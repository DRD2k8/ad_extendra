package com.drd.ad_extendra;

import com.drd.ad_extendra.block.ModBlocks;
import com.drd.ad_extendra.block.entity.ModBlockEntities;
import com.drd.ad_extendra.entity.ModEntities;
import com.drd.ad_extendra.entity.vehicle.ModBoats;
import com.drd.ad_extendra.item.ModCreativeTabs;
import com.drd.ad_extendra.item.ModItems;
import com.drd.ad_extendra.painting.ModPaintings;
import com.drd.ad_extendra.particle.ModParticles;
import com.drd.ad_extendra.util.ModLootModifiers;
import com.drd.ad_extendra.world.gen.feature.ModFeatures;
import com.drd.ad_extendra.world.gen.placement.ModPlacements;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class Main implements ModInitializer {
    public static final String MOD_ID = "ad_extendra";

    @Override
    public void onInitialize() {
        ModBlocks.BLOCKS.init();
        ModBlockEntities.BLOCK_ENTITIES.init();
        ModCreativeTabs.CREATIVE_TABS.init();
        ModEntities.ENTITIES.init();
        ModEntities.ROCKETS.init();
        ModFeatures.FEATURES.init();
        ModItems.ITEMS.init();
        ModItems.ROCKETS.init();
        ModPaintings.PAINTINGS.init();
        ModParticles.PARTICLES.init();

        ModEntities.registerAttributes((type, builder) -> FabricDefaultAttributeRegistry.register(type.get(), builder.get()));

        ModBoats.registerBoats();

        StrippableBlockRegistry.register(ModBlocks.GLACIAN_WOOD.get(), ModBlocks.STRIPPED_GLACIAN_WOOD.get());

        ModLootModifiers.modifyLootTables();
        ModPlacements.generateOres();
        ModPlacements.generateUndergroundDecorations();
    }
}
