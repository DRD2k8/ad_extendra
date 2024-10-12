package com.drd.ad_extendra.client;

import com.drd.ad_extendra.client.models.entities.vehicles.CustomRocketModel;
import com.drd.ad_extendra.client.renderers.blocks.CustomSlidingDoorBlockEntityRenderer;
import com.drd.ad_extendra.client.renderers.entities.vehicles.CustomRocketRenderer;
import com.drd.ad_extendra.common.registry.ModBlockEntityTypes;
import com.drd.ad_extendra.common.registry.ModEntityTypes;
import com.drd.ad_extendra.common.registry.ModItems;
import earth.terrarium.adastra.client.ClientPlatformUtils;
import earth.terrarium.adastra.client.renderers.entities.vehicles.RocketRenderer;
import earth.terrarium.botarium.client.ClientHooks;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;

import java.util.function.BiConsumer;

public class AdExtendraClient {
    public static void init() {
        registerEntityRenderers();
        registerBlockEntityRenderers();
    }

    private static void registerEntityRenderers() {
        ClientHooks.registerEntityRenderer(ModEntityTypes.TIER_5_ROCKET, c -> new RocketRenderer(c, CustomRocketModel.TIER_5_LAYER, CustomRocketRenderer.TIER_5_TEXTURE));
        ClientHooks.registerEntityRenderer(ModEntityTypes.TIER_6_ROCKET, c -> new RocketRenderer(c, CustomRocketModel.TIER_6_LAYER, CustomRocketRenderer.TIER_6_TEXTURE));
        ClientHooks.registerEntityRenderer(ModEntityTypes.TIER_7_ROCKET, c -> new RocketRenderer(c, CustomRocketModel.TIER_7_LAYER, CustomRocketRenderer.TIER_7_TEXTURE));
        ClientHooks.registerEntityRenderer(ModEntityTypes.TIER_8_ROCKET, c -> new RocketRenderer(c, CustomRocketModel.TIER_8_LAYER, CustomRocketRenderer.TIER_8_TEXTURE));
        ClientHooks.registerEntityRenderer(ModEntityTypes.TIER_9_ROCKET, c -> new RocketRenderer(c, CustomRocketModel.TIER_9_LAYER, CustomRocketRenderer.TIER_9_TEXTURE));
        ClientHooks.registerEntityRenderer(ModEntityTypes.TIER_10_ROCKET, c -> new RocketRenderer(c, CustomRocketModel.TIER_10_LAYER, CustomRocketRenderer.TIER_10_TEXTURE));
        ClientHooks.registerEntityRenderer(ModEntityTypes.TIER_11_ROCKET, c -> new RocketRenderer(c, CustomRocketModel.TIER_11_LAYER, CustomRocketRenderer.TIER_11_TEXTURE));
    }

    private static void registerBlockEntityRenderers() {
        ClientHooks.registerBlockEntityRenderers(ModBlockEntityTypes.SLIDING_DOOR.get(), c -> new CustomSlidingDoorBlockEntityRenderer());
    }

    public static void onRegisterEntityLayers(ClientPlatformUtils.LayerDefinitionRegistry consumer) {
        CustomRocketModel.register(consumer);
    }

    public static void onRegisterItemRenderers(BiConsumer<Item, BlockEntityWithoutLevelRenderer> consumer) {
        consumer.accept(ModItems.TIER_5_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_5_LAYER, CustomRocketRenderer.TIER_5_TEXTURE));
        consumer.accept(ModItems.TIER_6_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_6_LAYER, CustomRocketRenderer.TIER_6_TEXTURE));
        consumer.accept(ModItems.TIER_7_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_7_LAYER, CustomRocketRenderer.TIER_7_TEXTURE));
        consumer.accept(ModItems.TIER_8_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_8_LAYER, CustomRocketRenderer.TIER_8_TEXTURE));
        consumer.accept(ModItems.TIER_9_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_9_LAYER, CustomRocketRenderer.TIER_9_TEXTURE));
        consumer.accept(ModItems.TIER_10_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_10_LAYER, CustomRocketRenderer.TIER_10_TEXTURE));
        consumer.accept(ModItems.TIER_11_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_11_LAYER, CustomRocketRenderer.TIER_11_TEXTURE));
    }
}
