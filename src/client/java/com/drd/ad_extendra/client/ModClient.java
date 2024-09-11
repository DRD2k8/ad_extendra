package com.drd.ad_extendra.client;

import com.drd.ad_extendra.client.renderer.RendererRegistry;
import com.drd.ad_extendra.client.renderer.entity.ModEntityModelLayers;
import com.drd.ad_extendra.entity.vehicle.ModBoats;
import com.drd.ad_extendra.util.texture.ModSignTextures;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.function.Supplier;

public class ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RendererRegistry.registerEntityRenderers();
        RendererRegistry.registerBlockEntityRenderers();
        ModelLoadingRegistry.INSTANCE.registerModelProvider((manager, out) -> RendererRegistry.onRegisterModels(out));
        RendererRegistry.onRegisterBlockRenderTypes(ModClient::registerBlockRenderTypes);
        RendererRegistry.onRegisterItemRenderers(ModClient::registerItemRenderer);
        RendererRegistry.onRegisterParticles(ModClient::registerParticles);
        registerRenderers();

        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(Sheets.SIGN_SHEET, ModSignTextures.AERONOS_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(Sheets.SIGN_SHEET, ModSignTextures.AERONOS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(Sheets.SIGN_SHEET, ModSignTextures.STROPHAR_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(Sheets.SIGN_SHEET, ModSignTextures.STROPHAR_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier(new Material(Sheets.SIGN_SHEET, ModSignTextures.GLACIAN_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(ModBoats.GLACIAN_BOAT_ID, false);
    }

    private static void registerParticles(ParticleType<SimpleParticleType> particle, RendererRegistry.SpriteParticleRegistration<SimpleParticleType> provider) {
        ParticleFactoryRegistry.getInstance().register(particle, provider::create);
    }

    private static void registerItemRenderer(ItemLike item, BlockEntityWithoutLevelRenderer renderer) {
        BuiltinItemRendererRegistry.INSTANCE.register(item.asItem(), renderer::renderByItem);
    }

    private static void registerBlockRenderTypes(RenderType type, List<Block> blocks) {
        BlockRenderLayerMap.INSTANCE.putBlocks(type, blocks.toArray(new Block[0]));
    }

    private static void registerRenderers() {
        ModEntityModelLayers.registerEntityLayers(new ModEntityModelLayers.LayerDefinitionRegistry() {
            @Override
            public void register(ModelLayerLocation location, Supplier<LayerDefinition> definition) {
                EntityModelLayerRegistry.registerModelLayer(location, definition::get);
            }
        });
    }
}
