package net.teddy0008.ad_extendra.client.renderer.entity.mob.freeze;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.client.renderer.entity.ModEntityModelLayers;
import net.teddy0008.ad_extendra.entity.mob.Freeze;

public class FreezeRenderer extends MobRenderer<Freeze, FreezeModel<Freeze>> {
    public FreezeRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FreezeModel<>(pContext.bakeLayer(ModEntityModelLayers.FREEZE_LAYER)), 1f);
        this.addLayer(new FreezeEyesLayer(this));
    }

    @Override
    public ResourceLocation getTextureLocation(Freeze pEntity) {
        return new ResourceLocation(Main.MOD_ID, "textures/entity/freeze/freeze.png");
    }

    @Override
    public void render(Freeze pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
