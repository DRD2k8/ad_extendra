package com.drd.ad_extendra.common;

import com.drd.ad_extendra.common.registry.*;

public class AdExtendra {
    public static final String MOD_ID = "ad_extendra";

    public static void init() {
        ModBlocks.BLOCKS.init();
        ModBlockEntityTypes.BLOCK_ENTITY_TYPES.init();
        ModCreativeTab.init();
        ModEntityTypes.ENTITY_TYPES.init();
        ModEntityTypes.ROCKETS.init();
        ModFeatures.FEATURES.init();
        ModItems.ITEMS.init();
        ModPaintingVariants.PAINTING_VARIANTS.init();
        ModParticleTypes.PARTICLE_TYPES.init();
    }

    public static void postInit() {
    }
}
