package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier6;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class RocketRendererTier6 extends VehicleRenderer<RocketTier6, RocketModelTier6> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/vehicles/tier_6_rocket.png");

    public RocketRendererTier6(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier6(context.bakeLayer(RocketModelTier6.LAYER_LOCATION)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(RocketTier6 entity) {
        return TEXTURE;
    }
}
