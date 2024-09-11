package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier11;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class RocketRendererTier11 extends VehicleRenderer<RocketTier11, RocketModelTier11> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/vehicles/tier_11_rocket.png");

    public RocketRendererTier11(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier11(context.bakeLayer(RocketModelTier11.LAYER_LOCATION)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(RocketTier11 entity) {
        return TEXTURE;
    }
}
