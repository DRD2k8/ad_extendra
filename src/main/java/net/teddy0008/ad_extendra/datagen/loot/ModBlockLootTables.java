package net.teddy0008.ad_extendra.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.block.door.CustomSlidingDoorBlock;
import net.teddy0008.ad_extendra.block.door.LocationState;
import net.teddy0008.ad_extendra.datagen.ModItemModelGenerator;
import net.teddy0008.ad_extendra.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // Moon
        this.dropSelf(ModBlocks.AERONOS_MUSHROOM.get());
        this.dropSelf(ModBlocks.AERONOS_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.AERONOS_BUTTON.get());
        this.dropSelf(ModBlocks.STROPHAR_MUSHROOM.get());
        this.dropSelf(ModBlocks.STROPHAR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.STROPHAR_BUTTON.get());
        this.add(ModBlocks.MOON_MYCELIUM.get(), createGrassDrops(earth.terrarium.ad_astra.common.registry.ModBlocks.MOON_STONE.get()));
        this.add(ModBlocks.POTTED_AERONOS_MUSHROOM.get(), createPotFlowerItemTable(ModBlocks.AERONOS_MUSHROOM.get()));
        this.add(ModBlocks.POTTED_STROPHAR_MUSHROOM.get(), createPotFlowerItemTable(ModBlocks.STROPHAR_MUSHROOM.get()));
        this.add(ModBlocks.AERONOS_SIGN.get(), block ->
                createSingleItemTable(ModItems.AERONOS_SIGN.get()));
        this.add(ModBlocks.AERONOS_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.AERONOS_SIGN.get()));
        this.add(ModBlocks.AERONOS_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.AERONOS_HANGING_SIGN.get()));
        this.add(ModBlocks.AERONOS_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.AERONOS_HANGING_SIGN.get()));
        this.add(ModBlocks.STROPHAR_SIGN.get(), block ->
                createSingleItemTable(ModItems.STROPHAR_SIGN.get()));
        this.add(ModBlocks.STROPHAR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.STROPHAR_SIGN.get()));
        this.add(ModBlocks.STROPHAR_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.STROPHAR_HANGING_SIGN.get()));
        this.add(ModBlocks.STROPHAR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.STROPHAR_HANGING_SIGN.get()));

        // Jupiter
        this.dropSelf(ModBlocks.JUPERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_JUPERIUM_BLOCK.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING_STAIRS.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING_SLAB.get());
        this.dropSelf(ModBlocks.JUPERIUM_PILLAR.get());
        this.dropSelf(ModBlocks.GLOWING_JUPERIUM_PILLAR.get());
        this.add(ModBlocks.JUPERIUM_SLIDING_DOOR.get(), block ->
                createSlidingDoorTable(ModBlocks.JUPERIUM_SLIDING_DOOR.get()));
        this.dropSelf(ModBlocks.JUPERIUM_PLATING_BUTTON.get());
        this.dropSelf(ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.JUPITER_SAND.get());
        this.dropSelf(ModBlocks.JUPITER_STONE.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_SLAB.get());
        this.dropSelf(ModBlocks.JUPITER_COBBLESTONE.get());
        this.dropSelf(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.JUPITER_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get());
        this.dropSelf(ModBlocks.JUPITER_PILLAR.get());
        this.add(ModBlocks.JUPITER_JUPERIUM_ORE.get(), createOreDrop(ModBlocks.JUPITER_JUPERIUM_ORE.get(), ModItems.RAW_JUPERIUM.get()));
        this.add(ModBlocks.JUPITER_COAL_ORE.get(), createOreDrop(ModBlocks.JUPITER_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.JUPITER_DIAMOND_ORE.get(), createOreDrop(ModBlocks.JUPITER_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.JUPITER_GOLD_ORE.get(), createOreDrop(ModBlocks.JUPITER_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.JUPITER_STONE.get(), createStoneLikeDrop(ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_COBBLESTONE.get()));

        // Ceres
        this.dropSelf(ModBlocks.CERES_SAND.get());
        this.dropSelf(ModBlocks.CERES_STONE.get());
        this.dropSelf(ModBlocks.CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_STONE_SLAB.get());
        this.dropSelf(ModBlocks.CERES_COBBLESTONE.get());
        this.dropSelf(ModBlocks.CERES_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CERES_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_CERES_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_CERES_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_CERES_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_CERES_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_CERES_STONE_SLAB.get());
        this.dropSelf(ModBlocks.CERES_PILLAR.get());
        this.add(ModBlocks.CERES_COPPER_ORE.get(), createCopperOreDrops(ModBlocks.CERES_COPPER_ORE.get()));
        this.add(ModBlocks.CERES_IRON_ORE.get(), createOreDrop(ModBlocks.CERES_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.CERES_STONE.get(), createStoneLikeDrop(ModBlocks.CERES_STONE.get(), ModBlocks.CERES_COBBLESTONE.get()));

        // Saturn
        this.dropSelf(ModBlocks.SATURLYTE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SATURLYTE_BLOCK.get());
        this.dropSelf(ModBlocks.SATURLYTE_PLATING.get());
        this.dropSelf(ModBlocks.SATURLYTE_PLATING_STAIRS.get());
        this.dropSelf(ModBlocks.SATURLYTE_PLATING_SLAB.get());
        this.dropSelf(ModBlocks.SATURLYTE_PILLAR.get());
        this.dropSelf(ModBlocks.GLOWING_SATURLYTE_PILLAR.get());
        this.add(ModBlocks.SATURLYTE_SLIDING_DOOR.get(), block ->
                createSlidingDoorTable(ModBlocks.SATURLYTE_SLIDING_DOOR.get()));
        this.dropSelf(ModBlocks.SATURLYTE_PLATING_BUTTON.get());
        this.dropSelf(ModBlocks.SATURLYTE_PLATING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SATURN_SAND.get());
        this.dropSelf(ModBlocks.SATURN_ICE.get());
        this.dropSelf(ModBlocks.SATURN_STONE.get());
        this.dropSelf(ModBlocks.SATURN_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.SATURN_STONE_SLAB.get());
        this.dropSelf(ModBlocks.SATURN_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SATURN_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.SATURN_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.SATURN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.SATURN_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.SATURN_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.SATURN_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_SATURN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_SATURN_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_SATURN_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_SATURN_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_SATURN_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_SATURN_STONE_SLAB.get());
        this.dropSelf(ModBlocks.SATURN_PILLAR.get());
        this.add(ModBlocks.SATURN_SATURLYTE_ORE.get(), createOreDrop(ModBlocks.SATURN_SATURLYTE_ORE.get(), ModItems.RAW_SATURLYTE.get()));
        this.add(ModBlocks.SATURN_COAL_ORE.get(), createOreDrop(ModBlocks.SATURN_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.SATURN_DIAMOND_ORE.get(), createOreDrop(ModBlocks.SATURN_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.SATURN_GOLD_ORE.get(), createOreDrop(ModBlocks.SATURN_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.SATURN_STONE.get(), createStoneLikeDrop(ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_COBBLESTONE.get()));

        // Uranus
        this.dropSelf(ModBlocks.URANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_URANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.URANIUM_PLATING.get());
        this.dropSelf(ModBlocks.URANIUM_PLATING_STAIRS.get());
        this.dropSelf(ModBlocks.URANIUM_PLATING_SLAB.get());
        this.dropSelf(ModBlocks.URANIUM_PILLAR.get());
        this.dropSelf(ModBlocks.GLOWING_URANIUM_PILLAR.get());
        this.add(ModBlocks.URANIUM_SLIDING_DOOR.get(), block ->
                createSlidingDoorTable(ModBlocks.URANIUM_SLIDING_DOOR.get()));
        this.dropSelf(ModBlocks.URANIUM_PLATING_BUTTON.get());
        this.dropSelf(ModBlocks.URANIUM_PLATING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.URANUS_STONE.get());
        this.dropSelf(ModBlocks.URANUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.URANUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.URANUS_COBBLESTONE.get());
        this.dropSelf(ModBlocks.URANUS_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.URANUS_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.URANUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.URANUS_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.URANUS_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.URANUS_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_URANUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_URANUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_URANUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_URANUS_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_URANUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_URANUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.URANUS_PILLAR.get());
        this.dropSelf(ModBlocks.PACKED_SLUSHY_ICE.get());
        this.dropSelf(ModBlocks.ICICLE.get());
        this.add(ModBlocks.URANUS_URANIUM_ORE.get(), createOreDrop(ModBlocks.URANUS_URANIUM_ORE.get(), ModItems.RAW_URANIUM.get()));
        this.add(ModBlocks.URANUS_DIAMOND_ORE.get(), createOreDrop(ModBlocks.URANUS_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.URANUS_ICE_SHARD_ORE.get(), createOreDrop(ModBlocks.URANUS_ICE_SHARD_ORE.get(), earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get()));
        this.add(ModBlocks.URANUS_IRON_ORE.get(), createOreDrop(ModBlocks.URANUS_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.URANUS_LAPIS_ORE.get(), createOreDrop(ModBlocks.URANUS_LAPIS_ORE.get(), Items.LAPIS_LAZULI));
        this.add(ModBlocks.URANUS_STONE.get(), createStoneLikeDrop(ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_COBBLESTONE.get()));
        this.add(ModBlocks.SLUSHY_ICE.get(), createSilkTouchOnlyTable(ModBlocks.SLUSHY_ICE.get()));

        // Neptune
        this.dropSelf(ModBlocks.NEPTUNIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_NEPTUNIUM_BLOCK.get());
        this.dropSelf(ModBlocks.NEPTUNIUM_PLATING.get());
        this.dropSelf(ModBlocks.NEPTUNIUM_PLATING_STAIRS.get());
        this.dropSelf(ModBlocks.NEPTUNIUM_PLATING_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNIUM_PILLAR.get());
        this.dropSelf(ModBlocks.GLOWING_NEPTUNIUM_PILLAR.get());
        this.add(ModBlocks.NEPTUNIUM_SLIDING_DOOR.get(), block ->
                createSlidingDoorTable(ModBlocks.NEPTUNIUM_SLIDING_DOOR.get()));
        this.dropSelf(ModBlocks.NEPTUNIUM_PLATING_BUTTON.get());
        this.dropSelf(ModBlocks.NEPTUNIUM_PLATING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNE_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_NEPTUNE_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.NEPTUNE_PILLAR.get());
        this.dropSelf(ModBlocks.BLUE_SLUSHY_ICE.get());
        this.add(ModBlocks.NEPTUNE_NEPTUNIUM_ORE.get(), createOreDrop(ModBlocks.NEPTUNE_NEPTUNIUM_ORE.get(), ModItems.RAW_NEPTUNIUM.get()));
        this.add(ModBlocks.NEPTUNE_COAL_ORE.get(), createOreDrop(ModBlocks.NEPTUNE_COAL_ORE.get(), Items.COAL));
        this.add(ModBlocks.NEPTUNE_COPPER_ORE.get(), createOreDrop(ModBlocks.NEPTUNE_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.NEPTUNE_IRON_ORE.get(), createOreDrop(ModBlocks.NEPTUNE_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get(), createOreDrop(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get(), earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get()));
        this.add(ModBlocks.NEPTUNE_STONE.get(), createStoneLikeDrop(ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_COBBLESTONE.get()));

        // Orcus
        this.dropSelf(ModBlocks.RADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_RADIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RADIUM_PLATING.get());
        this.dropSelf(ModBlocks.RADIUM_PLATING_STAIRS.get());
        this.dropSelf(ModBlocks.RADIUM_PLATING_SLAB.get());
        this.dropSelf(ModBlocks.RADIUM_PILLAR.get());
        this.dropSelf(ModBlocks.GLOWING_RADIUM_PILLAR.get());
        this.add(ModBlocks.RADIUM_SLIDING_DOOR.get(), block ->
                createSlidingDoorTable(ModBlocks.RADIUM_SLIDING_DOOR.get()));
        this.dropSelf(ModBlocks.RADIUM_PLATING_BUTTON.get());
        this.dropSelf(ModBlocks.RADIUM_PLATING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.ORCUS_STONE.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ORCUS_COBBLESTONE.get());
        this.dropSelf(ModBlocks.ORCUS_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.ORCUS_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ORCUS_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_ORCUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_ORCUS_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_ORCUS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ORCUS_PILLAR.get());
        this.add(ModBlocks.ORCUS_RADIUM_ORE.get(), createOreDrop(ModBlocks.ORCUS_RADIUM_ORE.get(), ModItems.RAW_RADIUM.get()));
        this.add(ModBlocks.ORCUS_COPPER_ORE.get(), createOreDrop(ModBlocks.ORCUS_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.ORCUS_IRON_ORE.get(), createOreDrop(ModBlocks.ORCUS_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.ORCUS_STONE.get(), createStoneLikeDrop(ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_COBBLESTONE.get()));

        // Pluto
        this.dropSelf(ModBlocks.PLUTONIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PLUTONIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PLUTONIUM_PLATING.get());
        this.dropSelf(ModBlocks.PLUTONIUM_PLATING_STAIRS.get());
        this.dropSelf(ModBlocks.PLUTONIUM_PLATING_SLAB.get());
        this.dropSelf(ModBlocks.PLUTONIUM_PILLAR.get());
        this.dropSelf(ModBlocks.GLOWING_PLUTONIUM_PILLAR.get());
        this.add(ModBlocks.PLUTONIUM_SLIDING_DOOR.get(), block ->
                createSlidingDoorTable(ModBlocks.PLUTONIUM_SLIDING_DOOR.get()));
        this.dropSelf(ModBlocks.PLUTONIUM_PLATING_BUTTON.get());
        this.dropSelf(ModBlocks.PLUTONIUM_PLATING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PLUTO_SAND.get());
        this.dropSelf(ModBlocks.PLUTO_STONE.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_SLAB.get());
        this.dropSelf(ModBlocks.PLUTO_COBBLESTONE.get());
        this.dropSelf(ModBlocks.PLUTO_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.PLUTO_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.PLUTO_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_PLUTO_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_PLUTO_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_PLUTO_STONE_SLAB.get());
        this.dropSelf(ModBlocks.PLUTO_PILLAR.get());
        this.add(ModBlocks.PLUTO_PLUTONIUM_ORE.get(), createOreDrop(ModBlocks.PLUTO_PLUTONIUM_ORE.get(), ModItems.RAW_PLUTONIUM.get()));
        this.add(ModBlocks.PLUTO_DIAMOND_ORE.get(), createOreDrop(ModBlocks.PLUTO_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.PLUTO_GOLD_ORE.get(), createOreDrop(ModBlocks.PLUTO_GOLD_ORE.get(), Items.RAW_GOLD));
        this.add(ModBlocks.PLUTO_ICE_SHARD_ORE.get(), createOreDrop(ModBlocks.PLUTO_ICE_SHARD_ORE.get(), earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get()));
        this.add(ModBlocks.PLUTO_STONE.get(), createStoneLikeDrop(ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_COBBLESTONE.get()));

        // Haumea
        this.dropSelf(ModBlocks.HAUMEA_STONE.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.HAUMEA_COBBLESTONE.get());
        this.dropSelf(ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.HAUMEA_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.HAUMEA_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_HAUMEA_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.HAUMEA_PILLAR.get());
        this.add(ModBlocks.HAUMEA_COPPER_ORE.get(), createOreDrop(ModBlocks.HAUMEA_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.HAUMEA_IRON_ORE.get(), createOreDrop(ModBlocks.HAUMEA_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.HAUMEA_STONE.get(), createStoneLikeDrop(ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_COBBLESTONE.get()));

        // Quaoar
        this.dropSelf(ModBlocks.QUAOAR_STONE.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_SLAB.get());
        this.dropSelf(ModBlocks.QUAOAR_COBBLESTONE.get());
        this.dropSelf(ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.QUAOAR_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.QUAOAR_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_QUAOAR_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get());
        this.dropSelf(ModBlocks.QUAOAR_PILLAR.get());
        this.add(ModBlocks.QUAOAR_COPPER_ORE.get(), createOreDrop(ModBlocks.QUAOAR_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.QUAOAR_IRON_ORE.get(), createOreDrop(ModBlocks.QUAOAR_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.QUAOAR_STONE.get(), createStoneLikeDrop(ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_COBBLESTONE.get()));

        // Makemake
        this.dropSelf(ModBlocks.MAKEMAKE_STONE.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.MAKEMAKE_COBBLESTONE.get());
        this.dropSelf(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_MAKEMAKE_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get());
        this.dropSelf(ModBlocks.MAKEMAKE_PILLAR.get());
        this.add(ModBlocks.MAKEMAKE_COPPER_ORE.get(), createOreDrop(ModBlocks.MAKEMAKE_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.MAKEMAKE_IRON_ORE.get(), createOreDrop(ModBlocks.MAKEMAKE_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.MAKEMAKE_STONE.get(), createStoneLikeDrop(ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE.get()));

        // Gonggong
        this.dropSelf(ModBlocks.GONGGONG_STONE.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_SLAB.get());
        this.dropSelf(ModBlocks.GONGGONG_COBBLESTONE.get());
        this.dropSelf(ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.GONGGONG_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.GONGGONG_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_GONGGONG_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get());
        this.dropSelf(ModBlocks.GONGGONG_PILLAR.get());
        this.add(ModBlocks.GONGGONG_COPPER_ORE.get(), createOreDrop(ModBlocks.GONGGONG_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.GONGGONG_IRON_ORE.get(), createOreDrop(ModBlocks.GONGGONG_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.GONGGONG_STONE.get(), createStoneLikeDrop(ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_COBBLESTONE.get()));

        // Eris
        this.dropSelf(ModBlocks.ERIS_STONE.get());
        this.dropSelf(ModBlocks.ERIS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.ERIS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ERIS_COBBLESTONE.get());
        this.dropSelf(ModBlocks.ERIS_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.ERIS_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.ERIS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.ERIS_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.ERIS_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.ERIS_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_ERIS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_ERIS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_ERIS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_ERIS_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_ERIS_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_ERIS_STONE_SLAB.get());
        this.dropSelf(ModBlocks.ERIS_PILLAR.get());
        this.add(ModBlocks.ERIS_COPPER_ORE.get(), createOreDrop(ModBlocks.ERIS_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.ERIS_IRON_ORE.get(), createOreDrop(ModBlocks.ERIS_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.ERIS_STONE.get(), createStoneLikeDrop(ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_COBBLESTONE.get()));

        // Sedna
        this.dropSelf(ModBlocks.ELECTROLYTE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ELECTROLYTE_BLOCK.get());
        this.dropSelf(ModBlocks.ELECTROLYTE_PLATING.get());
        this.dropSelf(ModBlocks.ELECTROLYTE_PLATING_STAIRS.get());
        this.dropSelf(ModBlocks.ELECTROLYTE_PLATING_SLAB.get());
        this.dropSelf(ModBlocks.ELECTROLYTE_PILLAR.get());
        this.dropSelf(ModBlocks.GLOWING_ELECTROLYTE_PILLAR.get());
        this.add(ModBlocks.ELECTROLYTE_SLIDING_DOOR.get(), block ->
                createSlidingDoorTable(ModBlocks.ELECTROLYTE_SLIDING_DOOR.get()));
        this.dropSelf(ModBlocks.ELECTROLYTE_PLATING_BUTTON.get());
        this.dropSelf(ModBlocks.ELECTROLYTE_PLATING_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SEDNA_STONE.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.SEDNA_COBBLESTONE.get());
        this.dropSelf(ModBlocks.SEDNA_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.SEDNA_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.SEDNA_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_SEDNA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_SEDNA_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_SEDNA_STONE_SLAB.get());
        this.dropSelf(ModBlocks.SEDNA_PILLAR.get());
        this.add(ModBlocks.SEDNA_ELECTROLYTE_ORE.get(), createOreDrop(ModBlocks.SEDNA_ELECTROLYTE_ORE.get(), ModItems.RAW_ELECTROLYTE.get()));
        this.add(ModBlocks.SEDNA_COPPER_ORE.get(), createOreDrop(ModBlocks.SEDNA_COPPER_ORE.get(), Items.RAW_COPPER));
        this.add(ModBlocks.SEDNA_IRON_ORE.get(), createOreDrop(ModBlocks.SEDNA_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.SEDNA_STONE.get(), createStoneLikeDrop(ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_COBBLESTONE.get()));

        // Proxima Centauri b
        this.dropSelf(ModBlocks.B_SAND.get());
        this.dropSelf(ModBlocks.B_SANDSTONE.get());
        this.dropSelf(ModBlocks.B_SANDSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.B_SANDSTONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.B_SANDSTONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.CRACKED_B_SANDSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.B_STONE.get());
        this.dropSelf(ModBlocks.B_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.B_STONE_SLAB.get());
        this.dropSelf(ModBlocks.B_COBBLESTONE.get());
        this.dropSelf(ModBlocks.B_COBBLESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.B_COBBLESTONE_SLAB.get());
        this.dropSelf(ModBlocks.B_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.B_STONE_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.B_STONE_BRICK_SLAB.get());
        this.dropSelf(ModBlocks.B_STONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_B_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_B_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.CHISELED_B_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_B_STONE_SLAB.get());
        this.dropSelf(ModBlocks.POLISHED_B_STONE.get());
        this.dropSelf(ModBlocks.POLISHED_B_STONE_STAIRS.get());
        this.dropSelf(ModBlocks.POLISHED_B_STONE_SLAB.get());
        this.dropSelf(ModBlocks.B_PILLAR.get());
        this.add(ModBlocks.B_DIAMOND_ORE.get(), createOreDrop(ModBlocks.B_DIAMOND_ORE.get(), Items.DIAMOND));
        this.add(ModBlocks.B_EMERALD_ORE.get(), createOreDrop(ModBlocks.B_EMERALD_ORE.get(), Items.EMERALD));
        this.add(ModBlocks.B_IRON_ORE.get(), createOreDrop(ModBlocks.B_IRON_ORE.get(), Items.RAW_IRON));
        this.add(ModBlocks.B_REDSTONE_ORE.get(), createOreDrop(ModBlocks.B_REDSTONE_ORE.get(), Items.REDSTONE));
        this.add(ModBlocks.B_STONE.get(), createStoneLikeDrop(ModBlocks.B_STONE.get(), ModBlocks.B_COBBLESTONE.get()));

        // Glacio
        this.dropSelf(ModBlocks.GLACIAN_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GLACIAN_WOOD.get());
        this.dropSelf(ModBlocks.GLACIAN_SAPLING.get());
        this.add(ModBlocks.POTTED_GLACIAN_SAPLING.get(), createPotFlowerItemTable(ModBlocks.GLACIAN_SAPLING.get()));
        this.add(ModBlocks.GLACIAN_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GLACIAN_HANGING_SIGN.get()));
        this.add(ModBlocks.GLACIAN_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GLACIAN_HANGING_SIGN.get()));

        // Globes
        this.dropSelf(ModBlocks.CERES_GLOBE.get());
        this.dropSelf(ModBlocks.JUPITER_GLOBE.get());
        this.dropSelf(ModBlocks.SATURN_GLOBE.get());
        this.dropSelf(ModBlocks.URANUS_GLOBE.get());
        this.dropSelf(ModBlocks.NEPTUNE_GLOBE.get());
        this.dropSelf(ModBlocks.ORCUS_GLOBE.get());
        this.dropSelf(ModBlocks.PLUTO_GLOBE.get());
        this.dropSelf(ModBlocks.HAUMEA_GLOBE.get());
        this.dropSelf(ModBlocks.QUAOAR_GLOBE.get());
        this.dropSelf(ModBlocks.MAKEMAKE_GLOBE.get());
        this.dropSelf(ModBlocks.GONGGONG_GLOBE.get());
        this.dropSelf(ModBlocks.ERIS_GLOBE.get());
        this.dropSelf(ModBlocks.SEDNA_GLOBE.get());
        this.dropSelf(ModBlocks.B_GLOBE.get());
        // this.add(ModBlocks.BLOCK.get(), block -> createOreDrop(ModBlocks.BLOCK.get(), ModItems.ITEM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createStoneLikeDrop(Block pSilkBlock, Block pNonSilkBlock) {
        return createSilkTouchDispatchTable(pSilkBlock, (LootPoolEntryContainer.Builder)this.applyExplosionDecay(pSilkBlock, LootItem.lootTableItem(pNonSilkBlock)));
    }

    protected LootTable.Builder createSlidingDoorTable(Block pSlidingDoorBlock) {
        return this.createSinglePropConditionTable(pSlidingDoorBlock, CustomSlidingDoorBlock.LOCATION, LocationState.BOTTOM);
    }
}
