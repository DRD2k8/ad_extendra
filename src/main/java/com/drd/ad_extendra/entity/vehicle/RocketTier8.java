package com.drd.ad_extendra.entity.vehicle;

import com.drd.ad_extendra.entity.ModEntities;
import com.drd.ad_extendra.item.ModItems;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RocketTier8 extends Rocket {
    public RocketTier8(Level level) {
        super((EntityType) ModEntities.TIER_8_ROCKET.get(), level, 8);
    }

    public RocketTier8(EntityType<?> type, Level level) {
        super(type, level, 8);
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 1.7000000476837158;
    }

    public boolean shouldSit() {
        return false;
    }

    public ItemStack getDropStack() {
        return ((Item) ModItems.TIER_8_ROCKET.get()).getDefaultInstance();
    }
}
