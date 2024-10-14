package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.entities.vehicles.CustomBoat;
import com.drd.ad_extendra.common.items.CustomBoatItem;
import com.drd.ad_extendra.common.items.IceChargeItem;
import com.drd.ad_extendra.common.utils.PlatformUtils;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.adastra.common.items.vehicles.RocketItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class ModItems {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, AdExtendra.MOD_ID);
    public static final ResourcefulRegistry<Item> BASIC_ITEMS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> BLOCK_ITEMS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> SLIDING_DOORS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> GLOBES = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> SPAWN_EGGS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> VEHICLES = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> SIGNS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> HANGING_SIGNS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> BOATS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> CHEST_BOATS = ResourcefulRegistries.create(ITEMS);

    // Signs
    public static final RegistryEntry<Item> AERONOS_SIGN = registerSign("aeronos_sign", ModBlocks.AERONOS_SIGN, ModBlocks.AERONOS_WALL_SIGN);
    public static final RegistryEntry<Item> AERONOS_HANGING_SIGN = registerHangingSign("aeronos_hanging_sign", ModBlocks.AERONOS_HANGING_SIGN, ModBlocks.AERONOS_WALL_HANGING_SIGN);
    public static final RegistryEntry<Item> STROPHAR_SIGN = registerSign("strophar_sign", ModBlocks.STROPHAR_SIGN, ModBlocks.STROPHAR_WALL_SIGN);
    public static final RegistryEntry<Item> STROPHAR_HANGING_SIGN = registerHangingSign("strophar_hanging_sign", ModBlocks.STROPHAR_HANGING_SIGN, ModBlocks.STROPHAR_WALL_HANGING_SIGN);
    public static final RegistryEntry<Item> GLACIAN_SIGN = registerSign("glacian_sign", ModBlocks.GLACIAN_SIGN, ModBlocks.GLACIAN_WALL_SIGN);
    public static final RegistryEntry<Item> GLACIAN_HANGING_SIGN = registerHangingSign("glacian_hanging_sign", ModBlocks.GLACIAN_HANGING_SIGN, ModBlocks.GLACIAN_WALL_HANGING_SIGN);

    // Rockets
    public static final RegistryEntry<Item> TIER_5_ROCKET = registerRocket(5, ModEntityTypes.TIER_5_ROCKET::get);
    public static final RegistryEntry<Item> TIER_6_ROCKET = registerRocket(6, ModEntityTypes.TIER_6_ROCKET::get);
    public static final RegistryEntry<Item> TIER_7_ROCKET = registerRocket(7, ModEntityTypes.TIER_7_ROCKET::get);
    public static final RegistryEntry<Item> TIER_8_ROCKET = registerRocket(8, ModEntityTypes.TIER_8_ROCKET::get);
    public static final RegistryEntry<Item> TIER_9_ROCKET = registerRocket(9, ModEntityTypes.TIER_9_ROCKET::get);
    public static final RegistryEntry<Item> TIER_10_ROCKET = registerRocket(10, ModEntityTypes.TIER_10_ROCKET::get);
    public static final RegistryEntry<Item> TIER_11_ROCKET = registerRocket(11, ModEntityTypes.TIER_11_ROCKET::get);

    // Jupiter
    public static final RegistryEntry<Item> JUPERIUM_INGOT = registerBasicItem("juperium_ingot");
    public static final RegistryEntry<Item> JUPERIUM_NUGGET = registerBasicItem("juperium_nugget");
    public static final RegistryEntry<Item> JUPERIUM_PLATE = registerBasicItem("juperium_plate");
    public static final RegistryEntry<Item> RAW_JUPERIUM = registerBasicItem("raw_juperium");
    public static final RegistryEntry<Item> JUPERIUM_ENGINE = registerBasicItem("juperium_engine");
    public static final RegistryEntry<Item> JUPERIUM_TANK = registerBasicItem("juperium_tank");

    // Saturn
    public static final RegistryEntry<Item> SATURLYTE_INGOT = registerBasicItem("saturlyte_ingot");
    public static final RegistryEntry<Item> SATURLYTE_NUGGET = registerBasicItem("saturlyte_nugget");
    public static final RegistryEntry<Item> SATURLYTE_PLATE = registerBasicItem("saturlyte_plate");
    public static final RegistryEntry<Item> RAW_SATURLYTE = registerBasicItem("raw_saturlyte");
    public static final RegistryEntry<Item> SATURLYTE_ENGINE = registerBasicItem("saturlyte_engine");
    public static final RegistryEntry<Item> SATURLYTE_TANK = registerBasicItem("saturlyte_tank");

    // Uranus
    public static final RegistryEntry<Item> URANIUM_INGOT = registerBasicItem("uranium_ingot");
    public static final RegistryEntry<Item> URANIUM_NUGGET = registerBasicItem("uranium_nugget");
    public static final RegistryEntry<Item> URANIUM_PLATE = registerBasicItem("uranium_plate");
    public static final RegistryEntry<Item> RAW_URANIUM = registerBasicItem("raw_uranium");
    public static final RegistryEntry<Item> URANIUM_ENGINE = registerBasicItem("uranium_engine");
    public static final RegistryEntry<Item> URANIUM_TANK = registerBasicItem("uranium_tank");
    public static final RegistryEntry<Item> FREEZE_SHARD = BASIC_ITEMS.register("freeze_shard", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<IceChargeItem> ICE_CHARGE = BASIC_ITEMS.register("ice_charge", () -> new IceChargeItem(new Item.Properties()));

    // Neptune
    public static final RegistryEntry<Item> NEPTUNIUM_INGOT = registerBasicItem("neptunium_ingot");
    public static final RegistryEntry<Item> NEPTUNIUM_NUGGET = registerBasicItem("neptunium_nugget");
    public static final RegistryEntry<Item> NEPTUNIUM_PLATE = registerBasicItem("neptunium_plate");
    public static final RegistryEntry<Item> RAW_NEPTUNIUM = registerBasicItem("raw_neptunium");
    public static final RegistryEntry<Item> NEPTUNIUM_ENGINE = registerBasicItem("neptunium_engine");
    public static final RegistryEntry<Item> NEPTUNIUM_TANK = registerBasicItem("neptunium_tank");

    // Orcus
    public static final RegistryEntry<Item> RADIUM_INGOT = registerBasicItem("radium_ingot");
    public static final RegistryEntry<Item> RADIUM_NUGGET = registerBasicItem("radium_nugget");
    public static final RegistryEntry<Item> RADIUM_PLATE = registerBasicItem("radium_plate");
    public static final RegistryEntry<Item> RAW_RADIUM = registerBasicItem("raw_radium");
    public static final RegistryEntry<Item> RADIUM_ENGINE = registerBasicItem("radium_engine");
    public static final RegistryEntry<Item> RADIUM_TANK = registerBasicItem("radium_tank");

    // Pluto
    public static final RegistryEntry<Item> PLUTONIUM_INGOT = registerBasicItem("plutonium_ingot");
    public static final RegistryEntry<Item> PLUTONIUM_NUGGET = registerBasicItem("plutonium_nugget");
    public static final RegistryEntry<Item> PLUTONIUM_PLATE = registerBasicItem("plutonium_plate");
    public static final RegistryEntry<Item> RAW_PLUTONIUM = registerBasicItem("raw_plutonium");
    public static final RegistryEntry<Item> PLUTONIUM_ENGINE = registerBasicItem("plutonium_engine");
    public static final RegistryEntry<Item> PLUTONIUM_TANK = registerBasicItem("plutonium_tank");

    // Sedna
    public static final RegistryEntry<Item> ELECTROLYTE_INGOT = registerBasicItem("electrolyte_ingot");
    public static final RegistryEntry<Item> ELECTROLYTE_NUGGET = registerBasicItem("electrolyte_nugget");
    public static final RegistryEntry<Item> ELECTROLYTE_PLATE = registerBasicItem("electrolyte_plate");
    public static final RegistryEntry<Item> RAW_ELECTROLYTE = registerBasicItem("raw_electrolyte");
    public static final RegistryEntry<Item> ELECTROLYTE_ENGINE = registerBasicItem("electrolyte_engine");
    public static final RegistryEntry<Item> ELECTROLYTE_TANK = registerBasicItem("electrolyte_tank");

    // Glacio
    public static final RegistryEntry<Item> GLACIAN_BOAT = registerBoat(CustomBoat.Type.GLACIAN);
    public static final RegistryEntry<Item> GLACIAN_CHEST_BOAT = registerChestBoat(CustomBoat.Type.GLACIAN);

    // Spawn Eggs
    public static final RegistryEntry<Item> FREEZE_SPAWN_EGG = SPAWN_EGGS.register("freeze_spawn_egg", PlatformUtils.createSpawnEggItem(ModEntityTypes.FREEZE, 13303807, 7979472, new Item.Properties()));

    private static RegistryEntry<Item> registerBasicItem(String name) {
        return BASIC_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    private static RegistryEntry<Item> registerRocket(int tier, Supplier<EntityType<?>> entity) {
        return VEHICLES.register("tier_" + tier + "_rocket", () -> new RocketItem(entity, new Item.Properties().stacksTo(1).fireResistant()));
    }

    private static RegistryEntry<Item> registerSign(String name, RegistryEntry<Block> sign, RegistryEntry<Block> wallSign) {
        return SIGNS.register(name, () -> new SignItem(new Item.Properties(), sign.get(), wallSign.get()));
    }

    private static RegistryEntry<Item> registerHangingSign(String name, RegistryEntry<Block> hangingSign, RegistryEntry<Block> wallHangingSign) {
        return HANGING_SIGNS.register(name, () -> new HangingSignItem(hangingSign.get(), wallHangingSign.get(), new Item.Properties()));
    }

    private static RegistryEntry<Item> registerBoat(CustomBoat.Type type) {
        return BOATS.register(type.getName() + "_boat", () -> new CustomBoatItem(false, type, (new Item.Properties()).stacksTo(1)));
    }

    private static RegistryEntry<Item> registerChestBoat(CustomBoat.Type type) {
        return CHEST_BOATS.register(type.getName() + "_chest_boat", () -> new CustomBoatItem(true, type, (new Item.Properties()).stacksTo(1)));
    }
}
