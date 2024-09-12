package com.drd.ad_extendra.item;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.block.ModBlocks;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTabs {
    public static final ResourcefulRegistry<CreativeModeTab> CREATIVE_TABS =
            ResourcefulRegistries.create(BuiltInRegistries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static final RegistryEntry<CreativeModeTab> AD_EXTENDRA = CREATIVE_TABS.register("ad_extendra", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .icon(() -> new ItemStack(ModItems.JUPERIUM_INGOT.get()))
            .title(Component.translatable("creativetab.ad_extendra"))
            .displayItems((itemDisplayParameters, output) -> {
                // Moon
                output.accept(ModBlocks.MOON_MYCELIUM.get());
                output.accept(ModBlocks.AERONOS_MUSHROOM.get());
                output.accept(ModBlocks.AERONOS_PRESSURE_PLATE.get());
                output.accept(ModBlocks.AERONOS_BUTTON.get());
                output.accept(ModItems.AERONOS_SIGN.get());
                output.accept(ModItems.AERONOS_HANGING_SIGN.get());
                output.accept(ModBlocks.STROPHAR_MUSHROOM.get());
                output.accept(ModBlocks.STROPHAR_PRESSURE_PLATE.get());
                output.accept(ModBlocks.STROPHAR_BUTTON.get());
                output.accept(ModItems.STROPHAR_SIGN.get());
                output.accept(ModItems.STROPHAR_HANGING_SIGN.get());

                // Ceres
                output.accept(ModBlocks.CERES_SAND.get());
                output.accept(ModBlocks.CERES_STONE.get());
                output.accept(ModBlocks.CERES_STONE_STAIRS.get());
                output.accept(ModBlocks.CERES_STONE_SLAB.get());
                output.accept(ModBlocks.CERES_COBBLESTONE.get());
                output.accept(ModBlocks.CERES_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.CERES_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.CERES_STONE_BRICKS.get());
                output.accept(ModBlocks.CERES_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.CERES_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.CERES_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_CERES_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_CERES_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_CERES_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_CERES_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_CERES_STONE.get());
                output.accept(ModBlocks.POLISHED_CERES_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_CERES_STONE_SLAB.get());
                output.accept(ModBlocks.CERES_PILLAR.get());
                output.accept(ModBlocks.CERES_COPPER_ORE.get());
                output.accept(ModBlocks.CERES_IRON_ORE.get());

                // Jupiter
                output.accept(ModBlocks.JUPITER_SAND.get());
                output.accept(ModBlocks.JUPITER_STONE.get());
                output.accept(ModBlocks.JUPITER_STONE_STAIRS.get());
                output.accept(ModBlocks.JUPITER_STONE_SLAB.get());
                output.accept(ModBlocks.JUPITER_COBBLESTONE.get());
                output.accept(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.JUPITER_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.JUPITER_STONE_BRICKS.get());
                output.accept(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.JUPITER_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.JUPITER_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_JUPITER_STONE.get());
                output.accept(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get());
                output.accept(ModBlocks.JUPITER_PILLAR.get());
                output.accept(ModBlocks.JUPITER_JUPERIUM_ORE.get());
                output.accept(ModBlocks.JUPITER_COAL_ORE.get());
                output.accept(ModBlocks.JUPITER_GOLD_ORE.get());
                output.accept(ModBlocks.JUPITER_DIAMOND_ORE.get());
                output.accept(ModItems.RAW_JUPERIUM.get());
                output.accept(ModBlocks.RAW_JUPERIUM_BLOCK.get());
                output.accept(ModItems.JUPERIUM_INGOT.get());
                output.accept(ModItems.JUPERIUM_PLATE.get());
                output.accept(ModItems.JUPERIUM_NUGGET.get());
                output.accept(ModBlocks.JUPERIUM_BLOCK.get());
                output.accept(ModBlocks.JUPERIUM_PLATING.get());
                output.accept(ModBlocks.JUPERIUM_PLATING_STAIRS.get());
                output.accept(ModBlocks.JUPERIUM_PLATING_SLAB.get());
                output.accept(ModBlocks.JUPERIUM_PLATING_BUTTON.get());
                output.accept(ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get());
                output.accept(ModBlocks.JUPERIUM_PILLAR.get());
                output.accept(ModBlocks.GLOWING_JUPERIUM_PILLAR.get());
                output.accept(ModBlocks.JUPERIUM_SLIDING_DOOR.get());
                output.accept(ModItems.JUPERIUM_ENGINE.get());
                output.accept(ModItems.JUPERIUM_TANK.get());

                // Saturn
                output.accept(ModBlocks.SATURN_SAND.get());
                output.accept(ModBlocks.SATURN_ICE.get());
                output.accept(ModBlocks.SATURN_STONE.get());
                output.accept(ModBlocks.SATURN_STONE_STAIRS.get());
                output.accept(ModBlocks.SATURN_STONE_SLAB.get());
                output.accept(ModBlocks.SATURN_COBBLESTONE.get());
                output.accept(ModBlocks.SATURN_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.SATURN_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.SATURN_STONE_BRICKS.get());
                output.accept(ModBlocks.SATURN_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.SATURN_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.SATURN_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_SATURN_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_SATURN_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_SATURN_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_SATURN_STONE.get());
                output.accept(ModBlocks.POLISHED_SATURN_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_SATURN_STONE_SLAB.get());
                output.accept(ModBlocks.SATURN_PILLAR.get());
                output.accept(ModBlocks.SATURN_SATURLYTE_ORE.get());
                output.accept(ModBlocks.SATURN_COAL_ORE.get());
                output.accept(ModBlocks.SATURN_GOLD_ORE.get());
                output.accept(ModBlocks.SATURN_DIAMOND_ORE.get());
                output.accept(ModItems.RAW_SATURLYTE.get());
                output.accept(ModBlocks.RAW_SATURLYTE_BLOCK.get());
                output.accept(ModItems.SATURLYTE_INGOT.get());
                output.accept(ModItems.SATURLYTE_PLATE.get());
                output.accept(ModItems.SATURLYTE_NUGGET.get());
                output.accept(ModBlocks.SATURLYTE_BLOCK.get());
                output.accept(ModBlocks.SATURLYTE_PLATING.get());
                output.accept(ModBlocks.SATURLYTE_PLATING_STAIRS.get());
                output.accept(ModBlocks.SATURLYTE_PLATING_SLAB.get());
                output.accept(ModBlocks.SATURLYTE_PLATING_BUTTON.get());
                output.accept(ModBlocks.SATURLYTE_PLATING_PRESSURE_PLATE.get());
                output.accept(ModBlocks.SATURLYTE_PILLAR.get());
                output.accept(ModBlocks.GLOWING_SATURLYTE_PILLAR.get());
                output.accept(ModBlocks.SATURLYTE_SLIDING_DOOR.get());
                output.accept(ModItems.SATURLYTE_ENGINE.get());
                output.accept(ModItems.SATURLYTE_TANK.get());

                // Uranus
                output.accept(ModBlocks.URANUS_STONE.get());
                output.accept(ModBlocks.URANUS_STONE_STAIRS.get());
                output.accept(ModBlocks.URANUS_STONE_SLAB.get());
                output.accept(ModBlocks.URANUS_COBBLESTONE.get());
                output.accept(ModBlocks.URANUS_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.URANUS_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.URANUS_STONE_BRICKS.get());
                output.accept(ModBlocks.URANUS_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.URANUS_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.URANUS_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_URANUS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_URANUS_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_URANUS_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_URANUS_STONE.get());
                output.accept(ModBlocks.POLISHED_URANUS_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_URANUS_STONE_SLAB.get());
                output.accept(ModBlocks.URANUS_PILLAR.get());
                output.accept(ModBlocks.URANUS_URANIUM_ORE.get());
                output.accept(ModBlocks.URANUS_DIAMOND_ORE.get());
                output.accept(ModBlocks.URANUS_ICE_SHARD_ORE.get());
                output.accept(ModBlocks.URANUS_IRON_ORE.get());
                output.accept(ModBlocks.URANUS_LAPIS_ORE.get());
                output.accept(ModItems.RAW_URANIUM.get());
                output.accept(ModBlocks.RAW_URANIUM_BLOCK.get());
                output.accept(ModItems.URANIUM_INGOT.get());
                output.accept(ModItems.URANIUM_PLATE.get());
                output.accept(ModItems.URANIUM_NUGGET.get());
                output.accept(ModBlocks.URANIUM_BLOCK.get());
                output.accept(ModBlocks.URANIUM_PLATING.get());
                output.accept(ModBlocks.URANIUM_PLATING_STAIRS.get());
                output.accept(ModBlocks.URANIUM_PLATING_SLAB.get());
                output.accept(ModBlocks.URANIUM_PLATING_BUTTON.get());
                output.accept(ModBlocks.URANIUM_PLATING_PRESSURE_PLATE.get());
                output.accept(ModBlocks.URANIUM_PILLAR.get());
                output.accept(ModBlocks.GLOWING_URANIUM_PILLAR.get());
                output.accept(ModBlocks.URANIUM_SLIDING_DOOR.get());
                output.accept(ModItems.URANIUM_ENGINE.get());
                output.accept(ModItems.URANIUM_TANK.get());
                output.accept(ModBlocks.SLUSHY_ICE.get());
                output.accept(ModBlocks.PACKED_SLUSHY_ICE.get());
                output.accept(ModBlocks.ICICLE.get());
                output.accept(ModItems.FREEZE_SHARD.get());
                output.accept(ModItems.ICE_CHARGE.get());

                // Neptune
                output.accept(ModBlocks.NEPTUNE_STONE.get());
                output.accept(ModBlocks.NEPTUNE_STONE_STAIRS.get());
                output.accept(ModBlocks.NEPTUNE_STONE_SLAB.get());
                output.accept(ModBlocks.NEPTUNE_COBBLESTONE.get());
                output.accept(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.NEPTUNE_STONE_BRICKS.get());
                output.accept(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.NEPTUNE_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_NEPTUNE_STONE.get());
                output.accept(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get());
                output.accept(ModBlocks.NEPTUNE_PILLAR.get());
                output.accept(ModBlocks.NEPTUNE_NEPTUNIUM_ORE.get());
                output.accept(ModBlocks.NEPTUNE_COAL_ORE.get());
                output.accept(ModBlocks.NEPTUNE_COPPER_ORE.get());
                output.accept(ModBlocks.NEPTUNE_IRON_ORE.get());
                output.accept(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get());
                output.accept(ModItems.RAW_NEPTUNIUM.get());
                output.accept(ModBlocks.RAW_NEPTUNIUM_BLOCK.get());
                output.accept(ModItems.NEPTUNIUM_INGOT.get());
                output.accept(ModItems.NEPTUNIUM_PLATE.get());
                output.accept(ModItems.NEPTUNIUM_NUGGET.get());
                output.accept(ModBlocks.NEPTUNIUM_BLOCK.get());
                output.accept(ModBlocks.NEPTUNIUM_PLATING.get());
                output.accept(ModBlocks.NEPTUNIUM_PLATING_STAIRS.get());
                output.accept(ModBlocks.NEPTUNIUM_PLATING_SLAB.get());
                output.accept(ModBlocks.NEPTUNIUM_PLATING_BUTTON.get());
                output.accept(ModBlocks.NEPTUNIUM_PLATING_PRESSURE_PLATE.get());
                output.accept(ModBlocks.NEPTUNIUM_PILLAR.get());
                output.accept(ModBlocks.GLOWING_NEPTUNIUM_PILLAR.get());
                output.accept(ModBlocks.NEPTUNIUM_SLIDING_DOOR.get());
                output.accept(ModItems.NEPTUNIUM_ENGINE.get());
                output.accept(ModItems.NEPTUNIUM_TANK.get());
                output.accept(ModBlocks.BLUE_SLUSHY_ICE.get());

                // Orcus
                output.accept(ModBlocks.ORCUS_STONE.get());
                output.accept(ModBlocks.ORCUS_STONE_STAIRS.get());
                output.accept(ModBlocks.ORCUS_STONE_SLAB.get());
                output.accept(ModBlocks.ORCUS_COBBLESTONE.get());
                output.accept(ModBlocks.ORCUS_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.ORCUS_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.ORCUS_STONE_BRICKS.get());
                output.accept(ModBlocks.ORCUS_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.ORCUS_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.ORCUS_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_ORCUS_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_ORCUS_STONE.get());
                output.accept(ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_ORCUS_STONE_SLAB.get());
                output.accept(ModBlocks.ORCUS_PILLAR.get());
                output.accept(ModBlocks.ORCUS_RADIUM_ORE.get());
                output.accept(ModBlocks.ORCUS_COPPER_ORE.get());
                output.accept(ModBlocks.ORCUS_IRON_ORE.get());
                output.accept(ModItems.RAW_RADIUM.get());
                output.accept(ModBlocks.RAW_RADIUM_BLOCK.get());
                output.accept(ModItems.RADIUM_INGOT.get());
                output.accept(ModItems.RADIUM_PLATE.get());
                output.accept(ModItems.RADIUM_NUGGET.get());
                output.accept(ModBlocks.RADIUM_BLOCK.get());
                output.accept(ModBlocks.RADIUM_PLATING.get());
                output.accept(ModBlocks.RADIUM_PLATING_STAIRS.get());
                output.accept(ModBlocks.RADIUM_PLATING_SLAB.get());
                output.accept(ModBlocks.RADIUM_PLATING_BUTTON.get());
                output.accept(ModBlocks.RADIUM_PLATING_PRESSURE_PLATE.get());
                output.accept(ModBlocks.RADIUM_PILLAR.get());
                output.accept(ModBlocks.GLOWING_RADIUM_PILLAR.get());
                output.accept(ModBlocks.RADIUM_SLIDING_DOOR.get());
                output.accept(ModItems.RADIUM_ENGINE.get());
                output.accept(ModItems.RADIUM_TANK.get());

                // Pluto
                output.accept(ModBlocks.PLUTO_SAND.get());
                output.accept(ModBlocks.PLUTO_STONE.get());
                output.accept(ModBlocks.PLUTO_STONE_STAIRS.get());
                output.accept(ModBlocks.PLUTO_STONE_SLAB.get());
                output.accept(ModBlocks.PLUTO_COBBLESTONE.get());
                output.accept(ModBlocks.PLUTO_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.PLUTO_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.PLUTO_STONE_BRICKS.get());
                output.accept(ModBlocks.PLUTO_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.PLUTO_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.PLUTO_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_PLUTO_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_PLUTO_STONE.get());
                output.accept(ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_PLUTO_STONE_SLAB.get());
                output.accept(ModBlocks.PLUTO_PILLAR.get());
                output.accept(ModBlocks.PLUTO_PLUTONIUM_ORE.get());
                output.accept(ModBlocks.PLUTO_DIAMOND_ORE.get());
                output.accept(ModBlocks.PLUTO_GOLD_ORE.get());
                output.accept(ModBlocks.PLUTO_ICE_SHARD_ORE.get());
                output.accept(ModItems.RAW_PLUTONIUM.get());
                output.accept(ModBlocks.RAW_PLUTONIUM_BLOCK.get());
                output.accept(ModItems.PLUTONIUM_INGOT.get());
                output.accept(ModItems.PLUTONIUM_PLATE.get());
                output.accept(ModItems.PLUTONIUM_NUGGET.get());
                output.accept(ModBlocks.PLUTONIUM_BLOCK.get());
                output.accept(ModBlocks.PLUTONIUM_PLATING.get());
                output.accept(ModBlocks.PLUTONIUM_PLATING_STAIRS.get());
                output.accept(ModBlocks.PLUTONIUM_PLATING_SLAB.get());
                output.accept(ModBlocks.PLUTONIUM_PLATING_BUTTON.get());
                output.accept(ModBlocks.PLUTONIUM_PLATING_PRESSURE_PLATE.get());
                output.accept(ModBlocks.PLUTONIUM_PILLAR.get());
                output.accept(ModBlocks.GLOWING_PLUTONIUM_PILLAR.get());
                output.accept(ModBlocks.PLUTONIUM_SLIDING_DOOR.get());
                output.accept(ModItems.PLUTONIUM_ENGINE.get());
                output.accept(ModItems.PLUTONIUM_TANK.get());

                // Haumea
                output.accept(ModBlocks.HAUMEA_STONE.get());
                output.accept(ModBlocks.HAUMEA_STONE_STAIRS.get());
                output.accept(ModBlocks.HAUMEA_STONE_SLAB.get());
                output.accept(ModBlocks.HAUMEA_COBBLESTONE.get());
                output.accept(ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.HAUMEA_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.HAUMEA_STONE_BRICKS.get());
                output.accept(ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.HAUMEA_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_HAUMEA_STONE.get());
                output.accept(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get());
                output.accept(ModBlocks.HAUMEA_PILLAR.get());
                output.accept(ModBlocks.HAUMEA_COPPER_ORE.get());
                output.accept(ModBlocks.HAUMEA_IRON_ORE.get());

                // Quaoar
                output.accept(ModBlocks.QUAOAR_STONE.get());
                output.accept(ModBlocks.QUAOAR_STONE_STAIRS.get());
                output.accept(ModBlocks.QUAOAR_STONE_SLAB.get());
                output.accept(ModBlocks.QUAOAR_COBBLESTONE.get());
                output.accept(ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.QUAOAR_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.QUAOAR_STONE_BRICKS.get());
                output.accept(ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.QUAOAR_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_QUAOAR_STONE.get());
                output.accept(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get());
                output.accept(ModBlocks.QUAOAR_PILLAR.get());
                output.accept(ModBlocks.QUAOAR_COPPER_ORE.get());
                output.accept(ModBlocks.QUAOAR_IRON_ORE.get());

                // Makemake
                output.accept(ModBlocks.MAKEMAKE_STONE.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_STAIRS.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_SLAB.get());
                output.accept(ModBlocks.MAKEMAKE_COBBLESTONE.get());
                output.accept(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_BRICKS.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_MAKEMAKE_STONE.get());
                output.accept(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get());
                output.accept(ModBlocks.MAKEMAKE_PILLAR.get());
                output.accept(ModBlocks.MAKEMAKE_COPPER_ORE.get());
                output.accept(ModBlocks.MAKEMAKE_IRON_ORE.get());

                // Gonggong
                output.accept(ModBlocks.GONGGONG_STONE.get());
                output.accept(ModBlocks.GONGGONG_STONE_STAIRS.get());
                output.accept(ModBlocks.GONGGONG_STONE_SLAB.get());
                output.accept(ModBlocks.GONGGONG_COBBLESTONE.get());
                output.accept(ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.GONGGONG_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.GONGGONG_STONE_BRICKS.get());
                output.accept(ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.GONGGONG_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_GONGGONG_STONE.get());
                output.accept(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get());
                output.accept(ModBlocks.GONGGONG_PILLAR.get());
                output.accept(ModBlocks.GONGGONG_COPPER_ORE.get());
                output.accept(ModBlocks.GONGGONG_IRON_ORE.get());

                // Eris
                output.accept(ModBlocks.ERIS_STONE.get());
                output.accept(ModBlocks.ERIS_STONE_STAIRS.get());
                output.accept(ModBlocks.ERIS_STONE_SLAB.get());
                output.accept(ModBlocks.ERIS_COBBLESTONE.get());
                output.accept(ModBlocks.ERIS_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.ERIS_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.ERIS_STONE_BRICKS.get());
                output.accept(ModBlocks.ERIS_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.ERIS_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.ERIS_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_ERIS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_ERIS_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_ERIS_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_ERIS_STONE.get());
                output.accept(ModBlocks.POLISHED_ERIS_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_ERIS_STONE_SLAB.get());
                output.accept(ModBlocks.ERIS_PILLAR.get());
                output.accept(ModBlocks.ERIS_COPPER_ORE.get());
                output.accept(ModBlocks.ERIS_IRON_ORE.get());

                // Sedna
                output.accept(ModBlocks.SEDNA_STONE.get());
                output.accept(ModBlocks.SEDNA_STONE_STAIRS.get());
                output.accept(ModBlocks.SEDNA_STONE_SLAB.get());
                output.accept(ModBlocks.SEDNA_COBBLESTONE.get());
                output.accept(ModBlocks.SEDNA_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.SEDNA_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.SEDNA_STONE_BRICKS.get());
                output.accept(ModBlocks.SEDNA_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.SEDNA_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.SEDNA_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_SEDNA_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_SEDNA_STONE.get());
                output.accept(ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_SEDNA_STONE_SLAB.get());
                output.accept(ModBlocks.SEDNA_PILLAR.get());
                output.accept(ModBlocks.SEDNA_ELECTROLYTE_ORE.get());
                output.accept(ModBlocks.SEDNA_COPPER_ORE.get());
                output.accept(ModBlocks.SEDNA_IRON_ORE.get());
                output.accept(ModItems.RAW_ELECTROLYTE.get());
                output.accept(ModBlocks.RAW_ELECTROLYTE_BLOCK.get());
                output.accept(ModItems.ELECTROLYTE_INGOT.get());
                output.accept(ModItems.ELECTROLYTE_PLATE.get());
                output.accept(ModItems.ELECTROLYTE_NUGGET.get());
                output.accept(ModBlocks.ELECTROLYTE_BLOCK.get());
                output.accept(ModBlocks.ELECTROLYTE_PLATING.get());
                output.accept(ModBlocks.ELECTROLYTE_PLATING_STAIRS.get());
                output.accept(ModBlocks.ELECTROLYTE_PLATING_SLAB.get());
                output.accept(ModBlocks.ELECTROLYTE_PLATING_BUTTON.get());
                output.accept(ModBlocks.ELECTROLYTE_PLATING_PRESSURE_PLATE.get());
                output.accept(ModBlocks.ELECTROLYTE_PILLAR.get());
                output.accept(ModBlocks.GLOWING_ELECTROLYTE_PILLAR.get());
                output.accept(ModBlocks.ELECTROLYTE_SLIDING_DOOR.get());
                output.accept(ModItems.ELECTROLYTE_ENGINE.get());
                output.accept(ModItems.ELECTROLYTE_TANK.get());

                // Proxima Centauri b
                output.accept(ModBlocks.B_SAND.get());
                output.accept(ModBlocks.B_SANDSTONE.get());
                output.accept(ModBlocks.B_SANDSTONE_BRICKS.get());
                output.accept(ModBlocks.B_SANDSTONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.B_SANDSTONE_BRICK_SLAB.get());
                output.accept(ModBlocks.CRACKED_B_SANDSTONE_BRICKS.get());
                output.accept(ModBlocks.B_STONE.get());
                output.accept(ModBlocks.B_STONE_STAIRS.get());
                output.accept(ModBlocks.B_STONE_SLAB.get());
                output.accept(ModBlocks.B_COBBLESTONE.get());
                output.accept(ModBlocks.B_COBBLESTONE_STAIRS.get());
                output.accept(ModBlocks.B_COBBLESTONE_SLAB.get());
                output.accept(ModBlocks.B_STONE_BRICKS.get());
                output.accept(ModBlocks.B_STONE_BRICK_STAIRS.get());
                output.accept(ModBlocks.B_STONE_BRICK_SLAB.get());
                output.accept(ModBlocks.B_STONE_BRICK_WALL.get());
                output.accept(ModBlocks.CRACKED_B_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_B_STONE_BRICKS.get());
                output.accept(ModBlocks.CHISELED_B_STONE_STAIRS.get());
                output.accept(ModBlocks.CHISELED_B_STONE_SLAB.get());
                output.accept(ModBlocks.POLISHED_B_STONE.get());
                output.accept(ModBlocks.POLISHED_B_STONE_STAIRS.get());
                output.accept(ModBlocks.POLISHED_B_STONE_SLAB.get());
                output.accept(ModBlocks.B_PILLAR.get());
                output.accept(ModBlocks.B_DIAMOND_ORE.get());
                output.accept(ModBlocks.B_EMERALD_ORE.get());
                output.accept(ModBlocks.B_IRON_ORE.get());
                output.accept(ModBlocks.B_REDSTONE_ORE.get());

                // Glacio
                output.accept(ModBlocks.GLACIAN_WOOD.get());
                output.accept(ModBlocks.STRIPPED_GLACIAN_WOOD.get());
                output.accept(ModBlocks.GLACIAN_SAPLING.get());
                output.accept(ModItems.GLACIAN_HANGING_SIGN.get());
                output.accept(ModItems.GLACIAN_BOAT);
                output.accept(ModItems.GLACIAN_CHEST_BOAT);

                // Globes
                output.accept(ModBlocks.CERES_GLOBE.get());
                output.accept(ModBlocks.JUPITER_GLOBE.get());
                output.accept(ModBlocks.SATURN_GLOBE.get());
                output.accept(ModBlocks.URANUS_GLOBE.get());
                output.accept(ModBlocks.NEPTUNE_GLOBE.get());
                output.accept(ModBlocks.ORCUS_GLOBE.get());
                output.accept(ModBlocks.PLUTO_GLOBE.get());
                output.accept(ModBlocks.HAUMEA_GLOBE.get());
                output.accept(ModBlocks.QUAOAR_GLOBE.get());
                output.accept(ModBlocks.MAKEMAKE_GLOBE.get());
                output.accept(ModBlocks.GONGGONG_GLOBE.get());
                output.accept(ModBlocks.ERIS_GLOBE.get());
                output.accept(ModBlocks.SEDNA_GLOBE.get());
                output.accept(ModBlocks.B_GLOBE.get());

                // Rockets
                output.accept(ModItems.TIER_5_ROCKET.get());
                output.accept(ModItems.TIER_6_ROCKET.get());
                output.accept(ModItems.TIER_7_ROCKET.get());
                output.accept(ModItems.TIER_8_ROCKET.get());
                output.accept(ModItems.TIER_9_ROCKET.get());
                output.accept(ModItems.TIER_10_ROCKET.get());
                output.accept(ModItems.TIER_11_ROCKET.get());

                // Spawn Eggs
                output.accept(ModItems.FREEZE_SPAWN_EGG.get());
            }).build());
}