package com.drd.ad_extendra.common.blockentities;

import com.drd.ad_extendra.common.blocks.CustomGlobeBlock;
import com.drd.ad_extendra.common.registry.ModBlockEntityTypes;
import earth.terrarium.adastra.common.blockentities.base.TickableBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomGlobeBlockEntity extends BlockEntity implements TickableBlockEntity {
    private float torque;
    private float yRot;
    private float lastYRot;

    public CustomGlobeBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntityTypes.GLOBE.get(), pos, state);
    }

    @Override
    public void tick(Level level, long time, BlockState state, BlockPos pos) {
        if (getBlockState().getValue(CustomGlobeBlock.POWERED) && torque <= 3f) {
            torque = 3f;
        }

        if (torque > 0) {
            torque -= 0.75f;
            lastYRot = yRot;
            yRot -= torque;
        } else if (torque < 0) {
            torque = 0;
        }
    }

    public void rotateGlobe() {
        torque = (float) ((Mth.PI * 15) / (1 + Math.pow(0.00003f, torque)));
        setChanged();
    }

    public float yRot() {
        return yRot;
    }

    public float lastYRot() {
        return lastYRot;
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        torque = tag.getFloat("Torque");
        yRot = tag.getFloat("YRot");
        lastYRot = yRot;
    }

    @Override
    public void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putFloat("Torque", torque);
        tag.putFloat("YRot", yRot);
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }
}
