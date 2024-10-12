package com.drd.ad_extendra.datagen.provider.server;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.drd.ad_extendra.common.registry.ModItems;
import com.drd.ad_extendra.common.utils.tags.ModItemTags;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
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
import java.util.function.Function;
import java.util.function.Supplier;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
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
    }

    private void shaped(RegistryEntry<Item> result, int count, Supplier<Item> mainItem, Function<ShapedRecipeBuilder, ShapedRecipeBuilder> builder, Consumer<FinishedRecipe> consumer) {
        builder.apply(ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result.get(), count)
                        .define('#', mainItem.get())
                        .unlockedBy("has_" + result.getId().getPath(), has(mainItem.get())))
                .save(consumer);
    }

    private void shaped(RegistryEntry<Item> result, int count, TagKey<Item> mainItem, Function<ShapedRecipeBuilder, ShapedRecipeBuilder> builder, Consumer<FinishedRecipe> consumer) {
        builder.apply(ShapedRecipeBuilder.shaped(RecipeCategory.MISC, result.get(), count)
                        .define('#', mainItem)
                        .unlockedBy("has_" + result.getId().getPath(), has(mainItem)))
                .save(consumer);
    }

    private void shapeless(RegistryEntry<Item> result, int count, Supplier<Item> mainItem, Function<ShapelessRecipeBuilder, ShapelessRecipeBuilder> builder, Consumer<FinishedRecipe> consumer) {
        builder.apply(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result.get(), count)
                        .requires(mainItem.get())
                        .unlockedBy("has_" + result.getId().getPath(), has(mainItem.get())))
                .save(consumer);
    }

    private void shapeless(RegistryEntry<Item> result, int count, Supplier<Item> mainItem, String file, Function<ShapelessRecipeBuilder, ShapelessRecipeBuilder> builder, Consumer<FinishedRecipe> consumer) {
        builder.apply(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result.get(), count)
                        .requires(mainItem.get())
                        .unlockedBy("has_" + result.getId().getPath(), has(mainItem.get())))
                .save(consumer, new ResourceLocation(AdExtendra.MOD_ID, file));
    }

    private void shapeless(RegistryEntry<Item> result, int count, TagKey<Item> mainItem, Function<ShapelessRecipeBuilder, ShapelessRecipeBuilder> builder, Consumer<FinishedRecipe> consumer) {
        builder.apply(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result.get(), count)
                        .requires(mainItem)
                        .unlockedBy("has_" + result.getId().getPath(), has(mainItem)))
                .save(consumer);
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
