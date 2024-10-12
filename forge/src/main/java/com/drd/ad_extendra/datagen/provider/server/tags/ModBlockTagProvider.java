package com.drd.ad_extendra.datagen.provider.server.tags;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.drd.ad_extendra.common.utils.tags.ModBlockTags;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ModBlockTagProvider extends BlockTagsProvider {
    private static final List<Supplier<Block>> MINEABLE_WITH_SHOVEL = List.of(
            ModBlocks.CERES_SAND,
            ModBlocks.JUPITER_SAND,
            ModBlocks.SATURN_SAND,
            ModBlocks.PLUTO_SAND,
            ModBlocks.B_SAND
    );

    private static final List<Supplier<Block>> MINEABLE_WITH_AXE = List.of();

    private static final List<Supplier<Block>> NOT_MINED_WITH_PICKAXE = List.of();

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AdExtendra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        add(ModBlockTags.JUPERIUM_BLOCKS, ModBlocks.JUPERIUM_BLOCK.get(), "juperium_blocks", "storage_blocks/juperium");
        add(ModBlockTags.RAW_JUPERIUM_BLOCKS, ModBlocks.RAW_JUPERIUM_BLOCK.get(), "raw_juperium_blocks", "storage_blocks/raw_juperium");
        add(ModBlockTags.SATURLYTE_BLOCKS, ModBlocks.SATURLYTE_BLOCK.get(), "saturlyte_blocks", "storage_blocks/saturlyte");
        add(ModBlockTags.RAW_SATURLYTE_BLOCKS, ModBlocks.RAW_SATURLYTE_BLOCK.get(), "raw_saturlyte_blocks", "storage_blocks/raw_saturlyte");
        add(ModBlockTags.URANIUM_BLOCKS, ModBlocks.URANIUM_BLOCK.get(), "uranium_blocks", "storage_blocks/uranium");
        add(ModBlockTags.RAW_URANIUM_BLOCKS, ModBlocks.RAW_URANIUM_BLOCK.get(), "raw_uranium_blocks", "storage_blocks/raw_uranium");
        add(ModBlockTags.NEPTUNIUM_BLOCKS, ModBlocks.NEPTUNIUM_BLOCK.get(), "neptunium_blocks", "storage_blocks/neptunium");
        add(ModBlockTags.RAW_NEPTUNIUM_BLOCKS, ModBlocks.RAW_NEPTUNIUM_BLOCK.get(), "raw_neptunium_blocks", "storage_blocks/raw_neptunium");
        add(ModBlockTags.RADIUM_BLOCKS, ModBlocks.RADIUM_BLOCK.get(), "radium_blocks", "storage_blocks/radium");
        add(ModBlockTags.RAW_RADIUM_BLOCKS, ModBlocks.RAW_RADIUM_BLOCK.get(), "raw_radium_blocks", "storage_blocks/raw_radium");
        add(ModBlockTags.PLUTONIUM_BLOCKS, ModBlocks.PLUTONIUM_BLOCK.get(), "plutonium_blocks", "storage_blocks/plutonium");
        add(ModBlockTags.RAW_PLUTONIUM_BLOCKS, ModBlocks.RAW_PLUTONIUM_BLOCK.get(), "raw_plutonium_blocks", "storage_blocks/raw_plutonium");
        add(ModBlockTags.ELECTROLYTE_BLOCKS, ModBlocks.ELECTROLYTE_BLOCK.get(), "electrolyte_blocks", "storage_blocks/electrolyte");
        add(ModBlockTags.RAW_ELECTROLYTE_BLOCKS, ModBlocks.RAW_ELECTROLYTE_BLOCK.get(), "raw_electrolyte_blocks", "storage_blocks/raw_electrolyte");

        ModBlocks.STAIRS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.STAIRS).add(element(b)));
        ModBlocks.SLABS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.SLABS).add(element(b)));
        ModBlocks.WALLS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.WALLS).add(element(b)));
        ModBlocks.PRESSURE_PLATES.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.PRESSURE_PLATES).add(element(b)));
        ModBlocks.BUTTONS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.BUTTONS).add(element(b)));
        ModBlocks.SLIDING_DOORS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.NEEDS_IRON_TOOL).add(element(b)));

        tag(BlockTags.BEACON_BASE_BLOCKS).add(element(ModBlocks.JUPERIUM_BLOCK.get()));
        tag(BlockTags.BEACON_BASE_BLOCKS).add(element(ModBlocks.SATURLYTE_BLOCK.get()));
        tag(BlockTags.BEACON_BASE_BLOCKS).add(element(ModBlocks.URANIUM_BLOCK.get()));
        tag(BlockTags.BEACON_BASE_BLOCKS).add(element(ModBlocks.NEPTUNIUM_BLOCK.get()));
        tag(BlockTags.BEACON_BASE_BLOCKS).add(element(ModBlocks.RADIUM_BLOCK.get()));
        tag(BlockTags.BEACON_BASE_BLOCKS).add(element(ModBlocks.PLUTONIUM_BLOCK.get()));
        tag(BlockTags.BEACON_BASE_BLOCKS).add(element(ModBlocks.ELECTROLYTE_BLOCK.get()));

        tag(BlockTags.SAND).add(element(ModBlocks.CERES_SAND.get()));
        tag(BlockTags.SAND).add(element(ModBlocks.JUPITER_SAND.get()));
        tag(BlockTags.SAND).add(element(ModBlocks.SATURN_SAND.get()));
        tag(BlockTags.SAND).add(element(ModBlocks.PLUTO_SAND.get()));
        tag(BlockTags.SAND).add(element(ModBlocks.B_SAND.get()));

        tag(BlockTags.SMELTS_TO_GLASS).add(element(ModBlocks.CERES_SAND.get()));
        tag(BlockTags.SMELTS_TO_GLASS).add(element(ModBlocks.JUPITER_SAND.get()));
        tag(BlockTags.SMELTS_TO_GLASS).add(element(ModBlocks.SATURN_SAND.get()));
        tag(BlockTags.SMELTS_TO_GLASS).add(element(ModBlocks.PLUTO_SAND.get()));
        tag(BlockTags.SMELTS_TO_GLASS).add(element(ModBlocks.B_SAND.get()));

        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CERES_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_CERES_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_CERES_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.JUPITER_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_JUPITER_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_JUPITER_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.SATURN_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_SATURN_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_SATURN_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.URANUS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_URANUS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_URANUS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.NEPTUNE_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_NEPTUNE_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_NEPTUNE_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.ORCUS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_ORCUS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_ORCUS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.PLUTO_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_PLUTO_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_PLUTO_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.HAUMEA_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_HAUMEA_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_HAUMEA_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.QUAOAR_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_QUAOAR_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_QUAOAR_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.MAKEMAKE_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_MAKEMAKE_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_MAKEMAKE_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.GONGGONG_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_GONGGONG_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_GONGGONG_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.ERIS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_ERIS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_ERIS_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.SEDNA_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_SEDNA_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_SEDNA_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.B_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CRACKED_B_STONE_BRICKS.get()));
        tag(BlockTags.STONE_BRICKS).add(element(ModBlocks.CHISELED_B_STONE_BRICKS.get()));

        MINEABLE_WITH_SHOVEL.stream().map(Supplier::get).forEach(b -> tag(BlockTags.MINEABLE_WITH_SHOVEL).add(element(b)));

        ModBlocks.BLOCKS.stream()
                .filter(b -> !MINEABLE_WITH_SHOVEL.contains(b) && !MINEABLE_WITH_AXE.contains(b) && !NOT_MINED_WITH_PICKAXE.contains(b))
                .map(RegistryEntry::get)
                .forEach(b -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(element(b)));
    }

    private void add(TagKey<Block> tag, Block block) {
        tag(tag).add(element(block));
    }

    private void add(TagKey<Block> tag, Block item, String fabricCommonTag, String forgeCommonTag) {
        add(tag, item);
        addFabricTag(item, tag, fabricCommonTag);
        addForgeTag(item, tag, forgeCommonTag);
    }

    private void addFabricTag(Block item, TagKey<Block> tag, String fabricCommonTag) {
        tag(tag).add(TagEntry.optionalTag(new ResourceLocation("c", fabricCommonTag)));

        var commonTag = TagKey.create(Registries.BLOCK, new ResourceLocation("c", fabricCommonTag));
        tag(commonTag).add(element(item));
    }

    private void addForgeTag(Block item, TagKey<Block> tag, String forgeCommonTag) {
        tag(tag).add(TagEntry.optionalTag(new ResourceLocation("forge", forgeCommonTag)));

        var commonTag = TagKey.create(Registries.BLOCK, new ResourceLocation("forge", forgeCommonTag));
        tag(commonTag).add(element(item));

        var folderTag = TagKey.create(Registries.BLOCK, new ResourceLocation("forge", forgeCommonTag.split("/")[0]));
        tag(folderTag).add(TagEntry.tag(commonTag.location()));
    }

    private static TagEntry element(Block block) {
        return TagEntry.element(loc(block));
    }

    private static ResourceLocation loc(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
}
