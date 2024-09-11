package com.drd.ad_extendra.entity.vehicle;

import com.drd.ad_extendra.entity.ModEntities;
import com.drd.ad_extendra.item.ModItems;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RocketTier11 extends Rocket {
    public RocketTier11(Level level) {
        super((EntityType) ModEntities.TIER_11_ROCKET.get(), level, 11);
    }

    public RocketTier11(EntityType<?> type, Level level) {
        super(type, level, 11);
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 2.2000000476837158;
    }

    public boolean shouldSit() {
        return false;
    }

    public ItemStack getDropStack() {
        return ((Item) ModItems.TIER_11_ROCKET.get()).getDefaultInstance();
    }
}
