package com.drd.ad_extendra.util;

import earth.terrarium.ad_astra.common.registry.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;

public class ModVillagerTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 3,
                factories -> {
                    factories.add((trader, rand) -> new MerchantOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.EARTH_GLOBE.get()),1,8,0.02F));
                });
    }
}
