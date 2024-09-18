package net.teddy0008.ad_extendra.datagen;

import earth.terrarium.ad_astra.AdAstra;
import earth.terrarium.ad_astra.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.loot.AddItemModifier;

public class ModGlobalLootModifiersGenerator extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersGenerator(PackOutput output) {
        super(output, Main.MOD_ID);
    }

    @Override
    protected void start() {
        add("glacian_sapling_from_leaves", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(earth.terrarium.ad_astra.common.registry.ModBlocks.GLACIAN_LEAVES.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModBlocks.GLACIAN_SAPLING.get().asItem()));

        add("aeronos_mushroom_from_cap", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(earth.terrarium.ad_astra.common.registry.ModBlocks.AERONOS_CAP.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModBlocks.AERONOS_MUSHROOM.get().asItem()));

        add("strophar_mushroom_from_cap", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(earth.terrarium.ad_astra.common.registry.ModBlocks.STROPHAR_CAP.get()).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModBlocks.STROPHAR_MUSHROOM.get().asItem()));

        add("chests/village/moon/house/aeronos_mushroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation(AdAstra.MOD_ID, "chests/village/moon/house")).build(),
        LootItemRandomChanceCondition.randomChance(0.75f).build()}, ModBlocks.AERONOS_MUSHROOM.get().asItem()));

        add("chests/village/moon/house/strophar_mushroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation(AdAstra.MOD_ID, "chests/village/moon/house")).build(),
                LootItemRandomChanceCondition.randomChance(0.625f).build()}, ModBlocks.STROPHAR_MUSHROOM.get().asItem()));

        add("chests/village/moon/blacksmith/aeronos_mushroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation(AdAstra.MOD_ID, "chests/village/moon/blacksmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.75f).build()}, ModBlocks.AERONOS_MUSHROOM.get().asItem()));

        add("chests/village/moon/blacksmith/strophar_mushroom", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation(AdAstra.MOD_ID, "chests/village/moon/blacksmith")).build(),
                LootItemRandomChanceCondition.randomChance(0.625f).build()}, ModBlocks.STROPHAR_MUSHROOM.get().asItem()));

        add("chests/temple/mars/temple/mars_globe", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation(AdAstra.MOD_ID, "chests/temple/mars/temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.1f).build()}, ModItems.MARS_GLOBE.get().asItem()));
    }
}
