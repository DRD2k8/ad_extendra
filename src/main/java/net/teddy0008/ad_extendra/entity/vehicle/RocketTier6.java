package net.teddy0008.ad_extendra.entity.vehicle;

import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.teddy0008.ad_extendra.entity.ModEntities;
import net.teddy0008.ad_extendra.item.ModItems;

public class RocketTier6 extends Rocket {
    public RocketTier6(Level level) {
        super((EntityType) ModEntities.TIER_6_ROCKET.get(), level, 6);
    }

    public RocketTier6(EntityType<?> type, Level level) {
        super(type, level, 6);
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 1.7000000476837158;
    }

    public boolean shouldSit() {
        return false;
    }

    public ItemStack getDropStack() {
        return ((Item) ModItems.TIER_6_ROCKET.get()).getDefaultInstance();
    }
}
