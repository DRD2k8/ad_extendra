package com.drd.ad_extendra.client.renderer;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.block.ModBlocks;
import com.drd.ad_extendra.block.entity.ModBlockEntities;
import com.drd.ad_extendra.client.ClientPlatformUtils;
import com.drd.ad_extendra.client.particle.WindParticle;
import com.drd.ad_extendra.client.renderer.block.door.CustomSlidingDoorRenderer;
import com.drd.ad_extendra.client.renderer.block.globe.CustomGlobeRenderer;
import com.drd.ad_extendra.client.renderer.entity.mob.freeze.FreezeRenderer;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5.RocketItemRendererTier5;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5.RocketRendererTier5;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6.RocketItemRendererTier6;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6.RocketRendererTier6;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7.RocketItemRendererTier7;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7.RocketRendererTier7;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_8.RocketItemRendererTier8;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_8.RocketRendererTier8;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_9.RocketItemRendererTier9;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_9.RocketRendererTier9;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10.RocketItemRendererTier10;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10.RocketRendererTier10;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11.RocketItemRendererTier11;
import com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11.RocketRendererTier11;
import com.drd.ad_extendra.entity.ModEntities;
import com.drd.ad_extendra.item.ModItems;
import com.drd.ad_extendra.particle.ModParticles;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import earth.terrarium.ad_astra.client.registry.ClientModParticles;
import earth.terrarium.botarium.client.ClientHooks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class RendererRegistry {
    public static void registerEntityRenderers() {
        ClientHooks.registerEntityRenderer(ModEntities.FREEZE, FreezeRenderer::new);
        ClientHooks.registerEntityRenderer(ModEntities.ICE_CHARGE, ThrownItemRenderer::new);
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

    public static void onRegisterBlockRenderTypes(BiConsumer<RenderType, List<Block>> register) {
        ClientHooks.setRenderLayer((Block)ModBlocks.SATURN_ICE.get(), RenderType.translucent());
        ClientHooks.setRenderLayer((Block)ModBlocks.SLUSHY_ICE.get(), RenderType.translucent());
        ClientHooks.setRenderLayer((Block)ModBlocks.ICICLE.get(), RenderType.cutoutMipped());
        ClientHooks.setRenderLayer((Block)ModBlocks.GLACIAN_SAPLING.get(), RenderType.cutoutMipped());
        ClientHooks.setRenderLayer((Block)ModBlocks.POTTED_GLACIAN_SAPLING.get(), RenderType.cutoutMipped());
        ModBlocks.GLOBES.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)block.get()));
        });
    }

    public static void onRegisterParticles(BiConsumer<ParticleType<SimpleParticleType>, SpriteParticleRegistration<SimpleParticleType>> register) {
        register.accept((ParticleType)ModParticles.WIND.get(), WindParticle.Provider::new);
    }

    public static void onRegisterItemRenderers(BiConsumer<ItemLike, BlockEntityWithoutLevelRenderer> register) {
        ModItems.GLOBES.stream().forEach((item) -> {
            register.accept((ItemLike)item.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        register.accept((ItemLike)ModItems.TIER_5_ROCKET.get(), new RocketItemRendererTier5());
        register.accept((ItemLike)ModItems.TIER_6_ROCKET.get(), new RocketItemRendererTier6());
        register.accept((ItemLike)ModItems.TIER_7_ROCKET.get(), new RocketItemRendererTier7());
        register.accept((ItemLike)ModItems.TIER_8_ROCKET.get(), new RocketItemRendererTier8());
        register.accept((ItemLike)ModItems.TIER_9_ROCKET.get(), new RocketItemRendererTier9());
        register.accept((ItemLike)ModItems.TIER_10_ROCKET.get(), new RocketItemRendererTier10());
        register.accept((ItemLike)ModItems.TIER_11_ROCKET.get(), new RocketItemRendererTier11());
    }

    public static void onRegisterModels(Consumer<ResourceLocation> register) {
        ModBlocks.SLIDING_DOORS.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + block.getId().getPath()));
        });
        ModBlocks.SLIDING_DOORS.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + block.getId().getPath() + "_flipped"));
        });
        ModBlocks.GLOBES.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + b.getId().getPath() + "_cube"));
        });
    }

    public static void renderBlock(ResourceLocation model, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        Minecraft minecraft = Minecraft.getInstance();
        ModelManager manager = minecraft.getModelManager();
        BakedModel baked = ClientPlatformUtils.getModel(manager, model);
        VertexConsumer vertexConsumer1 = buffer.getBuffer(RenderType.entityCutout(InventoryMenu.BLOCK_ATLAS));
        List<BakedQuad> quads1 = baked.getQuads((BlockState)null, (Direction)null, minecraft.level.random);
        PoseStack.Pose entry1 = poseStack.last();
        Iterator var11 = quads1.iterator();

        while(var11.hasNext()) {
            BakedQuad quad = (BakedQuad)var11.next();
            vertexConsumer1.putBulkData(entry1, quad, 1.0F, 1.0F, 1.0F, packedLight, packedOverlay);
        }
    }

    @FunctionalInterface
    public interface SpriteParticleRegistration<T extends ParticleOptions> {
        ParticleProvider<T> create(SpriteSet var1);
    }
}
