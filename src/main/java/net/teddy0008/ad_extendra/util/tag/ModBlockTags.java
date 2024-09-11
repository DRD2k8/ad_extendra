package net.teddy0008.ad_extendra.util.tag;

import earth.terrarium.ad_astra.AdAstra;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> JUPERIUM_BLOCKS = tag("forge", "storage_blocks/juperium");
    public static final TagKey<Block> RAW_JUPERIUM_BLOCKS = tag("forge", "storage_blocks/raw_juperium");
    public static final TagKey<Block> JUPERIUM_ORES = tag("forge", "ores/juperium");
    public static final TagKey<Block> SATURLYTE_BLOCKS = tag("forge", "storage_blocks/saturlyte");
    public static final TagKey<Block> RAW_SATURLYTE_BLOCKS = tag("forge", "storage_blocks/raw_saturlyte");
    public static final TagKey<Block> SATURLYTE_ORES = tag("forge", "ores/saturlyte");
    public static final TagKey<Block> ICE_SHARD_ORES = tag("forge", "ores/ice_shard");
    public static final TagKey<Block> URANIUM_BLOCKS = tag("forge", "storage_blocks/uranium");
    public static final TagKey<Block> RAW_URANIUM_BLOCKS = tag("forge", "storage_blocks/raw_uranium");
    public static final TagKey<Block> URANIUM_ORES = tag("forge", "ores/uranium");
    public static final TagKey<Block> NEPTUNIUM_BLOCKS = tag("forge", "storage_blocks/neptunium");
    public static final TagKey<Block> RAW_NEPTUNIUM_BLOCKS = tag("forge", "storage_blocks/raw_neptunium");
    public static final TagKey<Block> NEPTUNIUM_ORES = tag("forge", "ores/neptunium");
    public static final TagKey<Block> RADIUM_BLOCKS = tag("forge", "storage_blocks/radium");
    public static final TagKey<Block> RAW_RADIUM_BLOCKS = tag("forge", "storage_blocks/raw_radium");
    public static final TagKey<Block> RADIUM_ORES = tag("forge", "ores/radium");
    public static final TagKey<Block> PLUTONIUM_BLOCKS = tag("forge", "storage_blocks/plutonium");
    public static final TagKey<Block> RAW_PLUTONIUM_BLOCKS = tag("forge", "storage_blocks/raw_plutonium");
    public static final TagKey<Block> PLUTONIUM_ORES = tag("forge", "ores/plutonium");
    public static final TagKey<Block> ELECTROLYTE_BLOCKS = tag("forge", "storage_blocks/electrolyte");
    public static final TagKey<Block> RAW_ELECTROLYTE_BLOCKS = tag("forge", "storage_blocks/raw_electrolyte");
    public static final TagKey<Block> ELECTROLYTE_ORES = tag("forge", "ores/electrolyte");
    public static final TagKey<Block> GLACIAN_LOGS = tag(AdAstra.MOD_ID, "glacian_logs");

    private static TagKey<Block> tag(String modid, String name) {
        return BlockTags.create(new ResourceLocation(modid, name));
    }
}
