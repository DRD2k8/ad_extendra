package com.drd.ad_extendra.common.utils.tags;

import com.drd.ad_extendra.common.AdExtendra;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    // Jupiter
    public static final TagKey<Block> JUPERIUM_BLOCKS = tag("juperium_blocks");
    public static final TagKey<Block> RAW_JUPERIUM_BLOCKS = tag("raw_juperium_blocks");
    public static final TagKey<Block> JUPERIUM_ORES = tag("juperium_ores");

    // Saturn
    public static final TagKey<Block> SATURLYTE_BLOCKS = tag("saturlyte_blocks");
    public static final TagKey<Block> RAW_SATURLYTE_BLOCKS = tag("raw_saturlyte_blocks");
    public static final TagKey<Block> SATURLYTE_ORES = tag("saturlyte_ores");

    // Uranus
    public static final TagKey<Block> URANIUM_BLOCKS = tag("uranium_blocks");
    public static final TagKey<Block> RAW_URANIUM_BLOCKS = tag("raw_uranium_blocks");
    public static final TagKey<Block> URANIUM_ORES = tag("uranium_ores");

    // Neptune
    public static final TagKey<Block> NEPTUNIUM_BLOCKS = tag("neptunium_blocks");
    public static final TagKey<Block> RAW_NEPTUNIUM_BLOCKS = tag("raw_neptunium_blocks");
    public static final TagKey<Block> NEPTUNIUM_ORES = tag("neptunium_ores");

    // Orcus
    public static final TagKey<Block> RADIUM_BLOCKS = tag("radium_blocks");
    public static final TagKey<Block> RAW_RADIUM_BLOCKS = tag("raw_radium_blocks");
    public static final TagKey<Block> RADIUM_ORES = tag("radium_ores");

    // Pluto
    public static final TagKey<Block> PLUTONIUM_BLOCKS = tag("plutonium_blocks");
    public static final TagKey<Block> RAW_PLUTONIUM_BLOCKS = tag("raw_plutonium_blocks");
    public static final TagKey<Block> PLUTONIUM_ORES = tag("plutonium_ores");

    // Sedna
    public static final TagKey<Block> ELECTROLYTE_BLOCKS =  tag("electrolyte_blocks");
    public static final TagKey<Block> RAW_ELECTROLYTE_BLOCKS = tag("raw_electrolyte_blocks");
    public static final TagKey<Block> ELECTROLYTE_ORES =  tag("electrolyte_ores");

    private static TagKey<Block> tag(String name) {
        return TagKey.create(Registries.BLOCK, new ResourceLocation(AdExtendra.MOD_ID, name));
    }
}
