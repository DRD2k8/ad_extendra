package net.teddy0008.ad_extendra;

import earth.terrarium.botarium.client.ClientHooks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.block.entity.ModBlockEntities;
import net.teddy0008.ad_extendra.client.renderer.RenderLoading;
import net.teddy0008.ad_extendra.client.renderer.block.door.CustomSlidingDoorRenderer;
import net.teddy0008.ad_extendra.client.renderer.block.globe.*;
import net.teddy0008.ad_extendra.client.renderer.entity.mob.freeze.FreezeRenderer;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.boat.CustomBoatRenderer;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5.RocketRendererTier5;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6.RocketRendererTier6;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7.RocketRendererTier7;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_8.RocketRendererTier8;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_9.RocketRendererTier9;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10.RocketRendererTier10;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11.RocketRendererTier11;
import net.teddy0008.ad_extendra.entity.ModEntities;
import net.teddy0008.ad_extendra.item.ModCreativeTabs;
import net.teddy0008.ad_extendra.item.ModItems;
import net.teddy0008.ad_extendra.loot.ModLootModifiers;
import net.teddy0008.ad_extendra.painting.ModPaintings;
import net.teddy0008.ad_extendra.particle.ModParticles;
import net.teddy0008.ad_extendra.util.ModWoodTypes;
import net.teddy0008.ad_extendra.util.PlatformUtils;
import net.teddy0008.ad_extendra.world.gen.feature.ModFeatures;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "ad_extendra";

    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModEntities.register(modEventBus);
        ModFeatures.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModParticles.register(modEventBus);

        ModPaintings.PAINTINGS.init();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(ModEntities.FREEZE.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);

            PlatformUtils.registerStrippedLog((Block) ModBlocks.GLACIAN_WOOD.get(), (Block) ModBlocks.STRIPPED_GLACIAN_WOOD.get());

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GLACIAN_SAPLING.getId(), ModBlocks.POTTED_GLACIAN_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.AERONOS_MUSHROOM.getId(), ModBlocks.POTTED_AERONOS_MUSHROOM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.STROPHAR_MUSHROOM.getId(), ModBlocks.POTTED_STROPHAR_MUSHROOM);
        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    public static void registerEntityRenderers() {
        EntityRenderers.register(ModEntities.FREEZE.get(), FreezeRenderer::new);
        EntityRenderers.register(ModEntities.ICE_CHARGE.get(), ThrownItemRenderer::new);
        EntityRenderers.register(ModEntities.BOAT.get(), pContext -> new CustomBoatRenderer(pContext, false));
        EntityRenderers.register(ModEntities.CHEST_BOAT.get(), pContext -> new CustomBoatRenderer(pContext, true));

        ClientHooks.registerEntityRenderer(ModEntities.TIER_5_ROCKET, RocketRendererTier5::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_6_ROCKET, RocketRendererTier6::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_7_ROCKET, RocketRendererTier7::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_8_ROCKET, RocketRendererTier8::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_9_ROCKET, RocketRendererTier9::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_10_ROCKET, RocketRendererTier10::new);
        ClientHooks.registerEntityRenderer(ModEntities.TIER_11_ROCKET, RocketRendererTier11::new);
    }

    public static void registerBlockEntityRenderers() {
        ClientHooks.registerBlockEntityRenderers((BlockEntityType) ModBlockEntities.SLIDING_DOOR.get(), CustomSlidingDoorRenderer::new);
        ClientHooks.registerBlockEntityRenderers((BlockEntityType) ModBlockEntities.GLOBE.get(), CustomGlobeRenderer::new);
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
            bus.addListener(RenderLoading::modelLoading);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SATURN_ICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SLUSHY_ICE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ICICLE.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLACIAN_SAPLING.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_GLACIAN_SAPLING.get(), RenderType.cutoutMipped());
            registerEntityRenderers();
            registerBlockEntityRenderers();
            RenderLoading.initRenderers();

            Sheets.addWoodType(ModWoodTypes.GLACIAN);
            Sheets.addWoodType(ModWoodTypes.AERONOS);
            Sheets.addWoodType(ModWoodTypes.STROPHAR);
        }
    }
}
