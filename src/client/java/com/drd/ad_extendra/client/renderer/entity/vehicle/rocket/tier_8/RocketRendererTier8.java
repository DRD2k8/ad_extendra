package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_8;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier8;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class RocketRendererTier8 extends VehicleRenderer<RocketTier8, RocketModelTier8> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/vehicles/tier_8_rocket.png");

    public RocketRendererTier8(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier8(context.bakeLayer(RocketModelTier8.LAYER_LOCATION)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(RocketTier8 entity) {
        return TEXTURE;
    }
}
