package net.teddy0008.ad_extendra.util;

import earth.terrarium.ad_astra.mixin.forge.AxeItemAccessor;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Map;

public class PlatformUtilsImpl {
    public static void registerStrippedLog(Block log, Block strippedLog) {
        Map<Block, Block> strippedBlocks = new HashMap(AxeItemAccessor.ad_astra$getStrippables());
        strippedBlocks.put(log, strippedLog);
        AxeItemAccessor.ad_astra$setStrippables(strippedBlocks);
    }
}
