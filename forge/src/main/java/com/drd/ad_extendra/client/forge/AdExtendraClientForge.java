package com.drd.ad_extendra.client.forge;

import com.drd.ad_extendra.client.AdExtendraClient;
import earth.terrarium.adastra.client.forge.AdAstraClientForge;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdExtendraClientForge {
    public static void init() {}

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(AdExtendraClient::init);
        AdExtendraClient.onRegisterItemRenderers(AdAstraClientForge.ITEM_RENDERERS::put);
    }

    @SubscribeEvent
    public static void onRegisterLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        AdExtendraClient.onRegisterEntityLayers(event::registerLayerDefinition);
    }

    @SubscribeEvent
    public static void onRegisterParticles(RegisterParticleProvidersEvent event) {
        AdExtendraClient.onRegisterParticles((type, provider) -> event.registerSpriteSet(type, provider::create));
    }

    @SubscribeEvent
    public static void modelLoading(ModelEvent.RegisterAdditional event) {
        AdExtendraClient.onRegisterModels(event::register);
    }
}
