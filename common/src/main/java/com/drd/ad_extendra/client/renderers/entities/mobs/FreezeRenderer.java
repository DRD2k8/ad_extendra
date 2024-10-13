package com.drd.ad_extendra.client.renderers.entities.mobs;

import com.drd.ad_extendra.client.models.entities.mobs.FreezeModel;
import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.entities.mobs.Freeze;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FreezeRenderer extends MobRenderer<Freeze, FreezeModel<Freeze>> {
    public FreezeRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FreezeModel<>(pContext.bakeLayer(FreezeModel.LAYER_LOCATION)), 1f);
        this.addLayer(new FreezeEyesLayer(this));
    }

    @Override
    public ResourceLocation getTextureLocation(Freeze pEntity) {
        return new ResourceLocation(AdExtendra.MOD_ID, "textures/entity/freeze/freeze.png");
    }

    @Override
    public void render(Freeze pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
