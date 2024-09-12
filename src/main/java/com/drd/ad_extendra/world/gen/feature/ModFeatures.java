package com.drd.ad_extendra.world.gen.feature;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.world.gen.feature.configuration.IcicleConfiguration;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;

public class ModFeatures {
    public static final ResourcefulRegistry<Feature<?>> FEATURES = ResourcefulRegistries.create(BuiltInRegistries.FEATURE, Main.MOD_ID);

    public static final RegistryEntry<Feature<?>> ICICLE = FEATURES.register("icicle", () -> new IcicleFeature(IcicleConfiguration.CODEC));
}
