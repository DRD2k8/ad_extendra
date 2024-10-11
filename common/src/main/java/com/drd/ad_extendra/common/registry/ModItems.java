package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.adastra.common.items.vehicles.RocketItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, AdExtendra.MOD_ID);
    public static final ResourcefulRegistry<Item> VEHICLES = ResourcefulRegistries.create(ITEMS);

    public static final RegistryEntry<Item> TIER_5_ROCKET = registerRocket(5, ModEntityTypes.TIER_5_ROCKET::get);
    public static final RegistryEntry<Item> TIER_6_ROCKET = registerRocket(6, ModEntityTypes.TIER_6_ROCKET::get);
    public static final RegistryEntry<Item> TIER_7_ROCKET = registerRocket(7, ModEntityTypes.TIER_7_ROCKET::get);
    public static final RegistryEntry<Item> TIER_8_ROCKET = registerRocket(8, ModEntityTypes.TIER_8_ROCKET::get);
    public static final RegistryEntry<Item> TIER_9_ROCKET = registerRocket(9, ModEntityTypes.TIER_9_ROCKET::get);
    public static final RegistryEntry<Item> TIER_10_ROCKET = registerRocket(10, ModEntityTypes.TIER_10_ROCKET::get);
    public static final RegistryEntry<Item> TIER_11_ROCKET = registerRocket(11, ModEntityTypes.TIER_11_ROCKET::get);

    private static RegistryEntry<Item> registerRocket(int tier, Supplier<EntityType<?>> entity) {
        return VEHICLES.register("tier_" + tier + "_rocket", () -> new RocketItem(entity, new Item.Properties().stacksTo(1).fireResistant()));
    }
}
