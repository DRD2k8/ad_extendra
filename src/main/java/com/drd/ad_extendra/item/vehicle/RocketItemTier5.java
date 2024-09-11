package com.drd.ad_extendra.item.vehicle;

import com.drd.ad_extendra.entity.vehicle.RocketTier5;
import earth.terrarium.ad_astra.common.block.door.LocationState;
import earth.terrarium.ad_astra.common.block.launchpad.LaunchPad;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import earth.terrarium.ad_astra.common.item.vehicle.RocketItem;
import earth.terrarium.botarium.common.item.ItemStackHolder;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RocketItemTier5 extends RocketItem {
    private final int tier;

    public RocketItemTier5(int tier, Properties properties) {
        super(tier, properties);
        this.tier = tier;
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        if (!level.isClientSide) {
            BlockPos pos = context.getClickedPos();
            BlockState state = level.getBlockState(pos);
            Player player = context.getPlayer();
            if (player == null) {
                return InteractionResult.FAIL;
            }

            for(int x = pos.getX() - 1; x < pos.getX() + 2; ++x) {
                for(int y = pos.getY() + 1; y < pos.getY() + 9; ++y) {
                    for(int z = pos.getZ() - 1; z < pos.getZ() + 2; ++z) {
                        BlockPos testBlockPos = new BlockPos(x, y, z);
                        BlockState testBlock = level.getBlockState(testBlockPos);
                        if (!testBlock.isAir() && !(testBlock.getBlock() instanceof LiquidBlock)) {
                            return InteractionResult.FAIL;
                        }
                    }
                }
            }

            if (state.getBlock() instanceof LaunchPad && ((LocationState)state.getValue(LaunchPad.LOCATION)).equals(LocationState.CENTER)) {
                ItemStackHolder rocketStack = new ItemStackHolder(player.getItemInHand(context.getHand()));
                Item var16 = rocketStack.getStack().getItem();
                if (var16 instanceof RocketItem) {
                    RocketItem<?> rocket = (RocketItem)var16;
                    Rocket rocketEntity = null;
                    int tier = rocket.getTier();
                    switch (tier) {
                        case 5 -> rocketEntity = new RocketTier5(level);
                    }

                    if (rocketEntity != null) {
                        AABB scanAbove = new AABB((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)(pos.getX() + 1), (double)(pos.getY() + 1), (double)(pos.getZ() + 1));
                        List<Rocket> entities = level.getEntitiesOfClass(Rocket.class, scanAbove, (entity) -> {
                            return true;
                        });
                        if (!entities.isEmpty()) {
                            return InteractionResult.PASS;
                        }

                        CompoundTag nbt = rocketStack.getStack().getOrCreateTag();
                        if (nbt.contains("Inventory")) {
                            ((Rocket)rocketEntity).getInventory().fromTag(nbt.getList("Inventory", 10));
                        }

                        ((Rocket)rocketEntity).assignLaunchPad(true);
                        level.playSound((Player)null, pos, SoundEvents.NETHERITE_BLOCK_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
                        ((Rocket)rocketEntity).setPos((double)pos.getX() + 0.5, (double)pos.getY() + 0.1, (double)pos.getZ() + 0.5);
                        ((Rocket)rocketEntity).setYRot((float)(Math.round((player.getYRot() + 180.0F) / 90.0F) * 90));
                        level.addFreshEntity((Entity)rocketEntity);
                        if (rocketStack.isDirty()) {
                            player.setItemInHand(context.getHand(), rocketStack.getStack());
                        }

                        player.getItemInHand(context.getHand()).shrink(1);
                        return InteractionResult.SUCCESS;
                    }
                }
            }
        }

        return InteractionResult.PASS;
    }

    public int getTier() {
        return this.tier;
    }
}
