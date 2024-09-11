package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier7;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class RocketRendererTier7 extends VehicleRenderer<RocketTier7, RocketModelTier7> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/vehicles/tier_7_rocket.png");

    public RocketRendererTier7(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier7(context.bakeLayer(RocketModelTier7.LAYER_LOCATION)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(RocketTier7 entity) {
        return TEXTURE;
    }
}
