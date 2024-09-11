package net.teddy0008.ad_extendra.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.ModBlocks;
import net.teddy0008.ad_extendra.item.ModItems;
import net.teddy0008.ad_extendra.util.tag.ModItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(Tags.Items.RAW_MATERIALS)
                .addTag(ModItemTags.JUPERIUM_RAW_MATERIALS)
                .addTag(ModItemTags.SATURLYTE_RAW_MATERIALS)
                .addTag(ModItemTags.URANIUM_RAW_MATERIALS)
                .addTag(ModItemTags.NEPTUNIUM_RAW_MATERIALS)
                .addTag(ModItemTags.RADIUM_RAW_MATERIALS)
                .addTag(ModItemTags.PLUTONIUM_RAW_MATERIALS)
                .addTag(ModItemTags.ELECTROLYTE_RAW_MATERIALS);
        this.tag(ModItemTags.JUPERIUM_RAW_MATERIALS)
                .add(ModItems.RAW_JUPERIUM.get());
        this.tag(ModItemTags.SATURLYTE_RAW_MATERIALS)
                .add(ModItems.RAW_SATURLYTE.get());
        this.tag(ModItemTags.URANIUM_RAW_MATERIALS)
                .add(ModItems.RAW_URANIUM.get());
        this.tag(ModItemTags.NEPTUNIUM_RAW_MATERIALS)
                .add(ModItems.RAW_NEPTUNIUM.get());
        this.tag(ModItemTags.RADIUM_RAW_MATERIALS)
                .add(ModItems.RAW_RADIUM.get());
        this.tag(ModItemTags.PLUTONIUM_RAW_MATERIALS)
                .add(ModItems.RAW_PLUTONIUM.get());
        this.tag(ModItemTags.ELECTROLYTE_RAW_MATERIALS)
                .add(ModItems.RAW_ELECTROLYTE.get());
        this.tag(Tags.Items.INGOTS)
                .addTag(ModItemTags.FORGE_JUPERIUM_INGOTS)
                .addTag(ModItemTags.FORGE_SATURLYTE_INGOTS)
                .addTag(ModItemTags.FORGE_URANIUM_INGOTS)
                .addTag(ModItemTags.FORGE_NEPTUNIUM_INGOTS)
                .addTag(ModItemTags.FORGE_RADIUM_INGOTS)
                .addTag(ModItemTags.FORGE_PLUTONIUM_INGOTS)
                .addTag(ModItemTags.FORGE_ELECTROLYTE_INGOTS);
        this.tag(ModItemTags.FORGE_JUPERIUM_INGOTS)
                .add(ModItems.JUPERIUM_INGOT.get());
        this.tag(ModItemTags.JUPERIUM_INGOTS)
                .addTag(ModItemTags.FORGE_JUPERIUM_INGOTS);
        this.tag(ModItemTags.FORGE_SATURLYTE_INGOTS)
                .add(ModItems.SATURLYTE_INGOT.get());
        this.tag(ModItemTags.SATURLYTE_INGOTS)
                .addTag(ModItemTags.FORGE_SATURLYTE_INGOTS);
        this.tag(ModItemTags.FORGE_URANIUM_INGOTS)
                .add(ModItems.URANIUM_INGOT.get());
        this.tag(ModItemTags.URANIUM_INGOTS)
                .addTag(ModItemTags.FORGE_URANIUM_INGOTS);
        this.tag(ModItemTags.FORGE_NEPTUNIUM_INGOTS)
                .add(ModItems.NEPTUNIUM_INGOT.get());
        this.tag(ModItemTags.NEPTUNIUM_INGOTS)
                .addTag(ModItemTags.FORGE_NEPTUNIUM_INGOTS);
        this.tag(ModItemTags.FORGE_RADIUM_INGOTS)
                .add(ModItems.RADIUM_INGOT.get());
        this.tag(ModItemTags.RADIUM_INGOTS)
                .addTag(ModItemTags.FORGE_RADIUM_INGOTS);
        this.tag(ModItemTags.FORGE_PLUTONIUM_INGOTS)
                .add(ModItems.PLUTONIUM_INGOT.get());
        this.tag(ModItemTags.PLUTONIUM_INGOTS)
                .addTag(ModItemTags.FORGE_PLUTONIUM_INGOTS);
        this.tag(ModItemTags.FORGE_ELECTROLYTE_INGOTS)
                .add(ModItems.ELECTROLYTE_INGOT.get());
        this.tag(ModItemTags.ELECTROLYTE_INGOTS)
                .addTag(ModItemTags.FORGE_ELECTROLYTE_INGOTS);
        this.tag(Tags.Items.STORAGE_BLOCKS)
                .addTag(ModItemTags.FORGE_JUPERIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_SATURLYTE_BLOCKS)
                .addTag(ModItemTags.FORGE_URANIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_NEPTUNIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_RADIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_PLUTONIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_ELECTROLYTE_BLOCKS)
                .addTag(ModItemTags.RAW_JUPERIUM_BLOCKS)
                .addTag(ModItemTags.RAW_SATURLYTE_BLOCKS)
                .addTag(ModItemTags.RAW_URANIUM_BLOCKS)
                .addTag(ModItemTags.RAW_NEPTUNIUM_BLOCKS)
                .addTag(ModItemTags.RAW_RADIUM_BLOCKS)
                .addTag(ModItemTags.RAW_PLUTONIUM_BLOCKS)
                .addTag(ModItemTags.RAW_ELECTROLYTE_BLOCKS);
        this.tag(ModItemTags.FORGE_JUPERIUM_BLOCKS)
                .add(ModBlocks.JUPERIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.JUPERIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_JUPERIUM_BLOCKS);
        this.tag(ModItemTags.RAW_JUPERIUM_BLOCKS)
                .add(ModBlocks.RAW_JUPERIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.FORGE_SATURLYTE_BLOCKS)
                .add(ModBlocks.SATURLYTE_BLOCK.get().asItem());
        this.tag(ModItemTags.SATURLYTE_BLOCKS)
                .addTag(ModItemTags.FORGE_SATURLYTE_BLOCKS);
        this.tag(ModItemTags.RAW_SATURLYTE_BLOCKS)
                .add(ModBlocks.RAW_SATURLYTE_BLOCK.get().asItem());
        this.tag(ModItemTags.FORGE_URANIUM_BLOCKS)
                .add(ModBlocks.URANIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.URANIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_URANIUM_BLOCKS);
        this.tag(ModItemTags.RAW_URANIUM_BLOCKS)
                .add(ModBlocks.RAW_URANIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.FORGE_NEPTUNIUM_BLOCKS)
                .add(ModBlocks.NEPTUNIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.NEPTUNIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_NEPTUNIUM_BLOCKS);
        this.tag(ModItemTags.RAW_NEPTUNIUM_BLOCKS)
                .add(ModBlocks.RAW_NEPTUNIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.FORGE_RADIUM_BLOCKS)
                .add(ModBlocks.RADIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.RADIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_RADIUM_BLOCKS);
        this.tag(ModItemTags.RAW_RADIUM_BLOCKS)
                .add(ModBlocks.RAW_RADIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.FORGE_PLUTONIUM_BLOCKS)
                .add(ModBlocks.PLUTONIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.PLUTONIUM_BLOCKS)
                .addTag(ModItemTags.FORGE_PLUTONIUM_BLOCKS);
        this.tag(ModItemTags.RAW_PLUTONIUM_BLOCKS)
                .add(ModBlocks.RAW_PLUTONIUM_BLOCK.get().asItem());
        this.tag(ModItemTags.FORGE_ELECTROLYTE_BLOCKS)
                .add(ModBlocks.ELECTROLYTE_BLOCK.get().asItem());
        this.tag(ModItemTags.ELECTROLYTE_BLOCKS)
                .addTag(ModItemTags.FORGE_ELECTROLYTE_BLOCKS);
        this.tag(ModItemTags.RAW_ELECTROLYTE_BLOCKS)
                .add(ModBlocks.RAW_ELECTROLYTE_BLOCK.get().asItem());
        this.tag(ModItemTags.PLATES)
                .addTag(ModItemTags.FORGE_JUPERIUM_PLATES)
                .addTag(ModItemTags.FORGE_SATURLYTE_PLATES)
                .addTag(ModItemTags.FORGE_URANIUM_PLATES)
                .addTag(ModItemTags.FORGE_NEPTUNIUM_PLATES)
                .addTag(ModItemTags.FORGE_RADIUM_PLATES)
                .addTag(ModItemTags.FORGE_PLUTONIUM_PLATES)
                .addTag(ModItemTags.FORGE_ELECTROLYTE_PLATES);
        this.tag(ModItemTags.FORGE_JUPERIUM_PLATES)
                .add(ModItems.JUPERIUM_PLATE.get());
        this.tag(ModItemTags.JUPERIUM_PLATES)
                .addTag(ModItemTags.FORGE_JUPERIUM_PLATES);
        this.tag(ModItemTags.FORGE_SATURLYTE_PLATES)
                .add(ModItems.SATURLYTE_PLATE.get());
        this.tag(ModItemTags.SATURLYTE_PLATES)
                .addTag(ModItemTags.FORGE_SATURLYTE_PLATES);
        this.tag(ModItemTags.FORGE_URANIUM_PLATES)
                .add(ModItems.URANIUM_PLATE.get());
        this.tag(ModItemTags.URANIUM_PLATES)
                .addTag(ModItemTags.FORGE_URANIUM_PLATES);
        this.tag(ModItemTags.FORGE_NEPTUNIUM_PLATES)
                .add(ModItems.NEPTUNIUM_PLATE.get());
        this.tag(ModItemTags.NEPTUNIUM_PLATES)
                .addTag(ModItemTags.FORGE_NEPTUNIUM_PLATES);
        this.tag(ModItemTags.FORGE_RADIUM_PLATES)
                .add(ModItems.RADIUM_PLATE.get());
        this.tag(ModItemTags.RADIUM_PLATES)
                .addTag(ModItemTags.FORGE_RADIUM_PLATES);
        this.tag(ModItemTags.FORGE_PLUTONIUM_PLATES)
                .add(ModItems.PLUTONIUM_PLATE.get());
        this.tag(ModItemTags.PLUTONIUM_PLATES)
                .addTag(ModItemTags.FORGE_PLUTONIUM_PLATES);
        this.tag(ModItemTags.FORGE_ELECTROLYTE_PLATES)
                .add(ModItems.ELECTROLYTE_PLATE.get());
        this.tag(ModItemTags.ELECTROLYTE_PLATES)
                .addTag(ModItemTags.FORGE_ELECTROLYTE_PLATES);
        this.tag(Tags.Items.NUGGETS)
                .addTag(ModItemTags.JUPERIUM_NUGGETS)
                .addTag(ModItemTags.SATURLYTE_NUGGETS)
                .addTag(ModItemTags.URANIUM_NUGGETS)
                .addTag(ModItemTags.NEPTUNIUM_NUGGETS)
                .addTag(ModItemTags.RADIUM_NUGGETS)
                .addTag(ModItemTags.PLUTONIUM_NUGGETS)
                .addTag(ModItemTags.ELECTROLYTE_NUGGETS);
        this.tag(ModItemTags.JUPERIUM_NUGGETS)
                .add(ModItems.JUPERIUM_NUGGET.get());
        this.tag(ModItemTags.SATURLYTE_NUGGETS)
                .add(ModItems.SATURLYTE_NUGGET.get());
        this.tag(ModItemTags.URANIUM_NUGGETS)
                .add(ModItems.URANIUM_NUGGET.get());
        this.tag(ModItemTags.NEPTUNIUM_NUGGETS)
                .add(ModItems.NEPTUNIUM_NUGGET.get());
        this.tag(ModItemTags.RADIUM_NUGGETS)
                .add(ModItems.RADIUM_NUGGET.get());
        this.tag(ModItemTags.PLUTONIUM_NUGGETS)
                .add(ModItems.PLUTONIUM_NUGGET.get());
        this.tag(ModItemTags.ELECTROLYTE_NUGGETS)
                .add(ModItems.ELECTROLYTE_NUGGET.get());
        this.tag(ItemTags.SAND)
                .add(ModBlocks.JUPITER_SAND.get().asItem())
                .add(ModBlocks.CERES_SAND.get().asItem())
                .add(ModBlocks.SATURN_SAND.get().asItem())
                .add(ModBlocks.PLUTO_SAND.get().asItem())
                .add(ModBlocks.B_SAND.get().asItem());
        this.tag(ItemTags.STAIRS)
                // Jupiter
                .add(ModBlocks.JUPERIUM_PLATING_STAIRS.get().asItem())
                .add(ModBlocks.JUPITER_STONE_STAIRS.get().asItem())
                .add(ModBlocks.JUPITER_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.JUPITER_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_JUPITER_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_JUPITER_STONE_STAIRS.get().asItem())

                // Ceres
                .add(ModBlocks.CERES_STONE_STAIRS.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_CERES_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_CERES_STONE_STAIRS.get().asItem())

                // Saturn
                .add(ModBlocks.SATURLYTE_PLATING_STAIRS.get().asItem())
                .add(ModBlocks.SATURN_STONE_STAIRS.get().asItem())
                .add(ModBlocks.SATURN_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.SATURN_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_SATURN_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_SATURN_STONE_STAIRS.get().asItem())

                // Uranus
                .add(ModBlocks.URANIUM_PLATING_STAIRS.get().asItem())
                .add(ModBlocks.URANUS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.URANUS_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.URANUS_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_URANUS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_URANUS_STONE_STAIRS.get().asItem())

                // Neptune
                .add(ModBlocks.NEPTUNIUM_PLATING_STAIRS.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE_STAIRS.get().asItem())
                .add(ModBlocks.NEPTUNE_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE_STAIRS.get().asItem())

                // Orcus
                .add(ModBlocks.RADIUM_PLATING_STAIRS.get().asItem())
                .add(ModBlocks.ORCUS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.ORCUS_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.ORCUS_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_ORCUS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_ORCUS_STONE_STAIRS.get().asItem())

                // Pluto
                .add(ModBlocks.PLUTONIUM_PLATING_STAIRS.get().asItem())
                .add(ModBlocks.PLUTO_STONE_STAIRS.get().asItem())
                .add(ModBlocks.PLUTO_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.PLUTO_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_PLUTO_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_PLUTO_STONE_STAIRS.get().asItem())

                // Haumea
                .add(ModBlocks.HAUMEA_STONE_STAIRS.get().asItem())
                .add(ModBlocks.HAUMEA_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.HAUMEA_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_HAUMEA_STONE_STAIRS.get().asItem())

                // Quaoar
                .add(ModBlocks.QUAOAR_STONE_STAIRS.get().asItem())
                .add(ModBlocks.QUAOAR_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.QUAOAR_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_QUAOAR_STONE_STAIRS.get().asItem())

                // Makemake
                .add(ModBlocks.MAKEMAKE_STONE_STAIRS.get().asItem())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE_STAIRS.get().asItem())

                // Gonggong
                .add(ModBlocks.GONGGONG_STONE_STAIRS.get().asItem())
                .add(ModBlocks.GONGGONG_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.GONGGONG_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_GONGGONG_STONE_STAIRS.get().asItem())

                // Eris
                .add(ModBlocks.ERIS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.ERIS_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.ERIS_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_ERIS_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_ERIS_STONE_STAIRS.get().asItem())

                // Sedna
                .add(ModBlocks.ELECTROLYTE_PLATING_STAIRS.get().asItem())
                .add(ModBlocks.SEDNA_STONE_STAIRS.get().asItem())
                .add(ModBlocks.SEDNA_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.SEDNA_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_SEDNA_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_SEDNA_STONE_STAIRS.get().asItem())

                // Proxima Centauri b
                .add(ModBlocks.B_SANDSTONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.B_STONE_STAIRS.get().asItem())
                .add(ModBlocks.B_COBBLESTONE_STAIRS.get().asItem())
                .add(ModBlocks.B_STONE_BRICK_STAIRS.get().asItem())
                .add(ModBlocks.CHISELED_B_STONE_STAIRS.get().asItem())
                .add(ModBlocks.POLISHED_B_STONE_STAIRS.get().asItem());
        this.tag(ItemTags.SLABS)
                // Jupiter
                .add(ModBlocks.JUPERIUM_PLATING_SLAB.get().asItem())
                .add(ModBlocks.JUPITER_STONE_SLAB.get().asItem())
                .add(ModBlocks.JUPITER_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.JUPITER_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_JUPITER_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_JUPITER_STONE_SLAB.get().asItem())

                // Ceres
                .add(ModBlocks.CERES_STONE_SLAB.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_CERES_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_CERES_STONE_SLAB.get().asItem())

                // Saturn
                .add(ModBlocks.SATURLYTE_PLATING_SLAB.get().asItem())
                .add(ModBlocks.SATURN_STONE_SLAB.get().asItem())
                .add(ModBlocks.SATURN_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.SATURN_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_SATURN_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_SATURN_STONE_SLAB.get().asItem())

                // Uranus
                .add(ModBlocks.URANIUM_PLATING_SLAB.get().asItem())
                .add(ModBlocks.URANUS_STONE_SLAB.get().asItem())
                .add(ModBlocks.URANUS_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.URANUS_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_URANUS_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_URANUS_STONE_SLAB.get().asItem())

                // Neptune
                .add(ModBlocks.NEPTUNIUM_PLATING_SLAB.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE_SLAB.get().asItem())
                .add(ModBlocks.NEPTUNE_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_NEPTUNE_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_NEPTUNE_STONE_SLAB.get().asItem())

                // Orcus
                .add(ModBlocks.RADIUM_PLATING_SLAB.get().asItem())
                .add(ModBlocks.ORCUS_STONE_SLAB.get().asItem())
                .add(ModBlocks.ORCUS_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.ORCUS_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_ORCUS_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_ORCUS_STONE_SLAB.get().asItem())

                // Pluto
                .add(ModBlocks.PLUTONIUM_PLATING_SLAB.get().asItem())
                .add(ModBlocks.PLUTO_STONE_SLAB.get().asItem())
                .add(ModBlocks.PLUTO_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.PLUTO_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_PLUTO_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_PLUTO_STONE_SLAB.get().asItem())

                // Haumea
                .add(ModBlocks.HAUMEA_STONE_SLAB.get().asItem())
                .add(ModBlocks.HAUMEA_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.HAUMEA_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_HAUMEA_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_HAUMEA_STONE_SLAB.get().asItem())

                // Quaoar
                .add(ModBlocks.QUAOAR_STONE_SLAB.get().asItem())
                .add(ModBlocks.QUAOAR_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.QUAOAR_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_QUAOAR_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_QUAOAR_STONE_SLAB.get().asItem())

                // Makemake
                .add(ModBlocks.MAKEMAKE_STONE_SLAB.get().asItem())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_MAKEMAKE_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_MAKEMAKE_STONE_SLAB.get().asItem())

                // Gonggong
                .add(ModBlocks.GONGGONG_STONE_SLAB.get().asItem())
                .add(ModBlocks.GONGGONG_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.GONGGONG_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_GONGGONG_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_GONGGONG_STONE_SLAB.get().asItem())

                // Eris
                .add(ModBlocks.ERIS_STONE_SLAB.get().asItem())
                .add(ModBlocks.ERIS_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.ERIS_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_ERIS_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_ERIS_STONE_SLAB.get().asItem())

                // Sedna
                .add(ModBlocks.ELECTROLYTE_PLATING_SLAB.get().asItem())
                .add(ModBlocks.SEDNA_STONE_SLAB.get().asItem())
                .add(ModBlocks.SEDNA_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.SEDNA_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_SEDNA_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_SEDNA_STONE_SLAB.get().asItem())

                // Proxima Centauri b
                .add(ModBlocks.B_SANDSTONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.B_STONE_SLAB.get().asItem())
                .add(ModBlocks.B_COBBLESTONE_SLAB.get().asItem())
                .add(ModBlocks.B_STONE_BRICK_SLAB.get().asItem())
                .add(ModBlocks.CHISELED_B_STONE_SLAB.get().asItem())
                .add(ModBlocks.POLISHED_B_STONE_SLAB.get().asItem());
        this.tag(ItemTags.WALLS)
                .add(ModBlocks.JUPITER_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.CERES_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.SATURN_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.URANUS_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.ORCUS_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.PLUTO_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.HAUMEA_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.QUAOAR_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.MAKEMAKE_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.GONGGONG_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.ERIS_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.SEDNA_STONE_BRICK_WALL.get().asItem())
                .add(ModBlocks.B_STONE_BRICK_WALL.get().asItem());
        this.tag(ItemTags.BUTTONS)
                .add(ModBlocks.JUPERIUM_PLATING_BUTTON.get().asItem())
                .add(ModBlocks.SATURLYTE_PLATING_BUTTON.get().asItem())
                .add(ModBlocks.URANIUM_PLATING_BUTTON.get().asItem())
                .add(ModBlocks.NEPTUNIUM_PLATING_BUTTON.get().asItem())
                .add(ModBlocks.RADIUM_PLATING_BUTTON.get().asItem())
                .add(ModBlocks.PLUTONIUM_PLATING_BUTTON.get().asItem())
                .add(ModBlocks.ELECTROLYTE_PLATING_BUTTON.get().asItem());
        this.tag(ItemTags.SIGNS)
                .add(ModItems.AERONOS_SIGN.get())
                .add(ModItems.STROPHAR_SIGN.get());
        this.tag(ItemTags.HANGING_SIGNS)
                .add(ModItems.GLACIAN_HANGING_SIGN.get())
                .add(ModItems.AERONOS_HANGING_SIGN.get())
                .add(ModItems.STROPHAR_HANGING_SIGN.get());
        this.tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModBlocks.JUPITER_COBBLESTONE.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE.get().asItem())
                .add(ModBlocks.SATURN_COBBLESTONE.get().asItem())
                .add(ModBlocks.URANUS_COBBLESTONE.get().asItem())
                .add(ModBlocks.NEPTUNE_COBBLESTONE.get().asItem())
                .add(ModBlocks.ORCUS_COBBLESTONE.get().asItem())
                .add(ModBlocks.PLUTO_COBBLESTONE.get().asItem())
                .add(ModBlocks.HAUMEA_COBBLESTONE.get().asItem())
                .add(ModBlocks.QUAOAR_COBBLESTONE.get().asItem())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE.get().asItem())
                .add(ModBlocks.GONGGONG_COBBLESTONE.get().asItem())
                .add(ModBlocks.ERIS_COBBLESTONE.get().asItem())
                .add(ModBlocks.SEDNA_COBBLESTONE.get().asItem())
                .add(ModBlocks.B_COBBLESTONE.get().asItem());
        this.tag(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModBlocks.JUPITER_COBBLESTONE.get().asItem())
                .add(ModBlocks.CERES_COBBLESTONE.get().asItem())
                .add(ModBlocks.SATURN_COBBLESTONE.get().asItem())
                .add(ModBlocks.URANUS_COBBLESTONE.get().asItem())
                .add(ModBlocks.NEPTUNE_COBBLESTONE.get().asItem())
                .add(ModBlocks.ORCUS_COBBLESTONE.get().asItem())
                .add(ModBlocks.PLUTO_COBBLESTONE.get().asItem())
                .add(ModBlocks.HAUMEA_COBBLESTONE.get().asItem())
                .add(ModBlocks.QUAOAR_COBBLESTONE.get().asItem())
                .add(ModBlocks.MAKEMAKE_COBBLESTONE.get().asItem())
                .add(ModBlocks.GONGGONG_COBBLESTONE.get().asItem())
                .add(ModBlocks.ERIS_COBBLESTONE.get().asItem())
                .add(ModBlocks.SEDNA_COBBLESTONE.get().asItem())
                .add(ModBlocks.B_COBBLESTONE.get().asItem());
        this.tag(Tags.Items.ORES)
                .addTag(ModItemTags.JUPERIUM_ORES)
                .addTag(ModItemTags.SATURLYTE_ORES)
                .addTag(ModItemTags.URANIUM_ORES)
                .addTag(ModItemTags.NEPTUNIUM_ORES)
                .addTag(ModItemTags.RADIUM_ORES)
                .addTag(ModItemTags.PLUTONIUM_ORES)
                .addTag(ModItemTags.ELECTROLYTE_ORES);
        this.tag(ItemTags.DIAMOND_ORES)
                .add(ModBlocks.JUPITER_DIAMOND_ORE.get().asItem())
                .add(ModBlocks.SATURN_DIAMOND_ORE.get().asItem())
                .add(ModBlocks.URANUS_DIAMOND_ORE.get().asItem())
                .add(ModBlocks.PLUTO_DIAMOND_ORE.get().asItem())
                .add(ModBlocks.B_DIAMOND_ORE.get().asItem());
        this.tag(ItemTags.COAL_ORES)
                .add(ModBlocks.JUPITER_COAL_ORE.get().asItem())
                .add(ModBlocks.SATURN_COAL_ORE.get().asItem())
                .add(ModBlocks.NEPTUNE_COAL_ORE.get().asItem());
        this.tag(ItemTags.GOLD_ORES)
                .add(ModBlocks.JUPITER_GOLD_ORE.get().asItem())
                .add(ModBlocks.SATURN_GOLD_ORE.get().asItem())
                .add(ModBlocks.PLUTO_GOLD_ORE.get().asItem());
        this.tag(ItemTags.COPPER_ORES)
                .add(ModBlocks.CERES_COPPER_ORE.get().asItem())
                .add(ModBlocks.NEPTUNE_COPPER_ORE.get().asItem())
                .add(ModBlocks.ORCUS_COPPER_ORE.get().asItem())
                .add(ModBlocks.HAUMEA_COPPER_ORE.get().asItem())
                .add(ModBlocks.QUAOAR_COPPER_ORE.get().asItem())
                .add(ModBlocks.MAKEMAKE_COPPER_ORE.get().asItem())
                .add(ModBlocks.GONGGONG_COPPER_ORE.get().asItem())
                .add(ModBlocks.ERIS_COPPER_ORE.get().asItem())
                .add(ModBlocks.SEDNA_COPPER_ORE.get().asItem());
        this.tag(ItemTags.IRON_ORES)
                .add(ModBlocks.CERES_IRON_ORE.get().asItem())
                .add(ModBlocks.URANUS_IRON_ORE.get().asItem())
                .add(ModBlocks.NEPTUNE_IRON_ORE.get().asItem())
                .add(ModBlocks.ORCUS_IRON_ORE.get().asItem())
                .add(ModBlocks.HAUMEA_IRON_ORE.get().asItem())
                .add(ModBlocks.QUAOAR_IRON_ORE.get().asItem())
                .add(ModBlocks.MAKEMAKE_IRON_ORE.get().asItem())
                .add(ModBlocks.GONGGONG_IRON_ORE.get().asItem())
                .add(ModBlocks.ERIS_IRON_ORE.get().asItem())
                .add(ModBlocks.SEDNA_IRON_ORE.get().asItem())
                .add(ModBlocks.B_IRON_ORE.get().asItem());
        this.tag(ItemTags.LAPIS_ORES)
                .add(ModBlocks.URANUS_LAPIS_ORE.get().asItem());
        this.tag(ItemTags.EMERALD_ORES)
                .add(ModBlocks.B_EMERALD_ORE.get().asItem());
        this.tag(ItemTags.REDSTONE_ORES)
                .add(ModBlocks.B_REDSTONE_ORE.get().asItem());
        this.tag(ModItemTags.JUPERIUM_ORES)
                .add(ModBlocks.JUPITER_JUPERIUM_ORE.get().asItem());
        this.tag(ModItemTags.ICE_SHARD_ORES)
                .add(ModBlocks.URANUS_ICE_SHARD_ORE.get().asItem())
                .add(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get().asItem())
                .add(ModBlocks.PLUTO_ICE_SHARD_ORE.get().asItem());
        this.tag(ModItemTags.SATURLYTE_ORES)
                .add(ModBlocks.SATURN_SATURLYTE_ORE.get().asItem());
        this.tag(ModItemTags.URANIUM_ORES)
                .add(ModBlocks.URANUS_URANIUM_ORE.get().asItem());
        this.tag(ModItemTags.NEPTUNIUM_ORES)
                .add(ModBlocks.NEPTUNE_NEPTUNIUM_ORE.get().asItem());
        this.tag(ModItemTags.RADIUM_ORES)
                .add(ModBlocks.ORCUS_RADIUM_ORE.get().asItem());
        this.tag(ModItemTags.PLUTONIUM_ORES)
                .add(ModBlocks.PLUTO_PLUTONIUM_ORE.get().asItem());
        this.tag(ModItemTags.ELECTROLYTE_ORES)
                .add(ModBlocks.SEDNA_ELECTROLYTE_ORE.get().asItem());
        this.tag(Tags.Items.STONE)
                .add(ModBlocks.CERES_STONE.get().asItem())
                .add(ModBlocks.JUPITER_STONE.get().asItem())
                .add(ModBlocks.SATURN_STONE.get().asItem())
                .add(ModBlocks.URANUS_STONE.get().asItem())
                .add(ModBlocks.NEPTUNE_STONE.get().asItem())
                .add(ModBlocks.ORCUS_STONE.get().asItem())
                .add(ModBlocks.PLUTO_STONE.get().asItem())
                .add(ModBlocks.HAUMEA_STONE.get().asItem())
                .add(ModBlocks.QUAOAR_STONE.get().asItem())
                .add(ModBlocks.MAKEMAKE_STONE.get().asItem())
                .add(ModBlocks.GONGGONG_STONE.get().asItem())
                .add(ModBlocks.ERIS_STONE.get().asItem())
                .add(ModBlocks.SEDNA_STONE.get().asItem())
                .add(ModBlocks.B_STONE.get().asItem());
        this.tag(Tags.Items.SANDSTONE)
                .add(ModBlocks.B_SANDSTONE.get().asItem());
        this.tag(ItemTags.SAPLINGS)
                .add(ModBlocks.GLACIAN_SAPLING.get().asItem());
        this.tag(ItemTags.DOORS)
                .add(ModBlocks.JUPERIUM_SLIDING_DOOR.get().asItem())
                .add(ModBlocks.SATURLYTE_SLIDING_DOOR.get().asItem())
                .add(ModBlocks.URANIUM_SLIDING_DOOR.get().asItem())
                .add(ModBlocks.NEPTUNIUM_SLIDING_DOOR.get().asItem())
                .add(ModBlocks.RADIUM_SLIDING_DOOR.get().asItem())
                .add(ModBlocks.PLUTONIUM_SLIDING_DOOR.get().asItem())
                .add(ModBlocks.ELECTROLYTE_SLIDING_DOOR.get().asItem());
        this.tag(ItemTags.BOATS)
                .add(ModItems.GLACIAN_BOAT.get());
        this.tag(ItemTags.CHEST_BOATS)
                .add(ModItems.GLACIAN_CHEST_BOAT.get());
        this.tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(ModItemTags.JUPERIUM_INGOTS)
                .addTag(ModItemTags.SATURLYTE_INGOTS)
                .addTag(ModItemTags.URANIUM_INGOTS)
                .addTag(ModItemTags.NEPTUNIUM_INGOTS)
                .addTag(ModItemTags.RADIUM_INGOTS)
                .addTag(ModItemTags.PLUTONIUM_INGOTS)
                .addTag(ModItemTags.ELECTROLYTE_INGOTS);
        this.tag(ItemTags.PIGLIN_LOVED)
                .add(ModBlocks.JUPITER_GOLD_ORE.get().asItem())
                .add(ModBlocks.SATURN_GOLD_ORE.get().asItem())
                .add(ModBlocks.PLUTO_GOLD_ORE.get().asItem());
        this.tag(ModItemTags.GLACIAN_LOGS)
                .add(ModBlocks.GLACIAN_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_GLACIAN_WOOD.get().asItem());
    }
}
