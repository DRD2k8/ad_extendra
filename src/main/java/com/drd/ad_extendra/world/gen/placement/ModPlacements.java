package com.drd.ad_extendra.world.gen.placement;

import com.drd.ad_extendra.entity.ModEntities;
import com.drd.ad_extendra.world.gen.ModPlacedFeatures;
import com.drd.ad_extendra.world.gen.biome.ModBiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.Heightmap;

public class ModPlacements {
    public static void generateOres() {
        // Ceres
        BiomeModifications.addFeature(ModBiomeSelectors.foundInCeres(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.CERES_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInCeres(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.CERES_IRON_ORE);

        // Jupiter
        BiomeModifications.addFeature(ModBiomeSelectors.foundInJupiter(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.JUPITER_COAL_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInJupiter(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.JUPITER_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInJupiter(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.JUPITER_GOLD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInJupiter(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.JUPITER_JUPERIUM_ORE);

        // Saturn
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSaturn(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SATURN_COAL_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSaturn(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SATURN_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSaturn(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SATURN_GOLD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSaturn(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SATURN_SATURLYTE_ORE);

        // Uranus
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.URANUS_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.URANUS_ICE_SHARD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.URANUS_IRON_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.URANUS_LAPIS_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.URANUS_URANIUM_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.URANUS_ICICLE_GEODE);

        // Neptune
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.NEPTUNE_COAL_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.NEPTUNE_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.NEPTUNE_ICE_SHARD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.NEPTUNE_IRON_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.NEPTUNE_NEPTUNIUM_ORE);

        // Orcus
        BiomeModifications.addFeature(ModBiomeSelectors.foundInOrcus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.ORCUS_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInOrcus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.ORCUS_IRON_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInOrcus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.ORCUS_RADIUM_ORE);

        // Pluto
        BiomeModifications.addFeature(ModBiomeSelectors.foundInPluto(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.PLUTO_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInPluto(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.PLUTO_GOLD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInPluto(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.PLUTO_ICE_SHARD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInPluto(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.PLUTO_PLUTONIUM_ORE);

        // Haumea
        BiomeModifications.addFeature(ModBiomeSelectors.foundInHaumea(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.HAUMEA_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInHaumea(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.HAUMEA_IRON_ORE);

        // Quaoar
        BiomeModifications.addFeature(ModBiomeSelectors.foundInQuaoar(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.QUAOAR_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInQuaoar(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.QUAOAR_IRON_ORE);

        // Makemake
        BiomeModifications.addFeature(ModBiomeSelectors.foundInMakemake(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.MAKEMAKE_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInMakemake(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.MAKEMAKE_IRON_ORE);

        // Gonggong
        BiomeModifications.addFeature(ModBiomeSelectors.foundInGonggong(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.GONGGONG_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInGonggong(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.GONGGONG_IRON_ORE);

        // Eris
        BiomeModifications.addFeature(ModBiomeSelectors.foundInEris(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.ERIS_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInEris(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.ERIS_IRON_ORE);

        // Sedna
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSedna(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SEDNA_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSedna(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SEDNA_ELECTROLYTE_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSedna(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SEDNA_IRON_ORE);

        // Proxima Centauri b
        BiomeModifications.addFeature(ModBiomeSelectors.foundInProximaCentauriB(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.B_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInProximaCentauriB(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.B_EMERALD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInProximaCentauriB(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.B_IRON_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInProximaCentauriB(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.B_REDSTONE_ORE);
    }

    public static void generateUndergroundDecorations() {
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_DECORATION, ModPlacedFeatures.URANUS_ICICLE);
    }

    public static void addSpawns() {
        SpawnPlacements.register(ModEntities.FREEZE.get(),
                SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Monster::checkMonsterSpawnRules);
    }
}
