package com.drd.ad_extendra.forge;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.client.forge.AdExtendraClientForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(AdExtendra.MOD_ID)
public class AdExtendraForge {
    public AdExtendraForge() {
        AdExtendra.init();

        if (FMLEnvironment.dist.isClient()) AdExtendraClientForge.init();
    }
}
