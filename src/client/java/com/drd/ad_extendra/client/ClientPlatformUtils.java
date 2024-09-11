package com.drd.ad_extendra.client;

import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.resources.ResourceLocation;

public class ClientPlatformUtils {
    public static BakedModel getModel(ModelManager dispatcher, ResourceLocation id) {
        return ClientPlatformUtilsImpl.getModel(dispatcher, id);
    }
}
