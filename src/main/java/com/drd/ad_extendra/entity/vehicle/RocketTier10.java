package com.drd.ad_extendra.entity.vehicle;

import com.drd.ad_extendra.entity.ModEntities;
import com.drd.ad_extendra.item.ModItems;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RocketTier10 extends Rocket {
    public RocketTier10(Level level) {
        super((EntityType) ModEntities.TIER_10_ROCKET.get(), level, 10);
    }

    public RocketTier10(EntityType<?> type, Level level) {
        super(type, level, 10);
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 2.2000000476837158;
    }

    public boolean shouldSit() {
        return false;
    }

    public ItemStack getDropStack() {
        return ((Item) ModItems.TIER_10_ROCKET.get()).getDefaultInstance();
    }
}
