package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_9;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier9;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class RocketRendererTier9 extends VehicleRenderer<RocketTier9, RocketModelTier9> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID, "textures/vehicles/tier_9_rocket.png");

    public RocketRendererTier9(EntityRendererProvider.Context context) {
        super(context, new RocketModelTier9(context.bakeLayer(RocketModelTier9.LAYER_LOCATION)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(RocketTier9 entity) {
        return TEXTURE;
    }
}
