package com.drd.ad_extendra.fabric;

import com.drd.ad_extendra.common.AdExtendra;
import net.fabricmc.api.ModInitializer;

public class AdExtendraFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AdExtendra.init();
    }
}
