package com.drd.ad_extendra.block.door;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

@MethodsReturnNonnullByDefault
public class CustomSlidingDoorBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING;
    public static final BooleanProperty OPEN;
    public static final BooleanProperty POWERED;
    public static final EnumProperty<LocationState> LOCATION;
    protected static final VoxelShape X_SHAPE;
    protected static final VoxelShape Z_SHAPE;
    protected static final VoxelShape GIANT_X_SHAPE;
    protected static final VoxelShape GIANT_Z_SHAPE;

    public CustomSlidingDoorBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)((BlockState)this.defaultBlockState().setValue(FACING, Direction.NORTH)).setValue(OPEN, false)).setValue(POWERED, false)).setValue(LOCATION, LocationState.BOTTOM));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, OPEN, POWERED, LOCATION});
    }

    public void setPlacedBy(Level level, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (!level.isClientSide) {
            Direction direction = (Direction)state.getValue(FACING);
            Direction offset = direction.getClockWise();
            level.setBlock(pos, (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.BOTTOM)).setValue(FACING, direction), 3);
            level.setBlock(pos.relative(offset), (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.BOTTOM_LEFT)).setValue(FACING, direction), 3);
            level.setBlock(pos.relative(offset.getOpposite()), (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.BOTTOM_RIGHT)).setValue(FACING, direction), 3);
            level.setBlock(pos.above(), (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.CENTER)).setValue(FACING, direction), 3);
            level.setBlock(pos.above().relative(offset), (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.LEFT)).setValue(FACING, direction), 3);
            level.setBlock(pos.above().relative(offset.getOpposite()), (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.RIGHT)).setValue(FACING, direction), 3);
            level.setBlock(pos.above().above(), (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.TOP)).setValue(FACING, direction), 3);
            level.setBlock(pos.above().above().relative(offset), (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.TOP_LEFT)).setValue(FACING, direction), 3);
            level.setBlock(pos.above().above().relative(offset.getOpposite()), (BlockState)((BlockState)this.defaultBlockState().setValue(LOCATION, LocationState.TOP_RIGHT)).setValue(FACING, direction), 3);
        }
    }

    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(level, pos, state, player);
        this.breakDoor(level, level.getBlockState(pos), pos, !player.isCreative());
    }

    public void wasExploded(Level level, BlockPos pos, Explosion explosion) {
        Direction[] var4 = Direction.values();
        int var5 = var4.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            Direction direction = var4[var6];
            BlockPos offset = pos.relative(direction);
            BlockState state = level.getBlockState(offset);
            if (state.getBlock().equals(this)) {
                this.breakDoor(level, state, offset, true);
                break;
            }
        }

        super.wasExploded(level, pos, explosion);
    }

    public void breakDoor(Level level, BlockState state, BlockPos pos, boolean drop) {
        if (!level.isClientSide && state.getBlock().equals(this)) {
            BlockPos mainPos = this.getMainPos(state, pos);
            if (level.getBlockState(mainPos).getBlock().equals(this)) {
                Direction direction = ((Direction)state.getValue(FACING)).getCounterClockWise();
                level.destroyBlock(mainPos, drop);
                level.destroyBlock(mainPos.relative(direction), false);
                level.destroyBlock(mainPos.relative(direction.getOpposite()), false);
                level.destroyBlock(mainPos.above(), false);
                level.destroyBlock(mainPos.above().relative(direction), false);
                level.destroyBlock(mainPos.above().relative(direction.getOpposite()), false);
                level.destroyBlock(mainPos.above().above(), false);
                level.destroyBlock(mainPos.above().above().relative(direction), false);
                level.destroyBlock(mainPos.above().above().relative(direction.getOpposite()), false);
            }
        }

    }

    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
        boolean var10000;
        switch (type) {
            case LAND -> var10000 = (Boolean)state.getValue(OPEN);
            case WATER -> var10000 = false;
            case AIR -> var10000 = (Boolean)state.getValue(OPEN);
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            BlockPos main = this.getMainPos(state, pos);
            BlockEntity var9 = level.getBlockEntity(this.getMainPos(state, pos));
            if (var9 instanceof CustomSlidingDoorBlockEntity) {
                CustomSlidingDoorBlockEntity entity = (CustomSlidingDoorBlockEntity)var9;
                if (entity.getSlideTicks() > 0 && entity.getSlideTicks() < 100) {
                    return InteractionResult.PASS;
                }

                level.setBlock(main, (BlockState)level.getBlockState(main).cycle(OPEN), 10);
            }
        }

        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        LocationState location = (LocationState)state.getValue(LOCATION);
        VoxelShape var10000;
        switch (location) {
            case TOP:
                var10000 = this.getFacingOutlineShape(state, -1.0);
                break;
            case CENTER:
                var10000 = this.getFacingOutlineShape(state, 0.0);
                break;
            case BOTTOM:
                var10000 = this.getFacingOutlineShape(state, 1.0);
                break;
            default:
                switch ((Direction)state.getValue(FACING)) {
                    case NORTH -> var10000 = X_SHAPE.move(0.0, 0.0, 0.42);
                    case EAST -> var10000 = Z_SHAPE.move(-0.38, 0.0, 0.0);
                    case SOUTH -> var10000 = X_SHAPE.move(0.0, 0.0, 0.38);
                    case WEST -> var10000 = Z_SHAPE.move(-0.42, 0.0, 0.0);
                    default -> var10000 = Shapes.empty();
                }
        }

        return var10000;
    }

    private VoxelShape getFacingOutlineShape(BlockState state, double offset) {
        VoxelShape var10000;
        switch ((Direction)state.getValue(FACING)) {
            case NORTH -> var10000 = GIANT_X_SHAPE.move(0.0, offset, 0.42);
            case EAST -> var10000 = GIANT_Z_SHAPE.move(0.38, offset, 0.0);
            case SOUTH -> var10000 = GIANT_X_SHAPE.move(0.0, offset, 0.38);
            case WEST -> var10000 = GIANT_Z_SHAPE.move(0.42, offset, 0.0);
            default -> var10000 = Shapes.empty();
        }

        return var10000;
    }

    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos mainPos = this.getMainPos(state, pos);
        Direction direction = ((Direction)state.getValue(FACING)).getClockWise();
        return level.getBlockState(mainPos).isAir() && level.getBlockState(mainPos.relative(direction)).isAir() && level.getBlockState(mainPos.relative(direction.getOpposite())).isAir() && level.getBlockState(mainPos.above()).isAir() && level.getBlockState(mainPos.above().relative(direction)).isAir() && level.getBlockState(mainPos.above().relative(direction.getOpposite())).isAir() && level.getBlockState(mainPos.above().above()).isAir() && level.getBlockState(mainPos.above().above().relative(direction)).isAir() && level.getBlockState(mainPos.above().above().relative(direction.getOpposite())).isAir();
    }

    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return (BlockState)((BlockState)this.defaultBlockState().setValue(POWERED, ctx.getLevel().hasNeighborSignal(ctx.getClickedPos()))).setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        super.neighborChanged(state, level, pos, block, fromPos, notify);
        if (!level.isClientSide) {
            level.setBlockAndUpdate(pos, (BlockState)state.setValue(POWERED, level.hasNeighborSignal(pos)));
        }

    }

    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        BlockState main = level.getBlockState(this.getMainPos(state, pos));
        if (main.hasProperty(OPEN) && !(Boolean)main.getValue(OPEN) && !(Boolean)main.getValue(POWERED)) {
            Direction direction = (Direction)state.getValue(FACING);
            VoxelShape var10000;
            switch (direction) {
                case NORTH -> var10000 = X_SHAPE.move(0.0, 0.0, 0.42);
                case EAST -> var10000 = Z_SHAPE.move(-0.38, 0.0, 0.0);
                case SOUTH -> var10000 = X_SHAPE.move(0.0, 0.0, 0.38);
                case WEST -> var10000 = Z_SHAPE.move(-0.42, 0.0, 0.0);
                default -> var10000 = Shapes.empty();
            }

            return var10000;
        } else {
            return Shapes.empty();
        }
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ((LocationState)state.getValue(LOCATION)).equals(LocationState.BOTTOM) ? new CustomSlidingDoorBlockEntity(pos, state) : null;
    }

    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return state.getValue(LOCATION) != LocationState.BOTTOM ? null : (entityWorld, pos, entityState, blockEntity) -> {
            if (blockEntity instanceof CustomSlidingDoorBlockEntity door) {
                door.tick();
            }
        };
    }

    public BlockState rotate(BlockState state, Rotation rotation) {
        return (BlockState)state.setValue(FACING, rotation.rotate((Direction)state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.getValue(FACING)));
    }

    public BlockPos getMainPos(BlockState state, BlockPos from) {
        BlockPos target = from;
        Direction facing = ((Direction)state.getValue(FACING)).getCounterClockWise();
        if (((LocationState)state.getValue(LOCATION)).equals(LocationState.TOP_LEFT)) {
            target = from.below().below().relative(facing);
        } else if (((LocationState)state.getValue(LOCATION)).equals(LocationState.TOP)) {
            target = from.below().below();
        } else if (((LocationState)state.getValue(LOCATION)).equals(LocationState.TOP_RIGHT)) {
            target = from.below().below().relative(facing.getOpposite());
        } else if (((LocationState)state.getValue(LOCATION)).equals(LocationState.RIGHT)) {
            target = from.below().relative(facing.getOpposite());
        } else if (((LocationState)state.getValue(LOCATION)).equals(LocationState.CENTER)) {
            target = from.below();
        } else if (((LocationState)state.getValue(LOCATION)).equals(LocationState.LEFT)) {
            target = from.below().relative(facing);
        } else if (((LocationState)state.getValue(LOCATION)).equals(LocationState.BOTTOM_LEFT)) {
            target = from.relative(facing);
        } else if (((LocationState)state.getValue(LOCATION)).equals(LocationState.BOTTOM_RIGHT)) {
            target = from.relative(facing.getOpposite());
        }

        return target;
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        OPEN = BlockStateProperties.OPEN;
        POWERED = BlockStateProperties.POWERED;
        LOCATION = EnumProperty.create("location", LocationState.class);
        X_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
        Z_SHAPE = Block.box(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
        GIANT_X_SHAPE = Block.box(-16.0, -16.0, 0.0, 32.0, 32.0, 3.0);
        GIANT_Z_SHAPE = Block.box(0.0, -16.0, -16.0, 3.0, 32.0, 32.0);
    }
}
