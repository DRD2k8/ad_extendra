package com.drd.ad_extendra.datagen.provider.server.tags;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.drd.ad_extendra.common.registry.ModItems;
import com.drd.ad_extendra.common.utils.tags.ModItemTags;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
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

        ModBlocks.STAIRS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.STAIRS).add(TagEntry.element(BuiltInRegistries.BLOCK.getKey(b))));
        ModBlocks.SLABS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.SLABS).add(TagEntry.element(BuiltInRegistries.BLOCK.getKey(b))));
        ModBlocks.BUTTONS.stream().map(RegistryEntry::get).forEach(b -> tag(ItemTags.BUTTONS).add(TagEntry.element(BuiltInRegistries.BLOCK.getKey(b))));

        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(element(ModItems.JUPERIUM_INGOT.get()));
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
