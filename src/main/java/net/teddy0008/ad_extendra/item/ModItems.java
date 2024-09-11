package net.teddy0008.ad_extendra.item;

import earth.terrarium.ad_astra.AdAstra;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.entity.ModEntities;
import net.teddy0008.ad_extendra.entity.vehicle.CustomBoat;
import net.teddy0008.ad_extendra.item.globe.*;
import net.teddy0008.ad_extendra.item.projectile.IceChargeItem;
import net.teddy0008.ad_extendra.item.vehicle.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final DeferredRegister<Item> ROCKETS = DeferredRegister.create(ForgeRegistries.ITEMS, AdAstra.MOD_ID);

    // Moon
    public static final RegistryObject<SignItem> AERONOS_SIGN = ITEMS.register("aeronos_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.AERONOS_SIGN.get(), ModBlocks.AERONOS_WALL_SIGN.get()));
    public static final RegistryObject<HangingSignItem> AERONOS_HANGING_SIGN = ITEMS.register("aeronos_hanging_sign",
            () -> new HangingSignItem(ModBlocks.AERONOS_HANGING_SIGN.get(), ModBlocks.AERONOS_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<SignItem> STROPHAR_SIGN = ITEMS.register("strophar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.STROPHAR_SIGN.get(), ModBlocks.STROPHAR_WALL_SIGN.get()));
    public static final RegistryObject<HangingSignItem> STROPHAR_HANGING_SIGN = ITEMS.register("strophar_hanging_sign",
            () -> new HangingSignItem(ModBlocks.STROPHAR_HANGING_SIGN.get(), ModBlocks.STROPHAR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    // Jupiter
    public static final RegistryObject<Item> RAW_JUPERIUM = ITEMS.register("raw_juperium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_INGOT = ITEMS.register("juperium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_NUGGET = ITEMS.register("juperium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_PLATE = ITEMS.register("juperium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_ENGINE = ITEMS.register("juperium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUPERIUM_TANK = ITEMS.register("juperium_tank", () -> new Item(new Item.Properties()));

    // Saturn
    public static final RegistryObject<Item> RAW_SATURLYTE = ITEMS.register("raw_saturlyte", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATURLYTE_INGOT = ITEMS.register("saturlyte_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATURLYTE_NUGGET = ITEMS.register("saturlyte_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATURLYTE_PLATE = ITEMS.register("saturlyte_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATURLYTE_ENGINE = ITEMS.register("saturlyte_engine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SATURLYTE_TANK = ITEMS.register("saturlyte_tank", () -> new Item(new Item.Properties()));

    // Uranus
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_PLATE = ITEMS.register("uranium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_ENGINE = ITEMS.register("uranium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_TANK = ITEMS.register("uranium_tank", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FREEZE_SHARD = ITEMS.register("freeze_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<IceChargeItem> ICE_CHARGE = ITEMS.register("ice_charge", () -> new IceChargeItem(new Item.Properties()));

    // Neptune
    public static final RegistryObject<Item> RAW_NEPTUNIUM = ITEMS.register("raw_neptunium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_INGOT = ITEMS.register("neptunium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_NUGGET = ITEMS.register("neptunium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_PLATE = ITEMS.register("neptunium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_ENGINE = ITEMS.register("neptunium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEPTUNIUM_TANK = ITEMS.register("neptunium_tank", () -> new Item(new Item.Properties()));

    // Orcus
    public static final RegistryObject<Item> RAW_RADIUM = ITEMS.register("raw_radium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIUM_INGOT = ITEMS.register("radium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIUM_NUGGET = ITEMS.register("radium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIUM_PLATE = ITEMS.register("radium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIUM_ENGINE = ITEMS.register("radium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RADIUM_TANK = ITEMS.register("radium_tank", () -> new Item(new Item.Properties()));

    // Pluto
    public static final RegistryObject<Item> RAW_PLUTONIUM = ITEMS.register("raw_plutonium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_NUGGET = ITEMS.register("plutonium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_PLATE = ITEMS.register("plutonium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_ENGINE = ITEMS.register("plutonium_engine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLUTONIUM_TANK = ITEMS.register("plutonium_tank", () -> new Item(new Item.Properties()));

    // Sedna
    public static final RegistryObject<Item> RAW_ELECTROLYTE = ITEMS.register("raw_electrolyte", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTROLYTE_INGOT = ITEMS.register("electrolyte_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTROLYTE_NUGGET = ITEMS.register("electrolyte_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTROLYTE_PLATE = ITEMS.register("electrolyte_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTROLYTE_ENGINE = ITEMS.register("electrolyte_engine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTROLYTE_TANK = ITEMS.register("electrolyte_tank", () -> new Item(new Item.Properties()));

    // Glacio
    public static final RegistryObject<HangingSignItem> GLACIAN_HANGING_SIGN = ITEMS.register("glacian_hanging_sign",
            () -> new HangingSignItem(ModBlocks.GLACIAN_HANGING_SIGN.get(), ModBlocks.GLACIAN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<CustomBoatItem> GLACIAN_BOAT = ITEMS.register("glacian_boat",
            () -> new CustomBoatItem(false, CustomBoat.Type.GLACIAN, (new Item.Properties()).stacksTo(1)));
    public static final RegistryObject<CustomBoatItem> GLACIAN_CHEST_BOAT = ITEMS.register("glacian_chest_boat",
            () -> new CustomBoatItem(true, CustomBoat.Type.GLACIAN, (new Item.Properties()).stacksTo(1)));

    // Globes
    public static final RegistryObject<GlobeItem> CERES_GLOBE = ITEMS.register("ceres_globe",
            () -> new GlobeItem((Block) ModBlocks.CERES_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> JUPITER_GLOBE = ITEMS.register("jupiter_globe",
            () -> new GlobeItem((Block) ModBlocks.JUPITER_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> SATURN_GLOBE = ITEMS.register("saturn_globe",
            () -> new GlobeItem((Block) ModBlocks.SATURN_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> URANUS_GLOBE = ITEMS.register("uranus_globe",
            () -> new GlobeItem((Block) ModBlocks.URANUS_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> NEPTUNE_GLOBE = ITEMS.register("neptune_globe",
            () -> new GlobeItem((Block) ModBlocks.NEPTUNE_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> ORCUS_GLOBE = ITEMS.register("orcus_globe",
            () -> new GlobeItem((Block) ModBlocks.ORCUS_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> PLUTO_GLOBE = ITEMS.register("pluto_globe",
            () -> new GlobeItem((Block) ModBlocks.PLUTO_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> HAUMEA_GLOBE = ITEMS.register("haumea_globe",
            () -> new GlobeItem((Block) ModBlocks.HAUMEA_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> QUAOAR_GLOBE = ITEMS.register("quaoar_globe",
            () -> new GlobeItem((Block) ModBlocks.QUAOAR_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> MAKEMAKE_GLOBE = ITEMS.register("makemake_globe",
            () -> new GlobeItem((Block) ModBlocks.MAKEMAKE_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> GONGGONG_GLOBE = ITEMS.register("gonggong_globe",
            () -> new GlobeItem((Block) ModBlocks.GONGGONG_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> ERIS_GLOBE = ITEMS.register("eris_globe",
            () -> new GlobeItem((Block) ModBlocks.ERIS_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> SEDNA_GLOBE = ITEMS.register("sedna_globe",
            () -> new GlobeItem((Block) ModBlocks.SEDNA_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    public static final RegistryObject<GlobeItem> B_GLOBE = ITEMS.register("b_globe",
            () -> new GlobeItem((Block) ModBlocks.B_GLOBE.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));

    // Rockets
    public static final RegistryObject<RocketItemTier5> TIER_5_ROCKET = ROCKETS.register("tier_5_rocket", () -> new RocketItemTier5(5, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryObject<RocketItemTier6> TIER_6_ROCKET = ROCKETS.register("tier_6_rocket", () -> new RocketItemTier6(6, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryObject<RocketItemTier7> TIER_7_ROCKET = ROCKETS.register("tier_7_rocket", () -> new RocketItemTier7(7, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryObject<RocketItemTier8> TIER_8_ROCKET = ROCKETS.register("tier_8_rocket", () -> new RocketItemTier8(8, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryObject<RocketItemTier9> TIER_9_ROCKET = ROCKETS.register("tier_9_rocket", () -> new RocketItemTier9(9, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryObject<RocketItemTier10> TIER_10_ROCKET = ROCKETS.register("tier_10_rocket", () -> new RocketItemTier10(10, (new Item.Properties()).stacksTo(1).fireResistant()));
    public static final RegistryObject<RocketItemTier11> TIER_11_ROCKET = ROCKETS.register("tier_11_rocket", () -> new RocketItemTier11(11, (new Item.Properties()).stacksTo(1).fireResistant()));

    // Spawn Eggs
    public static final RegistryObject<ForgeSpawnEggItem> FREEZE_SPAWN_EGG = ITEMS.register("freeze_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.FREEZE, 13303807, 7979472, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        ROCKETS.register(eventBus);
    }
}
