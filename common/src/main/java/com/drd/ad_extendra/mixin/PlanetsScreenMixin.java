package com.drd.ad_extendra.mixin;

import com.drd.ad_extendra.client.util.DimensionRenderingUtils;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.math.Axis;
import earth.terrarium.adastra.api.client.events.AdAstraClientEvents;
import earth.terrarium.adastra.client.screens.PlanetsScreen;
import earth.terrarium.adastra.common.constants.PlanetConstants;
import net.minecraft.Util;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PlanetsScreen.class)
public class PlanetsScreenMixin {
    static {
        AdAstraClientEvents.RenderSolarSystemEvent.register((graphics, solarSystem, width, height) -> {
            if (PlanetConstants.SOLAR_SYSTEM.equals(solarSystem)) {
                Tesselator tessellator = Tesselator.getInstance();
                BufferBuilder bufferBuilder = tessellator.getBuilder();
                bufferBuilder.begin(VertexFormat.Mode.DEBUG_LINES, DefaultVertexFormat.POSITION_COLOR);
                int color = 0xff24327b;
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), (double)(135), 75, color);
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), (double)(150), 75, color);
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), (double)(180), 75, color);
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), (double)(210), 75, color);
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), (double)(240), 75, color);
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), (double)(255), 75, color);
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), (double)(270), 75, color);
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), (double)(285), 75, color);
                tessellator.end();

                // Ceres
                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) / 4 / 2));
                graphics.pose().translate(131, 0, 0);
                graphics.blit(DimensionRenderingUtils.CERES, 0, 0, 0, 0, 6, 6, 6, 6);
                graphics.pose().popPose();

                // Jupiter
                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) / 5 / 2));
                graphics.pose().translate(145, 0, 0);
                graphics.blit(DimensionRenderingUtils.JUPITER, 0, 0, 0, 0, 12, 12, 12, 12);
                graphics.pose().popPose();

                // Saturn
                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) / 6 / 2));
                graphics.pose().translate(170, 0, 0);
                graphics.blit(DimensionRenderingUtils.SATURN, 0, 0, 0, 0, (int)22.5, (int)22.5, (int)22.5, (int)22.5);
                graphics.pose().popPose();

                // Uranus
                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) / 7 / 2));
                graphics.pose().translate(202, 0, 0);
                graphics.blit(DimensionRenderingUtils.URANUS, 0, 0, 0, 0, (int)18.75, (int)18.75, (int)18.75, (int)18.75);
                graphics.pose().popPose();

                // Neptune
                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) / 8 / 2));
                graphics.pose().translate(235, 0, 0);
                graphics.blit(DimensionRenderingUtils.NEPTUNE, 0, 0, 0, 0, 12, 12, 12, 12);
                graphics.pose().popPose();

                // Orcus
                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) / (int)450.8 / 2));
                graphics.pose().translate(250, 0, 0);
                graphics.blit(DimensionRenderingUtils.ORCUS, 0, 0, 0, 0, 12, 12, 12, 12);
                graphics.pose().popPose();

                // Pluto
                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) / (int)452.6 / 2));
                graphics.pose().translate(265, 0, 0);
                graphics.blit(DimensionRenderingUtils.PLUTO, 0, 0, 0, 0, 12, 12, 12, 12);
                graphics.pose().popPose();

                // Haumea
                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) / (int)516.475 / 2));
                graphics.pose().translate(280, 0, 0);
                graphics.blit(DimensionRenderingUtils.HAUMEA, 0, 0, 0, 0, 12, 12, 12, 12);
                graphics.pose().popPose();
            }

            if (PlanetConstants.PROXIMA_CENTAURI.equals(solarSystem)) {
                Tesselator tessellator = Tesselator.getInstance();
                BufferBuilder bufferBuilder = tessellator.getBuilder();
                bufferBuilder.begin(VertexFormat.Mode.DEBUG_LINES, DefaultVertexFormat.POSITION_COLOR);
                int color = 0xff008080;
                PlanetsScreen.drawCircle(bufferBuilder, (double)((float)width / 2.0F), (double)((float)height / 2.0F), 30.0D, 75, color);
                tessellator.end();

                graphics.pose().pushPose();
                graphics.pose().translate(width / 2f, height / 2f, 0);
                graphics.pose().mulPose(Axis.ZP.rotationDegrees((Util.getMillis() / 100f) * 20 / 2));
                graphics.pose().translate(22, 0, 0);
                graphics.blit(DimensionRenderingUtils.B, 0, 0, 0, 0, 12, 12, 12, 12);
                graphics.pose().popPose();
            }
        });
    }
}
