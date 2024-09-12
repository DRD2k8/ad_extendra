package net.teddy0008.ad_extendra.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.item.ModItems;
import net.teddy0008.ad_extendra.util.tag.ModItemTags;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> JUPERIUM_SMELTABLES = List.of(ModItems.RAW_JUPERIUM.get(), ModBlocks.JUPITER_JUPERIUM_ORE.get());
    private static final List<ItemLike> SATURLYTE_SMELTABLES = List.of(ModItems.RAW_SATURLYTE.get(), ModBlocks.SATURN_SATURLYTE_ORE.get());
    private static final List<ItemLike> URANIUM_SMELTABLES = List.of(ModItems.RAW_URANIUM.get(), ModBlocks.URANUS_URANIUM_ORE.get());
    private static final List<ItemLike> NEPTUNIUM_SMELTABLES = List.of(ModItems.RAW_NEPTUNIUM.get(), ModBlocks.NEPTUNE_NEPTUNIUM_ORE.get());
    private static final List<ItemLike> RADIUM_SMELTABLES = List.of(ModItems.RAW_RADIUM.get(), ModBlocks.ORCUS_RADIUM_ORE.get());
    private static final List<ItemLike> PLUTONIUM_SMELTABLES = List.of(ModItems.RAW_PLUTONIUM.get(), ModBlocks.PLUTO_PLUTONIUM_ORE.get());
    private static final List<ItemLike> ELECTROLYTE_SMELTABLES = List.of(ModItems.RAW_ELECTROLYTE.get(), ModBlocks.SEDNA_ELECTROLYTE_ORE.get());

    public ModRecipeGenerator(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // Moon
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AERONOS_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.AERONOS_BUTTON.get())
                .requires(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get()),
                        has(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.AERONOS_SIGN.get(), 3)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_PLANKS.get()))
                .unlockedBy(getHasName(Items.STICK), has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.AERONOS_HANGING_SIGN.get(), 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_STEM.get())
                .define('X', Items.CHAIN)
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_STEM.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.AERONOS_STEM.get()))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STROPHAR_PRESSURE_PLATE.get())
                .pattern("##")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.STROPHAR_BUTTON.get())
                .requires(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get()),
                        has(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.STROPHAR_SIGN.get(), 3)
                .pattern("###")
                .pattern("###")
                .pattern(" X ")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get())
                .define('X', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_PLANKS.get()))
                .unlockedBy(getHasName(Items.STICK), has(Tags.Items.RODS_WOODEN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.STROPHAR_HANGING_SIGN.get(), 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_STEM.get())
                .define('X', Items.CHAIN)
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_STEM.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.STROPHAR_STEM.get()))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(consumer);

        // Jupiter
        oreSmelting(consumer, JUPERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.RAW_JUPERIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.JUPERIUM_BLOCK.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.JUPITER_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.JUPITER_STONE.get(), 0f, 200, "item");

        oreBlasting(consumer, JUPERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.RAW_JUPERIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.JUPERIUM_BLOCK.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.JUPITER_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "item");

        // Ceres
        oreSmelting(consumer, List.of(ModBlocks.CERES_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.CERES_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.CERES_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.CERES_STONE.get(), 0f, 200, "item");

        oreBlasting(consumer, List.of(ModBlocks.CERES_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.CERES_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Saturn
        oreSmelting(consumer, SATURLYTE_SMELTABLES, RecipeCategory.MISC, ModItems.SATURLYTE_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SATURN_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SATURN_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SATURN_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.RAW_SATURLYTE_BLOCK.get()), RecipeCategory.MISC, ModBlocks.SATURLYTE_BLOCK.get(), 0.25f, 200, "item");
        oreBlasting(consumer, SATURLYTE_SMELTABLES, RecipeCategory.MISC, ModItems.SATURLYTE_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SATURN_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SATURN_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SATURN_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.RAW_SATURLYTE_BLOCK.get()), RecipeCategory.MISC, ModBlocks.SATURLYTE_BLOCK.get(), 0.25f, 100, "item");

        // Uranus
        oreSmelting(consumer, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_LAPIS_ORE.get()), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.RAW_URANIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 200, "item");
        oreBlasting(consumer, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.URANUS_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.URANUS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.URANUS_LAPIS_ORE.get()), RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.RAW_URANIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.URANUS_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 100, "item");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ICE_CHARGE.get(), 4)
                .requires(ModItems.FREEZE_SHARD.get()).unlockedBy(getHasName(ModItems.FREEZE_SHARD.get()), has(ModItems.FREEZE_SHARD.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICICLE.get())
                .pattern("#")
                .pattern("#")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get(), 2)
                .requires(ModBlocks.ICICLE.get())
                .unlockedBy(getHasName(ModBlocks.ICICLE.get()), has(ModBlocks.ICICLE.get()))
                .save(consumer, Main.MOD_ID + ":ice_shards_from_icicle");

        // Neptune
        oreSmelting(consumer, NEPTUNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.NEPTUNIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.RAW_NEPTUNIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.NEPTUNIUM_BLOCK.get(), 0.25f, 200, "item");
        oreBlasting(consumer, NEPTUNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.NEPTUNIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.NEPTUNE_COAL_ORE.get()), RecipeCategory.MISC, Items.COAL, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.NEPTUNE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.NEPTUNE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.RAW_NEPTUNIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.NEPTUNIUM_BLOCK.get(), 0.25f, 100, "item");

        // Pluto
        oreSmelting(consumer, PLUTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.RAW_PLUTONIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.PLUTONIUM_BLOCK.get(), 0.25f, 200, "item");
        oreBlasting(consumer, PLUTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.PLUTO_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.PLUTO_GOLD_ORE.get()), RecipeCategory.MISC, Items.GOLD_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.PLUTO_ICE_SHARD_ORE.get()), RecipeCategory.MISC, earth.terrarium.ad_astra.common.registry.ModItems.ICE_SHARD.get(), 1.0f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.RAW_PLUTONIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.PLUTONIUM_BLOCK.get(), 0.25f, 100, "item");

        // Orcus
        oreSmelting(consumer, RADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.RADIUM_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ORCUS_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ORCUS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.RAW_RADIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.RADIUM_BLOCK.get(), 0.25f, 200, "item");
        oreBlasting(consumer, RADIUM_SMELTABLES, RecipeCategory.MISC, ModItems.RADIUM_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.ORCUS_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.ORCUS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.RAW_RADIUM_BLOCK.get()), RecipeCategory.MISC, ModBlocks.RADIUM_BLOCK.get(), 0.25f, 100, "item");

        // Haumea
        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.HAUMEA_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.HAUMEA_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Quaoar
        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.QUAOAR_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.QUAOAR_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Makemake
        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.MAKEMAKE_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.MAKEMAKE_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Gonggong
        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.GONGGONG_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.GONGGONG_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Eris
        oreSmelting(consumer, List.of(ModBlocks.ERIS_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ERIS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.ERIS_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.ERIS_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");

        // Sedna
        oreSmelting(consumer, ELECTROLYTE_SMELTABLES, RecipeCategory.MISC, ModItems.ELECTROLYTE_INGOT.get(), 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SEDNA_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SEDNA_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.RAW_ELECTROLYTE_BLOCK.get()), RecipeCategory.MISC, ModBlocks.ELECTROLYTE_BLOCK.get(), 0.25f, 200, "item");
        oreBlasting(consumer, ELECTROLYTE_SMELTABLES, RecipeCategory.MISC, ModItems.ELECTROLYTE_INGOT.get(), 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SEDNA_COPPER_ORE.get()), RecipeCategory.MISC, Items.COPPER_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.SEDNA_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.RAW_ELECTROLYTE_BLOCK.get()), RecipeCategory.MISC, ModBlocks.ELECTROLYTE_BLOCK.get(), 0.25f, 100, "item");

        // Proxima Centauri b
        oreSmelting(consumer, List.of(ModBlocks.B_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.B_EMERALD_ORE.get()), RecipeCategory.MISC, Items.EMERALD, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.B_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.B_REDSTONE_ORE.get()), RecipeCategory.MISC, Items.REDSTONE, 0.25f, 200, "item");
        oreBlasting(consumer, List.of(ModBlocks.B_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.B_EMERALD_ORE.get()), RecipeCategory.MISC, Items.EMERALD, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.B_IRON_ORE.get()), RecipeCategory.MISC, Items.IRON_INGOT, 0.25f, 100, "item");
        oreBlasting(consumer, List.of(ModBlocks.B_REDSTONE_ORE.get()), RecipeCategory.MISC, Items.REDSTONE, 0.25f, 100, "item");

        // Glacio
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GLACIAN_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.GLACIAN_LOG.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.GLACIAN_LOG.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.GLACIAN_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_GLACIAN_WOOD.get(), 3)
                .pattern("##")
                .pattern("##")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.STRIPPED_GLACIAN_LOG.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.STRIPPED_GLACIAN_LOG.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.STRIPPED_GLACIAN_LOG.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.GLACIAN_HANGING_SIGN.get(), 6)
                .pattern("X X")
                .pattern("###")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.STRIPPED_GLACIAN_LOG.get())
                .define('X', Items.CHAIN)
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.STRIPPED_GLACIAN_LOG.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.STRIPPED_GLACIAN_LOG.get()))
                .unlockedBy(getHasName(Items.CHAIN), has(Items.CHAIN))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModItems.GLACIAN_BOAT.get())
                .pattern("# #")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModItems.GLACIAN_PLANKS.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.GLACIAN_PLANKS.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.GLACIAN_PLANKS.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GLACIAN_CHEST_BOAT.get())
                .requires(ModItems.GLACIAN_BOAT.get())
                .requires(Tags.Items.CHESTS_WOODEN)
                .unlockedBy(getHasName(ModItems.GLACIAN_BOAT.get()), has(ModItems.GLACIAN_BOAT.get()))
                .unlockedBy(getHasName(Items.CHEST), has(Tags.Items.CHESTS_WOODEN))
                .save(consumer);

        // More Cobblestone Smelting
        oreSmelting(consumer, List.of(ModBlocks.SATURN_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.SATURN_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.URANUS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.URANUS_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ORCUS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.ORCUS_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.PLUTO_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.PLUTO_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.HAUMEA_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.QUAOAR_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.GONGGONG_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.ERIS_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.ERIS_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.SEDNA_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.SEDNA_STONE.get(), 0f, 200, "item");
        oreSmelting(consumer, List.of(ModBlocks.B_COBBLESTONE.get()), RecipeCategory.MISC, ModBlocks.B_STONE.get(), 0f, 200, "item");

        // Juperium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.JUPERIUM_INGOT.get()).unlockedBy(getHasName(ModItems.JUPERIUM_INGOT.get()), has(ModItems.JUPERIUM_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_JUPERIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_JUPERIUM.get()).unlockedBy(getHasName(ModItems.RAW_JUPERIUM.get()), has(ModItems.RAW_JUPERIUM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.JUPERIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.JUPERIUM_NUGGET.get()), has(ModItems.JUPERIUM_NUGGET.get()))
                .save(consumer, Main.MOD_ID + ":" + getItemName(ModItems.JUPERIUM_INGOT.get()) + "_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING.get(), 8)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()), has(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()))
                .define('|', ModItemTags.JUPERIUM_PLATES)
                .unlockedBy(getHasName(ModItems.JUPERIUM_PLATE.get()), has(ModItemTags.JUPERIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.JUPERIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.JUPERIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING_BUTTON.get())
                        .requires(ModBlocks.JUPERIUM_PLATING.get()).unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get())
                .pattern("JJ")
                .define('J', ModBlocks.JUPERIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.JUPERIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.JUPERIUM_PLATING.get()), has(ModBlocks.JUPERIUM_PLATING.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.JUPERIUM_PLATING.get(), ModBlocks.JUPERIUM_PILLAR.get(), 1);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOWING_JUPERIUM_PILLAR.get(), 6)
                .pattern("JDJ")
                .pattern("JGJ")
                .pattern("JDJ")
                .define('J', ModItemTags.JUPERIUM_PLATES)
                .define('D', Items.YELLOW_DYE)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.JUPERIUM_PLATE.get()), has(ModItemTags.JUPERIUM_PLATES))
                .unlockedBy(getHasName(Items.YELLOW_DYE), has(Items.YELLOW_DYE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPERIUM_SLIDING_DOOR.get())
                .pattern("JJJ")
                .pattern("P#P")
                .pattern("JJJ")
                .define('#', ModItemTags.JUPERIUM_BLOCKS)
                .define('J', ModItemTags.JUPERIUM_PLATES)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(ModItems.JUPERIUM_PLATE.get()), has(ModItemTags.JUPERIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JUPERIUM_ENGINE.get())
                .pattern("###")
                .pattern(" E ")
                .pattern(" F ")
                .define('#', ModItemTags.JUPERIUM_PLATES)
                .define('E', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get())
                .define('F', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get())
                .unlockedBy(getHasName(ModItems.JUPERIUM_PLATE.get()), has(ModItemTags.JUPERIUM_PLATES))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JUPERIUM_TANK.get())
                .pattern("## ")
                .pattern("#U|")
                .pattern("## ")
                .define('#', ModItemTags.JUPERIUM_PLATES)
                .define('U', Items.BUCKET)
                .define('|', ModItemTags.IRON_RODS)
                .unlockedBy(getHasName(ModItems.JUPERIUM_PLATE.get()), has(ModItemTags.JUPERIUM_PLATES))
                .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.IRON_ROD.get()), has(ModItemTags.IRON_RODS))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JUPERIUM_INGOT.get(), 9)
                .requires(ModBlocks.JUPERIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.JUPERIUM_BLOCK.get()), has(ModBlocks.JUPERIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_JUPERIUM.get(), 9)
                .requires(ModBlocks.RAW_JUPERIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_JUPERIUM_BLOCK.get()), has(ModBlocks.RAW_JUPERIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.JUPERIUM_NUGGET.get(), 9)
                .requires(ModItems.JUPERIUM_INGOT.get()).unlockedBy(getHasName(ModItems.JUPERIUM_INGOT.get()), has(ModItems.JUPERIUM_INGOT.get())).save(consumer);

        // Saturlyte
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURLYTE_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.SATURLYTE_INGOT.get()).unlockedBy(getHasName(ModItems.SATURLYTE_INGOT.get()), has(ModItems.SATURLYTE_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SATURLYTE_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_SATURLYTE.get()).unlockedBy(getHasName(ModItems.RAW_SATURLYTE.get()), has(ModItems.RAW_SATURLYTE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SATURLYTE_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.SATURLYTE_NUGGET.get()).unlockedBy(getHasName(ModItems.SATURLYTE_NUGGET.get()), has(ModItems.SATURLYTE_NUGGET.get()))
                .save(consumer, Main.MOD_ID + ":" + getItemName(ModItems.SATURLYTE_INGOT.get()) + "_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURLYTE_PLATING.get(), 8)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()), has(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()))
                .define('|', ModItemTags.SATURLYTE_PLATES)
                .unlockedBy(getHasName(ModItems.SATURLYTE_PLATE.get()), has(ModItemTags.SATURLYTE_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURLYTE_PLATING_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SATURLYTE_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.SATURLYTE_PLATING.get()), has(ModBlocks.SATURLYTE_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURLYTE_PLATING_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SATURLYTE_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.SATURLYTE_PLATING.get()), has(ModBlocks.SATURLYTE_PLATING.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SATURLYTE_PLATING_BUTTON.get())
                .requires(ModBlocks.SATURLYTE_PLATING.get()).unlockedBy(getHasName(ModBlocks.SATURLYTE_PLATING.get()), has(ModBlocks.SATURLYTE_PLATING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURLYTE_PLATING_PRESSURE_PLATE.get())
                .pattern("JJ")
                .define('J', ModBlocks.SATURLYTE_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.SATURLYTE_PLATING.get()), has(ModBlocks.SATURLYTE_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURLYTE_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SATURLYTE_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.SATURLYTE_PLATING.get()), has(ModBlocks.SATURLYTE_PLATING.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.SATURLYTE_PLATING.get(), ModBlocks.SATURLYTE_PILLAR.get(), 1);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOWING_SATURLYTE_PILLAR.get(), 6)
                .pattern("JDJ")
                .pattern("JGJ")
                .pattern("JDJ")
                .define('J', ModItemTags.SATURLYTE_PLATES)
                .define('D', Items.MAGENTA_DYE)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.SATURLYTE_PLATE.get()), has(ModItemTags.SATURLYTE_PLATES))
                .unlockedBy(getHasName(Items.MAGENTA_DYE), has(Items.MAGENTA_DYE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURLYTE_SLIDING_DOOR.get())
                .pattern("JJJ")
                .pattern("P#P")
                .pattern("JJJ")
                .define('#', ModItemTags.SATURLYTE_BLOCKS)
                .define('J', ModItemTags.SATURLYTE_PLATES)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(ModItems.SATURLYTE_PLATE.get()), has(ModItemTags.SATURLYTE_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SATURLYTE_ENGINE.get())
                .pattern("###")
                .pattern(" E ")
                .pattern(" F ")
                .define('#', ModItemTags.SATURLYTE_PLATES)
                .define('E', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get())
                .define('F', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get())
                .unlockedBy(getHasName(ModItems.SATURLYTE_PLATE.get()), has(ModItemTags.SATURLYTE_PLATES))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SATURLYTE_TANK.get())
                .pattern("## ")
                .pattern("#U|")
                .pattern("## ")
                .define('#', ModItemTags.SATURLYTE_PLATES)
                .define('U', Items.BUCKET)
                .define('|', ModItemTags.IRON_RODS)
                .unlockedBy(getHasName(ModItems.SATURLYTE_PLATE.get()), has(ModItemTags.SATURLYTE_PLATES))
                .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.IRON_ROD.get()), has(ModItemTags.IRON_RODS))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SATURLYTE_INGOT.get(), 9)
                .requires(ModBlocks.SATURLYTE_BLOCK.get()).unlockedBy(getHasName(ModBlocks.SATURLYTE_BLOCK.get()), has(ModBlocks.SATURLYTE_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SATURLYTE.get(), 9)
                .requires(ModBlocks.RAW_SATURLYTE_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_SATURLYTE_BLOCK.get()), has(ModBlocks.RAW_SATURLYTE_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SATURLYTE_NUGGET.get(), 9)
                .requires(ModItems.SATURLYTE_INGOT.get()).unlockedBy(getHasName(ModItems.SATURLYTE_INGOT.get()), has(ModItems.SATURLYTE_INGOT.get())).save(consumer);

        // Uranium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.URANIUM_INGOT.get()).unlockedBy(getHasName(ModItems.URANIUM_INGOT.get()), has(ModItems.URANIUM_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_URANIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_URANIUM.get()).unlockedBy(getHasName(ModItems.RAW_URANIUM.get()), has(ModItems.RAW_URANIUM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.URANIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.URANIUM_NUGGET.get()), has(ModItems.URANIUM_NUGGET.get()))
                .save(consumer, Main.MOD_ID + ":" + getItemName(ModItems.URANIUM_INGOT.get()) + "_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_PLATING.get(), 8)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()), has(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()))
                .define('|', ModItemTags.URANIUM_PLATES)
                .unlockedBy(getHasName(ModItems.URANIUM_PLATE.get()), has(ModItemTags.URANIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_PLATING_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.URANIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.URANIUM_PLATING.get()), has(ModBlocks.URANIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_PLATING_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.URANIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.URANIUM_PLATING.get()), has(ModBlocks.URANIUM_PLATING.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.URANIUM_PLATING_BUTTON.get())
                .requires(ModBlocks.URANIUM_PLATING.get()).unlockedBy(getHasName(ModBlocks.URANIUM_PLATING.get()), has(ModBlocks.URANIUM_PLATING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_PLATING_PRESSURE_PLATE.get())
                .pattern("JJ")
                .define('J', ModBlocks.URANIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.URANIUM_PLATING.get()), has(ModBlocks.URANIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.URANIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.URANIUM_PLATING.get()), has(ModBlocks.URANIUM_PLATING.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.URANIUM_PLATING.get(), ModBlocks.URANIUM_PILLAR.get(), 1);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOWING_URANIUM_PILLAR.get(), 6)
                .pattern("JDJ")
                .pattern("JGJ")
                .pattern("JDJ")
                .define('J', ModItemTags.URANIUM_PLATES)
                .define('D', Items.BLUE_DYE)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.URANIUM_PLATE.get()), has(ModItemTags.URANIUM_PLATES))
                .unlockedBy(getHasName(Items.BLUE_DYE), has(Items.BLUE_DYE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_SLIDING_DOOR.get())
                .pattern("JJJ")
                .pattern("P#P")
                .pattern("JJJ")
                .define('#', ModItemTags.URANIUM_BLOCKS)
                .define('J', ModItemTags.URANIUM_PLATES)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(ModItems.URANIUM_PLATE.get()), has(ModItemTags.URANIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.URANIUM_ENGINE.get())
                .pattern("###")
                .pattern(" E ")
                .pattern(" F ")
                .define('#', ModItemTags.URANIUM_PLATES)
                .define('E', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get())
                .define('F', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get())
                .unlockedBy(getHasName(ModItems.URANIUM_PLATE.get()), has(ModItemTags.URANIUM_PLATES))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.URANIUM_TANK.get())
                .pattern("## ")
                .pattern("#U|")
                .pattern("## ")
                .define('#', ModItemTags.URANIUM_PLATES)
                .define('U', Items.BUCKET)
                .define('|', ModItemTags.IRON_RODS)
                .unlockedBy(getHasName(ModItems.URANIUM_PLATE.get()), has(ModItemTags.URANIUM_PLATES))
                .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.IRON_ROD.get()), has(ModItemTags.IRON_RODS))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 9)
                .requires(ModBlocks.URANIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.URANIUM_BLOCK.get()), has(ModBlocks.URANIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_URANIUM.get(), 9)
                .requires(ModBlocks.RAW_URANIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_URANIUM_BLOCK.get()), has(ModBlocks.RAW_URANIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_NUGGET.get(), 9)
                .requires(ModItems.URANIUM_INGOT.get()).unlockedBy(getHasName(ModItems.URANIUM_INGOT.get()), has(ModItems.URANIUM_INGOT.get())).save(consumer);

        // Neptunium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.NEPTUNIUM_INGOT.get()).unlockedBy(getHasName(ModItems.NEPTUNIUM_INGOT.get()), has(ModItems.NEPTUNIUM_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_NEPTUNIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_NEPTUNIUM.get()).unlockedBy(getHasName(ModItems.RAW_NEPTUNIUM.get()), has(ModItems.RAW_NEPTUNIUM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NEPTUNIUM_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.NEPTUNIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.NEPTUNIUM_NUGGET.get()), has(ModItems.NEPTUNIUM_NUGGET.get()))
                .save(consumer, Main.MOD_ID + ":" + getItemName(ModItems.NEPTUNIUM_INGOT.get()) + "_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_PLATING.get(), 8)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()), has(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()))
                .define('|', ModItemTags.NEPTUNIUM_PLATES)
                .unlockedBy(getHasName(ModItems.NEPTUNIUM_PLATE.get()), has(ModItemTags.NEPTUNIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_PLATING_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.NEPTUNIUM_PLATING.get()), has(ModBlocks.NEPTUNIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_PLATING_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.NEPTUNIUM_PLATING.get()), has(ModBlocks.NEPTUNIUM_PLATING.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_PLATING_BUTTON.get())
                .requires(ModBlocks.NEPTUNIUM_PLATING.get()).unlockedBy(getHasName(ModBlocks.NEPTUNIUM_PLATING.get()), has(ModBlocks.NEPTUNIUM_PLATING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_PLATING_PRESSURE_PLATE.get())
                .pattern("JJ")
                .define('J', ModBlocks.NEPTUNIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.NEPTUNIUM_PLATING.get()), has(ModBlocks.NEPTUNIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.NEPTUNIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.NEPTUNIUM_PLATING.get()), has(ModBlocks.NEPTUNIUM_PLATING.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.NEPTUNIUM_PLATING.get(), ModBlocks.NEPTUNIUM_PILLAR.get(), 1);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOWING_NEPTUNIUM_PILLAR.get(), 6)
                .pattern("JDJ")
                .pattern("JGJ")
                .pattern("JDJ")
                .define('J', ModItemTags.NEPTUNIUM_PLATES)
                .define('D', Items.BROWN_DYE)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.NEPTUNIUM_PLATE.get()), has(ModItemTags.NEPTUNIUM_PLATES))
                .unlockedBy(getHasName(Items.BROWN_DYE), has(Items.BROWN_DYE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNIUM_SLIDING_DOOR.get())
                .pattern("JJJ")
                .pattern("P#P")
                .pattern("JJJ")
                .define('#', ModItemTags.NEPTUNIUM_BLOCKS)
                .define('J', ModItemTags.NEPTUNIUM_PLATES)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(ModItems.NEPTUNIUM_PLATE.get()), has(ModItemTags.NEPTUNIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NEPTUNIUM_ENGINE.get())
                .pattern("###")
                .pattern(" E ")
                .pattern(" F ")
                .define('#', ModItemTags.NEPTUNIUM_PLATES)
                .define('E', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get())
                .define('F', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get())
                .unlockedBy(getHasName(ModItems.NEPTUNIUM_PLATE.get()), has(ModItemTags.NEPTUNIUM_PLATES))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NEPTUNIUM_TANK.get())
                .pattern("## ")
                .pattern("#U|")
                .pattern("## ")
                .define('#', ModItemTags.NEPTUNIUM_PLATES)
                .define('U', Items.BUCKET)
                .define('|', ModItemTags.IRON_RODS)
                .unlockedBy(getHasName(ModItems.NEPTUNIUM_PLATE.get()), has(ModItemTags.NEPTUNIUM_PLATES))
                .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.IRON_ROD.get()), has(ModItemTags.IRON_RODS))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NEPTUNIUM_INGOT.get(), 9)
                .requires(ModBlocks.NEPTUNIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.NEPTUNIUM_BLOCK.get()), has(ModBlocks.NEPTUNIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_NEPTUNIUM.get(), 9)
                .requires(ModBlocks.RAW_NEPTUNIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_NEPTUNIUM_BLOCK.get()), has(ModBlocks.RAW_NEPTUNIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NEPTUNIUM_NUGGET.get(), 9)
                .requires(ModItems.NEPTUNIUM_INGOT.get()).unlockedBy(getHasName(ModItems.NEPTUNIUM_INGOT.get()), has(ModItems.NEPTUNIUM_INGOT.get())).save(consumer);

        // Plutonium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.PLUTONIUM_INGOT.get()).unlockedBy(getHasName(ModItems.PLUTONIUM_INGOT.get()), has(ModItems.PLUTONIUM_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PLUTONIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_PLUTONIUM.get()).unlockedBy(getHasName(ModItems.RAW_PLUTONIUM.get()), has(ModItems.RAW_PLUTONIUM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.PLUTONIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.PLUTONIUM_NUGGET.get()), has(ModItems.PLUTONIUM_NUGGET.get()))
                .save(consumer, Main.MOD_ID + ":" + getItemName(ModItems.PLUTONIUM_INGOT.get()) + "_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_PLATING.get(), 8)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()), has(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()))
                .define('|', ModItemTags.PLUTONIUM_PLATES)
                .unlockedBy(getHasName(ModItems.PLUTONIUM_PLATE.get()), has(ModItemTags.PLUTONIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_PLATING_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTONIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.PLUTONIUM_PLATING.get()), has(ModBlocks.PLUTONIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_PLATING_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTONIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.PLUTONIUM_PLATING.get()), has(ModBlocks.PLUTONIUM_PLATING.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PLUTONIUM_PLATING_BUTTON.get())
                .requires(ModBlocks.PLUTONIUM_PLATING.get()).unlockedBy(getHasName(ModBlocks.PLUTONIUM_PLATING.get()), has(ModBlocks.PLUTONIUM_PLATING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_PLATING_PRESSURE_PLATE.get())
                .pattern("JJ")
                .define('J', ModBlocks.PLUTONIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.PLUTONIUM_PLATING.get()), has(ModBlocks.PLUTONIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.PLUTONIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.PLUTONIUM_PLATING.get()), has(ModBlocks.PLUTONIUM_PLATING.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.PLUTONIUM_PLATING.get(), ModBlocks.PLUTONIUM_PILLAR.get(), 1);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOWING_PLUTONIUM_PILLAR.get(), 6)
                .pattern("JDJ")
                .pattern("JGJ")
                .pattern("JDJ")
                .define('J', ModItemTags.PLUTONIUM_PLATES)
                .define('D', Items.WHITE_DYE)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.PLUTONIUM_PLATE.get()), has(ModItemTags.PLUTONIUM_PLATES))
                .unlockedBy(getHasName(Items.WHITE_DYE), has(Items.WHITE_DYE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTONIUM_SLIDING_DOOR.get())
                .pattern("JJJ")
                .pattern("P#P")
                .pattern("JJJ")
                .define('#', ModItemTags.PLUTONIUM_BLOCKS)
                .define('J', ModItemTags.PLUTONIUM_PLATES)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(ModItems.PLUTONIUM_PLATE.get()), has(ModItemTags.PLUTONIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLUTONIUM_ENGINE.get())
                .pattern("###")
                .pattern(" E ")
                .pattern(" F ")
                .define('#', ModItemTags.PLUTONIUM_PLATES)
                .define('E', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get())
                .define('F', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get())
                .unlockedBy(getHasName(ModItems.PLUTONIUM_PLATE.get()), has(ModItemTags.PLUTONIUM_PLATES))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLUTONIUM_TANK.get())
                .pattern("## ")
                .pattern("#U|")
                .pattern("## ")
                .define('#', ModItemTags.PLUTONIUM_PLATES)
                .define('U', Items.BUCKET)
                .define('|', ModItemTags.IRON_RODS)
                .unlockedBy(getHasName(ModItems.PLUTONIUM_PLATE.get()), has(ModItemTags.PLUTONIUM_PLATES))
                .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.IRON_ROD.get()), has(ModItemTags.IRON_RODS))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLUTONIUM_INGOT.get(), 9)
                .requires(ModBlocks.PLUTONIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.PLUTONIUM_BLOCK.get()), has(ModBlocks.PLUTONIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_PLUTONIUM.get(), 9)
                .requires(ModBlocks.RAW_PLUTONIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_PLUTONIUM_BLOCK.get()), has(ModBlocks.RAW_PLUTONIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PLUTONIUM_NUGGET.get(), 9)
                .requires(ModItems.PLUTONIUM_INGOT.get()).unlockedBy(getHasName(ModItems.PLUTONIUM_INGOT.get()), has(ModItems.PLUTONIUM_INGOT.get())).save(consumer);

        // Radium
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RADIUM_INGOT.get()).unlockedBy(getHasName(ModItems.RADIUM_INGOT.get()), has(ModItems.RADIUM_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RADIUM_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_RADIUM.get()).unlockedBy(getHasName(ModItems.RAW_RADIUM.get()), has(ModItems.RAW_RADIUM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RADIUM_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RADIUM_NUGGET.get()).unlockedBy(getHasName(ModItems.RADIUM_NUGGET.get()), has(ModItems.RADIUM_NUGGET.get()))
                .save(consumer, Main.MOD_ID + ":" + getItemName(ModItems.RADIUM_INGOT.get()) + "_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADIUM_PLATING.get(), 8)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()), has(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()))
                .define('|', ModItemTags.RADIUM_PLATES)
                .unlockedBy(getHasName(ModItems.RADIUM_PLATE.get()), has(ModItemTags.RADIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADIUM_PLATING_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.RADIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.RADIUM_PLATING.get()), has(ModBlocks.RADIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADIUM_PLATING_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.RADIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.RADIUM_PLATING.get()), has(ModBlocks.RADIUM_PLATING.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RADIUM_PLATING_BUTTON.get())
                .requires(ModBlocks.RADIUM_PLATING.get()).unlockedBy(getHasName(ModBlocks.RADIUM_PLATING.get()), has(ModBlocks.RADIUM_PLATING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADIUM_PLATING_PRESSURE_PLATE.get())
                .pattern("JJ")
                .define('J', ModBlocks.RADIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.RADIUM_PLATING.get()), has(ModBlocks.RADIUM_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADIUM_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.RADIUM_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.RADIUM_PLATING.get()), has(ModBlocks.RADIUM_PLATING.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.RADIUM_PLATING.get(), ModBlocks.RADIUM_PILLAR.get(), 1);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOWING_RADIUM_PILLAR.get(), 6)
                .pattern("JDJ")
                .pattern("JGJ")
                .pattern("JDJ")
                .define('J', ModItemTags.RADIUM_PLATES)
                .define('D', Items.BLACK_DYE)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.RADIUM_PLATE.get()), has(ModItemTags.RADIUM_PLATES))
                .unlockedBy(getHasName(Items.BLACK_DYE), has(Items.BLACK_DYE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RADIUM_SLIDING_DOOR.get())
                .pattern("JJJ")
                .pattern("P#P")
                .pattern("JJJ")
                .define('#', ModItemTags.RADIUM_BLOCKS)
                .define('J', ModItemTags.RADIUM_PLATES)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(ModItems.RADIUM_PLATE.get()), has(ModItemTags.RADIUM_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RADIUM_ENGINE.get())
                .pattern("###")
                .pattern(" E ")
                .pattern(" F ")
                .define('#', ModItemTags.RADIUM_PLATES)
                .define('E', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get())
                .define('F', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get())
                .unlockedBy(getHasName(ModItems.RADIUM_PLATE.get()), has(ModItemTags.RADIUM_PLATES))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RADIUM_TANK.get())
                .pattern("## ")
                .pattern("#U|")
                .pattern("## ")
                .define('#', ModItemTags.RADIUM_PLATES)
                .define('U', Items.BUCKET)
                .define('|', ModItemTags.IRON_RODS)
                .unlockedBy(getHasName(ModItems.RADIUM_PLATE.get()), has(ModItemTags.RADIUM_PLATES))
                .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.IRON_ROD.get()), has(ModItemTags.IRON_RODS))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RADIUM_INGOT.get(), 9)
                .requires(ModBlocks.RADIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RADIUM_BLOCK.get()), has(ModBlocks.RADIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RADIUM.get(), 9)
                .requires(ModBlocks.RAW_RADIUM_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_RADIUM_BLOCK.get()), has(ModBlocks.RAW_RADIUM_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RADIUM_NUGGET.get(), 9)
                .requires(ModItems.RADIUM_INGOT.get()).unlockedBy(getHasName(ModItems.RADIUM_INGOT.get()), has(ModItems.RADIUM_INGOT.get())).save(consumer);

        // Electrolyte
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTROLYTE_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.ELECTROLYTE_INGOT.get()).unlockedBy(getHasName(ModItems.ELECTROLYTE_INGOT.get()), has(ModItems.ELECTROLYTE_INGOT.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ELECTROLYTE_BLOCK.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.RAW_ELECTROLYTE.get()).unlockedBy(getHasName(ModItems.RAW_ELECTROLYTE.get()), has(ModItems.RAW_ELECTROLYTE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTROLYTE_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', ModItems.ELECTROLYTE_NUGGET.get()).unlockedBy(getHasName(ModItems.ELECTROLYTE_NUGGET.get()), has(ModItems.ELECTROLYTE_NUGGET.get()))
                .save(consumer, Main.MOD_ID + ":" + getItemName(ModItems.ELECTROLYTE_INGOT.get()) + "_from_nuggets");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTROLYTE_PLATING.get(), 8)
                .pattern("###")
                .pattern("#|#")
                .pattern("###")
                .define('#', earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get())
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()), has(earth.terrarium.ad_astra.common.registry.ModBlocks.IRON_PLATING.get()))
                .define('|', ModItemTags.ELECTROLYTE_PLATES)
                .unlockedBy(getHasName(ModItems.ELECTROLYTE_PLATE.get()), has(ModItemTags.ELECTROLYTE_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTROLYTE_PLATING_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ELECTROLYTE_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.ELECTROLYTE_PLATING.get()), has(ModBlocks.ELECTROLYTE_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTROLYTE_PLATING_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ELECTROLYTE_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.ELECTROLYTE_PLATING.get()), has(ModBlocks.ELECTROLYTE_PLATING.get()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.ELECTROLYTE_PLATING_BUTTON.get())
                .requires(ModBlocks.ELECTROLYTE_PLATING.get()).unlockedBy(getHasName(ModBlocks.ELECTROLYTE_PLATING.get()), has(ModBlocks.ELECTROLYTE_PLATING.get())).save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTROLYTE_PLATING_PRESSURE_PLATE.get())
                .pattern("JJ")
                .define('J', ModBlocks.ELECTROLYTE_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.ELECTROLYTE_PLATING.get()), has(ModBlocks.ELECTROLYTE_PLATING.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTROLYTE_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ELECTROLYTE_PLATING.get())
                .unlockedBy(getHasName(ModBlocks.ELECTROLYTE_PLATING.get()), has(ModBlocks.ELECTROLYTE_PLATING.get()))
                .save(consumer);
        stonecutting(consumer, RecipeCategory.MISC, ModBlocks.ELECTROLYTE_PLATING.get(), ModBlocks.ELECTROLYTE_PILLAR.get(), 1);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOWING_ELECTROLYTE_PILLAR.get(), 6)
                .pattern("JDJ")
                .pattern("JGJ")
                .pattern("JDJ")
                .define('J', ModItemTags.ELECTROLYTE_PLATES)
                .define('D', Items.GREEN_DYE)
                .define('G', Items.GLOWSTONE)
                .unlockedBy(getHasName(ModItems.ELECTROLYTE_PLATE.get()), has(ModItemTags.ELECTROLYTE_PLATES))
                .unlockedBy(getHasName(Items.GREEN_DYE), has(Items.GREEN_DYE))
                .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ELECTROLYTE_SLIDING_DOOR.get())
                .pattern("JJJ")
                .pattern("P#P")
                .pattern("JJJ")
                .define('#', ModItemTags.ELECTROLYTE_BLOCKS)
                .define('J', ModItemTags.ELECTROLYTE_PLATES)
                .define('P', Items.GLASS_PANE)
                .unlockedBy(getHasName(ModItems.ELECTROLYTE_PLATE.get()), has(ModItemTags.ELECTROLYTE_PLATES))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTROLYTE_ENGINE.get())
                .pattern("###")
                .pattern(" E ")
                .pattern(" F ")
                .define('#', ModItemTags.ELECTROLYTE_PLATES)
                .define('E', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get())
                .define('F', earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get())
                .unlockedBy(getHasName(ModItems.ELECTROLYTE_PLATE.get()), has(ModItemTags.ELECTROLYTE_PLATES))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FRAME.get()))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()), has(earth.terrarium.ad_astra.common.registry.ModItems.ENGINE_FAN.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELECTROLYTE_TANK.get())
                .pattern("## ")
                .pattern("#U|")
                .pattern("## ")
                .define('#', ModItemTags.ELECTROLYTE_PLATES)
                .define('U', Items.BUCKET)
                .define('|', ModItemTags.IRON_RODS)
                .unlockedBy(getHasName(ModItems.ELECTROLYTE_PLATE.get()), has(ModItemTags.ELECTROLYTE_PLATES))
                .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                .unlockedBy(getHasName(earth.terrarium.ad_astra.common.registry.ModItems.IRON_ROD.get()), has(ModItemTags.IRON_RODS))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ELECTROLYTE_INGOT.get(), 9)
                .requires(ModBlocks.ELECTROLYTE_BLOCK.get()).unlockedBy(getHasName(ModBlocks.ELECTROLYTE_BLOCK.get()), has(ModBlocks.ELECTROLYTE_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ELECTROLYTE.get(), 9)
                .requires(ModBlocks.RAW_ELECTROLYTE_BLOCK.get()).unlockedBy(getHasName(ModBlocks.RAW_ELECTROLYTE_BLOCK.get()), has(ModBlocks.RAW_ELECTROLYTE_BLOCK.get())).save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ELECTROLYTE_NUGGET.get(), 9)
                .requires(ModItems.ELECTROLYTE_INGOT.get()).unlockedBy(getHasName(ModItems.ELECTROLYTE_INGOT.get()), has(ModItems.ELECTROLYTE_INGOT.get())).save(consumer);

        // Jupiter Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_COBBLESTONE.get()), has(ModBlocks.JUPITER_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_COBBLESTONE.get()), has(ModBlocks.JUPITER_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.JUPITER_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.JUPITER_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICK_SLAB.get()), has(ModBlocks.JUPITER_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()), has(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_JUPITER_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()), has(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE.get()), has(ModBlocks.JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_JUPITER_STONE.get()), has(ModBlocks.POLISHED_JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_JUPITER_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_JUPITER_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_JUPITER_STONE.get()), has(ModBlocks.POLISHED_JUPITER_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUPITER_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.JUPITER_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.JUPITER_STONE_BRICKS.get()), has(ModBlocks.JUPITER_STONE_BRICKS.get()))
                .save(consumer);

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

        // Ceres Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE.get()), has(ModBlocks.CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE.get()), has(ModBlocks.CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.CERES_COBBLESTONE.get()), has(ModBlocks.CERES_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.CERES_COBBLESTONE.get()), has(ModBlocks.CERES_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE.get()), has(ModBlocks.CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE_BRICKS.get()), has(ModBlocks.CERES_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE_BRICKS.get()), has(ModBlocks.CERES_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.CERES_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_CERES_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.CERES_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE_BRICK_SLAB.get()), has(ModBlocks.CERES_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()), has(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_CERES_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()), has(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE.get()), has(ModBlocks.CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_CERES_STONE.get()), has(ModBlocks.POLISHED_CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_CERES_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_CERES_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_CERES_STONE.get()), has(ModBlocks.POLISHED_CERES_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CERES_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.CERES_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CERES_STONE_BRICKS.get()), has(ModBlocks.CERES_STONE_BRICKS.get()))
                .save(consumer);

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

        // Saturn Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE.get()), has(ModBlocks.SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE.get()), has(ModBlocks.SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_COBBLESTONE.get()), has(ModBlocks.SATURN_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_COBBLESTONE.get()), has(ModBlocks.SATURN_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE.get()), has(ModBlocks.SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE_BRICKS.get()), has(ModBlocks.SATURN_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE_BRICKS.get()), has(ModBlocks.SATURN_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.SATURN_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_SATURN_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SATURN_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE_BRICK_SLAB.get()), has(ModBlocks.SATURN_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()), has(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SATURN_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()), has(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE.get()), has(ModBlocks.SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_SATURN_STONE.get()), has(ModBlocks.POLISHED_SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SATURN_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_SATURN_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_SATURN_STONE.get()), has(ModBlocks.POLISHED_SATURN_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SATURN_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SATURN_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SATURN_STONE_BRICKS.get()), has(ModBlocks.SATURN_STONE_BRICKS.get()))
                .save(consumer);

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

        // Uranus Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE.get()), has(ModBlocks.URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE.get()), has(ModBlocks.URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_COBBLESTONE.get()), has(ModBlocks.URANUS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_COBBLESTONE.get()), has(ModBlocks.URANUS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE.get()), has(ModBlocks.URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE_BRICKS.get()), has(ModBlocks.URANUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE_BRICKS.get()), has(ModBlocks.URANUS_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.URANUS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_URANUS_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.URANUS_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE_BRICK_SLAB.get()), has(ModBlocks.URANUS_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_URANUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE.get()), has(ModBlocks.URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_URANUS_STONE.get()), has(ModBlocks.POLISHED_URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_URANUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_URANUS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_URANUS_STONE.get()), has(ModBlocks.POLISHED_URANUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANUS_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.URANUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.URANUS_STONE_BRICKS.get()), has(ModBlocks.URANUS_STONE_BRICKS.get()))
                .save(consumer);

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

        // Neptune Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE.get()), has(ModBlocks.NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE.get()), has(ModBlocks.NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_COBBLESTONE.get()), has(ModBlocks.NEPTUNE_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_COBBLESTONE.get()), has(ModBlocks.NEPTUNE_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE.get()), has(ModBlocks.NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.NEPTUNE_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get()), has(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE.get()), has(ModBlocks.NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_NEPTUNE_STONE.get()), has(ModBlocks.POLISHED_NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_NEPTUNE_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_NEPTUNE_STONE.get()), has(ModBlocks.POLISHED_NEPTUNE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEPTUNE_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.NEPTUNE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.NEPTUNE_STONE_BRICKS.get()), has(ModBlocks.NEPTUNE_STONE_BRICKS.get()))
                .save(consumer);

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

        // Orcus Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE.get()), has(ModBlocks.ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE.get()), has(ModBlocks.ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_COBBLESTONE.get()), has(ModBlocks.ORCUS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_COBBLESTONE.get()), has(ModBlocks.ORCUS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE.get()), has(ModBlocks.ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE_BRICKS.get()), has(ModBlocks.ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE_BRICKS.get()), has(ModBlocks.ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.ORCUS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ORCUS_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE_BRICK_SLAB.get()), has(ModBlocks.ORCUS_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ORCUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE.get()), has(ModBlocks.ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_ORCUS_STONE.get()), has(ModBlocks.POLISHED_ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ORCUS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_ORCUS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_ORCUS_STONE.get()), has(ModBlocks.POLISHED_ORCUS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORCUS_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ORCUS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ORCUS_STONE_BRICKS.get()), has(ModBlocks.ORCUS_STONE_BRICKS.get()))
                .save(consumer);

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

        // Pluto Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE.get()), has(ModBlocks.PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE.get()), has(ModBlocks.PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_COBBLESTONE.get()), has(ModBlocks.PLUTO_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_COBBLESTONE.get()), has(ModBlocks.PLUTO_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE.get()), has(ModBlocks.PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE_BRICKS.get()), has(ModBlocks.PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE_BRICKS.get()), has(ModBlocks.PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.PLUTO_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.PLUTO_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE_BRICK_SLAB.get()), has(ModBlocks.PLUTO_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()), has(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_PLUTO_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()), has(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE.get()), has(ModBlocks.PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_PLUTO_STONE.get()), has(ModBlocks.POLISHED_PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_PLUTO_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_PLUTO_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_PLUTO_STONE.get()), has(ModBlocks.POLISHED_PLUTO_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PLUTO_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.PLUTO_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.PLUTO_STONE_BRICKS.get()), has(ModBlocks.PLUTO_STONE_BRICKS.get()))
                .save(consumer);

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

        // Haumea Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE.get()), has(ModBlocks.HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE.get()), has(ModBlocks.HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_COBBLESTONE.get()), has(ModBlocks.HAUMEA_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_COBBLESTONE.get()), has(ModBlocks.HAUMEA_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE.get()), has(ModBlocks.HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE_BRICKS.get()), has(ModBlocks.HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE_BRICKS.get()), has(ModBlocks.HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.HAUMEA_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.HAUMEA_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get()), has(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()), has(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()), has(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE.get()), has(ModBlocks.HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_HAUMEA_STONE.get()), has(ModBlocks.POLISHED_HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_HAUMEA_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_HAUMEA_STONE.get()), has(ModBlocks.POLISHED_HAUMEA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HAUMEA_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.HAUMEA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.HAUMEA_STONE_BRICKS.get()), has(ModBlocks.HAUMEA_STONE_BRICKS.get()))
                .save(consumer);

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

        // Quaoar Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE.get()), has(ModBlocks.QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE.get()), has(ModBlocks.QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_COBBLESTONE.get()), has(ModBlocks.QUAOAR_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_COBBLESTONE.get()), has(ModBlocks.QUAOAR_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE.get()), has(ModBlocks.QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE_BRICKS.get()), has(ModBlocks.QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE_BRICKS.get()), has(ModBlocks.QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.QUAOAR_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.QUAOAR_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get()), has(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()), has(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()), has(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE.get()), has(ModBlocks.QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_QUAOAR_STONE.get()), has(ModBlocks.POLISHED_QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_QUAOAR_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_QUAOAR_STONE.get()), has(ModBlocks.POLISHED_QUAOAR_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.QUAOAR_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.QUAOAR_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.QUAOAR_STONE_BRICKS.get()), has(ModBlocks.QUAOAR_STONE_BRICKS.get()))
                .save(consumer);

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

        // Makemake Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE.get()), has(ModBlocks.MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE.get()), has(ModBlocks.MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_COBBLESTONE.get()), has(ModBlocks.MAKEMAKE_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_COBBLESTONE.get()), has(ModBlocks.MAKEMAKE_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE.get()), has(ModBlocks.MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get()), has(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE.get()), has(ModBlocks.MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_MAKEMAKE_STONE.get()), has(ModBlocks.POLISHED_MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_MAKEMAKE_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_MAKEMAKE_STONE.get()), has(ModBlocks.POLISHED_MAKEMAKE_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAKEMAKE_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.MAKEMAKE_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.MAKEMAKE_STONE_BRICKS.get()), has(ModBlocks.MAKEMAKE_STONE_BRICKS.get()))
                .save(consumer);

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

        // Gonggong Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE.get()), has(ModBlocks.GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE.get()), has(ModBlocks.GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_COBBLESTONE.get()), has(ModBlocks.GONGGONG_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_COBBLESTONE.get()), has(ModBlocks.GONGGONG_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE.get()), has(ModBlocks.GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE_BRICKS.get()), has(ModBlocks.GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE_BRICKS.get()), has(ModBlocks.GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.GONGGONG_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.GONGGONG_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get()), has(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()), has(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()), has(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE.get()), has(ModBlocks.GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_GONGGONG_STONE.get()), has(ModBlocks.POLISHED_GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_GONGGONG_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_GONGGONG_STONE.get()), has(ModBlocks.POLISHED_GONGGONG_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GONGGONG_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.GONGGONG_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.GONGGONG_STONE_BRICKS.get()), has(ModBlocks.GONGGONG_STONE_BRICKS.get()))
                .save(consumer);

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

        // Eris Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE.get()), has(ModBlocks.ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE.get()), has(ModBlocks.ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_COBBLESTONE.get()), has(ModBlocks.ERIS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_COBBLESTONE.get()), has(ModBlocks.ERIS_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE.get()), has(ModBlocks.ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE_BRICKS.get()), has(ModBlocks.ERIS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE_BRICKS.get()), has(ModBlocks.ERIS_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.ERIS_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_ERIS_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ERIS_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE_BRICK_SLAB.get()), has(ModBlocks.ERIS_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_ERIS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()), has(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE.get()), has(ModBlocks.ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_ERIS_STONE.get()), has(ModBlocks.POLISHED_ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_ERIS_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_ERIS_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_ERIS_STONE.get()), has(ModBlocks.POLISHED_ERIS_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ERIS_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.ERIS_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.ERIS_STONE_BRICKS.get()), has(ModBlocks.ERIS_STONE_BRICKS.get()))
                .save(consumer);

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

        // Sedna Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE.get()), has(ModBlocks.SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE.get()), has(ModBlocks.SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_COBBLESTONE.get()), has(ModBlocks.SEDNA_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_COBBLESTONE.get()), has(ModBlocks.SEDNA_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE.get()), has(ModBlocks.SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE_BRICKS.get()), has(ModBlocks.SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE_BRICKS.get()), has(ModBlocks.SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.SEDNA_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SEDNA_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE_BRICK_SLAB.get()), has(ModBlocks.SEDNA_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()), has(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_SEDNA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()), has(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE.get()), has(ModBlocks.SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_SEDNA_STONE.get()), has(ModBlocks.POLISHED_SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_SEDNA_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_SEDNA_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_SEDNA_STONE.get()), has(ModBlocks.POLISHED_SEDNA_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SEDNA_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.SEDNA_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.SEDNA_STONE_BRICKS.get()), has(ModBlocks.SEDNA_STONE_BRICKS.get()))
                .save(consumer);

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

        // Proxima Centauri B Stone Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_SANDSTONE.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.B_SAND.get()).unlockedBy(getHasName(ModBlocks.B_SAND.get()), has(ModBlocks.B_SAND.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_SANDSTONE_BRICKS.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.B_SANDSTONE.get()).unlockedBy(getHasName(ModBlocks.B_SANDSTONE.get()), has(ModBlocks.B_SANDSTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_SANDSTONE_BRICK_STAIRS.get(), 4)
                .pattern("S  ")
                .pattern("SS ")
                .pattern("SSS")
                .define('S', ModBlocks.B_SANDSTONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.B_SANDSTONE_BRICKS.get()), has(ModBlocks.B_SANDSTONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_SANDSTONE_BRICK_SLAB.get(), 6)
                .pattern("SSS")
                .define('S', ModBlocks.B_SANDSTONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.B_SANDSTONE_BRICKS.get()), has(ModBlocks.B_SANDSTONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.B_SANDSTONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_B_SANDSTONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.B_STONE.get()).unlockedBy(getHasName(ModBlocks.B_STONE.get()), has(ModBlocks.B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.B_STONE.get()).unlockedBy(getHasName(ModBlocks.B_STONE.get()), has(ModBlocks.B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_COBBLESTONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.B_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.B_COBBLESTONE.get()), has(ModBlocks.B_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_COBBLESTONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.B_COBBLESTONE.get()).unlockedBy(getHasName(ModBlocks.B_COBBLESTONE.get()), has(ModBlocks.B_COBBLESTONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_BRICKS.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.B_STONE.get()).unlockedBy(getHasName(ModBlocks.B_STONE.get()), has(ModBlocks.B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_BRICK_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.B_STONE_BRICKS.get()), has(ModBlocks.B_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_STONE_BRICK_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.B_STONE_BRICKS.get()), has(ModBlocks.B_STONE_BRICKS.get()))
                .save(consumer);

        oreSmelting(consumer, List.of(ModBlocks.B_STONE_BRICKS.get()), RecipeCategory.MISC, ModBlocks.CRACKED_B_STONE_BRICKS.get(), 0.2f, 200, "item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_BRICKS.get())
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.B_STONE_BRICK_SLAB.get()).unlockedBy(getHasName(ModBlocks.B_STONE_BRICK_SLAB.get()), has(ModBlocks.B_STONE_BRICK_SLAB.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_B_STONE_BRICKS.get()), has(ModBlocks.CHISELED_B_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHISELED_B_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.CHISELED_B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.CHISELED_B_STONE_BRICKS.get()), has(ModBlocks.CHISELED_B_STONE_BRICKS.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE.get(), 4)
                .pattern("JJ")
                .pattern("JJ")
                .define('J', ModBlocks.B_STONE.get()).unlockedBy(getHasName(ModBlocks.B_STONE.get()), has(ModBlocks.B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE_STAIRS.get(), 4)
                .pattern("J  ")
                .pattern("JJ ")
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_B_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_B_STONE.get()), has(ModBlocks.POLISHED_B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_B_STONE_SLAB.get(), 6)
                .pattern("JJJ")
                .define('J', ModBlocks.POLISHED_B_STONE.get()).unlockedBy(getHasName(ModBlocks.POLISHED_B_STONE.get()), has(ModBlocks.POLISHED_B_STONE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.B_PILLAR.get(), 2)
                .pattern("J")
                .pattern("J")
                .define('J', ModBlocks.B_STONE_BRICKS.get()).unlockedBy(getHasName(ModBlocks.B_STONE_BRICKS.get()), has(ModBlocks.B_STONE_BRICKS.get()))
                .save(consumer);

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

        // Other
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SLUSHY_ICE.get(), 4)
                .pattern(" # ")
                .pattern("#W#")
                .pattern(" # ")
                .define('#', Items.ICE)
                .define('W', Items.WATER_BUCKET)
                .unlockedBy(getHasName(Items.ICE), has(Items.ICE))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PACKED_SLUSHY_ICE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.SLUSHY_ICE.get())
                .unlockedBy(getHasName(ModBlocks.SLUSHY_ICE.get()), has(ModBlocks.SLUSHY_ICE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_SLUSHY_ICE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.PACKED_SLUSHY_ICE.get())
                .unlockedBy(getHasName(ModBlocks.PACKED_SLUSHY_ICE.get()), has(ModBlocks.PACKED_SLUSHY_ICE.get()))
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
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pFinishedRecipeConsumer, Main.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void stonecutting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory category, ItemLike ingredient, ItemLike result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), category, result, count)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(pFinishedRecipeConsumer, Main.MOD_ID + ":" + getItemName(result) + "_from_" + getItemName(ingredient) + "_stonecutting");
    }
}
