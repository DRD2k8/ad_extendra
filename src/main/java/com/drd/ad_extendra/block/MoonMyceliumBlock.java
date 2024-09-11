package com.drd.ad_extendra.block;

import earth.terrarium.ad_astra.common.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.lighting.LightEngine;

public class MoonMyceliumBlock extends Block implements BonemealableBlock {
    public MoonMyceliumBlock(Properties pProperties) {
        super(pProperties);
    }

    private static boolean canBeNylium(BlockState pState, LevelReader pReader, BlockPos pPos) {
        BlockPos $$3 = pPos.above();
        BlockState $$4 = pReader.getBlockState($$3);
        int $$5 = LightEngine.getLightBlockInto(pReader, pState, pPos, $$4, $$3, Direction.UP, $$4.getLightBlock(pReader, $$3));
        return $$5 < pReader.getMaxLightLevel();
    }

    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!canBeNylium(pState, pLevel, pPos)) {
            pLevel.setBlockAndUpdate(pPos, ModBlocks.MOON_STONE.get().defaultBlockState());
        }
    }

    public boolean isValidBonemealTarget(LevelReader pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return pLevel.getBlockState(pPos.above()).isAir();
    }

    public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        return true;
    }

    public void performBonemeal(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        BlockState $$4 = pLevel.getBlockState(pPos);
        BlockPos $$5 = pPos.above();
        ChunkGenerator $$6 = pLevel.getChunkSource().getGenerator();
        Registry<ConfiguredFeature<?, ?>> $$7 = pLevel.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE);
        // This part will be for the generation
        // if ($$4.is(ModBlocks.MOON_MYCELIUM.get())) {
        //     this.place($$7, MoonFeatures.AERONOS_VEGETATION_BONEMEAL, pLevel, $$6, pRandom, $$5);
        // }
    }

    private void place(Registry<ConfiguredFeature<?, ?>> pFeatureRegistry, ResourceKey<ConfiguredFeature<?, ?>> pFeatureKey, ServerLevel pLevel, ChunkGenerator pChunkGenerator, RandomSource pRandom, BlockPos pPos) {
        pFeatureRegistry.getHolder(pFeatureKey).ifPresent((p_255920_) -> {
            ((ConfiguredFeature)p_255920_.value()).place(pLevel, pChunkGenerator, pRandom, pPos);
        });
    }
}
