package com.drd.ad_extendra.world.gen.dimension;

import com.drd.ad_extendra.Main;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.dimension.LevelStem;

public class ModLevelStems {
    public static final ResourceKey<LevelStem> CERES = registerKey("ceres");
    public static final ResourceKey<LevelStem> JUPITER = registerKey("jupiter");
    public static final ResourceKey<LevelStem> SATURN = registerKey("saturn");
    public static final ResourceKey<LevelStem> URANUS = registerKey("uranus");
    public static final ResourceKey<LevelStem> NEPTUNE = registerKey("neptune");
    public static final ResourceKey<LevelStem> ORCUS = registerKey("orcus");
    public static final ResourceKey<LevelStem> PLUTO = registerKey("pluto");
    public static final ResourceKey<LevelStem> HAUMEA = registerKey("haumea");
    public static final ResourceKey<LevelStem> QUAOAR = registerKey("quaoar");
    public static final ResourceKey<LevelStem> MAKEMAKE = registerKey("makemake");
    public static final ResourceKey<LevelStem> GONGGONG = registerKey("gonggong");
    public static final ResourceKey<LevelStem> ERIS = registerKey("eris");
    public static final ResourceKey<LevelStem> SEDNA = registerKey("sedna");
    public static final ResourceKey<LevelStem> B = registerKey("b");

    public static ResourceKey<LevelStem> registerKey(String name) {
        return ResourceKey.create(Registries.LEVEL_STEM, new ResourceLocation(Main.MOD_ID, name));
    }
}
