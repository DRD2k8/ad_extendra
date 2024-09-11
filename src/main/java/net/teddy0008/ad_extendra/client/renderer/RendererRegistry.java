package net.teddy0008.ad_extendra.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.client.ClientPlatformUtils;
import net.teddy0008.ad_extendra.client.renderer.block.globe.*;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10.RocketItemRendererTier10;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_11.RocketItemRendererTier11;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5.RocketItemRendererTier5;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_6.RocketItemRendererTier6;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_7.RocketItemRendererTier7;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_8.RocketItemRendererTier8;
import net.teddy0008.ad_extendra.client.renderer.entity.vehicle.rocket.tier_9.RocketItemRendererTier9;
import net.teddy0008.ad_extendra.item.ModItems;

import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class RendererRegistry {
    public static void onRegisterBlockRenderTypes(BiConsumer<RenderType, List<Block>> register) {
        ModBlocks.CERES_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.CERES_GLOBE.get()));
        });
        ModBlocks.JUPITER_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.JUPITER_GLOBE.get()));
        });
        ModBlocks.SATURN_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.SATURN_GLOBE.get()));
        });
        ModBlocks.URANUS_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.URANUS_GLOBE.get()));
        });
        ModBlocks.NEPTUNE_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.NEPTUNE_GLOBE.get()));
        });
        ModBlocks.ORCUS_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.ORCUS_GLOBE.get()));
        });
        ModBlocks.PLUTO_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.PLUTO_GLOBE.get()));
        });
        ModBlocks.HAUMEA_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.HAUMEA_GLOBE.get()));
        });
        ModBlocks.QUAOAR_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.QUAOAR_GLOBE.get()));
        });
        ModBlocks.MAKEMAKE_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.MAKEMAKE_GLOBE.get()));
        });
        ModBlocks.GONGGONG_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.GONGGONG_GLOBE.get()));
        });
        ModBlocks.ERIS_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.ERIS_GLOBE.get()));
        });
        ModBlocks.SEDNA_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.SEDNA_GLOBE.get()));
        });
        ModBlocks.B_GLOBE.stream().forEach((block) -> {
            register.accept(RenderType.cutout(), List.of((Block)ModBlocks.B_GLOBE.get()));
        });
    }

    public static void onRegisterItemRenderers(BiConsumer<ItemLike, BlockEntityWithoutLevelRenderer> register) {
        ModItems.CERES_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.CERES_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.JUPITER_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.JUPITER_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.SATURN_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.SATURN_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.URANUS_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.URANUS_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.NEPTUNE_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.NEPTUNE_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.ORCUS_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.ORCUS_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.PLUTO_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.PLUTO_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.HAUMEA_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.HAUMEA_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.QUAOAR_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.QUAOAR_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.MAKEMAKE_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.MAKEMAKE_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.GONGGONG_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.GONGGONG_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.ERIS_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.ERIS_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.SEDNA_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.SEDNA_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
        });
        ModItems.B_GLOBE.stream().forEach((item) -> {
            register.accept((ItemLike)ModItems.B_GLOBE.get(), new CustomGlobeRenderer.ItemRenderer());
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
        // Sliding Doors
        ModBlocks.JUPERIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.JUPERIUM_SLIDING_DOOR.getId().getPath()));
        });
        ModBlocks.JUPERIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.JUPERIUM_SLIDING_DOOR.getId().getPath() + "_flipped"));
        });
        ModBlocks.SATURLYTE_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.SATURLYTE_SLIDING_DOOR.getId().getPath()));
        });
        ModBlocks.SATURLYTE_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.SATURLYTE_SLIDING_DOOR.getId().getPath() + "_flipped"));
        });
        ModBlocks.URANIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.URANIUM_SLIDING_DOOR.getId().getPath()));
        });
        ModBlocks.URANIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.URANIUM_SLIDING_DOOR.getId().getPath() + "_flipped"));
        });
        ModBlocks.NEPTUNIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.NEPTUNIUM_SLIDING_DOOR.getId().getPath()));
        });
        ModBlocks.NEPTUNIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.NEPTUNIUM_SLIDING_DOOR.getId().getPath() + "_flipped"));
        });
        ModBlocks.RADIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.RADIUM_SLIDING_DOOR.getId().getPath()));
        });
        ModBlocks.RADIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.RADIUM_SLIDING_DOOR.getId().getPath() + "_flipped"));
        });
        ModBlocks.PLUTONIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.PLUTONIUM_SLIDING_DOOR.getId().getPath()));
        });
        ModBlocks.PLUTONIUM_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.PLUTONIUM_SLIDING_DOOR.getId().getPath() + "_flipped"));
        });
        ModBlocks.ELECTROLYTE_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.ELECTROLYTE_SLIDING_DOOR.getId().getPath()));
        });
        ModBlocks.ELECTROLYTE_SLIDING_DOOR.stream().forEach((block) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/door/" + ModBlocks.ELECTROLYTE_SLIDING_DOOR.getId().getPath() + "_flipped"));
        });

        // Globes
        ModBlocks.CERES_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.CERES_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.JUPITER_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.JUPITER_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.SATURN_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.SATURN_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.URANUS_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.URANUS_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.NEPTUNE_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.NEPTUNE_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.ORCUS_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.ORCUS_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.PLUTO_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.PLUTO_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.HAUMEA_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.HAUMEA_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.QUAOAR_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.QUAOAR_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.MAKEMAKE_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.MAKEMAKE_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.GONGGONG_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.GONGGONG_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.ERIS_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.ERIS_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.SEDNA_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.SEDNA_GLOBE.getId().getPath() + "_cube"));
        });
        ModBlocks.B_GLOBE.stream().forEach((b) -> {
            register.accept(new ResourceLocation(Main.MOD_ID, "block/" + ModBlocks.B_GLOBE.getId().getPath() + "_cube"));
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
}
