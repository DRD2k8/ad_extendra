package com.drd.ad_extendra.world.gen.tree;

import com.drd.ad_extendra.world.gen.ModTreeConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class GlacianTreeGrower extends AbstractTreeGrower {
    public GlacianTreeGrower() {
    }

    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean b) {
        return ModTreeConfiguredFeatures.GLACIAN_KEY;
    }
}
