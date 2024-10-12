package com.drd.ad_extendra.client.fabric;

import com.drd.ad_extendra.client.AdExtendraClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

public class AdExtendraClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AdExtendraClient.init();

        AdExtendraClient.onRegisterItemRenderers(((item, renderer) -> BuiltinItemRendererRegistry.INSTANCE.register(item, renderer::renderByItem)));
        AdExtendraClient.onRegisterEntityLayers(((location, definition) -> EntityModelLayerRegistry.registerModelLayer(location, definition::get)));

        ModelLoadingPlugin.register(ctx -> AdExtendraClient.onRegisterModels(ctx::addModels));
    }
}
