package com.drd.ad_extendra.worldgen.feature;

import com.drd.ad_extendra.common.AdExtendra;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLACIAN_SAPLING = registerKey("glacio/glacian_sapling");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AERONOS_MUSHROOM = registerKey("moon/aeronos_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STROPHAR_MUSHROOM = registerKey("moon/strophar_mushroom");

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(AdExtendra.MOD_ID, name));
    }
}
