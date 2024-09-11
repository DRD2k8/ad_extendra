package com.drd.ad_extendra.client.renderer.entity;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.client.renderer.entity.mob.freeze.FreezeModel;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5.RocketModelTier5;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6.RocketModelTier6;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7.RocketModelTier7;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_8.RocketModelTier8;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_9.RocketModelTier9;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10.RocketModelTier10;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11.RocketModelTier11;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class ModEntityModelLayers {
    public static final ModelLayerLocation FREEZE_LAYER = new ModelLayerLocation(
            new ResourceLocation(Main.MOD_ID, "freeze_layer"), "main");

    public static void registerEntityLayers(LayerDefinitionRegistry registry) {
        registry.register(FREEZE_LAYER, FreezeModel::createBodyLayer);
        registry.register(RocketModelTier5.LAYER_LOCATION, RocketModelTier5::createBodyLayer);
        registry.register(RocketModelTier6.LAYER_LOCATION, RocketModelTier6::createBodyLayer);
        registry.register(RocketModelTier7.LAYER_LOCATION, RocketModelTier7::createBodyLayer);
        registry.register(RocketModelTier8.LAYER_LOCATION, RocketModelTier8::createBodyLayer);
        registry.register(RocketModelTier9.LAYER_LOCATION, RocketModelTier9::createBodyLayer);
        registry.register(RocketModelTier10.LAYER_LOCATION, RocketModelTier10::createBodyLayer);
        registry.register(RocketModelTier11.LAYER_LOCATION, RocketModelTier11::createBodyLayer);
    }

    public abstract static class LayerDefinitionRegistry {
        public LayerDefinitionRegistry() {
        }

        public abstract void register(ModelLayerLocation var1, Supplier<LayerDefinition> var2);
    }
}
