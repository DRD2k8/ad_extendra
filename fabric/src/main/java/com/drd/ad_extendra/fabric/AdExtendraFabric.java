package com.drd.ad_extendra.fabric;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.drd.ad_extendra.common.registry.ModEntityTypes;
import com.drd.ad_extendra.common.utils.fabric.ModLootModifiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class AdExtendraFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AdExtendra.init();
        ModEntityTypes.registerAttributes((type, builder) -> FabricDefaultAttributeRegistry.register(type.get(), builder.get()));

        StrippableBlockRegistry.register(earth.terrarium.adastra.common.registry.ModBlocks.GLACIAN_LOG.get(), earth.terrarium.adastra.common.registry.ModBlocks.STRIPPED_GLACIAN_LOG.get());
        StrippableBlockRegistry.register(ModBlocks.GLACIAN_WOOD.get(), ModBlocks.STRIPPED_GLACIAN_WOOD.get());

        ModLootModifiers.modifyLootTables();
    }
}
