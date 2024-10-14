package com.drd.ad_extendra.datagen.provider.server.tags;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.drd.ad_extendra.common.registry.ModItems;
import com.drd.ad_extendra.common.utils.tags.ModItemTags;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import earth.terrarium.adastra.AdAstra;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> contentsGetter, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, contentsGetter, AdExtendra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        add(ModItemTags.JUPERIUM_INGOTS, ModItems.JUPERIUM_INGOT.get(), "juperium_ingots", "ingots/juperium");
        add(ModItemTags.JUPERIUM_NUGGETS, ModItems.JUPERIUM_NUGGET.get(), "juperium_nuggets", "nuggets/juperium");
        add(ModItemTags.JUPERIUM_PLATES, ModItems.JUPERIUM_PLATE.get(), "juperium_plates", "plates/juperium");
        add(ModItemTags.RAW_JUPERIUM, ModItems.RAW_JUPERIUM.get(), "raw_juperium_ores", "raw_materials/juperium");
        add(ModItemTags.JUPERIUM_BLOCKS, ModBlocks.JUPERIUM_BLOCK.get().asItem(), "juperium_blocks", "storage_blocks/juperium");
        add(ModItemTags.RAW_JUPERIUM_BLOCKS, ModBlocks.RAW_JUPERIUM_BLOCK.get().asItem(), "raw_juperium_blocks", "storage_blocks/raw_juperium");
        add(ModItemTags.JUPERIUM_ORES, ModBlocks.JUPITER_JUPERIUM_ORE.get().asItem(), "juperium_ores", "ores/juperium");
        add(ModItemTags.SATURLYTE_INGOTS, ModItems.SATURLYTE_INGOT.get(), "saturlyte_ingots", "ingots/saturlyte");
        add(ModItemTags.SATURLYTE_NUGGETS, ModItems.SATURLYTE_NUGGET.get(), "saturlyte_nuggets", "nuggets/saturlyte");
        add(ModItemTags.SATURLYTE_PLATES, ModItems.SATURLYTE_PLATE.get(), "saturlyte_plates", "plates/saturlyte");
        add(ModItemTags.RAW_SATURLYTE, ModItems.RAW_SATURLYTE.get(), "raw_saturlyte_ores", "raw_materials/saturlyte");
        add(ModItemTags.SATURLYTE_BLOCKS, ModBlocks.SATURLYTE_BLOCK.get().asItem(), "saturlyte_blocks", "storage_blocks/saturlyte");
        add(ModItemTags.RAW_SATURLYTE_BLOCKS, ModBlocks.RAW_SATURLYTE_BLOCK.get().asItem(), "raw_saturlyte_blocks", "storage_blocks/raw_saturlyte");
        add(ModItemTags.SATURLYTE_ORES, ModBlocks.SATURN_SATURLYTE_ORE.get().asItem(), "saturlyte_ores", "ores/saturlyte");
        add(ModItemTags.URANIUM_INGOTS, ModItems.URANIUM_INGOT.get(), "uranium_ingots", "ingots/uranium");
        add(ModItemTags.URANIUM_NUGGETS, ModItems.URANIUM_NUGGET.get(), "uranium_nuggets", "nuggets/uranium");
        add(ModItemTags.URANIUM_PLATES, ModItems.URANIUM_PLATE.get(), "uranium_plates", "plates/uranium");
        add(ModItemTags.RAW_URANIUM, ModItems.RAW_URANIUM.get(), "raw_uranium_ores", "raw_materials/uranium");
        add(ModItemTags.URANIUM_BLOCKS, ModBlocks.URANIUM_BLOCK.get().asItem(), "uranium_blocks", "storage_blocks/uranium");
        add(ModItemTags.RAW_URANIUM_BLOCKS, ModBlocks.RAW_URANIUM_BLOCK.get().asItem(), "raw_uranium_blocks", "storage_blocks/raw_uranium");
        add(ModItemTags.URANIUM_ORES, ModBlocks.URANUS_URANIUM_ORE.get().asItem(), "uranium_ores", "ores/uranium");
        add(ModItemTags.NEPTUNIUM_INGOTS, ModItems.NEPTUNIUM_INGOT.get(), "neptunium_ingots", "ingots/neptunium");
        add(ModItemTags.NEPTUNIUM_NUGGETS, ModItems.NEPTUNIUM_NUGGET.get(), "neptunium_nuggets", "nuggets/neptunium");
        add(ModItemTags.NEPTUNIUM_PLATES, ModItems.NEPTUNIUM_PLATE.get(), "neptunium_plates", "plates/neptunium");
        add(ModItemTags.RAW_NEPTUNIUM, ModItems.RAW_NEPTUNIUM.get(), "raw_neptunium_ores", "raw_materials/neptunium");
        add(ModItemTags.NEPTUNIUM_BLOCKS, ModBlocks.NEPTUNIUM_BLOCK.get().asItem(), "neptunium_blocks", "storage_blocks/neptunium");
        add(ModItemTags.RAW_NEPTUNIUM_BLOCKS, ModBlocks.RAW_NEPTUNIUM_BLOCK.get().asItem(), "raw_neptunium_blocks", "storage_blocks/raw_neptunium");
        add(ModItemTags.NEPTUNIUM_ORES, ModBlocks.NEPTUNE_NEPTUNIUM_ORE.get().asItem(), "neptunium_ores", "ores/neptunium");
        add(ModItemTags.RADIUM_INGOTS, ModItems.RADIUM_INGOT.get(), "radium_ingots", "ingots/radium");
        add(ModItemTags.RADIUM_NUGGETS, ModItems.RADIUM_NUGGET.get(), "radium_nuggets", "nuggets/radium");
        add(ModItemTags.RADIUM_PLATES, ModItems.RADIUM_PLATE.get(), "radium_plates", "plates/radium");
        add(ModItemTags.RAW_RADIUM, ModItems.RAW_RADIUM.get(), "raw_radium_ores", "raw_materials/radium");
        add(ModItemTags.RADIUM_BLOCKS, ModBlocks.RADIUM_BLOCK.get().asItem(), "radium_blocks", "storage_blocks/radium");
        add(ModItemTags.RAW_RADIUM_BLOCKS, ModBlocks.RAW_RADIUM_BLOCK.get().asItem(), "raw_radium_blocks", "storage_blocks/raw_radium");
        add(ModItemTags.RADIUM_ORES, ModBlocks.ORCUS_RADIUM_ORE.get().asItem(), "radium_ores", "ores/radium");
        add(ModItemTags.PLUTONIUM_INGOTS, ModItems.PLUTONIUM_INGOT.get(), "plutonium_ingots", "ingots/plutonium");
        add(ModItemTags.PLUTONIUM_NUGGETS, ModItems.PLUTONIUM_NUGGET.get(), "plutonium_nuggets", "nuggets/plutonium");
        add(ModItemTags.PLUTONIUM_PLATES, ModItems.PLUTONIUM_PLATE.get(), "plutonium_plates", "plates/plutonium");
        add(ModItemTags.RAW_PLUTONIUM, ModItems.RAW_PLUTONIUM.get(), "raw_plutonium_ores", "raw_materials/plutonium");
        add(ModItemTags.PLUTONIUM_BLOCKS, ModBlocks.PLUTONIUM_BLOCK.get().asItem(), "plutonium_blocks", "storage_blocks/plutonium");
        add(ModItemTags.RAW_PLUTONIUM_BLOCKS, ModBlocks.RAW_PLUTONIUM_BLOCK.get().asItem(), "raw_plutonium_blocks", "storage_blocks/raw_plutonium");
        add(ModItemTags.PLUTONIUM_ORES, ModBlocks.PLUTO_PLUTONIUM_ORE.get().asItem(), "plutonium_ores", "ores/plutonium");
        add(ModItemTags.ELECTROLYTE_INGOTS, ModItems.ELECTROLYTE_INGOT.get(), "electrolyte_ingots", "ingots/electrolyte");
        add(ModItemTags.ELECTROLYTE_NUGGETS, ModItems.ELECTROLYTE_NUGGET.get(), "electrolyte_nuggets", "nuggets/electrolyte");
        add(ModItemTags.ELECTROLYTE_PLATES, ModItems.ELECTROLYTE_PLATE.get(), "electrolyte_plates", "plates/electrolyte");
        add(ModItemTags.RAW_ELECTROLYTE, ModItems.RAW_ELECTROLYTE.get(), "raw_electrolyte_ores", "raw_materials/electrolyte");
        add(ModItemTags.ELECTROLYTE_BLOCKS, ModBlocks.ELECTROLYTE_BLOCK.get().asItem(), "electrolyte_blocks", "storage_blocks/electrolyte");
        add(ModItemTags.RAW_ELECTROLYTE_BLOCKS, ModBlocks.RAW_ELECTROLYTE_BLOCK.get().asItem(), "raw_electrolyte_blocks", "storage_blocks/raw_electrolyte");
        add(ModItemTags.ELECTROLYTE_ORES, ModBlocks.SEDNA_ELECTROLYTE_ORE.get().asItem(), "electrolyte_ores", "ores/electrolyte");

        ModBlocks.STAIRS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.STAIRS).add(TagEntry.element(BuiltInRegistries.BLOCK.getKey(b))));
        ModBlocks.SLABS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.SLABS).add(TagEntry.element(BuiltInRegistries.BLOCK.getKey(b))));
        ModBlocks.WALLS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.WALLS).add(TagEntry.element(BuiltInRegistries.BLOCK.getKey(b))));
        ModBlocks.BUTTONS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.BUTTONS).add(TagEntry.element(BuiltInRegistries.BLOCK.getKey(b))));
        ModItems.SIGNS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.SIGNS).add(element(b)));
        ModItems.HANGING_SIGNS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.HANGING_SIGNS).add(element(b)));
        ModItems.BOATS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.BOATS).add(element(b)));
        ModItems.CHEST_BOATS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.CHEST_BOATS).add(element(b)));

        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(element(ModItems.JUPERIUM_INGOT.get()));
        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(element(ModItems.SATURLYTE_INGOT.get()));
        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(element(ModItems.URANIUM_INGOT.get()));
        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(element(ModItems.NEPTUNIUM_INGOT.get()));
        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(element(ModItems.RADIUM_INGOT.get()));
        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(element(ModItems.PLUTONIUM_INGOT.get()));
        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(element(ModItems.ELECTROLYTE_INGOT.get()));

        tag(ItemTags.SAND).add(element(ModBlocks.CERES_SAND.get().asItem()));
        tag(ItemTags.SAND).add(element(ModBlocks.JUPITER_SAND.get().asItem()));
        tag(ItemTags.SAND).add(element(ModBlocks.SATURN_SAND.get().asItem()));
        tag(ItemTags.SAND).add(element(ModBlocks.PLUTO_SAND.get().asItem()));
        tag(ItemTags.SAND).add(element(ModBlocks.B_SAND.get().asItem()));

        tag(ItemTags.SMELTS_TO_GLASS).add(element(ModBlocks.CERES_SAND.get().asItem()));
        tag(ItemTags.SMELTS_TO_GLASS).add(element(ModBlocks.JUPITER_SAND.get().asItem()));
        tag(ItemTags.SMELTS_TO_GLASS).add(element(ModBlocks.SATURN_SAND.get().asItem()));
        tag(ItemTags.SMELTS_TO_GLASS).add(element(ModBlocks.PLUTO_SAND.get().asItem()));
        tag(ItemTags.SMELTS_TO_GLASS).add(element(ModBlocks.B_SAND.get().asItem()));

        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.CERES_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.JUPITER_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.SATURN_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.URANUS_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.NEPTUNE_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.ORCUS_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.PLUTO_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.HAUMEA_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.QUAOAR_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.MAKEMAKE_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.GONGGONG_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.ERIS_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.SEDNA_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(element(ModBlocks.B_COBBLESTONE.get().asItem()));

        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.CERES_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.JUPITER_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.SATURN_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.URANUS_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.NEPTUNE_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.ORCUS_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.PLUTO_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.HAUMEA_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.QUAOAR_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.MAKEMAKE_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.GONGGONG_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.ERIS_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.SEDNA_COBBLESTONE.get().asItem()));
        tag(ItemTags.STONE_TOOL_MATERIALS).add(element(ModBlocks.B_COBBLESTONE.get().asItem()));

        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CERES_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_CERES_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_CERES_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.JUPITER_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.SATURN_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_SATURN_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.URANUS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_URANUS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.NEPTUNE_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.ORCUS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.PLUTO_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.HAUMEA_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.QUAOAR_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.MAKEMAKE_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.GONGGONG_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.ERIS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_ERIS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.SEDNA_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.B_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_B_STONE_BRICKS.get().asItem()));
        tag(ItemTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_B_STONE_BRICKS.get().asItem()));

        tag(ItemTags.COAL_ORES).add(element(ModBlocks.JUPITER_COAL_ORE.get().asItem()));
        tag(ItemTags.COAL_ORES).add(element(ModBlocks.SATURN_COAL_ORE.get().asItem()));
        tag(ItemTags.COAL_ORES).add(element(ModBlocks.NEPTUNE_COAL_ORE.get().asItem()));

        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.CERES_COPPER_ORE.get().asItem()));
        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.NEPTUNE_COPPER_ORE.get().asItem()));
        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.ORCUS_COPPER_ORE.get().asItem()));
        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.HAUMEA_COPPER_ORE.get().asItem()));
        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.QUAOAR_COPPER_ORE.get().asItem()));
        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.MAKEMAKE_COPPER_ORE.get().asItem()));
        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.GONGGONG_COPPER_ORE.get().asItem()));
        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.ERIS_COPPER_ORE.get().asItem()));
        tag(ItemTags.COPPER_ORES).add(element(ModBlocks.SEDNA_COPPER_ORE.get().asItem()));

        tag(ItemTags.DIAMOND_ORES).add(element(ModBlocks.JUPITER_DIAMOND_ORE.get().asItem()));
        tag(ItemTags.DIAMOND_ORES).add(element(ModBlocks.SATURN_DIAMOND_ORE.get().asItem()));
        tag(ItemTags.DIAMOND_ORES).add(element(ModBlocks.URANUS_DIAMOND_ORE.get().asItem()));
        tag(ItemTags.DIAMOND_ORES).add(element(ModBlocks.PLUTO_DIAMOND_ORE.get().asItem()));
        tag(ItemTags.DIAMOND_ORES).add(element(ModBlocks.B_DIAMOND_ORE.get().asItem()));

        tag(ItemTags.EMERALD_ORES).add(element(ModBlocks.B_EMERALD_ORE.get().asItem()));

        tag(ItemTags.GOLD_ORES).add(element(ModBlocks.JUPITER_GOLD_ORE.get().asItem()));
        tag(ItemTags.GOLD_ORES).add(element(ModBlocks.SATURN_GOLD_ORE.get().asItem()));
        tag(ItemTags.GOLD_ORES).add(element(ModBlocks.PLUTO_GOLD_ORE.get().asItem()));

        tag(ItemTags.IRON_ORES).add(element(ModBlocks.CERES_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.URANUS_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.NEPTUNE_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.ORCUS_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.HAUMEA_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.QUAOAR_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.MAKEMAKE_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.GONGGONG_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.ERIS_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.SEDNA_IRON_ORE.get().asItem()));
        tag(ItemTags.IRON_ORES).add(element(ModBlocks.B_IRON_ORE.get().asItem()));

        Arrays.asList(earth.terrarium.adastra.common.registry.ModItems.MOON_ICE_SHARD_ORE.get(), earth.terrarium.adastra.common.registry.ModItems.MARS_ICE_SHARD_ORE.get(), earth.terrarium.adastra.common.registry.ModItems.GLACIO_ICE_SHARD_ORE.get(), earth.terrarium.adastra.common.registry.ModItems.DEEPSLATE_ICE_SHARD_ORE.get(), ModBlocks.URANUS_ICE_SHARD_ORE.get().asItem(), ModBlocks.NEPTUNE_ICE_SHARD_ORE.get().asItem(), ModBlocks.PLUTO_ICE_SHARD_ORE.get().asItem()).forEach(item -> add(TagKey.create(Registries.ITEM, new ResourceLocation(AdAstra.MOD_ID, "ice_shard_ores")), item, "ice_shard_ores", "ores/ice_shard"));

        Arrays.asList(ModBlocks.AERONOS_PRESSURE_PLATE.get().asItem(), ModBlocks.STROPHAR_PRESSURE_PLATE.get().asItem()).forEach(item -> tag(ItemTags.WOODEN_PRESSURE_PLATES).add(element(item)));
        Arrays.asList(ModBlocks.AERONOS_BUTTON.get().asItem(), ModBlocks.STROPHAR_BUTTON.get().asItem()).forEach(item -> tag(ItemTags.WOODEN_BUTTONS).add(element(item)));
        Arrays.asList(ModBlocks.GLACIAN_WOOD.get().asItem(), ModBlocks.STRIPPED_GLACIAN_WOOD.get().asItem()).forEach(item -> tag(earth.terrarium.adastra.common.tags.ModItemTags.GLACIAN_LOGS).add(element(item)));

        tag(ItemTags.SAPLINGS).add(element(ModBlocks.GLACIAN_SAPLING.get().asItem()));
    }

    private void add(TagKey<Item> tag, Item item) {
        tag(tag).add(element(item));
    }

    private void add(TagKey<Item> tag, Item item, String fabricCommonTag, String forgeCommonTag) {
        add(tag, item);
        addFabricTag(item, tag, fabricCommonTag);
        addForgeTag(item, tag, forgeCommonTag);
    }

    private void addFabricTag(Item item, TagKey<Item> tag, String fabricCommonTag) {
        tag(tag).add(TagEntry.optionalTag(new ResourceLocation("c", fabricCommonTag)));

        var commonTag = TagKey.create(Registries.ITEM, new ResourceLocation("c", fabricCommonTag));
        tag(commonTag).add(element(item));
    }

    private void addForgeTag(Item item, TagKey<Item> tag, String forgeCommonTag) {
        tag(tag).add(TagEntry.optionalTag(new ResourceLocation("forge", forgeCommonTag)));

        var commonTag = TagKey.create(Registries.ITEM, new ResourceLocation("forge", forgeCommonTag));
        tag(commonTag).add(element(item));

        var folderTag = TagKey.create(Registries.ITEM, new ResourceLocation("forge", forgeCommonTag.split("/")[0]));
        tag(folderTag).add(TagEntry.tag(commonTag.location()));
    }

    private static TagEntry element(Item item) {
        return TagEntry.element(loc(item));
    }

    private static ResourceLocation loc(Item item) {
        return BuiltInRegistries.ITEM.getKey(item);
    }
}
