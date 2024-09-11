package net.teddy0008.ad_extendra.world.gen;

import earth.terrarium.ad_astra.common.registry.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.HugeMushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.HugeMushroomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.teddy0008.ad_extendra.Main;

public class ModTreeConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLACIAN_KEY = registerKey("glacian");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AERONOS_KEY = registerKey("aeronos");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STROPHAR_KEY = registerKey("strophar");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, GLACIAN_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GLACIAN_LOG.get()),
                new StraightTrunkPlacer(5, 3, 3),

                BlockStateProvider.simple(ModBlocks.GLACIAN_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(4), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, AERONOS_KEY, Feature.HUGE_RED_MUSHROOM, new HugeMushroomFeatureConfiguration(
                BlockStateProvider.simple((BlockState) ModBlocks.AERONOS_CAP.get().defaultBlockState().setValue(HugeMushroomBlock.DOWN, false)),
                BlockStateProvider.simple((BlockState)((BlockState)ModBlocks.AERONOS_STEM.get().defaultBlockState().setValue(HugeMushroomBlock.UP, false))
                        .setValue(HugeMushroomBlock.DOWN, false)), 3));

        register(context, STROPHAR_KEY, Feature.HUGE_BROWN_MUSHROOM, new HugeMushroomFeatureConfiguration(
                BlockStateProvider.simple((BlockState) ModBlocks.STROPHAR_CAP.get().defaultBlockState().setValue(HugeMushroomBlock.DOWN, false)),
                BlockStateProvider.simple((BlockState)((BlockState)ModBlocks.STROPHAR_STEM.get().defaultBlockState().setValue(HugeMushroomBlock.UP, false))
                        .setValue(HugeMushroomBlock.DOWN, false)), 3));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Main.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
