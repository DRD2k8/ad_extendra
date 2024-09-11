package com.drd.ad_extendra.block.door;

import com.drd.ad_extendra.block.entity.ModBlockEntities;
import earth.terrarium.ad_astra.common.registry.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomSlidingDoorBlockEntity extends BlockEntity {
    private int slideTicks;
    private int previousSlideTicks;

    public CustomSlidingDoorBlockEntity(BlockPos blockPos, BlockState blockState) {
        super((BlockEntityType) ModBlockEntities.SLIDING_DOOR.get(), blockPos, blockState);
    }

    public void load(CompoundTag nbt) {
        this.slideTicks = nbt.getInt("SlideTicks");
    }

    protected void saveAdditional(CompoundTag nbt) {
        nbt.putInt("SlideTicks", this.slideTicks);
    }

    public int getSlideTicks() {
        return this.slideTicks;
    }

    public int getPreviousSlideTicks() {
        return this.previousSlideTicks;
    }

    public void tick() {
        if (((LocationState)this.getBlockState().getValue(CustomSlidingDoorBlock.LOCATION)).equals(LocationState.BOTTOM)) {
            boolean open = (Boolean)this.getBlockState().getValue(CustomSlidingDoorBlock.OPEN) || (Boolean)this.getBlockState().getValue(CustomSlidingDoorBlock.POWERED);
            this.previousSlideTicks = this.slideTicks;
            if (open) {
                this.slideTicks += 3;
            } else {
                this.slideTicks -= 3;
            }

            if (this.level != null && !this.level.isClientSide) {
                if (!open && this.slideTicks == 94) {
                    this.level.playSound((Player)null, this.worldPosition, (SoundEvent) ModSoundEvents.LARGE_DOOR_CLOSE.get(), SoundSource.BLOCKS, 0.25F, 1.0F);
                } else if (open && this.slideTicks == 6) {
                    this.level.playSound((Player)null, this.worldPosition, (SoundEvent)ModSoundEvents.LARGE_DOOR_OPEN.get(), SoundSource.BLOCKS, 0.25F, 1.0F);
                }
            }
            this.slideTicks = Mth.clamp(this.slideTicks, 0, 100);
        }
    }
}
