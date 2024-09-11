package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier10;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class RocketRendererTier10 extends VehicleRenderer<RocketTier10, RocketModelTier10> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/vehicles/tier_10_rocket.png");

    public RocketRendererTier10(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier10(context.bakeLayer(RocketModelTier10.LAYER_LOCATION)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(RocketTier10 entity) {
        return TEXTURE;
    }
}
