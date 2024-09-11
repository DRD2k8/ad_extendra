package com.drd.ad_extendra.world.gen;

import com.drd.ad_extendra.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModTreeConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLACIAN_KEY = registerKey("glacian");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AERONOS_KEY = registerKey("aeronos");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STROPHAR_KEY = registerKey("strophar");

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Main.MOD_ID, name));
    }
}
