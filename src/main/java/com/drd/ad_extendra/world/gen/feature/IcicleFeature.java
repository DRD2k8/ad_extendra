package com.drd.ad_extendra.world.gen.feature;

import com.drd.ad_extendra.block.IcicleBlock;
import com.drd.ad_extendra.world.gen.feature.configuration.IcicleConfiguration;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.DripstoneUtils;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

import java.util.Optional;

public class IcicleFeature extends Feature<IcicleConfiguration> {
    public IcicleFeature(Codec<IcicleConfiguration> pCodec) {
        super(pCodec);
    }

    @Override
    public boolean place(FeaturePlaceContext<IcicleConfiguration> pContext) {
        LevelAccessor levelaccessor = pContext.level();
        BlockPos blockpos = pContext.origin();
        RandomSource randomsource = pContext.random();
        IcicleConfiguration config = pContext.config();
        Optional<Direction> optional = getTipDirection(levelaccessor, blockpos, randomsource);
        if (optional.isEmpty()) {
            return false;
        } else {
            BlockPos blockpos1 = blockpos.relative(optional.get().getOpposite());
            createPatchOfDripstoneBlocks(levelaccessor, randomsource, blockpos1, config);
            int i = randomsource.nextFloat() < config.chanceOfTallerDripstone && DripstoneUtils.isEmptyOrWater(levelaccessor.getBlockState(blockpos.relative(optional.get()))) ? 2 : 1;
            IcicleBlock.growPointedDripstone(levelaccessor, blockpos, optional.get(), i, false, config.stone_provider.getState(randomsource, blockpos).getBlock());
            return true;
        }
    }

    private static Optional<Direction> getTipDirection(LevelAccessor pLevel, BlockPos pPos, RandomSource pRandom) {
        boolean flag = pLevel.getBlockState(pPos.above()).isSolidRender(pLevel, pPos.above());
        boolean flag1 = pLevel.getBlockState(pPos.below()).isSolidRender(pLevel, pPos.below());;
        if (flag && flag1) {
            return Optional.of(pRandom.nextBoolean() ? Direction.DOWN : Direction.UP);
        } else if (flag) {
            return Optional.of(Direction.DOWN);
        } else {
            return flag1 ? Optional.of(Direction.UP) : Optional.empty();
        }
    }

    private static void createPatchOfDripstoneBlocks(LevelAccessor pLevel, RandomSource pRandom, BlockPos pPos, IcicleConfiguration pConfig) {
        Block block = pConfig.stone_provider.getState(pRandom, pPos).getBlock();
        Block block2 = pConfig.base_stone_provider.getState(pRandom, pPos).getBlock();
        placeDripstoneBlockIfPossible(pLevel, pPos, block, block2);

        for(Direction direction : Direction.Plane.HORIZONTAL) {
            if (!(pRandom.nextFloat() > pConfig.chanceOfDirectionalSpread)) {
                BlockPos blockpos = pPos.relative(direction);
                placeDripstoneBlockIfPossible(pLevel, blockpos, block, block2);
                if (!(pRandom.nextFloat() > pConfig.chanceOfSpreadRadius2)) {
                    BlockPos blockpos1 = blockpos.relative(Direction.getRandom(pRandom));
                    placeDripstoneBlockIfPossible(pLevel, blockpos1, block, block2);
                    if (!(pRandom.nextFloat() > pConfig.chanceOfSpreadRadius3)) {
                        BlockPos blockpos2 = blockpos1.relative(Direction.getRandom(pRandom));
                        placeDripstoneBlockIfPossible(pLevel, blockpos2, block, block2);
                    }
                }
            }
        }

    }

    protected static boolean placeDripstoneBlockIfPossible(LevelAccessor pLevel, BlockPos pPos, Block block, Block block2) {
        BlockState blockstate = pLevel.getBlockState(pPos);
        if (blockstate.is(block2)) {
            Direction direction = null;
            if(!getTipDirection(pLevel, pPos, pLevel.getRandom()).isEmpty()) {
                direction = getTipDirection(pLevel, pPos, pLevel.getRandom()).get();
            }
            IcicleBlock.growPointedDripstone(pLevel, pPos, direction == null ? Direction.UP : direction , pLevel.getRandom().nextInt(1,8), true, block);
            return true;
        } else {
            return false;
        }
    }
}
