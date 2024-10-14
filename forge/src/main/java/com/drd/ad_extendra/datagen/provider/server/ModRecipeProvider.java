package com.drd.ad_extendra.datagen.provider.server;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.drd.ad_extendra.common.registry.ModItems;
import com.drd.ad_extendra.common.utils.tags.ModItemTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> JUPERIUM_SMELTABLES = List.of(ModItems.RAW_JUPERIUM.get(), ModBlocks.JUPITER_JUPERIUM_ORE.get());
    private static final List<ItemLike> SATURLYTE_SMELTABLES = List.of(ModItems.RAW_SATURLYTE.get(), ModBlocks.SATURN_SATURLYTE_ORE.get());
    private static final List<ItemLike> URANIUM_SMELTABLES = List.of(ModItems.RAW_URANIUM.get(), ModBlocks.URANUS_URANIUM_ORE.get());
    private static final List<ItemLike> NEPTUNIUM_SMELTABLES = List.of(ModItems.RAW_NEPTUNIUM.get(), ModBlocks.NEPTUNE_NEPTUNIUM_ORE.get());
    private static final List<ItemLike> RADIUM_SMELTABLES = List.of(ModItems.RAW_RADIUM.get(), ModBlocks.ORCUS_RADIUM_ORE.get());
    private static final List<ItemLike> PLUTONIUM_SMELTABLES = List.of(ModItems.RAW_PLUTONIUM.get(), ModBlocks.PLUTO_PLUTONIUM_ORE.get());
    private static final List<ItemLike> ELECTROLYTE_SMELTABLES = List.of(ModItems.RAW_ELECTROLYTE.get(), ModBlocks.SEDNA_ELECTROLYTE_ORE.get());

    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Moon
        metalPressurePlate(earth.terrarium.adastra.common.registry.ModItems.AERONOS_PLANKS.get(), ModBlocks.AERONOS_PRESSURE_PLATE.get(), consumer);
        metalButton(earth.terrarium.adastra.common.registry.ModItems.AERONOS_PLANKS.get(), ModBlocks.AERONOS_BUTTON.get(), consumer);
        sign(earth.terrarium.adastra.common.registry.ModItems.AERONOS_PLANKS.get(), ModItems.AERONOS_SIGN.get(), consumer);
        hangingSign(earth.terrarium.adastra.common.registry.ModItems.AERONOS_STEM.get(), ModItems.AERONOS_HANGING_SIGN.get(), consumer);
        metalPressurePlate(earth.terrarium.adastra.common.registry.ModItems.STROPHAR_PLANKS.get(), ModBlocks.STROPHAR_PRESSURE_PLATE.get(), consumer);
        metalButton(earth.terrarium.adastra.common.registry.ModItems.STROPHAR_PLANKS.get(), ModBlocks.STROPHAR_BUTTON.get(), consumer);
        sign(earth.terrarium.adastra.common.registry.ModItems.STROPHAR_PLANKS.get(), ModItems.STROPHAR_SIGN.get(), consumer);
        hangingSign(earth.terrarium.adastra.common.registry.ModItems.STROPHAR_STEM.get(), ModItems.STROPHAR_HANGING_SIGN.get(), consumer);

        // Ceres
        oreSmelting(consumer, List.of(ModBlocks.CERES_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.CERES_COBBLESTONE.get(), ModBlocks.CERES_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.CERES_COBBLESTONE.get(), ModBlocks.CERES_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CERES_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CERES_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CERES_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.CERES_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_CERES_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.CERES_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), ModBlocks.CHISELED_CERES_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), ModBlocks.CHISELED_CERES_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.CERES_STONE.get(), ModBlocks.CERES_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CERES_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CHISELED_CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.CHISELED_CERES_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_COBBLESTONE.get(), ModBlocks.CERES_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_COBBLESTONE.get(), ModBlocks.CERES_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CERES_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICKS.get(), ModBlocks.CERES_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), ModBlocks.CHISELED_CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_BRICKS.get(), ModBlocks.CHISELED_CERES_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE.get(), ModBlocks.POLISHED_CERES_STONE_SLAB.get(), 2);
        oreSmelting(consumer, List.of(ModBlocks.CERES_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.CERES_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.CERES_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.CERES_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Jupiter
        packing(ModItems.JUPERIUM_INGOT.get(), ModBlocks.JUPERIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.JUPERIUM_BLOCK.get(), ModItems.JUPERIUM_INGOT.get(), consumer);
        packing(ModItems.JUPERIUM_NUGGET.get(), ModItems.JUPERIUM_INGOT.get(), "from_nuggets", consumer);
        unpacking(ModItems.JUPERIUM_INGOT.get(), ModItems.JUPERIUM_NUGGET.get(), consumer);
        packing(ModItems.RAW_JUPERIUM.get(), ModBlocks.RAW_JUPERIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.RAW_JUPERIUM_BLOCK.get(), ModItems.RAW_JUPERIUM.get(), consumer);
        factoryBlock(ModItemTags.JUPERIUM_PLATES, ModItemTags.JUPERIUM_INGOTS, ModItems.JUPERIUM_INGOT.get(), ModBlocks.JUPERIUM_FACTORY_BLOCK.get(), consumer);
        plateblock(ModItemTags.JUPERIUM_PLATES, ModItems.JUPERIUM_PLATE.get(), ModBlocks.JUPERIUM_PLATEBLOCK.get(), consumer);
        encasedBlock(ModItemTags.JUPERIUM_PLATES, ModBlocks.ENCASED_JUPERIUM_BLOCK.get(), consumer);
        panel(ModItemTags.JUPERIUM_PLATES, ModItemTags.JUPERIUM_INGOTS, ModItems.JUPERIUM_INGOT.get(), ModBlocks.JUPERIUM_PANEL.get(), consumer);
        plating(ModItemTags.JUPERIUM_PLATES, ModItems.JUPERIUM_PLATE.get(), ModBlocks.JUPERIUM_PLATING.get(), consumer);
        stairs(ModBlocks.JUPERIUM_PLATING.get(), ModBlocks.JUPERIUM_PLATING_STAIRS.get(), consumer);
        slab(ModBlocks.JUPERIUM_PLATING.get(), ModBlocks.JUPERIUM_PLATING_SLAB.get(), consumer);
        pillar(ModBlocks.JUPERIUM_PLATING.get(), ModBlocks.JUPERIUM_PILLAR.get(), consumer);
        glowingPillar(ModBlocks.JUPERIUM_PILLAR.get(), ModBlocks.GLOWING_JUPERIUM_PILLAR.get(), consumer);
        metalButton(ModBlocks.JUPERIUM_PLATING.get(), ModBlocks.JUPERIUM_PLATING_BUTTON.get(), consumer);
        metalPressurePlate(ModBlocks.JUPERIUM_PLATING.get(), ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get(), consumer);
        slidingDoor(ModItemTags.JUPERIUM_BLOCKS, ModItemTags.JUPERIUM_PLATES, ModItems.JUPERIUM_PLATE.get(), ModBlocks.JUPERIUM_SLIDING_DOOR.get(), consumer);
        engine(ModItemTags.JUPERIUM_PLATES, earth.terrarium.adastra.common.registry.ModItems.CALORITE_ENGINE.get(), ModItems.JUPERIUM_ENGINE.get(), consumer);
        tank(ModItemTags.JUPERIUM_PLATES, earth.terrarium.adastra.common.registry.ModItems.CALORITE_TANK.get(), ModItems.JUPERIUM_TANK.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.JUPITER_COBBLESTONE.get(), ModBlocks.JUPITER_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.JUPITER_COBBLESTONE.get(), ModBlocks.JUPITER_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), ModBlocks.CHISELED_JUPITER_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.CHISELED_JUPITER_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_COBBLESTONE.get(), ModBlocks.JUPITER_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_COBBLESTONE.get(), ModBlocks.JUPITER_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICKS.get(), ModBlocks.JUPITER_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get(), ModBlocks.CHISELED_JUPITER_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE.get(), ModBlocks.POLISHED_JUPITER_STONE_SLAB.get(), 2);
        oreSmelting(consumer, JUPERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, JUPERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "item");

        // Saturn
        packing(ModItems.SATURLYTE_INGOT.get(), ModBlocks.SATURLYTE_BLOCK.get(), consumer);
        unpacking(ModBlocks.SATURLYTE_BLOCK.get(), ModItems.SATURLYTE_INGOT.get(), consumer);
        packing(ModItems.SATURLYTE_NUGGET.get(), ModItems.SATURLYTE_INGOT.get(), "from_nuggets", consumer);
        unpacking(ModItems.SATURLYTE_INGOT.get(), ModItems.SATURLYTE_NUGGET.get(), consumer);
        packing(ModItems.RAW_SATURLYTE.get(), ModBlocks.RAW_SATURLYTE_BLOCK.get(), consumer);
        unpacking(ModBlocks.RAW_SATURLYTE_BLOCK.get(), ModItems.RAW_SATURLYTE.get(), consumer);
        factoryBlock(ModItemTags.SATURLYTE_PLATES, ModItemTags.SATURLYTE_INGOTS, ModItems.SATURLYTE_INGOT.get(), ModBlocks.SATURLYTE_FACTORY_BLOCK.get(), consumer);
        plateblock(ModItemTags.SATURLYTE_PLATES, ModItems.SATURLYTE_PLATE.get(), ModBlocks.SATURLYTE_PLATEBLOCK.get(), consumer);
        encasedBlock(ModItemTags.SATURLYTE_PLATES, ModBlocks.ENCASED_SATURLYTE_BLOCK.get(), consumer);
        panel(ModItemTags.SATURLYTE_PLATES, ModItemTags.SATURLYTE_INGOTS, ModItems.SATURLYTE_INGOT.get(), ModBlocks.SATURLYTE_PANEL.get(), consumer);
        plating(ModItemTags.SATURLYTE_PLATES, ModItems.SATURLYTE_PLATE.get(), ModBlocks.SATURLYTE_PLATING.get(), consumer);
        stairs(ModBlocks.SATURLYTE_PLATING.get(), ModBlocks.SATURLYTE_PLATING_STAIRS.get(), consumer);
        slab(ModBlocks.SATURLYTE_PLATING.get(), ModBlocks.SATURLYTE_PLATING_SLAB.get(), consumer);
        pillar(ModBlocks.SATURLYTE_PLATING.get(), ModBlocks.SATURLYTE_PILLAR.get(), consumer);
        glowingPillar(ModBlocks.SATURLYTE_PILLAR.get(), ModBlocks.GLOWING_SATURLYTE_PILLAR.get(), consumer);
        metalButton(ModBlocks.SATURLYTE_PLATING.get(), ModBlocks.SATURLYTE_PLATING_BUTTON.get(), consumer);
        metalPressurePlate(ModBlocks.SATURLYTE_PLATING.get(), ModBlocks.SATURLYTE_PLATING_PRESSURE_PLATE.get(), consumer);
        slidingDoor(ModItemTags.SATURLYTE_BLOCKS, ModItemTags.SATURLYTE_PLATES, ModItems.SATURLYTE_PLATE.get(), ModBlocks.SATURLYTE_SLIDING_DOOR.get(), consumer);
        engine(ModItemTags.SATURLYTE_PLATES, ModItems.JUPERIUM_ENGINE.get(), ModItems.SATURLYTE_ENGINE.get(), consumer);
        tank(ModItemTags.SATURLYTE_PLATES, ModItems.JUPERIUM_TANK.get(), ModItems.SATURLYTE_TANK.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.SATURN_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.SATURN_COBBLESTONE.get(), ModBlocks.SATURN_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.SATURN_COBBLESTONE.get(), ModBlocks.SATURN_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.SATURN_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.SATURN_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.SATURN_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.SATURN_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_SATURN_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.SATURN_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), ModBlocks.CHISELED_SATURN_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), ModBlocks.CHISELED_SATURN_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.CHISELED_SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.CHISELED_SATURN_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_COBBLESTONE.get(), ModBlocks.SATURN_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_COBBLESTONE.get(), ModBlocks.SATURN_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.SATURN_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICKS.get(), ModBlocks.SATURN_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), ModBlocks.CHISELED_SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_BRICKS.get(), ModBlocks.CHISELED_SATURN_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE.get(), ModBlocks.POLISHED_SATURN_STONE_SLAB.get(), 2);
        oreSmelting(consumer, SATURLYTE_SMELTABLES, RecipeCategory.MISC, ModItems.SATURLYTE_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SATURN_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SATURN_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SATURN_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, SATURLYTE_SMELTABLES, RecipeCategory.MISC, ModItems.SATURLYTE_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SATURN_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SATURN_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SATURN_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "item");

        // Uranus
        packing(ModItems.URANIUM_INGOT.get(), ModBlocks.URANIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.URANIUM_BLOCK.get(), ModItems.URANIUM_INGOT.get(), consumer);
        packing(ModItems.URANIUM_NUGGET.get(), ModItems.URANIUM_INGOT.get(), "from_nuggets", consumer);
        unpacking(ModItems.URANIUM_INGOT.get(), ModItems.URANIUM_NUGGET.get(), consumer);
        packing(ModItems.RAW_URANIUM.get(), ModBlocks.RAW_URANIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.RAW_URANIUM_BLOCK.get(), ModItems.RAW_URANIUM.get(), consumer);
        factoryBlock(ModItemTags.URANIUM_PLATES, ModItemTags.URANIUM_INGOTS, ModItems.URANIUM_INGOT.get(), ModBlocks.URANIUM_FACTORY_BLOCK.get(), consumer);
        plateblock(ModItemTags.URANIUM_PLATES, ModItems.URANIUM_PLATE.get(), ModBlocks.URANIUM_PLATEBLOCK.get(), consumer);
        encasedBlock(ModItemTags.URANIUM_PLATES, ModBlocks.ENCASED_URANIUM_BLOCK.get(), consumer);
        panel(ModItemTags.URANIUM_PLATES, ModItemTags.URANIUM_INGOTS, ModItems.URANIUM_INGOT.get(), ModBlocks.URANIUM_PANEL.get(), consumer);
        plating(ModItemTags.URANIUM_PLATES, ModItems.URANIUM_PLATE.get(), ModBlocks.URANIUM_PLATING.get(), consumer);
        stairs(ModBlocks.URANIUM_PLATING.get(), ModBlocks.URANIUM_PLATING_STAIRS.get(), consumer);
        slab(ModBlocks.URANIUM_PLATING.get(), ModBlocks.URANIUM_PLATING_SLAB.get(), consumer);
        pillar(ModBlocks.URANIUM_PLATING.get(), ModBlocks.URANIUM_PILLAR.get(), consumer);
        glowingPillar(ModBlocks.URANIUM_PILLAR.get(), ModBlocks.GLOWING_URANIUM_PILLAR.get(), consumer);
        metalButton(ModBlocks.URANIUM_PLATING.get(), ModBlocks.URANIUM_PLATING_BUTTON.get(), consumer);
        metalPressurePlate(ModBlocks.URANIUM_PLATING.get(), ModBlocks.URANIUM_PLATING_PRESSURE_PLATE.get(), consumer);
        slidingDoor(ModItemTags.URANIUM_BLOCKS, ModItemTags.URANIUM_PLATES, ModItems.URANIUM_PLATE.get(), ModBlocks.URANIUM_SLIDING_DOOR.get(), consumer);
        engine(ModItemTags.URANIUM_PLATES, ModItems.SATURLYTE_ENGINE.get(), ModItems.URANIUM_ENGINE.get(), consumer);
        tank(ModItemTags.URANIUM_PLATES, ModItems.SATURLYTE_TANK.get(), ModItems.URANIUM_TANK.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.URANUS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.URANUS_COBBLESTONE.get(), ModBlocks.URANUS_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.URANUS_COBBLESTONE.get(), ModBlocks.URANUS_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.URANUS_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.URANUS_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.URANUS_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.URANUS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_URANUS_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.URANUS_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), ModBlocks.CHISELED_URANUS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), ModBlocks.CHISELED_URANUS_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.CHISELED_URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.CHISELED_URANUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_COBBLESTONE.get(), ModBlocks.URANUS_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_COBBLESTONE.get(), ModBlocks.URANUS_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.URANUS_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICKS.get(), ModBlocks.URANUS_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), ModBlocks.CHISELED_URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_BRICKS.get(), ModBlocks.CHISELED_URANUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE.get(), ModBlocks.POLISHED_URANUS_STONE_SLAB.get(), 2);
        oreSmelting(consumer, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_LAPIS_ORE.get()), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 200, "item");
        oreBlasting(consumer, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.URANUS_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.URANUS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.URANUS_LAPIS_ORE.get()), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.URANUS_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 100, "item");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ICE_CHARGE.get(), 4)
                .requires(ModItems.FREEZE_SHARD.get()).unlockedBy(getHasName(ModItems.FREEZE_SHARD.get()), has(ModItems.FREEZE_SHARD.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICICLE.get())
                .pattern("#")
                .pattern("#")
                .define('#', earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get())
                .unlockedBy(getHasName(earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get()), has(earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get(), 2)
                .requires(ModBlocks.ICICLE.get())
                .unlockedBy(getHasName(ModBlocks.ICICLE.get()), has(ModBlocks.ICICLE.get()))
                .save(consumer, AdExtendra.MOD_ID + ":ice_shards_from_icicle");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SLUSHY_ICE.get(), 4)
                .pattern(" # ")
                .pattern("#W#")
                .pattern(" # ")
                .define('#', Items.ICE)
                .define('W', Items.WATER_BUCKET)
                .unlockedBy(getHasName(Items.ICE), has(Items.ICE))
                .save(consumer);
        packing(ModBlocks.SLUSHY_ICE.get(), ModBlocks.PACKED_SLUSHY_ICE.get(), consumer);

        // Neptune
        packing(ModItems.NEPTUNIUM_INGOT.get(), ModBlocks.NEPTUNIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.NEPTUNIUM_BLOCK.get(), ModItems.NEPTUNIUM_INGOT.get(), consumer);
        packing(ModItems.NEPTUNIUM_NUGGET.get(), ModItems.NEPTUNIUM_INGOT.get(), "from_nuggets", consumer);
        unpacking(ModItems.NEPTUNIUM_INGOT.get(), ModItems.NEPTUNIUM_NUGGET.get(), consumer);
        packing(ModItems.RAW_NEPTUNIUM.get(), ModBlocks.RAW_NEPTUNIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.RAW_NEPTUNIUM_BLOCK.get(), ModItems.RAW_NEPTUNIUM.get(), consumer);
        factoryBlock(ModItemTags.NEPTUNIUM_PLATES, ModItemTags.NEPTUNIUM_INGOTS, ModItems.NEPTUNIUM_INGOT.get(), ModBlocks.NEPTUNIUM_FACTORY_BLOCK.get(), consumer);
        plateblock(ModItemTags.NEPTUNIUM_PLATES, ModItems.NEPTUNIUM_PLATE.get(), ModBlocks.NEPTUNIUM_PLATEBLOCK.get(), consumer);
        encasedBlock(ModItemTags.NEPTUNIUM_PLATES, ModBlocks.ENCASED_NEPTUNIUM_BLOCK.get(), consumer);
        panel(ModItemTags.NEPTUNIUM_PLATES, ModItemTags.NEPTUNIUM_INGOTS, ModItems.NEPTUNIUM_INGOT.get(), ModBlocks.NEPTUNIUM_PANEL.get(), consumer);
        plating(ModItemTags.NEPTUNIUM_PLATES, ModItems.NEPTUNIUM_PLATE.get(), ModBlocks.NEPTUNIUM_PLATING.get(), consumer);
        stairs(ModBlocks.NEPTUNIUM_PLATING.get(), ModBlocks.NEPTUNIUM_PLATING_STAIRS.get(), consumer);
        slab(ModBlocks.NEPTUNIUM_PLATING.get(), ModBlocks.NEPTUNIUM_PLATING_SLAB.get(), consumer);
        pillar(ModBlocks.NEPTUNIUM_PLATING.get(), ModBlocks.NEPTUNIUM_PILLAR.get(), consumer);
        glowingPillar(ModBlocks.NEPTUNIUM_PILLAR.get(), ModBlocks.GLOWING_NEPTUNIUM_PILLAR.get(), consumer);
        metalButton(ModBlocks.NEPTUNIUM_PLATING.get(), ModBlocks.NEPTUNIUM_PLATING_BUTTON.get(), consumer);
        metalPressurePlate(ModBlocks.NEPTUNIUM_PLATING.get(), ModBlocks.NEPTUNIUM_PLATING_PRESSURE_PLATE.get(), consumer);
        slidingDoor(ModItemTags.NEPTUNIUM_BLOCKS, ModItemTags.NEPTUNIUM_PLATES, ModItems.NEPTUNIUM_PLATE.get(), ModBlocks.NEPTUNIUM_SLIDING_DOOR.get(), consumer);
        engine(ModItemTags.NEPTUNIUM_PLATES, ModItems.URANIUM_ENGINE.get(), ModItems.NEPTUNIUM_ENGINE.get(), consumer);
        tank(ModItemTags.NEPTUNIUM_PLATES, ModItems.URANIUM_TANK.get(), ModItems.NEPTUNIUM_TANK.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.NEPTUNE_COBBLESTONE.get(), ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.NEPTUNE_COBBLESTONE.get(), ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.NEPTUNE_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_COBBLESTONE.get(), ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_COBBLESTONE.get(), ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.NEPTUNE_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICKS.get(), ModBlocks.NEPTUNE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get(), ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE.get(), ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get(), 2);
        oreSmelting(consumer, NEPTUNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.NEPTUNIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 200, "item");
        oreBlasting(consumer, NEPTUNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.NEPTUNIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.NEPTUNE_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.NEPTUNE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.NEPTUNE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 100, "item");
        packing(ModBlocks.PACKED_SLUSHY_ICE.get(), ModBlocks.BLUE_SLUSHY_ICE.get(), consumer);

        // Orcus
        packing(ModItems.RADIUM_INGOT.get(), ModBlocks.RADIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.RADIUM_BLOCK.get(), ModItems.RADIUM_INGOT.get(), consumer);
        packing(ModItems.RADIUM_NUGGET.get(), ModItems.RADIUM_INGOT.get(), "from_nuggets", consumer);
        unpacking(ModItems.RADIUM_INGOT.get(), ModItems.RADIUM_NUGGET.get(), consumer);
        packing(ModItems.RAW_RADIUM.get(), ModBlocks.RAW_RADIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.RAW_RADIUM_BLOCK.get(), ModItems.RAW_RADIUM.get(), consumer);
        factoryBlock(ModItemTags.RADIUM_PLATES, ModItemTags.RADIUM_INGOTS, ModItems.RADIUM_INGOT.get(), ModBlocks.RADIUM_FACTORY_BLOCK.get(), consumer);
        plateblock(ModItemTags.RADIUM_PLATES, ModItems.RADIUM_PLATE.get(), ModBlocks.RADIUM_PLATEBLOCK.get(), consumer);
        encasedBlock(ModItemTags.RADIUM_PLATES, ModBlocks.ENCASED_RADIUM_BLOCK.get(), consumer);
        panel(ModItemTags.RADIUM_PLATES, ModItemTags.RADIUM_INGOTS, ModItems.RADIUM_INGOT.get(), ModBlocks.RADIUM_PANEL.get(), consumer);
        plating(ModItemTags.RADIUM_PLATES, ModItems.RADIUM_PLATE.get(), ModBlocks.RADIUM_PLATING.get(), consumer);
        stairs(ModBlocks.RADIUM_PLATING.get(), ModBlocks.RADIUM_PLATING_STAIRS.get(), consumer);
        slab(ModBlocks.RADIUM_PLATING.get(), ModBlocks.RADIUM_PLATING_SLAB.get(), consumer);
        pillar(ModBlocks.RADIUM_PLATING.get(), ModBlocks.RADIUM_PILLAR.get(), consumer);
        glowingPillar(ModBlocks.RADIUM_PILLAR.get(), ModBlocks.GLOWING_RADIUM_PILLAR.get(), consumer);
        metalButton(ModBlocks.RADIUM_PLATING.get(), ModBlocks.RADIUM_PLATING_BUTTON.get(), consumer);
        metalPressurePlate(ModBlocks.RADIUM_PLATING.get(), ModBlocks.RADIUM_PLATING_PRESSURE_PLATE.get(), consumer);
        slidingDoor(ModItemTags.RADIUM_BLOCKS, ModItemTags.RADIUM_PLATES, ModItems.RADIUM_PLATE.get(), ModBlocks.RADIUM_SLIDING_DOOR.get(), consumer);
        engine(ModItemTags.RADIUM_PLATES, ModItems.NEPTUNIUM_ENGINE.get(), ModItems.RADIUM_ENGINE.get(), consumer);
        tank(ModItemTags.RADIUM_PLATES, ModItems.NEPTUNIUM_TANK.get(), ModItems.RADIUM_TANK.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.ORCUS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.ORCUS_COBBLESTONE.get(), ModBlocks.ORCUS_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.ORCUS_COBBLESTONE.get(), ModBlocks.ORCUS_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.ORCUS_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.ORCUS_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.ORCUS_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.ORCUS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.ORCUS_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), ModBlocks.CHISELED_ORCUS_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.CHISELED_ORCUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_COBBLESTONE.get(), ModBlocks.ORCUS_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_COBBLESTONE.get(), ModBlocks.ORCUS_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.ORCUS_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICKS.get(), ModBlocks.ORCUS_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get(), ModBlocks.CHISELED_ORCUS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE.get(), ModBlocks.POLISHED_ORCUS_STONE_SLAB.get(), 2);
        oreSmelting(consumer, RADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.RADIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ORCUS_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ORCUS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, RADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.RADIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.ORCUS_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.ORCUS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Pluto
        packing(ModItems.PLUTONIUM_INGOT.get(), ModBlocks.PLUTONIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.PLUTONIUM_BLOCK.get(), ModItems.PLUTONIUM_INGOT.get(), consumer);
        packing(ModItems.PLUTONIUM_NUGGET.get(), ModItems.PLUTONIUM_INGOT.get(), "from_nuggets", consumer);
        unpacking(ModItems.PLUTONIUM_INGOT.get(), ModItems.PLUTONIUM_NUGGET.get(), consumer);
        packing(ModItems.RAW_PLUTONIUM.get(), ModBlocks.RAW_PLUTONIUM_BLOCK.get(), consumer);
        unpacking(ModBlocks.RAW_PLUTONIUM_BLOCK.get(), ModItems.RAW_PLUTONIUM.get(), consumer);
        factoryBlock(ModItemTags.PLUTONIUM_PLATES, ModItemTags.PLUTONIUM_INGOTS, ModItems.PLUTONIUM_INGOT.get(), ModBlocks.PLUTONIUM_FACTORY_BLOCK.get(), consumer);
        plateblock(ModItemTags.PLUTONIUM_PLATES, ModItems.PLUTONIUM_PLATE.get(), ModBlocks.PLUTONIUM_PLATEBLOCK.get(), consumer);
        encasedBlock(ModItemTags.PLUTONIUM_PLATES, ModBlocks.ENCASED_PLUTONIUM_BLOCK.get(), consumer);
        panel(ModItemTags.PLUTONIUM_PLATES, ModItemTags.PLUTONIUM_INGOTS, ModItems.PLUTONIUM_INGOT.get(), ModBlocks.PLUTONIUM_PANEL.get(), consumer);
        plating(ModItemTags.PLUTONIUM_PLATES, ModItems.PLUTONIUM_PLATE.get(), ModBlocks.PLUTONIUM_PLATING.get(), consumer);
        stairs(ModBlocks.PLUTONIUM_PLATING.get(), ModBlocks.PLUTONIUM_PLATING_STAIRS.get(), consumer);
        slab(ModBlocks.PLUTONIUM_PLATING.get(), ModBlocks.PLUTONIUM_PLATING_SLAB.get(), consumer);
        pillar(ModBlocks.PLUTONIUM_PLATING.get(), ModBlocks.PLUTONIUM_PILLAR.get(), consumer);
        glowingPillar(ModBlocks.PLUTONIUM_PILLAR.get(), ModBlocks.GLOWING_PLUTONIUM_PILLAR.get(), consumer);
        metalButton(ModBlocks.PLUTONIUM_PLATING.get(), ModBlocks.PLUTONIUM_PLATING_BUTTON.get(), consumer);
        metalPressurePlate(ModBlocks.PLUTONIUM_PLATING.get(), ModBlocks.PLUTONIUM_PLATING_PRESSURE_PLATE.get(), consumer);
        slidingDoor(ModItemTags.PLUTONIUM_BLOCKS, ModItemTags.PLUTONIUM_PLATES, ModItems.PLUTONIUM_PLATE.get(), ModBlocks.PLUTONIUM_SLIDING_DOOR.get(), consumer);
        engine(ModItemTags.PLUTONIUM_PLATES, ModItems.RADIUM_ENGINE.get(), ModItems.PLUTONIUM_ENGINE.get(), consumer);
        tank(ModItemTags.PLUTONIUM_PLATES, ModItems.RADIUM_TANK.get(), ModItems.PLUTONIUM_TANK.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.PLUTO_COBBLESTONE.get(), ModBlocks.PLUTO_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.PLUTO_COBBLESTONE.get(), ModBlocks.PLUTO_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.PLUTO_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.PLUTO_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.PLUTO_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.PLUTO_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), ModBlocks.CHISELED_PLUTO_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.CHISELED_PLUTO_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_COBBLESTONE.get(), ModBlocks.PLUTO_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_COBBLESTONE.get(), ModBlocks.PLUTO_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.PLUTO_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICKS.get(), ModBlocks.PLUTO_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get(), ModBlocks.CHISELED_PLUTO_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE.get(), ModBlocks.POLISHED_PLUTO_STONE_SLAB.get(), 2);
        oreSmelting(consumer, PLUTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 200, "item");
        oreBlasting(consumer, PLUTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.PLUTO_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.PLUTO_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.PLUTO_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 100, "item");
        
        // Haumea
        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.HAUMEA_COBBLESTONE.get(), ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.HAUMEA_COBBLESTONE.get(), ModBlocks.HAUMEA_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.HAUMEA_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.HAUMEA_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_COBBLESTONE.get(), ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_COBBLESTONE.get(), ModBlocks.HAUMEA_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.HAUMEA_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICKS.get(), ModBlocks.HAUMEA_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get(), ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE.get(), ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get(), 2);
        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.HAUMEA_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.HAUMEA_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        
        // Quaoar
        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.QUAOAR_COBBLESTONE.get(), ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.QUAOAR_COBBLESTONE.get(), ModBlocks.QUAOAR_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.QUAOAR_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.QUAOAR_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_COBBLESTONE.get(), ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_COBBLESTONE.get(), ModBlocks.QUAOAR_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.QUAOAR_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICKS.get(), ModBlocks.QUAOAR_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get(), ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE.get(), ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get(), 2);
        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.QUAOAR_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.QUAOAR_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        
        // Makemake
        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.MAKEMAKE_COBBLESTONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.MAKEMAKE_COBBLESTONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_COBBLESTONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_COBBLESTONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICKS.get(), ModBlocks.MAKEMAKE_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get(), ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE.get(), ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get(), 2);
        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.MAKEMAKE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.MAKEMAKE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        
        // Gonggong
        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.GONGGONG_COBBLESTONE.get(), ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.GONGGONG_COBBLESTONE.get(), ModBlocks.GONGGONG_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.GONGGONG_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.GONGGONG_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_COBBLESTONE.get(), ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_COBBLESTONE.get(), ModBlocks.GONGGONG_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.GONGGONG_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICKS.get(), ModBlocks.GONGGONG_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get(), ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE.get(), ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get(), 2);
        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.GONGGONG_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.GONGGONG_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        
        // Eris
        oreSmelting(consumer, List.of(ModBlocks.ERIS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.ERIS_COBBLESTONE.get(), ModBlocks.ERIS_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.ERIS_COBBLESTONE.get(), ModBlocks.ERIS_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.ERIS_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.ERIS_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.ERIS_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.ERIS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_ERIS_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.ERIS_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), ModBlocks.CHISELED_ERIS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), ModBlocks.CHISELED_ERIS_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.CHISELED_ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.CHISELED_ERIS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_COBBLESTONE.get(), ModBlocks.ERIS_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_COBBLESTONE.get(), ModBlocks.ERIS_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.ERIS_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICKS.get(), ModBlocks.ERIS_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), ModBlocks.CHISELED_ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_BRICKS.get(), ModBlocks.CHISELED_ERIS_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE.get(), ModBlocks.POLISHED_ERIS_STONE_SLAB.get(), 2);
        oreSmelting(consumer, List.of(ModBlocks.ERIS_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ERIS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.ERIS_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.ERIS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Sedna
        packing(ModItems.ELECTROLYTE_INGOT.get(), ModBlocks.ELECTROLYTE_BLOCK.get(), consumer);
        unpacking(ModBlocks.ELECTROLYTE_BLOCK.get(), ModItems.ELECTROLYTE_INGOT.get(), consumer);
        packing(ModItems.ELECTROLYTE_NUGGET.get(), ModItems.ELECTROLYTE_INGOT.get(), "from_nuggets", consumer);
        unpacking(ModItems.ELECTROLYTE_INGOT.get(), ModItems.ELECTROLYTE_NUGGET.get(), consumer);
        packing(ModItems.RAW_ELECTROLYTE.get(), ModBlocks.RAW_ELECTROLYTE_BLOCK.get(), consumer);
        unpacking(ModBlocks.RAW_ELECTROLYTE_BLOCK.get(), ModItems.RAW_ELECTROLYTE.get(), consumer);
        factoryBlock(ModItemTags.ELECTROLYTE_PLATES, ModItemTags.ELECTROLYTE_INGOTS, ModItems.ELECTROLYTE_INGOT.get(), ModBlocks.ELECTROLYTE_FACTORY_BLOCK.get(), consumer);
        plateblock(ModItemTags.ELECTROLYTE_PLATES, ModItems.ELECTROLYTE_PLATE.get(), ModBlocks.ELECTROLYTE_PLATEBLOCK.get(), consumer);
        encasedBlock(ModItemTags.ELECTROLYTE_PLATES, ModBlocks.ENCASED_ELECTROLYTE_BLOCK.get(), consumer);
        panel(ModItemTags.ELECTROLYTE_PLATES, ModItemTags.ELECTROLYTE_INGOTS, ModItems.ELECTROLYTE_INGOT.get(), ModBlocks.ELECTROLYTE_PANEL.get(), consumer);
        plating(ModItemTags.ELECTROLYTE_PLATES, ModItems.ELECTROLYTE_PLATE.get(), ModBlocks.ELECTROLYTE_PLATING.get(), consumer);
        stairs(ModBlocks.ELECTROLYTE_PLATING.get(), ModBlocks.ELECTROLYTE_PLATING_STAIRS.get(), consumer);
        slab(ModBlocks.ELECTROLYTE_PLATING.get(), ModBlocks.ELECTROLYTE_PLATING_SLAB.get(), consumer);
        pillar(ModBlocks.ELECTROLYTE_PLATING.get(), ModBlocks.ELECTROLYTE_PILLAR.get(), consumer);
        glowingPillar(ModBlocks.ELECTROLYTE_PILLAR.get(), ModBlocks.GLOWING_ELECTROLYTE_PILLAR.get(), consumer);
        metalButton(ModBlocks.ELECTROLYTE_PLATING.get(), ModBlocks.ELECTROLYTE_PLATING_BUTTON.get(), consumer);
        metalPressurePlate(ModBlocks.ELECTROLYTE_PLATING.get(), ModBlocks.ELECTROLYTE_PLATING_PRESSURE_PLATE.get(), consumer);
        slidingDoor(ModItemTags.ELECTROLYTE_BLOCKS, ModItemTags.ELECTROLYTE_PLATES, ModItems.ELECTROLYTE_PLATE.get(), ModBlocks.ELECTROLYTE_SLIDING_DOOR.get(), consumer);
        engine(ModItemTags.ELECTROLYTE_PLATES, ModItems.PLUTONIUM_ENGINE.get(), ModItems.ELECTROLYTE_ENGINE.get(), consumer);
        tank(ModItemTags.ELECTROLYTE_PLATES, ModItems.PLUTONIUM_TANK.get(), ModItems.ELECTROLYTE_TANK.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.SEDNA_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.SEDNA_COBBLESTONE.get(), ModBlocks.SEDNA_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.SEDNA_COBBLESTONE.get(), ModBlocks.SEDNA_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.SEDNA_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.SEDNA_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.SEDNA_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.SEDNA_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.SEDNA_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), ModBlocks.CHISELED_SEDNA_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.CHISELED_SEDNA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_COBBLESTONE.get(), ModBlocks.SEDNA_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_COBBLESTONE.get(), ModBlocks.SEDNA_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.SEDNA_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICKS.get(), ModBlocks.SEDNA_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get(), ModBlocks.CHISELED_SEDNA_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE.get(), ModBlocks.POLISHED_SEDNA_STONE_SLAB.get(), 2);
        oreSmelting(consumer, ELECTROLYTE_SMELTABLES, RecipeCategory.MISC, ModItems.ELECTROLYTE_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SEDNA_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SEDNA_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, ELECTROLYTE_SMELTABLES, RecipeCategory.MISC, ModItems.ELECTROLYTE_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SEDNA_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SEDNA_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        
        // Proxima Centauri b
        bricks(ModBlocks.B_SAND.get(), ModBlocks.B_SANDSTONE.get(), consumer);
        bricks(ModBlocks.B_SANDSTONE.get(), ModBlocks.B_SANDSTONE_BRICKS.get(), consumer);
        stairs(ModBlocks.B_SANDSTONE_BRICKS.get(), ModBlocks.B_SANDSTONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.B_SANDSTONE_BRICKS.get(), ModBlocks.B_SANDSTONE_BRICK_SLAB.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.B_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.B_STONE.get(), 0f, 200, "item");
        stairs(ModBlocks.B_STONE.get(), ModBlocks.B_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.B_STONE.get(), ModBlocks.B_STONE_SLAB.get(), consumer);
        stairs(ModBlocks.B_COBBLESTONE.get(), ModBlocks.B_COBBLESTONE_STAIRS.get(), consumer);
        slab(ModBlocks.B_COBBLESTONE.get(), ModBlocks.B_COBBLESTONE_SLAB.get(), consumer);
        bricks(ModBlocks.B_STONE.get(), ModBlocks.B_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.B_STONE_BRICKS.get(), ModBlocks.B_STONE_BRICK_STAIRS.get(), consumer);
        slab(ModBlocks.B_STONE_BRICKS.get(), ModBlocks.B_STONE_BRICK_SLAB.get(), consumer);
        wall(ModBlocks.B_STONE_BRICKS.get(), ModBlocks.B_STONE_BRICK_WALL.get(), consumer);
        oreSmelting(consumer, List.of(ModBlocks.B_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_B_STONE_BRICKS.get(), 0f, 200, "item");
        chiseledBricks(ModBlocks.B_STONE_BRICK_SLAB.get(), ModBlocks.CHISELED_B_STONE_BRICKS.get(), consumer);
        stairs(ModBlocks.CHISELED_B_STONE_BRICKS.get(), ModBlocks.CHISELED_B_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.CHISELED_B_STONE_BRICKS.get(), ModBlocks.CHISELED_B_STONE_SLAB.get(), consumer);
        polishedStone(ModBlocks.B_STONE.get(), ModBlocks.POLISHED_B_STONE.get(), consumer);
        stairs(ModBlocks.POLISHED_B_STONE.get(), ModBlocks.POLISHED_B_STONE_STAIRS.get(), consumer);
        slab(ModBlocks.POLISHED_B_STONE.get(), ModBlocks.POLISHED_B_STONE_SLAB.get(), consumer);
        pillar(ModBlocks.B_STONE.get(), ModBlocks.B_PILLAR.get(), consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_SANDSTONE.get(), ModBlocks.B_SANDSTONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_SANDSTONE_BRICKS.get(), ModBlocks.B_SANDSTONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_SANDSTONE_BRICKS.get(), ModBlocks.B_SANDSTONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_SANDSTONE.get(), ModBlocks.B_SANDSTONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_SANDSTONE.get(), ModBlocks.B_SANDSTONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_BRICK_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.B_STONE_BRICK_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.CHISELED_B_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.CHISELED_B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.CHISELED_B_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.POLISHED_B_STONE.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.POLISHED_B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE.get(), ModBlocks.POLISHED_B_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_COBBLESTONE.get(), ModBlocks.B_COBBLESTONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_COBBLESTONE.get(), ModBlocks.B_COBBLESTONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE_BRICKS.get(), ModBlocks.B_STONE_BRICK_WALL.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE_BRICKS.get(), ModBlocks.CHISELED_B_STONE_BRICKS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.B_STONE_BRICKS.get(), ModBlocks.B_PILLAR.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_BRICKS.get(), ModBlocks.CHISELED_B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_BRICKS.get(), ModBlocks.CHISELED_B_STONE_SLAB.get(), 2);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE.get(), ModBlocks.POLISHED_B_STONE_STAIRS.get(), 1);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE.get(), ModBlocks.POLISHED_B_STONE_SLAB.get(), 2);
        oreSmelting(consumer, List.of(ModBlocks.B_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.B_EMERALD_ORE.get()), RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.B_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.B_REDSTONE_ORE.get()), RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.B_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.B_EMERALD_ORE.get()), RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.B_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.B_REDSTONE_ORE.get()), RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "item");

        // Glacio
        bark(earth.terrarium.adastra.common.registry.ModItems.GLACIAN_LOG.get(), ModBlocks.GLACIAN_WOOD.get(), consumer);
        bark(earth.terrarium.adastra.common.registry.ModItems.STRIPPED_GLACIAN_LOG.get(), ModBlocks.STRIPPED_GLACIAN_WOOD.get(), consumer);
        sign(earth.terrarium.adastra.common.registry.ModItems.GLACIAN_PLANKS.get(), ModItems.GLACIAN_SIGN.get(), consumer);
        hangingSign(earth.terrarium.adastra.common.registry.ModItems.STRIPPED_GLACIAN_LOG.get(), ModItems.GLACIAN_HANGING_SIGN.get(), consumer);
    }

    private void packing(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void packing(ItemLike ingredient, ItemLike result, String others, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer, AdExtendra.MOD_ID + ":" + result + "_" + others);
    }

    private void unpacking(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 9)
                .requires(ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void bricks(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 4)
                .pattern("##")
                .pattern("##")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void polishedStone(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 9)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void bark(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 3)
                .pattern("##")
                .pattern("##")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void chiseledBricks(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("#")
                .pattern("#")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void stairs(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void slab(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 6)
                .pattern("###")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void wall(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 6)
                .pattern("###")
                .pattern("###")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void factoryBlock(TagKey<Item> plates, TagKey<Item> ingots, ItemLike mainIngot, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 64)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .define('#', plates)
                .define('X', ingots)
                .unlockedBy(getHasName(mainIngot), has(ingots))
                .save(consumer);
    }

    private void encasedBlock(TagKey<Item> plates, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 64)
                .pattern("XXX")
                .pattern("###")
                .pattern("XXX")
                .define('#', plates)
                .define('X', earth.terrarium.adastra.common.tags.ModItemTags.STEEL_INGOTS)
                .unlockedBy(getHasName(earth.terrarium.adastra.common.registry.ModItems.STEEL_INGOT.get()), has(earth.terrarium.adastra.common.tags.ModItemTags.STEEL_INGOTS))
                .save(consumer);
    }

    private void plateblock(TagKey<Item> plates, ItemLike mainPlate, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 64)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', plates)
                .define('|', earth.terrarium.adastra.common.registry.ModItems.STEEL_ROD.get())
                .unlockedBy(getHasName(mainPlate), has(plates))
                .save(consumer);
    }

    private void plating(TagKey<Item> plates, ItemLike mainPlate, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 64)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', plates)
                .unlockedBy(getHasName(mainPlate), has(plates))
                .save(consumer);
    }

    private void pillar(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 2)
                .pattern("#")
                .pattern("#")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void glowingPillar(ItemLike pillar, ItemLike glowingPillar, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, glowingPillar)
                .requires(pillar)
                .requires(Items.GLOWSTONE_DUST)
                .unlockedBy(getHasName(pillar), has(pillar))
                .save(consumer);
    }

    private void panel(TagKey<Item> plates, TagKey<Item> ingots, ItemLike mainIngot, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result, 64)
                .pattern("#X#")
                .pattern("XXX")
                .pattern("#X#")
                .define('#', plates)
                .define('X', ingots)
                .unlockedBy(getHasName(mainIngot), has(ingots))
                .save(consumer);
    }

    private void metalButton(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result)
                .requires(ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void metalPressurePlate(ItemLike ingredient, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("##")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer);
    }

    private void sign(ItemLike planks, ItemLike sign, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, sign, 3)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .define('#', planks)
                .define('X', Items.STICK)
                .unlockedBy(getHasName(planks), has(planks))
                .save(consumer);
    }

    private void hangingSign(ItemLike strippedLog, ItemLike hangingSign, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, hangingSign, 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', strippedLog)
                .define('X', Items.CHAIN)
                .unlockedBy(getHasName(strippedLog), has(strippedLog))
                .save(consumer);
    }

    private void boat(ItemLike planks, ItemLike boat, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, boat)
                .pattern("# #")
                .pattern("###")
                .define('#', planks)
                .unlockedBy(getHasName(planks), has(planks))
                .save(consumer);
    }

    private void chestBoat(ItemLike boat, ItemLike chestBoat, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, chestBoat)
                .requires(boat)
                .requires(Items.CHEST)
                .unlockedBy(getHasName(boat), has(boat))
                .save(consumer);
    }

    private void slidingDoor(TagKey<Item> blocks, TagKey<Item> plates, ItemLike mainPlate, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("###")
                .pattern("PBP")
                .pattern("###")
                .define('B', blocks)
                .define('#', plates)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(mainPlate), has(plates))
                .save(consumer);
    }

    private void engine(TagKey<Item> plates, ItemLike previousEngine, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("###")
                .pattern("#E#")
                .pattern(" F ")
                .define('#', plates)
                .define('E', previousEngine)
                .define('F', earth.terrarium.adastra.common.registry.ModItems.FAN.get())
                .unlockedBy(getHasName(previousEngine), has(previousEngine))
                .save(consumer);
    }

    private void tank(TagKey<Item> plates, ItemLike previousTank, ItemLike result, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result)
                .pattern("## ")
                .pattern("#T|")
                .pattern("## ")
                .define('#', plates)
                .define('T', previousTank)
                .define('|', earth.terrarium.adastra.common.registry.ModItems.STEEL_ROD.get())
                .unlockedBy(getHasName(previousTank), has(previousTank))
                .save(consumer);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, AdExtendra.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void stonecutting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), category, result, count)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(pFinishedRecipeConsumer, AdExtendra.MOD_ID + ":" + getItemName(result) + "_from_" + getItemName(ingredient) + "_stonecutting");
    }
}
