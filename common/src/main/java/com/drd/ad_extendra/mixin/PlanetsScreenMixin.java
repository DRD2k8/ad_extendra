package com.drd.ad_extendra.mixin;

import com.drd.ad_extendra.client.util.DimensionRenderingUtils;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.math.Axis;
import earth.terrarium.adastra.client.screens.PlanetsScreen;
import earth.terrarium.adastra.common.constants.PlanetConstants;
import net.minecraft.Util;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlanetsScreen.class)
public class PlanetsScreenMixin extends Screen {
    @Shadow
    private @Nullable ResourceLocation selectedSolarSystem;

    protected PlanetsScreenMixin(Component p_96550_) {
        super(p_96550_);
    }

    @Inject(method = "renderSolarSystem", at = @At("TAIL"), remap = false)
    public void renderSolarSystem(GuiGraphics graphics, CallbackInfo ci) {
        float ceresYRot = (float) Util.getMillis() / 400.0F;
        float jupiterYRot = (float) Util.getMillis() / 500.0F;
        float saturnYRot = (float) Util.getMillis() / 600.0F;
        float uranusYRot = (float) Util.getMillis() / 700.0F;
        float neptuneYRot = (float) Util.getMillis() / 800.0F;
        float orcusYRot = (float) Util.getMillis() / 45080.0F;
        float plutoYRot = (float) Util.getMillis() / 45260.0F;
        float haumeaYRot = (float) Util.getMillis() / 51647.5F;

        // Ceres
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(ceresYRot));
        graphics.pose().translate(131.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.CERES, 0, 0, 0.0F, 0.0F, 6, 6, 6, 6);
        graphics.pose().popPose();

        // Jupiter
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(jupiterYRot));
        graphics.pose().translate(145.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.JUPITER, 0, 0, 0.0F, 0.0F, 12, 12, 12, 12);
        graphics.pose().popPose();

        // Saturn
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(saturnYRot));
        graphics.pose().translate(170.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.SATURN, 0, 0, 0.0F, 0.0F, (int) 22.5, (int) 22.5, (int) 22.5, (int) 22.5);
        graphics.pose().popPose();

        // Uranus
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(uranusYRot));
        graphics.pose().translate(202.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.URANUS, 0, 0, 0.0F, 0.0F, (int) 18.75, (int) 18.75, (int) 18.75, (int) 18.75);
        graphics.pose().popPose();

        // Neptune
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(neptuneYRot));
        graphics.pose().translate(235.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.NEPTUNE, 0, 0, 0.0F, 0.0F, 12, 12, 12, 12);
        graphics.pose().popPose();

        // Orcus
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(orcusYRot));
        graphics.pose().translate(250.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.ORCUS, 0, 0, 0.0F, 0.0F, 12, 12, 12, 12);
        graphics.pose().popPose();

        // Pluto
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(plutoYRot));
        graphics.pose().translate(265.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.PLUTO, 0, 0, 0.0F, 0.0F, 12, 12, 12, 12);
        graphics.pose().popPose();

        // Haumea
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(haumeaYRot));
        graphics.pose().translate(280.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.HAUMEA, 0, 0, 0.0F, 0.0F, 12, 12, 12, 12);
        graphics.pose().popPose();
    }

    @Inject(method = "renderProximaCentauri", at = @At("TAIL"), remap = false)
    public void renderProximaCentauri(GuiGraphics graphics, CallbackInfo ci) {
        float proximaCentauriAbYRot = (float) Util.getMillis() / 5.0F;

        // Proxima Centauri b
        graphics.pose().pushPose();
        graphics.pose().translate((float)this.width / 2.0F, (float)this.height / 2.0F, 0.0F);
        graphics.pose().mulPose(Axis.ZP.rotationDegrees(proximaCentauriAbYRot));
        graphics.pose().translate(22.0F, 0.0F, 0.0F);
        graphics.blit(DimensionRenderingUtils.B, 0, 0, 0.0F, 0.0F, 12, 12, 12, 12);
        graphics.pose().popPose();
    }

    @Inject(method = "drawCircles", at = @At("TAIL"), remap = false)
    public void drawCircles(int start, int count, int color, BufferBuilder bufferBuilder, CallbackInfo ci) {
        if (PlanetConstants.SOLAR_SYSTEM.equals(this.selectedSolarSystem)) {
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(135), 75, color);
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(150), 75, color);
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(180), 75, color);
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(210), 75, color);
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(240), 75, color);
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(255), 75, color);
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(270), 75, color);
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(285), 75, color);
        }

        if (PlanetConstants.PROXIMA_CENTAURI.equals(this.selectedSolarSystem)) {
            PlanetsScreen.drawCircle(bufferBuilder, (double)((float)this.width / 2.0F), (double)((float)this.height / 2.0F), (double)(30), 75, color);
        }
    }
}
