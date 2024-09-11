package com.drd.ad_extendra.entity.vehicle;

import com.drd.ad_extendra.entity.ModEntities;
import com.drd.ad_extendra.item.ModItems;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RocketTier9 extends Rocket {
    public RocketTier9(Level level) {
        super((EntityType) ModEntities.TIER_9_ROCKET.get(), level, 9);
    }

    public RocketTier9(EntityType<?> type, Level level) {
        super(type, level, 9);
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 1.7000000476837158;
    }

    public boolean shouldSit() {
        return false;
    }

    public ItemStack getDropStack() {
        return ((Item) ModItems.TIER_9_ROCKET.get()).getDefaultInstance();
    }
}
