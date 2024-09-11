package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11;

import com.mojang.blaze3d.vertex.PoseStack;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class RocketItemRendererTier11 extends BlockEntityWithoutLevelRenderer {
    public RocketItemRendererTier11() {
        super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
    }

    public void renderByItem(ItemStack stack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        VehicleRenderer.renderRocketItem(RocketRendererTier11.TEXTURE, RocketModelTier11.LAYER_LOCATION, poseStack, buffer, packedLight, packedOverlay);
    }
}
