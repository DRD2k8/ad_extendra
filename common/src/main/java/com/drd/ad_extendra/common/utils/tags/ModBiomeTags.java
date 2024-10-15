package com.drd.ad_extendra.common.utils.tags;

import com.drd.ad_extendra.common.AdExtendra;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class ModBiomeTags {
    public static final TagKey<Biome> HAS_JUPITER_CLOUDS = tag("has_jupiter_clouds");
    public static final TagKey<Biome> HAS_SATURN_CLOUDS = tag("has_saturn_clouds");

    private static TagKey<Biome> tag(String name) {
        return TagKey.create(Registries.BIOME, new ResourceLocation(AdExtendra.MOD_ID, name));
    }
}
