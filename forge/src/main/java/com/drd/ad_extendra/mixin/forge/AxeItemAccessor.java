package com.drd.ad_extendra.mixin.forge;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(AxeItem.class)
public interface AxeItemAccessor {
    @Accessor("STRIPPABLES")
    static Map<Block, Block> ad_extendra$getStrippables() {
        throw new UnsupportedOperationException();
    }

    @Mutable
    @Accessor("STRIPPABLES")
    static void ad_extendra$setStrippables(Map<Block, Block> value) {
        throw new UnsupportedOperationException();
    }
}
