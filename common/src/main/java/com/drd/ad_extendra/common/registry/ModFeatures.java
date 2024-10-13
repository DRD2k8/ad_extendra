package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.worldgen.feature.IcicleFeature;
import com.drd.ad_extendra.worldgen.feature.configuration.IcicleConfiguration;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;

public class ModFeatures {
    public static final ResourcefulRegistry<Feature<?>> FEATURES = ResourcefulRegistries.create(BuiltInRegistries.FEATURE, AdExtendra.MOD_ID);

    public static final RegistryEntry<Feature<?>> ICICLE = FEATURES.register("icicle", () -> new IcicleFeature(IcicleConfiguration.CODEC));
}
