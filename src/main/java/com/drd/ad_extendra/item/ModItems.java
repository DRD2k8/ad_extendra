package com.drd.ad_extendra.item;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.block.ModBlocks;
import com.drd.ad_extendra.entity.ModEntities;
import com.drd.ad_extendra.entity.vehicle.ModBoats;
import com.drd.ad_extendra.item.projectile.IceChargeItem;
import com.drd.ad_extendra.item.vehicle.*;
import com.teamresourceful.resourcefullib.common.item.tabs.ResourcefulCreativeTab;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

public class ModItems {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, Main.MOD_ID);
    public static final ResourcefulRegistry<Item> BASIC_ITEMS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> BLOCKS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> SIGNS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> HANGING_SIGNS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> SLIDING_DOORS = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> GLOBES = ResourcefulRegistries.create(ITEMS);
    public static final ResourcefulRegistry<Item> ROCKETS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, "ad_astra");

    // Moon
    public static final RegistryEntry<SignItem> AERONOS_SIGN = SIGNS.register("aeronos_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.AERONOS_SIGN.get(), ModBlocks.AERONOS_WALL_SIGN.get()));
    public static final RegistryEntry<HangingSignItem> AERONOS_HANGING_SIGN = HANGING_SIGNS.register("aeronos_hanging_sign",
            () -> new HangingSignItem(ModBlocks.AERONOS_HANGING_SIGN.get(), ModBlocks.AERONOS_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryEntry<SignItem> STROPHAR_SIGN = SIGNS.register("strophar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.STROPHAR_SIGN.get(), ModBlocks.STROPHAR_WALL_SIGN.get()));
    public static final RegistryEntry<HangingSignItem> STROPHAR_HANGING_SIGN = HANGING_SIGNS.register("strophar_hanging_sign",
            () -> new HangingSignItem(ModBlocks.STROPHAR_HANGING_SIGN.get(), ModBlocks.STROPHAR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    // Jupiter
    public static final RegistryEntry<Item> RAW_JUPERIUM = BASIC_ITEMS.register("raw_juperium", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> JUPERIUM_INGOT = BASIC_ITEMS.register("juperium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> JUPERIUM_NUGGET = BASIC_ITEMS.register("juperium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> JUPERIUM_PLATE = BASIC_ITEMS.register("juperium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> JUPERIUM_ENGINE = BASIC_ITEMS.register("juperium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> JUPERIUM_TANK = BASIC_ITEMS.register("juperium_tank", () -> new Item(new Item.Properties()));

    // Saturn
    public static final RegistryEntry<Item> RAW_SATURLYTE = BASIC_ITEMS.register("raw_saturlyte", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> SATURLYTE_INGOT = BASIC_ITEMS.register("saturlyte_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> SATURLYTE_NUGGET = BASIC_ITEMS.register("saturlyte_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> SATURLYTE_PLATE = BASIC_ITEMS.register("saturlyte_plate", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> SATURLYTE_ENGINE = BASIC_ITEMS.register("saturlyte_engine", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> SATURLYTE_TANK = BASIC_ITEMS.register("saturlyte_tank", () -> new Item(new Item.Properties()));

    // Uranus
    public static final RegistryEntry<Item> RAW_URANIUM = BASIC_ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> URANIUM_INGOT = BASIC_ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> URANIUM_NUGGET = BASIC_ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> URANIUM_PLATE = BASIC_ITEMS.register("uranium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> URANIUM_ENGINE = BASIC_ITEMS.register("uranium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> URANIUM_TANK = BASIC_ITEMS.register("uranium_tank", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> FREEZE_SHARD = BASIC_ITEMS.register("freeze_shard", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<IceChargeItem> ICE_CHARGE = BASIC_ITEMS.register("ice_charge", () -> new IceChargeItem(new Item.Properties()));

    // Neptune
    public static final RegistryEntry<Item> RAW_NEPTUNIUM = BASIC_ITEMS.register("raw_neptunium", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> NEPTUNIUM_INGOT = BASIC_ITEMS.register("neptunium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> NEPTUNIUM_NUGGET = BASIC_ITEMS.register("neptunium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> NEPTUNIUM_PLATE = BASIC_ITEMS.register("neptunium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> NEPTUNIUM_ENGINE = BASIC_ITEMS.register("neptunium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> NEPTUNIUM_TANK = BASIC_ITEMS.register("neptunium_tank", () -> new Item(new Item.Properties()));

    // Orcus
    public static final RegistryEntry<Item> RAW_RADIUM = BASIC_ITEMS.register("raw_radium", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> RADIUM_INGOT = BASIC_ITEMS.register("radium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> RADIUM_NUGGET = BASIC_ITEMS.register("radium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> RADIUM_PLATE = BASIC_ITEMS.register("radium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> RADIUM_ENGINE = BASIC_ITEMS.register("radium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> RADIUM_TANK = BASIC_ITEMS.register("radium_tank", () -> new Item(new Item.Properties()));

    // Pluto
    public static final RegistryEntry<Item> RAW_PLUTONIUM = BASIC_ITEMS.register("raw_plutonium", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> PLUTONIUM_INGOT = BASIC_ITEMS.register("plutonium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> PLUTONIUM_NUGGET = BASIC_ITEMS.register("plutonium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> PLUTONIUM_PLATE = BASIC_ITEMS.register("plutonium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> PLUTONIUM_ENGINE = BASIC_ITEMS.register("plutonium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> PLUTONIUM_TANK = BASIC_ITEMS.register("plutonium_tank", () -> new Item(new Item.Properties()));

    // Sedna
    public static final RegistryEntry<Item> RAW_ELECTROLYTE = BASIC_ITEMS.register("raw_electrolyte", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> ELECTROLYTE_INGOT = BASIC_ITEMS.register("electrolyte_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> ELECTROLYTE_NUGGET = BASIC_ITEMS.register("electrolyte_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> ELECTROLYTE_PLATE = BASIC_ITEMS.register("electrolyte_plate", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> ELECTROLYTE_ENGINE = BASIC_ITEMS.register("electrolyte_engine", () -> new Item(new Item.Properties()));
    public static final RegistryEntry<Item> ELECTROLYTE_TANK = BASIC_ITEMS.register("electrolyte_tank", () -> new Item(new Item.Properties()));

    // Glacio
    public static final RegistryEntry<HangingSignItem> GLACIAN_HANGING_SIGN = HANGING_SIGNS.register("glacian_hanging_sign",
            () -> new HangingSignItem(ModBlocks.GLACIAN_HANGING_SIGN.get(), ModBlocks.GLACIAN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final Item GLACIAN_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.GLACIAN_BOAT_ID, ModBoats.GLACIAN_BOAT_KEY, false);
    public static final Item GLACIAN_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.GLACIAN_CHEST_BOAT_ID, ModBoats.GLACIAN_BOAT_KEY, true);

    // Rockets
    public static final RegistryEntry<RocketItemTier5> TIER_5_ROCKET = ROCKETS.register("tier_5_rocket", () -> new RocketItemTier5(5, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryEntry<RocketItemTier6> TIER_6_ROCKET = ROCKETS.register("tier_6_rocket", () -> new RocketItemTier6(6, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryEntry<RocketItemTier7> TIER_7_ROCKET = ROCKETS.register("tier_7_rocket", () -> new RocketItemTier7(7, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryEntry<RocketItemTier8> TIER_8_ROCKET = ROCKETS.register("tier_8_rocket", () -> new RocketItemTier8(8, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryEntry<RocketItemTier9> TIER_9_ROCKET = ROCKETS.register("tier_9_rocket", () -> new RocketItemTier9(9, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryEntry<RocketItemTier10> TIER_10_ROCKET = ROCKETS.register("tier_10_rocket", () -> new RocketItemTier10(10, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryEntry<RocketItemTier11> TIER_11_ROCKET = ROCKETS.register("tier_11_rocket", () -> new RocketItemTier11(11, (new Item.Properties()).stacksTo(1).fireResistant()));

    // Spawn Eggs
    public static final RegistryEntry<SpawnEggItem> FREEZE_SPAWN_EGG = BASIC_ITEMS.register("freeze_spawn_egg",
            () -> new SpawnEggItem(ModEntities.FREEZE.get(), 13303807, 7979472, new Item.Properties()));
}
