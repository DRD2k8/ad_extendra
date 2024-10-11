package com.drd.ad_extendra.common;

import com.drd.ad_extendra.common.registry.*;

public class AdExtendra {
    public static final String MOD_ID = "ad_extendra";

    public static void init() {
        ModCreativeTab.init();
        ModEntityTypes.ENTITY_TYPES.init();
        ModEntityTypes.ROCKETS.init();
        ModItems.ITEMS.init();
    }

    public static void postInit() {
    }
}
