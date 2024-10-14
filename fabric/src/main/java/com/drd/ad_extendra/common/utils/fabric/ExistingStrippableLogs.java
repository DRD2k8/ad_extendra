package com.drd.ad_extendra.common.utils.fabric;

import earth.terrarium.adastra.common.registry.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ExistingStrippableLogs {
    public static void register() {
        StrippableBlockRegistry.register(ModBlocks.GLACIAN_LOG.get(), ModBlocks.STRIPPED_GLACIAN_LOG.get());
    }
}
