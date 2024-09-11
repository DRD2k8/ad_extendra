package com.drd.ad_extendra.world.gen.biome;

import com.drd.ad_extendra.world.gen.dimension.ModLevelStems;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;

import java.util.function.Predicate;

public class ModBiomeSelectors {
    public static Predicate<BiomeSelectionContext> foundInCeres() {
        return context -> context.canGenerateIn(ModLevelStems.CERES);
    }

    public static Predicate<BiomeSelectionContext> foundInJupiter() {
        return context -> context.canGenerateIn(ModLevelStems.JUPITER);
    }

    public static Predicate<BiomeSelectionContext> foundInSaturn() {
        return context -> context.canGenerateIn(ModLevelStems.SATURN);
    }

    public static Predicate<BiomeSelectionContext> foundInUranus() {
        return context -> context.canGenerateIn(ModLevelStems.URANUS);
    }

    public static Predicate<BiomeSelectionContext> foundInNeptune() {
        return context -> context.canGenerateIn(ModLevelStems.NEPTUNE);
    }

    public static Predicate<BiomeSelectionContext> foundInOrcus() {
        return context -> context.canGenerateIn(ModLevelStems.ORCUS);
    }

    public static Predicate<BiomeSelectionContext> foundInPluto() {
        return context -> context.canGenerateIn(ModLevelStems.PLUTO);
    }

    public static Predicate<BiomeSelectionContext> foundInHaumea() {
        return context -> context.canGenerateIn(ModLevelStems.HAUMEA);
    }

    public static Predicate<BiomeSelectionContext> foundInQuaoar() {
        return context -> context.canGenerateIn(ModLevelStems.QUAOAR);
    }

    public static Predicate<BiomeSelectionContext> foundInMakemake() {
        return context -> context.canGenerateIn(ModLevelStems.MAKEMAKE);
    }

    public static Predicate<BiomeSelectionContext> foundInGonggong() {
        return context -> context.canGenerateIn(ModLevelStems.GONGGONG);
    }

    public static Predicate<BiomeSelectionContext> foundInEris() {
        return context -> context.canGenerateIn(ModLevelStems.ERIS);
    }

    public static Predicate<BiomeSelectionContext> foundInSedna() {
        return context -> context.canGenerateIn(ModLevelStems.SEDNA);
    }

    public static Predicate<BiomeSelectionContext> foundInProximaCentauriB() {
        return context -> context.canGenerateIn(ModLevelStems.B);
    }
}
