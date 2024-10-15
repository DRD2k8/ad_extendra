package com.drd.ad_extendra.mixin;

import com.drd.ad_extendra.client.util.DimensionRenderingUtils;
import com.drd.ad_extendra.common.utils.tags.ModBiomeTags;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexBuffer;
import net.minecraft.client.CloudStatus;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public abstract class LevelRendererMixin {
    @Shadow
    private ClientLevel level;

    @Shadow
    private int ticks;

    @Shadow
    private int prevCloudX;

    @Shadow
    private int prevCloudY;

    @Shadow
    private int prevCloudZ;

    @Shadow
    @Final
    private Minecraft minecraft;

    @Shadow
    private Vec3 prevCloudColor;

    @Shadow
    private CloudStatus prevCloudsType;

    @Shadow
    private boolean generateClouds;

    @Shadow
    private VertexBuffer cloudBuffer;

    @Shadow
    protected abstract BufferBuilder.RenderedBuffer buildClouds(BufferBuilder builder, double x, double y, double z, Vec3 cloudColor);

    @Inject(method = "renderClouds", at = @At(value = "HEAD"), cancellable = true)
    private void ad_extendra$renderClouds(PoseStack poseStack, Matrix4f projectionMatrix, float partialTick, double camX, double camY, double camZ, CallbackInfo ci) {
        if (ad_extendra$hasJupiterClouds()) {
            ci.cancel();
            float f = this.level.effects().getCloudHeight();
            if (!Float.isNaN(f)) {
                RenderSystem.disableCull();
                RenderSystem.enableBlend();
                RenderSystem.enableDepthTest();
                RenderSystem.blendFuncSeparate(
                        GlStateManager.SourceFactor.SRC_ALPHA,
                        GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
                        GlStateManager.SourceFactor.ONE,
                        GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
                );
                RenderSystem.depthMask(true);
                double d1 = ((float) this.ticks + partialTick) * 0.03F;
                double d2 = (camX + d1) / 12.0;
                double d3 = f - (float) camY + 0.33F;
                double d4 = camZ / 12.0 + 0.33F;
                d2 -= Mth.floor(d2 / 2048.0) * 2048;
                d4 -= Mth.floor(d4 / 2048.0) * 2048;
                float f3 = (float) (d2 - (double) Mth.floor(d2));
                float f4 = (float) (d3 / 4.0 - (double) Mth.floor(d3 / 4.0)) * 4.0F;
                float f5 = (float) (d4 - (double) Mth.floor(d4));
                Vec3 vec3 = this.level.getCloudColor(partialTick);
                int i = (int) Math.floor(d2);
                int j = (int) Math.floor(d3 / 4.0);
                int k = (int) Math.floor(d4);
                if (i != this.prevCloudX
                        || j != this.prevCloudY
                        || k != this.prevCloudZ
                        || this.minecraft.options.getCloudsType() != this.prevCloudsType
                        || this.prevCloudColor.distanceToSqr(vec3) > 2.0E-4) {
                    this.prevCloudX = i;
                    this.prevCloudY = j;
                    this.prevCloudZ = k;
                    this.prevCloudColor = vec3;
                    this.prevCloudsType = this.minecraft.options.getCloudsType();
                    this.generateClouds = true;
                }

                if (this.generateClouds) {
                    this.generateClouds = false;
                    BufferBuilder bufferbuilder = Tesselator.getInstance().getBuilder();
                    if (this.cloudBuffer != null) {
                        this.cloudBuffer.close();
                    }

                    this.cloudBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
                    BufferBuilder.RenderedBuffer bufferbuilder$renderedbuffer = this.buildClouds(bufferbuilder, d2, d3, d4, vec3);
                    this.cloudBuffer.bind();
                    this.cloudBuffer.upload(bufferbuilder$renderedbuffer);
                    VertexBuffer.unbind();
                }

                RenderSystem.setShader(GameRenderer::getPositionTexColorNormalShader);
                RenderSystem.setShaderTexture(0, DimensionRenderingUtils.JUPITER_CLOUDS);
                FogRenderer.levelFogColor();
                poseStack.pushPose();
                poseStack.scale(12.0F, 1.0F, 12.0F);
                poseStack.translate(-f3, f4, -f5);
                if (this.cloudBuffer != null) {
                    this.cloudBuffer.bind();
                    int l = this.prevCloudsType == CloudStatus.FANCY ? 0 : 1;

                    for (int i1 = l; i1 < 2; ++i1) {
                        if (i1 == 0) {
                            RenderSystem.colorMask(false, false, false, false);
                        } else {
                            RenderSystem.colorMask(true, true, true, true);
                        }

                        ShaderInstance shaderinstance = RenderSystem.getShader();
                        assert shaderinstance != null;
                        this.cloudBuffer.drawWithShader(poseStack.last().pose(), projectionMatrix, shaderinstance);
                    }

                    VertexBuffer.unbind();
                }

                poseStack.popPose();
                RenderSystem.enableCull();
                RenderSystem.disableBlend();
                RenderSystem.defaultBlendFunc();
            }
        }

        if (ad_extendra$hasSaturnClouds()) {
            ci.cancel();
            float f = this.level.effects().getCloudHeight();
            if (!Float.isNaN(f)) {
                RenderSystem.disableCull();
                RenderSystem.enableBlend();
                RenderSystem.enableDepthTest();
                RenderSystem.blendFuncSeparate(
                        GlStateManager.SourceFactor.SRC_ALPHA,
                        GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
                        GlStateManager.SourceFactor.ONE,
                        GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA
                );
                RenderSystem.depthMask(true);
                double d1 = ((float) this.ticks + partialTick) * 0.03F;
                double d2 = (camX + d1) / 12.0;
                double d3 = f - (float) camY + 0.33F;
                double d4 = camZ / 12.0 + 0.33F;
                d2 -= Mth.floor(d2 / 2048.0) * 2048;
                d4 -= Mth.floor(d4 / 2048.0) * 2048;
                float f3 = (float) (d2 - (double) Mth.floor(d2));
                float f4 = (float) (d3 / 4.0 - (double) Mth.floor(d3 / 4.0)) * 4.0F;
                float f5 = (float) (d4 - (double) Mth.floor(d4));
                Vec3 vec3 = this.level.getCloudColor(partialTick);
                int i = (int) Math.floor(d2);
                int j = (int) Math.floor(d3 / 4.0);
                int k = (int) Math.floor(d4);
                if (i != this.prevCloudX
                        || j != this.prevCloudY
                        || k != this.prevCloudZ
                        || this.minecraft.options.getCloudsType() != this.prevCloudsType
                        || this.prevCloudColor.distanceToSqr(vec3) > 2.0E-4) {
                    this.prevCloudX = i;
                    this.prevCloudY = j;
                    this.prevCloudZ = k;
                    this.prevCloudColor = vec3;
                    this.prevCloudsType = this.minecraft.options.getCloudsType();
                    this.generateClouds = true;
                }

                if (this.generateClouds) {
                    this.generateClouds = false;
                    BufferBuilder bufferbuilder = Tesselator.getInstance().getBuilder();
                    if (this.cloudBuffer != null) {
                        this.cloudBuffer.close();
                    }

                    this.cloudBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
                    BufferBuilder.RenderedBuffer bufferbuilder$renderedbuffer = this.buildClouds(bufferbuilder, d2, d3, d4, vec3);
                    this.cloudBuffer.bind();
                    this.cloudBuffer.upload(bufferbuilder$renderedbuffer);
                    VertexBuffer.unbind();
                }

                RenderSystem.setShader(GameRenderer::getPositionTexColorNormalShader);
                RenderSystem.setShaderTexture(0, DimensionRenderingUtils.SATURN_CLOUDS);
                FogRenderer.levelFogColor();
                poseStack.pushPose();
                poseStack.scale(12.0F, 1.0F, 12.0F);
                poseStack.translate(-f3, f4, -f5);
                if (this.cloudBuffer != null) {
                    this.cloudBuffer.bind();
                    int l = this.prevCloudsType == CloudStatus.FANCY ? 0 : 1;

                    for (int i1 = l; i1 < 2; ++i1) {
                        if (i1 == 0) {
                            RenderSystem.colorMask(false, false, false, false);
                        } else {
                            RenderSystem.colorMask(true, true, true, true);
                        }

                        ShaderInstance shaderinstance = RenderSystem.getShader();
                        assert shaderinstance != null;
                        this.cloudBuffer.drawWithShader(poseStack.last().pose(), projectionMatrix, shaderinstance);
                    }

                    VertexBuffer.unbind();
                }

                poseStack.popPose();
                RenderSystem.enableCull();
                RenderSystem.disableBlend();
                RenderSystem.defaultBlendFunc();
            }
        }
    }

    @Unique
    private boolean ad_extendra$hasJupiterClouds() {
        var player = Minecraft.getInstance().player;
        if (player == null) return false;
        return player.level().getBiome(player.blockPosition()).is(ModBiomeTags.HAS_JUPITER_CLOUDS);
    }

    @Unique
    private boolean ad_extendra$hasSaturnClouds() {
        var player = Minecraft.getInstance().player;
        if (player == null) return false;
        return player.level().getBiome(player.blockPosition()).is(ModBiomeTags.HAS_SATURN_CLOUDS);
    }
}
