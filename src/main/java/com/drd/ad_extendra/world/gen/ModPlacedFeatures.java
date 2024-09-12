package com.drd.ad_extendra.world.gen;

import com.drd.ad_extendra.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    // Ceres
    public static final ResourceKey<PlacedFeature> CERES_COPPER_ORE = registerKey("ceres/copper_ore");
    public static final ResourceKey<PlacedFeature> CERES_IRON_ORE = registerKey("ceres/iron_ore");

    // Jupiter
    public static final ResourceKey<PlacedFeature> JUPITER_COAL_ORE = registerKey("jupiter/coal_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_DIAMOND_ORE = registerKey("jupiter/diamond_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_GOLD_ORE = registerKey("jupiter/gold_ore");
    public static final ResourceKey<PlacedFeature> JUPITER_JUPERIUM_ORE = registerKey("jupiter/juperium_ore");

    // Saturn
    public static final ResourceKey<PlacedFeature> SATURN_COAL_ORE = registerKey("saturn/coal_ore");
    public static final ResourceKey<PlacedFeature> SATURN_DIAMOND_ORE = registerKey("saturn/diamond_ore");
    public static final ResourceKey<PlacedFeature> SATURN_GOLD_ORE = registerKey("saturn/gold_ore");
    public static final ResourceKey<PlacedFeature> SATURN_SATURLYTE_ORE = registerKey("saturn/saturlyte_ore");

    // Uranus
    public static final ResourceKey<PlacedFeature> URANUS_DIAMOND_ORE = registerKey("uranus/diamond_ore");
    public static final ResourceKey<PlacedFeature> URANUS_ICE_SHARD_ORE = registerKey("uranus/ice_shard_ore");
    public static final ResourceKey<PlacedFeature> URANUS_IRON_ORE = registerKey("uranus/iron_ore");
    public static final ResourceKey<PlacedFeature> URANUS_LAPIS_ORE = registerKey("uranus/lapis_ore");
    public static final ResourceKey<PlacedFeature> URANUS_URANIUM_ORE = registerKey("uranus/uranium_ore");
    public static final ResourceKey<PlacedFeature> URANUS_ICICLE_GEODE = registerKey("uranus/icicle_geode");
    public static final ResourceKey<PlacedFeature> URANUS_ICICLE = registerKey("uranus/icicle");

    // Neptune
    public static final ResourceKey<PlacedFeature> NEPTUNE_COAL_ORE = registerKey("neptune/coal_ore");
    public static final ResourceKey<PlacedFeature> NEPTUNE_COPPER_ORE = registerKey("neptune/copper_ore");
    public static final ResourceKey<PlacedFeature> NEPTUNE_ICE_SHARD_ORE = registerKey("neptune/ice_shard_ore");
    public static final ResourceKey<PlacedFeature> NEPTUNE_IRON_ORE = registerKey("neptune/iron_ore");
    public static final ResourceKey<PlacedFeature> NEPTUNE_NEPTUNIUM_ORE = registerKey("neptune/neptunium_ore");

    // Orcus
    public static final ResourceKey<PlacedFeature> ORCUS_COPPER_ORE = registerKey("orcus/copper_ore");
    public static final ResourceKey<PlacedFeature> ORCUS_IRON_ORE = registerKey("orcus/iron_ore");
    public static final ResourceKey<PlacedFeature> ORCUS_RADIUM_ORE = registerKey("orcus/radium_ore");

    // Pluto
    public static final ResourceKey<PlacedFeature> PLUTO_DIAMOND_ORE = registerKey("pluto/diamond_ore");
    public static final ResourceKey<PlacedFeature> PLUTO_GOLD_ORE = registerKey("pluto/gold_ore");
    public static final ResourceKey<PlacedFeature> PLUTO_ICE_SHARD_ORE = registerKey("pluto/ice_shard_ore");
    public static final ResourceKey<PlacedFeature> PLUTO_PLUTONIUM_ORE = registerKey("pluto/plutonium_ore");

    // Haumea
    public static final ResourceKey<PlacedFeature> HAUMEA_COPPER_ORE = registerKey("haumea/copper_ore");
    public static final ResourceKey<PlacedFeature> HAUMEA_IRON_ORE = registerKey("haumea/iron_ore");

    // Quaoar
    public static final ResourceKey<PlacedFeature> QUAOAR_COPPER_ORE = registerKey("quaoar/copper_ore");
    public static final ResourceKey<PlacedFeature> QUAOAR_IRON_ORE = registerKey("quaoar/iron_ore");

    // Makemake
    public static final ResourceKey<PlacedFeature> MAKEMAKE_COPPER_ORE = registerKey("makemake/copper_ore");
    public static final ResourceKey<PlacedFeature> MAKEMAKE_IRON_ORE = registerKey("makemake/iron_ore");

    // Gonggong
    public static final ResourceKey<PlacedFeature> GONGGONG_COPPER_ORE = registerKey("gonggong/copper_ore");
    public static final ResourceKey<PlacedFeature> GONGGONG_IRON_ORE = registerKey("gonggong/iron_ore");

    // Eris
    public static final ResourceKey<PlacedFeature> ERIS_COPPER_ORE = registerKey("eris/copper_ore");
    public static final ResourceKey<PlacedFeature> ERIS_IRON_ORE = registerKey("eris/iron_ore");

    // Sedna
    public static final ResourceKey<PlacedFeature> SEDNA_COPPER_ORE = registerKey("sedna/copper_ore");
    public static final ResourceKey<PlacedFeature> SEDNA_ELECTROLYTE_ORE = registerKey("sedna/electrolyte_ore");
    public static final ResourceKey<PlacedFeature> SEDNA_IRON_ORE = registerKey("sedna/iron_ore");

    // Proxima Centauri b
    public static final ResourceKey<PlacedFeature> B_DIAMOND_ORE = registerKey("b/diamond_ore");
    public static final ResourceKey<PlacedFeature> B_EMERALD_ORE = registerKey("b/emerald_ore");
    public static final ResourceKey<PlacedFeature> B_IRON_ORE = registerKey("b/iron_ore");
    public static final ResourceKey<PlacedFeature> B_REDSTONE_ORE = registerKey("b/redstone_ore");

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Main.MOD_ID, name));
    }
}
