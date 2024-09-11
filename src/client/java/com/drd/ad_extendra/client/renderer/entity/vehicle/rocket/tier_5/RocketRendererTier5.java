package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier5;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class RocketRendererTier5 extends VehicleRenderer<RocketTier5, RocketModelTier5> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/vehicles/tier_5_rocket.png");

    public RocketRendererTier5(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier5(context.bakeLayer(RocketModelTier5.LAYER_LOCATION)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(RocketTier5 entity) {
        return TEXTURE;
    }
}
