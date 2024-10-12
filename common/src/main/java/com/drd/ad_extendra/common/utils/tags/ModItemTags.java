package com.drd.ad_extendra.common.utils.tags;

import com.drd.ad_extendra.common.AdExtendra;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    // Jupiter
    public static final TagKey<Item> JUPERIUM_INGOTS = tag("juperium_ingots");
    public static final TagKey<Item> JUPERIUM_NUGGETS = tag("juperium_nuggets");
    public static final TagKey<Item> JUPERIUM_PLATES = tag("juperium_plates");
    public static final TagKey<Item> RAW_JUPERIUM = tag("raw_juperium");
    public static final TagKey<Item> JUPERIUM_BLOCKS = tag("juperium_blocks");
    public static final TagKey<Item> RAW_JUPERIUM_BLOCKS = tag("raw_juperium_blocks");
    public static final TagKey<Item> JUPERIUM_ORES = tag("juperium_ores");

    // Saturn
    public static final TagKey<Item> SATURLYTE_INGOTS = tag("saturlyte_ingots");
    public static final TagKey<Item> SATURLYTE_NUGGETS = tag("saturlyte_nuggets");
    public static final TagKey<Item> SATURLYTE_PLATES = tag("saturlyte_plates");
    public static final TagKey<Item> RAW_SATURLYTE = tag("raw_saturlyte");
    public static final TagKey<Item> SATURLYTE_BLOCKS = tag("saturlyte_blocks");
    public static final TagKey<Item> RAW_SATURLYTE_BLOCKS = tag("raw_saturlyte_blocks");
    public static final TagKey<Item> SATURLYTE_ORES = tag("saturlyte_ores");

    // Uranus
    public static final TagKey<Item> URANIUM_INGOTS = tag("uranium_ingots");
    public static final TagKey<Item> URANIUM_NUGGETS = tag("uranium_nuggets");
    public static final TagKey<Item> URANIUM_PLATES = tag("uranium_plates");
    public static final TagKey<Item> RAW_URANIUM = tag("raw_uranium");
    public static final TagKey<Item> URANIUM_BLOCKS = tag("uranium_blocks");
    public static final TagKey<Item> RAW_URANIUM_BLOCKS = tag("raw_uranium_blocks");
    public static final TagKey<Item> URANIUM_ORES = tag("uranium_ores");

    // Neptune
    public static final TagKey<Item> NEPTUNIUM_INGOTS = tag("neptunium_ingots");
    public static final TagKey<Item> NEPTUNIUM_NUGGETS = tag("neptunium_nuggets");
    public static final TagKey<Item> NEPTUNIUM_PLATES = tag("neptunium_plates");
    public static final TagKey<Item> RAW_NEPTUNIUM = tag("raw_neptunium");
    public static final TagKey<Item> NEPTUNIUM_BLOCKS = tag("neptunium_blocks");
    public static final TagKey<Item> RAW_NEPTUNIUM_BLOCKS = tag("raw_neptunium_blocks");
    public static final TagKey<Item> NEPTUNIUM_ORES = tag("neptunium_ores");

    // Orcus
    public static final TagKey<Item> RADIUM_INGOTS = tag("radium_ingots");
    public static final TagKey<Item> RADIUM_NUGGETS = tag("radium_nuggets");
    public static final TagKey<Item> RADIUM_PLATES = tag("radium_plates");
    public static final TagKey<Item> RAW_RADIUM = tag("raw_radium");
    public static final TagKey<Item> RADIUM_BLOCKS = tag("radium_blocks");
    public static final TagKey<Item> RAW_RADIUM_BLOCKS = tag("raw_radium_blocks");
    public static final TagKey<Item> RADIUM_ORES = tag("radium_ores");

    // Pluto
    public static final TagKey<Item> PLUTONIUM_INGOTS = tag("plutonium_ingots");
    public static final TagKey<Item> PLUTONIUM_NUGGETS = tag("plutonium_nuggets");
    public static final TagKey<Item> PLUTONIUM_PLATES = tag("plutonium_plates");
    public static final TagKey<Item> RAW_PLUTONIUM = tag("raw_plutonium");
    public static final TagKey<Item> PLUTONIUM_BLOCKS = tag("plutonium_blocks");
    public static final TagKey<Item> RAW_PLUTONIUM_BLOCKS = tag("raw_plutonium_blocks");
    public static final TagKey<Item> PLUTONIUM_ORES = tag("plutonium_ores");

    // Sedna
    public static final TagKey<Item> ELECTROLYTE_INGOTS =  tag("electrolyte_ingots");
    public static final TagKey<Item> ELECTROLYTE_NUGGETS =  tag("electrolyte_nuggets");
    public static final TagKey<Item> ELECTROLYTE_PLATES =  tag("electrolyte_plates");
    public static final TagKey<Item> RAW_ELECTROLYTE = tag("raw_electrolyte");
    public static final TagKey<Item> ELECTROLYTE_BLOCKS =  tag("electrolyte_blocks");
    public static final TagKey<Item> RAW_ELECTROLYTE_BLOCKS = tag("raw_electrolyte_blocks");
    public static final TagKey<Item> ELECTROLYTE_ORES =  tag("electrolyte_ores");

    private static TagKey<Item> tag(String name) {
        return TagKey.create(Registries.ITEM, new ResourceLocation(AdExtendra.MOD_ID, name));
    }
}
