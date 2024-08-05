package net.teddy0008.ad_extendra.block.globe;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.teddy0008.ad_extendra.block.entity.ModBlockEntities;

public class SidewaysRingedGlobeBlockEntity extends BlockEntity {
    private float torque;
    private float yaw;
    public float prevYaw;

    public SidewaysRingedGlobeBlockEntity(BlockPos blockPos, BlockState blockState) {
        super((BlockEntityType) ModBlockEntities.SIDEWAYS_RINGED_GLOBE.get(), blockPos, blockState);
    }

    public void serverTick() {
        if ((Boolean)this.getBlockState().getValue(StandardGlobeBlock.POWERED) && this.torque <= 3.0F) {
            this.torque = 3.0F;
        }

        if (this.torque > 0.0F) {
            this.torque -= 0.75F;
            this.prevYaw = this.yaw;
            this.yaw -= this.torque;
        } else if (this.torque < 0.0F) {
            this.torque = 0.0F;
        }

    }

    public void rotateGlobe() {
        this.torque = (float)(47.1238899230957 / (1.0 + Math.pow(2.9999999242136255E-5, (double)this.torque)));
        this.setChanged();
    }

    public float getYaw() {
        return this.yaw;
    }

    public void load(CompoundTag tag) {
        super.load(tag);
        this.torque = tag.getFloat("Torque");
        this.yaw = tag.getFloat("Yaw");
        this.prevYaw = this.yaw;
    }

    public void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putFloat("Torque", this.torque);
        tag.putFloat("Yaw", this.yaw);
    }

    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public CompoundTag getUpdateTag() {
        return this.saveWithoutMetadata();
    }
}
