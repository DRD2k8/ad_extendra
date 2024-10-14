package com.drd.ad_extendra.common.utils;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.mixin.WoodTypeInvoker;
import dev.architectury.injectables.targets.ArchitecturyTarget;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType AERONOS = registerWoodType("aeronos");
    public static final WoodType STROPHAR = registerWoodType("strophar");
    public static final WoodType GLACIAN = registerWoodType("glacian");

    private static WoodType registerWoodType(String name) {
        return WoodTypeInvoker.ad_extendra$register(new WoodType(ArchitecturyTarget.getCurrentTarget().equals("forge") ? AdExtendra.MOD_ID + ":" + name : name, BlockSetType.OAK));
    }
}
