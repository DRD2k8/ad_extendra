package com.drd.ad_extendra.client;

import com.drd.ad_extendra.client.models.entities.mobs.FreezeModel;
import com.drd.ad_extendra.client.models.entities.vehicles.CustomRocketModel;
import com.drd.ad_extendra.client.particles.WindParticle;
import com.drd.ad_extendra.client.renderers.blocks.CustomGlobeBlockEntityRenderer;
import com.drd.ad_extendra.client.renderers.blocks.CustomSlidingDoorBlockEntityRenderer;
import com.drd.ad_extendra.client.renderers.entities.mobs.FreezeRenderer;
import com.drd.ad_extendra.client.renderers.entities.vehicles.CustomBoatRenderer;
import com.drd.ad_extendra.client.renderers.entities.vehicles.CustomRocketRenderer;
import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.entities.vehicles.CustomBoat;
import com.drd.ad_extendra.common.registry.*;
import com.drd.ad_extendra.common.utils.ModWoodTypes;
import earth.terrarium.adastra.client.ClientPlatformUtils;
import earth.terrarium.adastra.client.renderers.entities.vehicles.RocketRenderer;
import earth.terrarium.botarium.client.ClientHooks;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AdExtendraClient {
    public static void init() {
        registerEntityRenderers();
        registerBlockEntityRenderers();
        registerRenderLayers();
        registerSheets();
    }

    private static void registerEntityRenderers() {
        ClientHooks.registerEntityRenderer(ModEntityTypes.FREEZE, FreezeRenderer::new);
        ClientHooks.registerEntityRenderer(ModEntityTypes.ICE_CHARGE, ThrownItemRenderer::new);
        ClientHooks.registerEntityRenderer(ModEntityTypes.BOAT, c -> new CustomBoatRenderer(c, false));
        ClientHooks.registerEntityRenderer(ModEntityTypes.CHEST_BOAT, c -> new CustomBoatRenderer(c, true));
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
        ClientHooks.registerBlockEntityRenderers(ModBlockEntityTypes.GLOBE.get(), c -> new CustomGlobeBlockEntityRenderer());
        ClientHooks.registerBlockEntityRenderers(ModBlockEntityTypes.SIGN.get(), SignRenderer::new);
        ClientHooks.registerBlockEntityRenderers(ModBlockEntityTypes.HANGING_SIGN.get(), HangingSignRenderer::new);
    }

    public static void registerRenderLayers() {
        ClientHooks.setRenderLayer(ModBlocks.SATURN_ICE.get(), RenderType.translucent());
        ClientHooks.setRenderLayer(ModBlocks.SLUSHY_ICE.get(), RenderType.translucent());
        ClientHooks.setRenderLayer(ModBlocks.ICICLE.get(), RenderType.cutoutMipped());
        ClientHooks.setRenderLayer(ModBlocks.GLACIAN_SAPLING.get(), RenderType.cutoutMipped());
        ClientHooks.setRenderLayer(ModBlocks.POTTED_GLACIAN_SAPLING.get(), RenderType.cutoutMipped());
        ModBlocks.GLOBES.stream().forEach((block) -> {
            ClientHooks.setRenderLayer(block.get(), RenderType.cutout());
        });
    }

    public static void onRegisterEntityLayers(ClientPlatformUtils.LayerDefinitionRegistry consumer) {
        consumer.register(FreezeModel.LAYER_LOCATION, FreezeModel::createBodyLayer);

        for (CustomBoat.Type type : CustomBoat.Type.values()) {
            consumer.register(CustomBoatRenderer.boatTextureLocation(type), BoatModel::createBodyModel);
            consumer.register(CustomBoatRenderer.chestBoatTextureLocation(type), ChestBoatModel::createBodyModel);
        }

        CustomRocketModel.register(consumer);
    }

    public static void onRegisterModels(Consumer<ResourceLocation> consumer) {
        ModBlocks.GLOBES.stream().forEach(b -> consumer.accept(new ResourceLocation(AdExtendra.MOD_ID, "block/%s_cube".formatted(b.getId().getPath()))));
    }

    public static void onRegisterItemRenderers(BiConsumer<Item, BlockEntityWithoutLevelRenderer> consumer) {
        // Rockets
        consumer.accept(ModItems.TIER_5_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_5_LAYER, CustomRocketRenderer.TIER_5_TEXTURE));
        consumer.accept(ModItems.TIER_6_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_6_LAYER, CustomRocketRenderer.TIER_6_TEXTURE));
        consumer.accept(ModItems.TIER_7_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_7_LAYER, CustomRocketRenderer.TIER_7_TEXTURE));
        consumer.accept(ModItems.TIER_8_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_8_LAYER, CustomRocketRenderer.TIER_8_TEXTURE));
        consumer.accept(ModItems.TIER_9_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_9_LAYER, CustomRocketRenderer.TIER_9_TEXTURE));
        consumer.accept(ModItems.TIER_10_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_10_LAYER, CustomRocketRenderer.TIER_10_TEXTURE));
        consumer.accept(ModItems.TIER_11_ROCKET.get(), new RocketRenderer.ItemRenderer(CustomRocketModel.TIER_11_LAYER, CustomRocketRenderer.TIER_11_TEXTURE));

        // Globes
        ModItems.GLOBES.stream().forEach(item -> consumer.accept(item.get(), new CustomGlobeBlockEntityRenderer.ItemRenderer()));
    }

    public static void onRegisterParticles(BiConsumer<ParticleType<SimpleParticleType>, ClientPlatformUtils.SpriteParticleRegistration<SimpleParticleType>> consumer) {
        consumer.accept(ModParticleTypes.WIND.get(), WindParticle.Provider::new);
    }

    private static void registerSheets() {
        addWoodType(ModWoodTypes.AERONOS);
        addWoodType(ModWoodTypes.STROPHAR);
        addWoodType(ModWoodTypes.GLACIAN);
    }

    private static void addWoodType(WoodType woodType) {
        ResourceLocation location = new ResourceLocation(woodType.name());
        Sheets.SIGN_MATERIALS.put(woodType, new Material(Sheets.SIGN_SHEET, new ResourceLocation(AdExtendra.MOD_ID, "entity/signs/" + location.getPath())));
        Sheets.HANGING_SIGN_MATERIALS.put(woodType, new Material(Sheets.SIGN_SHEET, new ResourceLocation(AdExtendra.MOD_ID, "entity/signs/hanging/" + location.getPath())));
    }
}
