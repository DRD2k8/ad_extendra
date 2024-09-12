package com.drd.ad_extendra.block;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.block.door.CustomSlidingDoorBlock;
import com.drd.ad_extendra.block.globe.CustomGlobeBlock;
import com.drd.ad_extendra.item.ModItems;
import com.drd.ad_extendra.item.globe.GlobeItem;
import com.drd.ad_extendra.util.texture.ModSignTextures;
import com.drd.ad_extendra.world.gen.ModTreeConfiguredFeatures;
import com.drd.ad_extendra.world.gen.tree.GlacianTreeGrower;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Supplier;

public class ModBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, Main.MOD_ID);
    public static final ResourcefulRegistry<Block> BASIC_BLOCKS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> POTTED_BLOCKS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> SIGNS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> STANDING_SIGNS = ResourcefulRegistries.create(SIGNS);
    public static final ResourcefulRegistry<Block> WALL_SIGNS = ResourcefulRegistries.create(SIGNS);
    public static final ResourcefulRegistry<Block> HANGING_SIGNS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> CEILING_HANGING_SIGNS = ResourcefulRegistries.create(HANGING_SIGNS);
    public static final ResourcefulRegistry<Block> WALL_HANGING_SIGNS = ResourcefulRegistries.create(HANGING_SIGNS);
    public static final ResourcefulRegistry<Block> SLIDING_DOORS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> GLOBES = ResourcefulRegistries.create(BLOCKS);

    // Signs (They have to be at the top to avoid crashes)
    public static final RegistryEntry<TerraformSignBlock> AERONOS_SIGN = STANDING_SIGNS.register("aeronos_sign",
            () -> new TerraformSignBlock(ModSignTextures.AERONOS_SIGN_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_SIGN)));
    public static final RegistryEntry<TerraformWallSignBlock> AERONOS_WALL_SIGN = WALL_SIGNS.register("aeronos_wall_sign",
            () -> new TerraformWallSignBlock(ModSignTextures.AERONOS_SIGN_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_SIGN)));
    public static final RegistryEntry<TerraformHangingSignBlock> AERONOS_HANGING_SIGN = CEILING_HANGING_SIGNS.register("aeronos_hanging_sign",
            () -> new TerraformHangingSignBlock(ModSignTextures.AERONOS_HANGING_SIGN_TEXTURE, ModSignTextures.AERONOS_HANGING_SIGN_GUI_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_HANGING_SIGN)));
    public static final RegistryEntry<TerraformWallHangingSignBlock> AERONOS_WALL_HANGING_SIGN = WALL_HANGING_SIGNS.register("aeronos_wall_hanging_sign",
            () -> new TerraformWallHangingSignBlock(ModSignTextures.AERONOS_HANGING_SIGN_TEXTURE, ModSignTextures.AERONOS_HANGING_SIGN_GUI_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_HANGING_SIGN)));
    public static final RegistryEntry<TerraformSignBlock> STROPHAR_SIGN = STANDING_SIGNS.register("strophar_sign",
            () -> new TerraformSignBlock(ModSignTextures.STROPHAR_SIGN_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_SIGN)));
    public static final RegistryEntry<TerraformWallSignBlock> STROPHAR_WALL_SIGN = WALL_SIGNS.register("strophar_wall_sign",
            () -> new TerraformWallSignBlock(ModSignTextures.STROPHAR_SIGN_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_SIGN)));
    public static final RegistryEntry<TerraformHangingSignBlock> STROPHAR_HANGING_SIGN = CEILING_HANGING_SIGNS.register("strophar_hanging_sign",
            () -> new TerraformHangingSignBlock(ModSignTextures.STROPHAR_HANGING_SIGN_TEXTURE, ModSignTextures.STROPHAR_HANGING_SIGN_GUI_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_HANGING_SIGN)));
    public static final RegistryEntry<TerraformWallHangingSignBlock> STROPHAR_WALL_HANGING_SIGN = WALL_HANGING_SIGNS.register("strophar_wall_hanging_sign",
            () -> new TerraformWallHangingSignBlock(ModSignTextures.STROPHAR_HANGING_SIGN_TEXTURE, ModSignTextures.STROPHAR_HANGING_SIGN_GUI_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_HANGING_SIGN)));
    public static final RegistryEntry<TerraformHangingSignBlock> GLACIAN_HANGING_SIGN = CEILING_HANGING_SIGNS.register("glacian_hanging_sign",
            () -> new TerraformHangingSignBlock(ModSignTextures.GLACIAN_HANGING_SIGN_TEXTURE, ModSignTextures.GLACIAN_HANGING_SIGN_GUI_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN)));
    public static final RegistryEntry<TerraformWallHangingSignBlock> GLACIAN_WALL_HANGING_SIGN = WALL_HANGING_SIGNS.register("glacian_wall_hanging_sign",
            () -> new TerraformWallHangingSignBlock(ModSignTextures.GLACIAN_HANGING_SIGN_TEXTURE, ModSignTextures.GLACIAN_HANGING_SIGN_GUI_TEXTURE,
                    BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN)));

    // Moon
    public static final RegistryEntry<MoonMyceliumBlock> MOON_MYCELIUM = registerBlock("moon_mycelium",
            () -> new MoonMyceliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).lightLevel((state) -> {
                return 6;
            })));
    public static final RegistryEntry<MushroomBlock> AERONOS_MUSHROOM = registerBlock("aeronos_mushroom",
            () -> new MushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).sound(SoundType.STEM).lightLevel((state) -> {
                return 6;
            }), ModTreeConfiguredFeatures.AERONOS_KEY));
    public static final RegistryEntry<FlowerPotBlock> POTTED_AERONOS_MUSHROOM = POTTED_BLOCKS.register("potted_aeronos_mushroom",
            () -> new FlowerPotBlock(AERONOS_MUSHROOM.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryEntry<ButtonBlock> AERONOS_BUTTON = registerBlock("aeronos_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_BUTTON), BlockSetType.CRIMSON, 30, true));
    public static final RegistryEntry<PressurePlateBlock> AERONOS_PRESSURE_PLATE = registerBlock("aeronos_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRIMSON_PRESSURE_PLATE).friction(0.5f), BlockSetType.CRIMSON));
    public static final RegistryEntry<MushroomBlock> STROPHAR_MUSHROOM = registerBlock("strophar_mushroom",
            () -> new MushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM).sound(SoundType.STEM).lightLevel((state) -> {
                return 6;
            }), ModTreeConfiguredFeatures.STROPHAR_KEY));
    public static final RegistryEntry<FlowerPotBlock> POTTED_STROPHAR_MUSHROOM = BLOCKS.register("potted_strophar_mushroom",
            () -> new FlowerPotBlock(STROPHAR_MUSHROOM.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryEntry<ButtonBlock> STROPHAR_BUTTON = registerBlock("strophar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_BUTTON), BlockSetType.CRIMSON, 30, true));
    public static final RegistryEntry<PressurePlateBlock> STROPHAR_PRESSURE_PLATE = registerBlock("strophar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.CRIMSON_PRESSURE_PLATE).friction(0.5f), BlockSetType.CRIMSON));

    // Ceres
    public static final RegistryEntry<Block> CERES_COPPER_ORE = registerBlock("ceres_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryEntry<Block> CERES_IRON_ORE = registerBlock("ceres_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryEntry<SandBlock> CERES_SAND = registerBlock("ceres_sand", () -> new SandBlock(6974058, BlockBehaviour.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE)));
    public static final RegistryEntry<Block> CERES_STONE = registerBlock("ceres_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryEntry<StairBlock> CERES_STONE_STAIRS = registerBlock("ceres_stone_stairs", () -> new StairBlock(((Block)CERES_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryEntry<SlabBlock> CERES_STONE_SLAB = registerBlock("ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryEntry<Block> CERES_COBBLESTONE = registerBlock("ceres_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryEntry<StairBlock> CERES_COBBLESTONE_STAIRS = registerBlock("ceres_cobblestone_stairs", () -> new StairBlock(((Block)CERES_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryEntry<SlabBlock> CERES_COBBLESTONE_SLAB = registerBlock("ceres_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryEntry<Block> CERES_STONE_BRICKS = registerBlock("ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryEntry<StairBlock> CERES_STONE_BRICK_STAIRS = registerBlock("ceres_stone_brick_stairs", () -> new StairBlock(((Block)CERES_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryEntry<SlabBlock> CERES_STONE_BRICK_SLAB = registerBlock("ceres_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryEntry<WallBlock> CERES_STONE_BRICK_WALL = registerBlock("ceres_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryEntry<Block> CRACKED_CERES_STONE_BRICKS = registerBlock("cracked_ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryEntry<Block> CHISELED_CERES_STONE_BRICKS = registerBlock("chiseled_ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryEntry<StairBlock> CHISELED_CERES_STONE_STAIRS = registerBlock("chiseled_ceres_stone_stairs", () -> new StairBlock(((Block)CHISELED_CERES_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryEntry<SlabBlock> CHISELED_CERES_STONE_SLAB = registerBlock("chiseled_ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryEntry<Block> POLISHED_CERES_STONE = registerBlock("polished_ceres_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryEntry<StairBlock> POLISHED_CERES_STONE_STAIRS = registerBlock("polished_ceres_stone_stairs", () -> new StairBlock(((Block)POLISHED_CERES_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryEntry<SlabBlock> POLISHED_CERES_STONE_SLAB = registerBlock("polished_ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryEntry<RotatedPillarBlock> CERES_PILLAR = registerBlock("ceres_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Jupiter
    public static final RegistryEntry<Block> JUPERIUM_BLOCK = registerBlock("juperium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryEntry<Block> RAW_JUPERIUM_BLOCK = registerBlock("raw_juperium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.DIAMOND)));
    public static final RegistryEntry<Block> JUPERIUM_PLATING = registerBlock("juperium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.DIAMOND)));
    public static final RegistryEntry<StairBlock> JUPERIUM_PLATING_STAIRS = registerBlock("juperium_plating_stairs", () -> new StairBlock(((Block)JUPERIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.DIAMOND)));
    public static final RegistryEntry<SlabBlock> JUPERIUM_PLATING_SLAB = registerBlock("juperium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.DIAMOND)));
    public static final RegistryEntry<RotatedPillarBlock> JUPERIUM_PILLAR = registerBlock("juperium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.DIAMOND)));
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_JUPERIUM_PILLAR = registerBlock("glowing_juperium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.DIAMOND)));
    public static final RegistryEntry<ButtonBlock> JUPERIUM_PLATING_BUTTON = registerBlock("juperium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.DIAMOND), BlockSetType.IRON, 20, false));
    public static final RegistryEntry<PressurePlateBlock> JUPERIUM_PLATING_PRESSURE_PLATE = registerBlock("juperium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.DIAMOND), BlockSetType.IRON));
    public static final RegistryEntry<Block> JUPITER_JUPERIUM_ORE = registerBlock("jupiter_juperium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<Block> JUPITER_COAL_ORE = registerBlock("jupiter_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<Block> JUPITER_DIAMOND_ORE = registerBlock("jupiter_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<Block> JUPITER_GOLD_ORE = registerBlock("jupiter_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<SandBlock> JUPITER_SAND = registerBlock("jupiter_sand", () -> new SandBlock(12359294, BlockBehaviour.Properties.copy(Blocks.SAND).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<Block> JUPITER_STONE = registerBlock("jupiter_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<StairBlock> JUPITER_STONE_STAIRS = registerBlock("jupiter_stone_stairs", () -> new StairBlock(((Block)JUPITER_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(JUPITER_STONE.get())));
    public static final RegistryEntry<SlabBlock> JUPITER_STONE_SLAB = registerBlock("jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(JUPITER_STONE.get())));
    public static final RegistryEntry<Block> JUPITER_COBBLESTONE = registerBlock("jupiter_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<StairBlock> JUPITER_COBBLESTONE_STAIRS = registerBlock("jupiter_cobblestone_stairs", () -> new StairBlock(((Block)JUPITER_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(JUPITER_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> JUPITER_COBBLESTONE_SLAB = registerBlock("jupiter_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(JUPITER_COBBLESTONE.get())));
    public static final RegistryEntry<Block> JUPITER_STONE_BRICKS = registerBlock("jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<StairBlock> JUPITER_STONE_BRICK_STAIRS = registerBlock("jupiter_stone_brick_stairs", () -> new StairBlock(((Block)JUPITER_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(JUPITER_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> JUPITER_STONE_BRICK_SLAB = registerBlock("jupiter_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(JUPITER_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> JUPITER_STONE_BRICK_WALL = registerBlock("jupiter_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(JUPITER_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_JUPITER_STONE_BRICKS = registerBlock("cracked_jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<Block> CHISELED_JUPITER_STONE_BRICKS = registerBlock("chiseled_jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<StairBlock> CHISELED_JUPITER_STONE_STAIRS = registerBlock("chiseled_jupiter_stone_stairs", () -> new StairBlock(((Block)CHISELED_JUPITER_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_JUPITER_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_JUPITER_STONE_SLAB = registerBlock("chiseled_jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_JUPITER_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_JUPITER_STONE = registerBlock("polished_jupiter_stone", () -> new Block(BlockBehaviour.Properties.copy(JUPITER_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_JUPITER_STONE_STAIRS = registerBlock("polished_jupiter_stone_stairs", () -> new StairBlock(((Block)POLISHED_JUPITER_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_JUPITER_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_JUPITER_STONE_SLAB = registerBlock("polished_jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_JUPITER_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> JUPITER_PILLAR = registerBlock("jupiter_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(JUPITER_STONE.get())));
    public static final RegistryEntry<CustomSlidingDoorBlock> JUPERIUM_SLIDING_DOOR = registerSlidingDoor("juperium_sliding_door",
            () -> new CustomSlidingDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR).mapColor(MapColor.DIAMOND)));

    // Saturn
    public static final RegistryEntry<Block> SATURLYTE_BLOCK = registerBlock("saturlyte_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<Block> RAW_SATURLYTE_BLOCK = registerBlock("raw_saturlyte_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryEntry<Block> SATURLYTE_PLATING = registerBlock("saturlyte_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<StairBlock> SATURLYTE_PLATING_STAIRS = registerBlock("saturlyte_plating_stairs", () -> new StairBlock(((Block)SATURLYTE_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<SlabBlock> SATURLYTE_PLATING_SLAB = registerBlock("saturlyte_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> SATURLYTE_PILLAR = registerBlock("saturlyte_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_SATURLYTE_PILLAR = registerBlock("glowing_saturlyte_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<ButtonBlock> SATURLYTE_PLATING_BUTTON = registerBlock("saturlyte_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_PURPLE), BlockSetType.IRON, 20, false));
    public static final RegistryEntry<PressurePlateBlock> SATURLYTE_PLATING_PRESSURE_PLATE = registerBlock("saturlyte_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_PURPLE), BlockSetType.IRON));
    public static final RegistryEntry<Block> SATURN_SATURLYTE_ORE = registerBlock("saturn_saturlyte_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.SAND)));
    public static final RegistryEntry<Block> SATURN_COAL_ORE = registerBlock("saturn_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).mapColor(MapColor.SAND)));
    public static final RegistryEntry<Block> SATURN_DIAMOND_ORE = registerBlock("saturn_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.SAND)));
    public static final RegistryEntry<Block> SATURN_GOLD_ORE = registerBlock("saturn_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).mapColor(MapColor.SAND)));
    public static final RegistryEntry<SandBlock> SATURN_SAND = registerBlock("saturn_sand", () -> new SandBlock(16640684, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryEntry<IceBlock> SATURN_ICE = registerBlock("saturn_ice", () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<Block> SATURN_STONE = registerBlock("saturn_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.SAND)));
    public static final RegistryEntry<StairBlock> SATURN_STONE_STAIRS = registerBlock("saturn_stone_stairs", () -> new StairBlock(((Block)SATURN_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(SATURN_STONE.get())));
    public static final RegistryEntry<SlabBlock> SATURN_STONE_SLAB = registerBlock("saturn_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SATURN_STONE.get())));
    public static final RegistryEntry<Block> SATURN_COBBLESTONE = registerBlock("saturn_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.SAND)));
    public static final RegistryEntry<StairBlock> SATURN_COBBLESTONE_STAIRS = registerBlock("saturn_cobblestone_stairs", () -> new StairBlock(((Block)SATURN_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(SATURN_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> SATURN_COBBLESTONE_SLAB = registerBlock("saturn_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SATURN_COBBLESTONE.get())));
    public static final RegistryEntry<Block> SATURN_STONE_BRICKS = registerBlock("saturn_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.SAND)));
    public static final RegistryEntry<StairBlock> SATURN_STONE_BRICK_STAIRS = registerBlock("saturn_stone_brick_stairs", () -> new StairBlock(((Block)SATURN_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(SATURN_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> SATURN_STONE_BRICK_SLAB = registerBlock("saturn_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SATURN_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> SATURN_STONE_BRICK_WALL = registerBlock("saturn_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SATURN_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_SATURN_STONE_BRICKS = registerBlock("cracked_saturn_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.SAND)));
    public static final RegistryEntry<Block> CHISELED_SATURN_STONE_BRICKS = registerBlock("chiseled_saturn_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.SAND)));
    public static final RegistryEntry<StairBlock> CHISELED_SATURN_STONE_STAIRS = registerBlock("chiseled_saturn_stone_stairs", () -> new StairBlock(((Block)CHISELED_SATURN_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_SATURN_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_SATURN_STONE_SLAB = registerBlock("chiseled_saturn_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_SATURN_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_SATURN_STONE = registerBlock("polished_saturn_stone", () -> new Block(BlockBehaviour.Properties.copy(SATURN_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_SATURN_STONE_STAIRS = registerBlock("polished_saturn_stone_stairs", () -> new StairBlock(((Block)POLISHED_SATURN_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_SATURN_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_SATURN_STONE_SLAB = registerBlock("polished_saturn_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_SATURN_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> SATURN_PILLAR = registerBlock("saturn_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(SATURN_STONE.get())));
    public static final RegistryEntry<CustomSlidingDoorBlock> SATURLYTE_SLIDING_DOOR = registerSlidingDoor("saturlyte_sliding_door",
            () -> new CustomSlidingDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR).mapColor(MapColor.COLOR_PURPLE)));

    // Uranus
    public static final RegistryEntry<Block> URANIUM_BLOCK = registerBlock("uranium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.EMERALD).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.EMERALD)));
    public static final RegistryEntry<Block> URANIUM_PLATING = registerBlock("uranium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.EMERALD).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<StairBlock> URANIUM_PLATING_STAIRS = registerBlock("uranium_plating_stairs", () -> new StairBlock(((Block)URANIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.EMERALD).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<SlabBlock> URANIUM_PLATING_SLAB = registerBlock("uranium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.EMERALD).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> URANIUM_PILLAR = registerBlock("uranium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.EMERALD).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_URANIUM_PILLAR = registerBlock("glowing_uranium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.EMERALD).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<ButtonBlock> URANIUM_PLATING_BUTTON = registerBlock("uranium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.EMERALD), BlockSetType.IRON, 20, false));
    public static final RegistryEntry<PressurePlateBlock> URANIUM_PLATING_PRESSURE_PLATE = registerBlock("uranium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.EMERALD), BlockSetType.IRON));
    public static final RegistryEntry<Block> URANUS_URANIUM_ORE = registerBlock("uranus_uranium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<Block> URANUS_DIAMOND_ORE = registerBlock("uranus_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<DropExperienceBlock> URANUS_ICE_SHARD_ORE = registerBlock("uranus_ice_shard_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_LIGHT_BLUE), UniformInt.of(2, 5)));
    public static final RegistryEntry<Block> URANUS_IRON_ORE = registerBlock("uranus_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<Block> URANUS_LAPIS_ORE = registerBlock("uranus_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<Block> URANUS_STONE = registerBlock("uranus_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<StairBlock> URANUS_STONE_STAIRS = registerBlock("uranus_stone_stairs", () -> new StairBlock(((Block)URANUS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(URANUS_STONE.get())));
    public static final RegistryEntry<SlabBlock> URANUS_STONE_SLAB = registerBlock("uranus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(URANUS_STONE.get())));
    public static final RegistryEntry<Block> URANUS_COBBLESTONE = registerBlock("uranus_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<StairBlock> URANUS_COBBLESTONE_STAIRS = registerBlock("uranus_cobblestone_stairs", () -> new StairBlock(((Block)URANUS_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(URANUS_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> URANUS_COBBLESTONE_SLAB = registerBlock("uranus_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(URANUS_COBBLESTONE.get())));
    public static final RegistryEntry<Block> URANUS_STONE_BRICKS = registerBlock("uranus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<StairBlock> URANUS_STONE_BRICK_STAIRS = registerBlock("uranus_stone_brick_stairs", () -> new StairBlock(((Block)URANUS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(URANUS_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> URANUS_STONE_BRICK_SLAB = registerBlock("uranus_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(URANUS_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> URANUS_STONE_BRICK_WALL = registerBlock("uranus_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(URANUS_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_URANUS_STONE_BRICKS = registerBlock("cracked_uranus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<Block> CHISELED_URANUS_STONE_BRICKS = registerBlock("chiseled_uranus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryEntry<StairBlock> CHISELED_URANUS_STONE_STAIRS = registerBlock("chiseled_uranus_stone_stairs", () -> new StairBlock(((Block)CHISELED_URANUS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_URANUS_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_URANUS_STONE_SLAB = registerBlock("chiseled_uranus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_URANUS_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_URANUS_STONE = registerBlock("polished_uranus_stone", () -> new Block(BlockBehaviour.Properties.copy(URANUS_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_URANUS_STONE_STAIRS = registerBlock("polished_uranus_stone_stairs", () -> new StairBlock(((Block)POLISHED_URANUS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_URANUS_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_URANUS_STONE_SLAB = registerBlock("polished_uranus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_URANUS_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> URANUS_PILLAR = registerBlock("uranus_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(URANUS_STONE.get())));
    public static final RegistryEntry<CustomSlidingDoorBlock> URANIUM_SLIDING_DOOR = registerSlidingDoor("uranium_sliding_door",
            () -> new CustomSlidingDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR).mapColor(MapColor.EMERALD)));
    public static final RegistryEntry<IceBlock> SLUSHY_ICE = registerBlock("slushy_ice", () -> new IceBlock(BlockBehaviour.Properties.of().mapColor(MapColor.ICE).instrument(NoteBlockInstrument.CHIME).strength(0.5F).sound(SoundType.GLASS)));
    public static final RegistryEntry<Block> PACKED_SLUSHY_ICE = registerBlock("packed_slushy_ice", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.ICE).instrument(NoteBlockInstrument.CHIME).strength(0.5F).sound(SoundType.GLASS)));
    public static final RegistryEntry<Block> ICICLE = registerBlock("icicle",
            () -> new IcicleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.ICE)
                    .forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).noOcclusion().sound(SoundType.GLASS).randomTicks().strength(1.5F, 3.0F)
                    .dynamicShape().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY).isRedstoneConductor(ModBlocks::never)));

    // Neptune
    public static final RegistryEntry<Block> NEPTUNIUM_BLOCK = registerBlock("neptunium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<Block> RAW_NEPTUNIUM_BLOCK = registerBlock("raw_neptunium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_GREEN)));
    public static final RegistryEntry<Block> NEPTUNIUM_PLATING = registerBlock("neptunium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<StairBlock> NEPTUNIUM_PLATING_STAIRS = registerBlock("neptunium_plating_stairs", () -> new StairBlock(((Block)NEPTUNIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<SlabBlock> NEPTUNIUM_PLATING_SLAB = registerBlock("neptunium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> NEPTUNIUM_PILLAR = registerBlock("neptunium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_NEPTUNIUM_PILLAR = registerBlock("glowing_neptunium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<ButtonBlock> NEPTUNIUM_PLATING_BUTTON = registerBlock("neptunium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_GREEN), BlockSetType.IRON, 20, false));
    public static final RegistryEntry<PressurePlateBlock> NEPTUNIUM_PLATING_PRESSURE_PLATE = registerBlock("neptunium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_GREEN), BlockSetType.IRON));
    public static final RegistryEntry<Block> NEPTUNE_NEPTUNIUM_ORE = registerBlock("neptune_neptunium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<Block> NEPTUNE_COAL_ORE = registerBlock("neptune_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<Block> NEPTUNE_COPPER_ORE = registerBlock("neptune_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<Block> NEPTUNE_IRON_ORE = registerBlock("neptune_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<DropExperienceBlock> NEPTUNE_ICE_SHARD_ORE = registerBlock("neptune_ice_shard_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_BLUE), UniformInt.of(2, 5)));
    public static final RegistryEntry<Block> NEPTUNE_STONE = registerBlock("neptune_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<StairBlock> NEPTUNE_STONE_STAIRS = registerBlock("neptune_stone_stairs", () -> new StairBlock(((Block)NEPTUNE_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(NEPTUNE_STONE.get())));
    public static final RegistryEntry<SlabBlock> NEPTUNE_STONE_SLAB = registerBlock("neptune_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(NEPTUNE_STONE.get())));
    public static final RegistryEntry<Block> NEPTUNE_COBBLESTONE = registerBlock("neptune_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<StairBlock> NEPTUNE_COBBLESTONE_STAIRS = registerBlock("neptune_cobblestone_stairs", () -> new StairBlock(((Block)NEPTUNE_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(NEPTUNE_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> NEPTUNE_COBBLESTONE_SLAB = registerBlock("neptune_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(NEPTUNE_COBBLESTONE.get())));
    public static final RegistryEntry<Block> NEPTUNE_STONE_BRICKS = registerBlock("neptune_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<StairBlock> NEPTUNE_STONE_BRICK_STAIRS = registerBlock("neptune_stone_brick_stairs", () -> new StairBlock(((Block)NEPTUNE_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(NEPTUNE_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> NEPTUNE_STONE_BRICK_SLAB = registerBlock("neptune_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(NEPTUNE_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> NEPTUNE_STONE_BRICK_WALL = registerBlock("neptune_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(NEPTUNE_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_NEPTUNE_STONE_BRICKS = registerBlock("cracked_neptune_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<Block> CHISELED_NEPTUNE_STONE_BRICKS = registerBlock("chiseled_neptune_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<StairBlock> CHISELED_NEPTUNE_STONE_STAIRS = registerBlock("chiseled_neptune_stone_stairs", () -> new StairBlock(((Block)CHISELED_NEPTUNE_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_NEPTUNE_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_NEPTUNE_STONE_SLAB = registerBlock("chiseled_neptune_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_NEPTUNE_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_NEPTUNE_STONE = registerBlock("polished_neptune_stone", () -> new Block(BlockBehaviour.Properties.copy(NEPTUNE_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_NEPTUNE_STONE_STAIRS = registerBlock("polished_neptune_stone_stairs", () -> new StairBlock(((Block)POLISHED_NEPTUNE_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_NEPTUNE_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_NEPTUNE_STONE_SLAB = registerBlock("polished_neptune_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_NEPTUNE_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> NEPTUNE_PILLAR = registerBlock("neptune_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(NEPTUNE_STONE.get())));
    public static final RegistryEntry<CustomSlidingDoorBlock> NEPTUNIUM_SLIDING_DOOR = registerSlidingDoor("neptunium_sliding_door",
            () -> new CustomSlidingDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR).mapColor(MapColor.COLOR_GREEN)));
    public static final RegistryEntry<Block> BLUE_SLUSHY_ICE = registerBlock("blue_slushy_ice", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.ICE).instrument(NoteBlockInstrument.CHIME).strength(0.5F).sound(SoundType.GLASS)));

    // Orcus
    public static final RegistryEntry<Block> RADIUM_BLOCK = registerBlock("radium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<Block> RAW_RADIUM_BLOCK = registerBlock("raw_radium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryEntry<Block> RADIUM_PLATING = registerBlock("radium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<StairBlock> RADIUM_PLATING_STAIRS = registerBlock("radium_plating_stairs", () -> new StairBlock(((Block)RADIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<SlabBlock> RADIUM_PLATING_SLAB = registerBlock("radium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> RADIUM_PILLAR = registerBlock("radium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_RADIUM_PILLAR = registerBlock("glowing_radium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<ButtonBlock> RADIUM_PLATING_BUTTON = registerBlock("radium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_LIGHT_GREEN), BlockSetType.IRON, 20, false));
    public static final RegistryEntry<PressurePlateBlock> RADIUM_PLATING_PRESSURE_PLATE = registerBlock("radium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_LIGHT_GREEN), BlockSetType.IRON));
    public static final RegistryEntry<Block> ORCUS_RADIUM_ORE = registerBlock("orcus_radium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryEntry<Block> ORCUS_COPPER_ORE = registerBlock("orcus_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryEntry<Block> ORCUS_IRON_ORE = registerBlock("orcus_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryEntry<Block> ORCUS_STONE = registerBlock("orcus_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryEntry<StairBlock> ORCUS_STONE_STAIRS = registerBlock("orcus_stone_stairs", () -> new StairBlock(((Block)ORCUS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(ORCUS_STONE.get())));
    public static final RegistryEntry<SlabBlock> ORCUS_STONE_SLAB = registerBlock("orcus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ORCUS_STONE.get())));
    public static final RegistryEntry<Block> ORCUS_COBBLESTONE = registerBlock("orcus_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryEntry<StairBlock> ORCUS_COBBLESTONE_STAIRS = registerBlock("orcus_cobblestone_stairs", () -> new StairBlock(((Block)ORCUS_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(ORCUS_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> ORCUS_COBBLESTONE_SLAB = registerBlock("orcus_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ORCUS_COBBLESTONE.get())));
    public static final RegistryEntry<Block> ORCUS_STONE_BRICKS = registerBlock("orcus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryEntry<StairBlock> ORCUS_STONE_BRICK_STAIRS = registerBlock("orcus_stone_brick_stairs", () -> new StairBlock(((Block)ORCUS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(ORCUS_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> ORCUS_STONE_BRICK_SLAB = registerBlock("orcus_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ORCUS_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> ORCUS_STONE_BRICK_WALL = registerBlock("orcus_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ORCUS_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_ORCUS_STONE_BRICKS = registerBlock("cracked_orcus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryEntry<Block> CHISELED_ORCUS_STONE_BRICKS = registerBlock("chiseled_orcus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryEntry<StairBlock> CHISELED_ORCUS_STONE_STAIRS = registerBlock("chiseled_orcus_stone_stairs", () -> new StairBlock(((Block)CHISELED_ORCUS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_ORCUS_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_ORCUS_STONE_SLAB = registerBlock("chiseled_orcus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_ORCUS_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_ORCUS_STONE = registerBlock("polished_orcus_stone", () -> new Block(BlockBehaviour.Properties.copy(ORCUS_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_ORCUS_STONE_STAIRS = registerBlock("polished_orcus_stone_stairs", () -> new StairBlock(((Block)POLISHED_ORCUS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_ORCUS_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_ORCUS_STONE_SLAB = registerBlock("polished_orcus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_ORCUS_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> ORCUS_PILLAR = registerBlock("orcus_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(ORCUS_STONE.get())));
    public static final RegistryEntry<CustomSlidingDoorBlock> RADIUM_SLIDING_DOOR = registerSlidingDoor("radium_sliding_door",
            () -> new CustomSlidingDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR).mapColor(MapColor.COLOR_LIGHT_GREEN)));

    // Pluto
    public static final RegistryEntry<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<Block> RAW_PLUTONIUM_BLOCK = registerBlock("raw_plutonium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryEntry<Block> PLUTONIUM_PLATING = registerBlock("plutonium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<StairBlock> PLUTONIUM_PLATING_STAIRS = registerBlock("plutonium_plating_stairs", () -> new StairBlock(((Block)PLUTONIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<SlabBlock> PLUTONIUM_PLATING_SLAB = registerBlock("plutonium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> PLUTONIUM_PILLAR = registerBlock("plutonium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_PLUTONIUM_PILLAR = registerBlock("glowing_plutonium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<ButtonBlock> PLUTONIUM_PLATING_BUTTON = registerBlock("plutonium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_YELLOW), BlockSetType.IRON, 20, false));
    public static final RegistryEntry<PressurePlateBlock> PLUTONIUM_PLATING_PRESSURE_PLATE = registerBlock("plutonium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_YELLOW), BlockSetType.IRON));
    public static final RegistryEntry<Block> PLUTO_PLUTONIUM_ORE = registerBlock("pluto_plutonium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<Block> PLUTO_DIAMOND_ORE = registerBlock("pluto_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<Block> PLUTO_GOLD_ORE = registerBlock("pluto_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<DropExperienceBlock> PLUTO_ICE_SHARD_ORE = registerBlock("pluto_ice_shard_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_ORANGE), UniformInt.of(2, 5)));
    public static final RegistryEntry<SandBlock> PLUTO_SAND = registerBlock("pluto_sand", () -> new SandBlock(16770711, BlockBehaviour.Properties.copy(Blocks.SAND).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<Block> PLUTO_STONE = registerBlock("pluto_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<StairBlock> PLUTO_STONE_STAIRS = registerBlock("pluto_stone_stairs", () -> new StairBlock(((Block)PLUTO_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(PLUTO_STONE.get())));
    public static final RegistryEntry<SlabBlock> PLUTO_STONE_SLAB = registerBlock("pluto_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PLUTO_STONE.get())));
    public static final RegistryEntry<Block> PLUTO_COBBLESTONE = registerBlock("pluto_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<StairBlock> PLUTO_COBBLESTONE_STAIRS = registerBlock("pluto_cobblestone_stairs", () -> new StairBlock(((Block)PLUTO_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(PLUTO_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> PLUTO_COBBLESTONE_SLAB = registerBlock("pluto_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PLUTO_COBBLESTONE.get())));
    public static final RegistryEntry<Block> PLUTO_STONE_BRICKS = registerBlock("pluto_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<StairBlock> PLUTO_STONE_BRICK_STAIRS = registerBlock("pluto_stone_brick_stairs", () -> new StairBlock(((Block)PLUTO_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(PLUTO_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> PLUTO_STONE_BRICK_SLAB = registerBlock("pluto_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PLUTO_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> PLUTO_STONE_BRICK_WALL = registerBlock("pluto_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(PLUTO_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_PLUTO_STONE_BRICKS = registerBlock("cracked_pluto_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<Block> CHISELED_PLUTO_STONE_BRICKS = registerBlock("chiseled_pluto_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<StairBlock> CHISELED_PLUTO_STONE_STAIRS = registerBlock("chiseled_pluto_stone_stairs", () -> new StairBlock(((Block)CHISELED_PLUTO_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_PLUTO_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_PLUTO_STONE_SLAB = registerBlock("chiseled_pluto_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_PLUTO_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_PLUTO_STONE = registerBlock("polished_pluto_stone", () -> new Block(BlockBehaviour.Properties.copy(PLUTO_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_PLUTO_STONE_STAIRS = registerBlock("polished_pluto_stone_stairs", () -> new StairBlock(((Block)POLISHED_PLUTO_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_PLUTO_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_PLUTO_STONE_SLAB = registerBlock("polished_pluto_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_PLUTO_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> PLUTO_PILLAR = registerBlock("pluto_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(PLUTO_STONE.get())));
    public static final RegistryEntry<CustomSlidingDoorBlock> PLUTONIUM_SLIDING_DOOR = registerSlidingDoor("plutonium_sliding_door",
            () -> new CustomSlidingDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR).mapColor(MapColor.COLOR_YELLOW)));

    // Haumea
    public static final RegistryEntry<Block> HAUMEA_COPPER_ORE = registerBlock("haumea_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryEntry<Block> HAUMEA_IRON_ORE = registerBlock("haumea_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryEntry<Block> HAUMEA_STONE = registerBlock("haumea_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryEntry<StairBlock> HAUMEA_STONE_STAIRS = registerBlock("haumea_stone_stairs", () -> new StairBlock(((Block)HAUMEA_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(HAUMEA_STONE.get())));
    public static final RegistryEntry<SlabBlock> HAUMEA_STONE_SLAB = registerBlock("haumea_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(HAUMEA_STONE.get())));
    public static final RegistryEntry<Block> HAUMEA_COBBLESTONE = registerBlock("haumea_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryEntry<StairBlock> HAUMEA_COBBLESTONE_STAIRS = registerBlock("haumea_cobblestone_stairs", () -> new StairBlock(((Block)HAUMEA_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(HAUMEA_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> HAUMEA_COBBLESTONE_SLAB = registerBlock("haumea_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(HAUMEA_COBBLESTONE.get())));
    public static final RegistryEntry<Block> HAUMEA_STONE_BRICKS = registerBlock("haumea_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryEntry<StairBlock> HAUMEA_STONE_BRICK_STAIRS = registerBlock("haumea_stone_brick_stairs", () -> new StairBlock(((Block)HAUMEA_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(HAUMEA_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> HAUMEA_STONE_BRICK_SLAB = registerBlock("haumea_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(HAUMEA_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> HAUMEA_STONE_BRICK_WALL = registerBlock("haumea_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(HAUMEA_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_HAUMEA_STONE_BRICKS = registerBlock("cracked_haumea_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryEntry<Block> CHISELED_HAUMEA_STONE_BRICKS = registerBlock("chiseled_haumea_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryEntry<StairBlock> CHISELED_HAUMEA_STONE_STAIRS = registerBlock("chiseled_haumea_stone_stairs", () -> new StairBlock(((Block)CHISELED_HAUMEA_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_HAUMEA_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_HAUMEA_STONE_SLAB = registerBlock("chiseled_haumea_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_HAUMEA_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_HAUMEA_STONE = registerBlock("polished_haumea_stone", () -> new Block(BlockBehaviour.Properties.copy(HAUMEA_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_HAUMEA_STONE_STAIRS = registerBlock("polished_haumea_stone_stairs", () -> new StairBlock(((Block)POLISHED_HAUMEA_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_HAUMEA_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_HAUMEA_STONE_SLAB = registerBlock("polished_haumea_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_HAUMEA_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> HAUMEA_PILLAR = registerBlock("haumea_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(HAUMEA_STONE.get())));

    // Quaoar
    public static final RegistryEntry<Block> QUAOAR_COPPER_ORE = registerBlock("quaoar_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).mapColor(MapColor.PODZOL)));
    public static final RegistryEntry<Block> QUAOAR_IRON_ORE = registerBlock("quaoar_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.PODZOL)));
    public static final RegistryEntry<Block> QUAOAR_STONE = registerBlock("quaoar_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.PODZOL)));
    public static final RegistryEntry<StairBlock> QUAOAR_STONE_STAIRS = registerBlock("quaoar_stone_stairs", () -> new StairBlock(((Block)QUAOAR_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(QUAOAR_STONE.get())));
    public static final RegistryEntry<SlabBlock> QUAOAR_STONE_SLAB = registerBlock("quaoar_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(QUAOAR_STONE.get())));
    public static final RegistryEntry<Block> QUAOAR_COBBLESTONE = registerBlock("quaoar_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.PODZOL)));
    public static final RegistryEntry<StairBlock> QUAOAR_COBBLESTONE_STAIRS = registerBlock("quaoar_cobblestone_stairs", () -> new StairBlock(((Block)QUAOAR_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(QUAOAR_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> QUAOAR_COBBLESTONE_SLAB = registerBlock("quaoar_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(QUAOAR_COBBLESTONE.get())));
    public static final RegistryEntry<Block> QUAOAR_STONE_BRICKS = registerBlock("quaoar_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.PODZOL)));
    public static final RegistryEntry<StairBlock> QUAOAR_STONE_BRICK_STAIRS = registerBlock("quaoar_stone_brick_stairs", () -> new StairBlock(((Block)QUAOAR_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(QUAOAR_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> QUAOAR_STONE_BRICK_SLAB = registerBlock("quaoar_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(QUAOAR_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> QUAOAR_STONE_BRICK_WALL = registerBlock("quaoar_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(QUAOAR_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_QUAOAR_STONE_BRICKS = registerBlock("cracked_quaoar_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.PODZOL)));
    public static final RegistryEntry<Block> CHISELED_QUAOAR_STONE_BRICKS = registerBlock("chiseled_quaoar_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.PODZOL)));
    public static final RegistryEntry<StairBlock> CHISELED_QUAOAR_STONE_STAIRS = registerBlock("chiseled_quaoar_stone_stairs", () -> new StairBlock(((Block)CHISELED_QUAOAR_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_QUAOAR_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_QUAOAR_STONE_SLAB = registerBlock("chiseled_quaoar_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_QUAOAR_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_QUAOAR_STONE = registerBlock("polished_quaoar_stone", () -> new Block(BlockBehaviour.Properties.copy(QUAOAR_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_QUAOAR_STONE_STAIRS = registerBlock("polished_quaoar_stone_stairs", () -> new StairBlock(((Block)POLISHED_QUAOAR_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_QUAOAR_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_QUAOAR_STONE_SLAB = registerBlock("polished_quaoar_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_QUAOAR_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> QUAOAR_PILLAR = registerBlock("quaoar_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(QUAOAR_STONE.get())));

    // Makemake
    public static final RegistryEntry<Block> MAKEMAKE_COPPER_ORE = registerBlock("makemake_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<Block> MAKEMAKE_IRON_ORE = registerBlock("makemake_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<Block> MAKEMAKE_STONE = registerBlock("makemake_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<StairBlock> MAKEMAKE_STONE_STAIRS = registerBlock("makemake_stone_stairs", () -> new StairBlock(((Block)MAKEMAKE_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(MAKEMAKE_STONE.get())));
    public static final RegistryEntry<SlabBlock> MAKEMAKE_STONE_SLAB = registerBlock("makemake_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MAKEMAKE_STONE.get())));
    public static final RegistryEntry<Block> MAKEMAKE_COBBLESTONE = registerBlock("makemake_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<StairBlock> MAKEMAKE_COBBLESTONE_STAIRS = registerBlock("makemake_cobblestone_stairs", () -> new StairBlock(((Block)MAKEMAKE_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(MAKEMAKE_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> MAKEMAKE_COBBLESTONE_SLAB = registerBlock("makemake_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MAKEMAKE_COBBLESTONE.get())));
    public static final RegistryEntry<Block> MAKEMAKE_STONE_BRICKS = registerBlock("makemake_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<StairBlock> MAKEMAKE_STONE_BRICK_STAIRS = registerBlock("makemake_stone_brick_stairs", () -> new StairBlock(((Block)MAKEMAKE_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(MAKEMAKE_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> MAKEMAKE_STONE_BRICK_SLAB = registerBlock("makemake_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MAKEMAKE_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> MAKEMAKE_STONE_BRICK_WALL = registerBlock("makemake_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MAKEMAKE_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_MAKEMAKE_STONE_BRICKS = registerBlock("cracked_makemake_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<Block> CHISELED_MAKEMAKE_STONE_BRICKS = registerBlock("chiseled_makemake_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.COLOR_RED)));
    public static final RegistryEntry<StairBlock> CHISELED_MAKEMAKE_STONE_STAIRS = registerBlock("chiseled_makemake_stone_stairs", () -> new StairBlock(((Block)CHISELED_MAKEMAKE_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_MAKEMAKE_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_MAKEMAKE_STONE_SLAB = registerBlock("chiseled_makemake_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_MAKEMAKE_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_MAKEMAKE_STONE = registerBlock("polished_makemake_stone", () -> new Block(BlockBehaviour.Properties.copy(MAKEMAKE_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_MAKEMAKE_STONE_STAIRS = registerBlock("polished_makemake_stone_stairs", () -> new StairBlock(((Block)POLISHED_MAKEMAKE_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_MAKEMAKE_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_MAKEMAKE_STONE_SLAB = registerBlock("polished_makemake_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_MAKEMAKE_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> MAKEMAKE_PILLAR = registerBlock("makemake_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(MAKEMAKE_STONE.get())));

    // Gonggong
    public static final RegistryEntry<Block> GONGGONG_COPPER_ORE = registerBlock("gonggong_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).mapColor(MapColor.WARPED_HYPHAE)));
    public static final RegistryEntry<Block> GONGGONG_IRON_ORE = registerBlock("gonggong_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.WARPED_HYPHAE)));
    public static final RegistryEntry<Block> GONGGONG_STONE = registerBlock("gonggong_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.WARPED_HYPHAE)));
    public static final RegistryEntry<StairBlock> GONGGONG_STONE_STAIRS = registerBlock("gonggong_stone_stairs", () -> new StairBlock(((Block)GONGGONG_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(GONGGONG_STONE.get())));
    public static final RegistryEntry<SlabBlock> GONGGONG_STONE_SLAB = registerBlock("gonggong_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GONGGONG_STONE.get())));
    public static final RegistryEntry<Block> GONGGONG_COBBLESTONE = registerBlock("gonggong_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.WARPED_HYPHAE)));
    public static final RegistryEntry<StairBlock> GONGGONG_COBBLESTONE_STAIRS = registerBlock("gonggong_cobblestone_stairs", () -> new StairBlock(((Block)GONGGONG_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(GONGGONG_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> GONGGONG_COBBLESTONE_SLAB = registerBlock("gonggong_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GONGGONG_COBBLESTONE.get())));
    public static final RegistryEntry<Block> GONGGONG_STONE_BRICKS = registerBlock("gonggong_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.WARPED_HYPHAE)));
    public static final RegistryEntry<StairBlock> GONGGONG_STONE_BRICK_STAIRS = registerBlock("gonggong_stone_brick_stairs", () -> new StairBlock(((Block)GONGGONG_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(GONGGONG_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> GONGGONG_STONE_BRICK_SLAB = registerBlock("gonggong_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GONGGONG_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> GONGGONG_STONE_BRICK_WALL = registerBlock("gonggong_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GONGGONG_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_GONGGONG_STONE_BRICKS = registerBlock("cracked_gonggong_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.WARPED_HYPHAE)));
    public static final RegistryEntry<Block> CHISELED_GONGGONG_STONE_BRICKS = registerBlock("chiseled_gonggong_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.WARPED_HYPHAE)));
    public static final RegistryEntry<StairBlock> CHISELED_GONGGONG_STONE_STAIRS = registerBlock("chiseled_gonggong_stone_stairs", () -> new StairBlock(((Block)CHISELED_GONGGONG_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_GONGGONG_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_GONGGONG_STONE_SLAB = registerBlock("chiseled_gonggong_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_GONGGONG_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_GONGGONG_STONE = registerBlock("polished_gonggong_stone", () -> new Block(BlockBehaviour.Properties.copy(GONGGONG_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_GONGGONG_STONE_STAIRS = registerBlock("polished_gonggong_stone_stairs", () -> new StairBlock(((Block)POLISHED_GONGGONG_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_GONGGONG_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_GONGGONG_STONE_SLAB = registerBlock("polished_gonggong_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_GONGGONG_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> GONGGONG_PILLAR = registerBlock("gonggong_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(GONGGONG_STONE.get())));

    // Eris
    public static final RegistryEntry<Block> ERIS_COPPER_ORE = registerBlock("eris_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).mapColor(MapColor.SNOW)));
    public static final RegistryEntry<Block> ERIS_IRON_ORE = registerBlock("eris_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.SNOW)));
    public static final RegistryEntry<Block> ERIS_STONE = registerBlock("eris_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.SNOW)));
    public static final RegistryEntry<StairBlock> ERIS_STONE_STAIRS = registerBlock("eris_stone_stairs", () -> new StairBlock(((Block)ERIS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(ERIS_STONE.get())));
    public static final RegistryEntry<SlabBlock> ERIS_STONE_SLAB = registerBlock("eris_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ERIS_STONE.get())));
    public static final RegistryEntry<Block> ERIS_COBBLESTONE = registerBlock("eris_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.SNOW)));
    public static final RegistryEntry<StairBlock> ERIS_COBBLESTONE_STAIRS = registerBlock("eris_cobblestone_stairs", () -> new StairBlock(((Block)ERIS_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(ERIS_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> ERIS_COBBLESTONE_SLAB = registerBlock("eris_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ERIS_COBBLESTONE.get())));
    public static final RegistryEntry<Block> ERIS_STONE_BRICKS = registerBlock("eris_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.SNOW)));
    public static final RegistryEntry<StairBlock> ERIS_STONE_BRICK_STAIRS = registerBlock("eris_stone_brick_stairs", () -> new StairBlock(((Block)ERIS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(ERIS_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> ERIS_STONE_BRICK_SLAB = registerBlock("eris_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ERIS_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> ERIS_STONE_BRICK_WALL = registerBlock("eris_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ERIS_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_ERIS_STONE_BRICKS = registerBlock("cracked_eris_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.SNOW)));
    public static final RegistryEntry<Block> CHISELED_ERIS_STONE_BRICKS = registerBlock("chiseled_eris_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.SNOW)));
    public static final RegistryEntry<StairBlock> CHISELED_ERIS_STONE_STAIRS = registerBlock("chiseled_eris_stone_stairs", () -> new StairBlock(((Block)CHISELED_ERIS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_ERIS_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_ERIS_STONE_SLAB = registerBlock("chiseled_eris_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_ERIS_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_ERIS_STONE = registerBlock("polished_eris_stone", () -> new Block(BlockBehaviour.Properties.copy(ERIS_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_ERIS_STONE_STAIRS = registerBlock("polished_eris_stone_stairs", () -> new StairBlock(((Block)POLISHED_ERIS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_ERIS_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_ERIS_STONE_SLAB = registerBlock("polished_eris_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_ERIS_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> ERIS_PILLAR = registerBlock("eris_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(ERIS_STONE.get())));

    // Sedna
    public static final RegistryEntry<Block> ELECTROLYTE_BLOCK = registerBlock("electrolyte_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<Block> RAW_ELECTROLYTE_BLOCK = registerBlock("raw_electrolyte_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryEntry<Block> ELECTROLYTE_PLATING = registerBlock("electrolyte_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<StairBlock> ELECTROLYTE_PLATING_STAIRS = registerBlock("electrolyte_plating_stairs", () -> new StairBlock(((Block)ELECTROLYTE_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<SlabBlock> ELECTROLYTE_PLATING_SLAB = registerBlock("electrolyte_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> ELECTROLYTE_PILLAR = registerBlock("electrolyte_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_ELECTROLYTE_PILLAR = registerBlock("glowing_electrolyte_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryEntry<ButtonBlock> ELECTROLYTE_PLATING_BUTTON = registerBlock("electrolyte_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_BLUE), BlockSetType.IRON, 20, false));
    public static final RegistryEntry<PressurePlateBlock> ELECTROLYTE_PLATING_PRESSURE_PLATE = registerBlock("electrolyte_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_BLUE), BlockSetType.IRON));
    public static final RegistryEntry<Block> SEDNA_ELECTROLYTE_ORE = registerBlock("sedna_electrolyte_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.NETHER)));
    public static final RegistryEntry<Block> SEDNA_COPPER_ORE = registerBlock("sedna_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).mapColor(MapColor.NETHER)));
    public static final RegistryEntry<Block> SEDNA_IRON_ORE = registerBlock("sedna_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.NETHER)));
    public static final RegistryEntry<Block> SEDNA_STONE = registerBlock("sedna_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.NETHER)));
    public static final RegistryEntry<StairBlock> SEDNA_STONE_STAIRS = registerBlock("sedna_stone_stairs", () -> new StairBlock(((Block)SEDNA_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(SEDNA_STONE.get())));
    public static final RegistryEntry<SlabBlock> SEDNA_STONE_SLAB = registerBlock("sedna_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SEDNA_STONE.get())));
    public static final RegistryEntry<Block> SEDNA_COBBLESTONE = registerBlock("sedna_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.NETHER)));
    public static final RegistryEntry<StairBlock> SEDNA_COBBLESTONE_STAIRS = registerBlock("sedna_cobblestone_stairs", () -> new StairBlock(((Block)SEDNA_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(SEDNA_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> SEDNA_COBBLESTONE_SLAB = registerBlock("sedna_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SEDNA_COBBLESTONE.get())));
    public static final RegistryEntry<Block> SEDNA_STONE_BRICKS = registerBlock("sedna_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.NETHER)));
    public static final RegistryEntry<StairBlock> SEDNA_STONE_BRICK_STAIRS = registerBlock("sedna_stone_brick_stairs", () -> new StairBlock(((Block)SEDNA_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(SEDNA_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> SEDNA_STONE_BRICK_SLAB = registerBlock("sedna_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SEDNA_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> SEDNA_STONE_BRICK_WALL = registerBlock("sedna_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SEDNA_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_SEDNA_STONE_BRICKS = registerBlock("cracked_sedna_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.NETHER)));
    public static final RegistryEntry<Block> CHISELED_SEDNA_STONE_BRICKS = registerBlock("chiseled_sedna_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.NETHER)));
    public static final RegistryEntry<StairBlock> CHISELED_SEDNA_STONE_STAIRS = registerBlock("chiseled_sedna_stone_stairs", () -> new StairBlock(((Block)CHISELED_SEDNA_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_SEDNA_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_SEDNA_STONE_SLAB = registerBlock("chiseled_sedna_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_SEDNA_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_SEDNA_STONE = registerBlock("polished_sedna_stone", () -> new Block(BlockBehaviour.Properties.copy(SEDNA_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_SEDNA_STONE_STAIRS = registerBlock("polished_sedna_stone_stairs", () -> new StairBlock(((Block)POLISHED_SEDNA_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_SEDNA_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_SEDNA_STONE_SLAB = registerBlock("polished_sedna_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_SEDNA_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> SEDNA_PILLAR = registerBlock("sedna_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(SEDNA_STONE.get())));
    public static final RegistryEntry<CustomSlidingDoorBlock> ELECTROLYTE_SLIDING_DOOR = registerSlidingDoor("electrolyte_sliding_door",
            () -> new CustomSlidingDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR).mapColor(MapColor.COLOR_BLUE)));

    // Proxima Centauri b
    public static final RegistryEntry<Block> B_DIAMOND_ORE = registerBlock("b_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<Block> B_EMERALD_ORE = registerBlock("b_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<Block> B_IRON_ORE = registerBlock("b_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<RedStoneOreBlock> B_REDSTONE_ORE = registerBlock("b_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<SandBlock> B_SAND = registerBlock("b_sand", () -> new SandBlock(12945208, BlockBehaviour.Properties.copy(Blocks.SAND).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<Block> B_SANDSTONE = registerBlock("b_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<Block> B_SANDSTONE_BRICKS = registerBlock("b_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<StairBlock> B_SANDSTONE_BRICK_STAIRS = registerBlock("b_sandstone_brick_stairs", () -> new StairBlock(((Block)B_SANDSTONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(B_SANDSTONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> B_SANDSTONE_BRICK_SLAB = registerBlock("b_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(B_SANDSTONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_B_SANDSTONE_BRICKS = registerBlock("cracked_b_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(B_SANDSTONE_BRICKS.get())));
    public static final RegistryEntry<Block> B_STONE = registerBlock("b_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<StairBlock> B_STONE_STAIRS = registerBlock("b_stone_stairs", () -> new StairBlock(((Block)B_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(B_STONE.get())));
    public static final RegistryEntry<SlabBlock> B_STONE_SLAB = registerBlock("b_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(B_STONE.get())));
    public static final RegistryEntry<Block> B_COBBLESTONE = registerBlock("b_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<StairBlock> B_COBBLESTONE_STAIRS = registerBlock("b_cobblestone_stairs", () -> new StairBlock(((Block)B_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(B_COBBLESTONE.get())));
    public static final RegistryEntry<SlabBlock> B_COBBLESTONE_SLAB = registerBlock("b_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(B_COBBLESTONE.get())));
    public static final RegistryEntry<Block> B_STONE_BRICKS = registerBlock("b_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<StairBlock> B_STONE_BRICK_STAIRS = registerBlock("b_stone_brick_stairs", () -> new StairBlock(((Block)B_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(B_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> B_STONE_BRICK_SLAB = registerBlock("b_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(B_STONE_BRICKS.get())));
    public static final RegistryEntry<WallBlock> B_STONE_BRICK_WALL = registerBlock("b_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(B_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> CRACKED_B_STONE_BRICKS = registerBlock("cracked_b_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<Block> CHISELED_B_STONE_BRICKS = registerBlock("chiseled_b_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<StairBlock> CHISELED_B_STONE_STAIRS = registerBlock("chiseled_b_stone_stairs", () -> new StairBlock(((Block)CHISELED_B_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(CHISELED_B_STONE_BRICKS.get())));
    public static final RegistryEntry<SlabBlock> CHISELED_B_STONE_SLAB = registerBlock("chiseled_b_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHISELED_B_STONE_BRICKS.get())));
    public static final RegistryEntry<Block> POLISHED_B_STONE = registerBlock("polished_b_stone", () -> new Block(BlockBehaviour.Properties.copy(B_STONE.get())));
    public static final RegistryEntry<StairBlock> POLISHED_B_STONE_STAIRS = registerBlock("polished_b_stone_stairs", () -> new StairBlock(((Block)POLISHED_B_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_B_STONE.get())));
    public static final RegistryEntry<SlabBlock> POLISHED_B_STONE_SLAB = registerBlock("polished_b_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_B_STONE.get())));
    public static final RegistryEntry<RotatedPillarBlock> B_PILLAR = registerBlock("b_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(B_STONE.get())));

    // Glacio
    public static final RegistryEntry<Block> GLACIAN_WOOD = registerBlock("glacian_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).mapColor(MapColor.CLAY).friction(0.5F).mapColor(MapColor.COLOR_PINK)));
    public static final RegistryEntry<Block> STRIPPED_GLACIAN_WOOD = registerBlock("stripped_glacian_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.CLAY).friction(0.5F).mapColor(MapColor.COLOR_PINK)));
    public static final RegistryEntry<GlacianSaplingBlock> GLACIAN_SAPLING = registerBlock("glacian_sapling",
            () -> new GlacianSaplingBlock(new GlacianTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryEntry<FlowerPotBlock> POTTED_GLACIAN_SAPLING = POTTED_BLOCKS.register("potted_glacian_sapling",
            () -> new FlowerPotBlock(GLACIAN_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    // Globes
    public static final RegistryEntry<CustomGlobeBlock> CERES_GLOBE = registerGlobe("ceres_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> JUPITER_GLOBE = registerGlobe("jupiter_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> SATURN_GLOBE = registerGlobe("saturn_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> URANUS_GLOBE = registerGlobe("uranus_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> NEPTUNE_GLOBE = registerGlobe("neptune_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> ORCUS_GLOBE = registerGlobe("orcus_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> PLUTO_GLOBE = registerGlobe("pluto_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> HAUMEA_GLOBE = registerGlobe("haumea_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> QUAOAR_GLOBE = registerGlobe("quaoar_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> MAKEMAKE_GLOBE = registerGlobe("makemake_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> GONGGONG_GLOBE = registerGlobe("gonggong_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> ERIS_GLOBE = registerGlobe("eris_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> SEDNA_GLOBE = registerGlobe("sedna_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryEntry<CustomGlobeBlock> B_GLOBE = registerGlobe("b_globe",
            () -> new CustomGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));

    private static Boolean never(BlockState p_50779_, BlockGetter p_50780_, BlockPos p_50781_, EntityType<?> p_50782_) {
        return false;
    }

    private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
        return false;
    }

    private static <T extends Block> RegistryEntry<T> registerBlock(String name, Supplier<T> block) {
        RegistryEntry<T> toReturn = BASIC_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryEntry<Item> registerBlockItem(String name, RegistryEntry<T> block) {
        return ModItems.BLOCKS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryEntry<T> registerSlidingDoor(String name, Supplier<T> block) {
        RegistryEntry<T> toReturn = SLIDING_DOORS.register(name, block);
        registerSlidingDoorItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryEntry<Item> registerSlidingDoorItem(String name, RegistryEntry<T> block) {
        return ModItems.SLIDING_DOORS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryEntry<T> registerGlobe(String name, Supplier<T> block) {
        RegistryEntry<T> toReturn = GLOBES.register(name, block);
        registerGlobeItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryEntry<Item> registerGlobeItem(String name, RegistryEntry<T> block) {
        return ModItems.GLOBES.register(name, () -> new GlobeItem(block.get(), (new Item.Properties()).stacksTo(1).rarity(Rarity.RARE)));
    }
}
