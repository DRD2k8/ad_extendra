package com.drd.ad_extendra.world.gen.ore;

import com.drd.ad_extendra.world.gen.ModOrePlacedFeatures;
import com.drd.ad_extendra.world.gen.biome.ModBiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModOrePlacement {
    public static void generateOres() {
        // Ceres
        BiomeModifications.addFeature(ModBiomeSelectors.foundInCeres(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.CERES_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInCeres(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.CERES_IRON_ORE);

        // Jupiter
        BiomeModifications.addFeature(ModBiomeSelectors.foundInJupiter(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.JUPITER_COAL_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInJupiter(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.JUPITER_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInJupiter(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.JUPITER_GOLD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInJupiter(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.JUPITER_JUPERIUM_ORE);

        // Saturn
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSaturn(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.SATURN_COAL_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSaturn(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.SATURN_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSaturn(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.SATURN_GOLD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSaturn(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.SATURN_SATURLYTE_ORE);

        // Uranus
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.URANUS_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.URANUS_ICE_SHARD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.URANUS_IRON_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.URANUS_LAPIS_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInUranus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.URANUS_URANIUM_ORE);

        // Neptune
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.NEPTUNE_COAL_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.NEPTUNE_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.NEPTUNE_ICE_SHARD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.NEPTUNE_IRON_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInNeptune(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.NEPTUNE_NEPTUNIUM_ORE);

        // Orcus
        BiomeModifications.addFeature(ModBiomeSelectors.foundInOrcus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.ORCUS_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInOrcus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.ORCUS_IRON_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInOrcus(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.ORCUS_RADIUM_ORE);

        // Pluto
        BiomeModifications.addFeature(ModBiomeSelectors.foundInPluto(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.PLUTO_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInPluto(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.PLUTO_GOLD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInPluto(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.PLUTO_ICE_SHARD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInPluto(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.PLUTO_PLUTONIUM_ORE);

        // Haumea
        BiomeModifications.addFeature(ModBiomeSelectors.foundInHaumea(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.HAUMEA_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInHaumea(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.HAUMEA_IRON_ORE);

        // Quaoar
        BiomeModifications.addFeature(ModBiomeSelectors.foundInQuaoar(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.QUAOAR_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInQuaoar(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.QUAOAR_IRON_ORE);

        // Makemake
        BiomeModifications.addFeature(ModBiomeSelectors.foundInMakemake(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.MAKEMAKE_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInMakemake(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.MAKEMAKE_IRON_ORE);

        // Gonggong
        BiomeModifications.addFeature(ModBiomeSelectors.foundInGonggong(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.GONGGONG_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInGonggong(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.GONGGONG_IRON_ORE);

        // Eris
        BiomeModifications.addFeature(ModBiomeSelectors.foundInEris(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.ERIS_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInEris(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.ERIS_IRON_ORE);

        // Sedna
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSedna(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.SEDNA_COPPER_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSedna(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.SEDNA_ELECTROLYTE_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInSedna(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.SEDNA_IRON_ORE);

        // Proxima Centauri b
        BiomeModifications.addFeature(ModBiomeSelectors.foundInProximaCentauriB(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.B_DIAMOND_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInProximaCentauriB(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.B_EMERALD_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInProximaCentauriB(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.B_IRON_ORE);
        BiomeModifications.addFeature(ModBiomeSelectors.foundInProximaCentauriB(),
                GenerationStep.Decoration.UNDERGROUND_ORES, ModOrePlacedFeatures.B_REDSTONE_ORE);
    }
}
