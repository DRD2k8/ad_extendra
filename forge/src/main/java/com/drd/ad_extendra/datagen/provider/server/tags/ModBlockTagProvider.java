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
    private static final List<Supplier<Block>> MINEABLE_WITH_SHOVEL = List.of();

    private static final List<Supplier<Block>> MINEABLE_WITH_AXE = List.of();

    private static final List<Supplier<Block>> NOT_MINED_WITH_PICKAXE = List.of();

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AdExtendra.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        add(ModBlockTags.JUPERIUM_BLOCKS, ModBlocks.JUPERIUM_BLOCK.get(), "juperium_blocks", "storage_blocks/juperium");
        add(ModBlockTags.RAW_JUPERIUM_BLOCKS, ModBlocks.RAW_JUPERIUM_BLOCK.get(), "raw_juperium_blocks", "storage_blocks/raw_juperium");

        ModBlocks.STAIRS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.STAIRS).add(element(b)));
        ModBlocks.SLABS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.SLABS).add(element(b)));
        ModBlocks.PRESSURE_PLATES.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.PRESSURE_PLATES).add(element(b)));
        ModBlocks.BUTTONS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.BUTTONS).add(element(b)));
        ModBlocks.SLIDING_DOORS.stream().map(RegistryEntry::get).forEach(b -> tag(BlockTags.NEEDS_IRON_TOOL).add(element(b)));

        tag(BlockTags.BEACON_BASE_BLOCKS).add(element(ModBlocks.JUPERIUM_BLOCK.get()));

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
