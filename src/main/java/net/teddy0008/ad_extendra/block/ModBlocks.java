package net.teddy0008.ad_extendra.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.block.globe.StandardGlobeBlock;
import net.teddy0008.ad_extendra.item.ModItems;
import net.teddy0008.ad_extendra.util.ModWoodTypes;
import net.teddy0008.ad_extendra.world.gen.ModTreeConfiguredFeatures;
import net.teddy0008.ad_extendra.world.gen.tree.GlacianTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);

    // Moon
    public static final RegistryObject<MoonMyceliumBlock> MOON_MYCELIUM = registerBlock("moon_mycelium",
            () -> new MoonMyceliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).lightLevel((state) -> {
                return 6;
            })));
    public static final RegistryObject<MushroomBlock> AERONOS_MUSHROOM = registerBlock("aeronos_mushroom",
            () -> new MushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).sound(SoundType.STEM).lightLevel((state) -> {
                return 6;
            }), ModTreeConfiguredFeatures.AERONOS_KEY));
    public static final RegistryObject<FlowerPotBlock> POTTED_AERONOS_MUSHROOM = BLOCKS.register("potted_aeronos_mushroom",
            () -> new FlowerPotBlock(AERONOS_MUSHROOM.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<CustomStandingSignBlock> AERONOS_SIGN = BLOCKS.register("aeronos_sign",
            () -> new CustomStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SIGN), ModWoodTypes.AERONOS));
    public static final RegistryObject<CustomWallSignBlock> AERONOS_WALL_SIGN = BLOCKS.register("aeronos_wall_sign",
            () -> new CustomWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_SIGN), ModWoodTypes.AERONOS));
    public static final RegistryObject<CustomCeilingHangingSignBlock> AERONOS_HANGING_SIGN = BLOCKS.register("aeronos_hanging_sign",
            () -> new CustomCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HANGING_SIGN), ModWoodTypes.AERONOS));
    public static final RegistryObject<CustomWallHangingSignBlock> AERONOS_WALL_HANGING_SIGN = BLOCKS.register("aeronos_wall_hanging_sign",
            () -> new CustomWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_HANGING_SIGN), ModWoodTypes.AERONOS));
    public static final RegistryObject<MushroomBlock> STROPHAR_MUSHROOM = registerBlock("strophar_mushroom",
            () -> new MushroomBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM).sound(SoundType.STEM).lightLevel((state) -> {
                return 6;
            }), ModTreeConfiguredFeatures.STROPHAR_KEY));
    public static final RegistryObject<FlowerPotBlock> POTTED_STROPHAR_MUSHROOM = BLOCKS.register("potted_strophar_mushroom",
            () -> new FlowerPotBlock(STROPHAR_MUSHROOM.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<CustomStandingSignBlock> STROPHAR_SIGN = BLOCKS.register("strophar_sign",
            () -> new CustomStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SIGN), ModWoodTypes.STROPHAR));
    public static final RegistryObject<CustomWallSignBlock> STROPHAR_WALL_SIGN = BLOCKS.register("strophar_wall_sign",
            () -> new CustomWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_SIGN), ModWoodTypes.STROPHAR));
    public static final RegistryObject<CustomCeilingHangingSignBlock> STROPHAR_HANGING_SIGN = BLOCKS.register("strophar_hanging_sign",
            () -> new CustomCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HANGING_SIGN), ModWoodTypes.STROPHAR));
    public static final RegistryObject<CustomWallHangingSignBlock> STROPHAR_WALL_HANGING_SIGN = BLOCKS.register("strophar_wall_hanging_sign",
            () -> new CustomWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_HANGING_SIGN), ModWoodTypes.STROPHAR));

    // Jupiter
    public static final RegistryObject<Block> JUPERIUM_BLOCK = registerBlock("juperium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)));
    public static final RegistryObject<Block> RAW_JUPERIUM_BLOCK = registerBlock("raw_juperium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> JUPERIUM_PLATING = registerBlock("juperium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.DIAMOND)));
    public static final RegistryObject<StairBlock> JUPERIUM_PLATING_STAIRS = registerBlock("juperium_plating_stairs", () -> new StairBlock(((Block)JUPERIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.DIAMOND)));
    public static final RegistryObject<SlabBlock> JUPERIUM_PLATING_SLAB = registerBlock("juperium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.DIAMOND)));
    public static final RegistryObject<RotatedPillarBlock> JUPERIUM_PILLAR = registerBlock("juperium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.DIAMOND)));
    public static final RegistryObject<RotatedPillarBlock> GLOWING_JUPERIUM_PILLAR = registerBlock("glowing_juperium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.DIAMOND)));
    public static final RegistryObject<ButtonBlock> JUPERIUM_PLATING_BUTTON = registerBlock("juperium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.DIAMOND), BlockSetType.IRON, 20, false));
    public static final RegistryObject<PressurePlateBlock> JUPERIUM_PLATING_PRESSURE_PLATE = registerBlock("juperium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.DIAMOND), BlockSetType.IRON));
    public static final RegistryObject<Block> JUPITER_JUPERIUM_ORE = registerBlock("jupiter_juperium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> JUPITER_COAL_ORE = registerBlock("jupiter_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> JUPITER_DIAMOND_ORE = registerBlock("jupiter_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> JUPITER_GOLD_ORE = registerBlock("jupiter_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<FallingBlock> JUPITER_SAND = registerBlock("jupiter_sand", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> JUPITER_STONE = registerBlock("jupiter_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> JUPITER_STONE_STAIRS = registerBlock("jupiter_stone_stairs", () -> new StairBlock(((Block)JUPITER_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> JUPITER_STONE_SLAB = registerBlock("jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> JUPITER_COBBLESTONE = registerBlock("jupiter_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> JUPITER_COBBLESTONE_STAIRS = registerBlock("jupiter_cobblestone_stairs", () -> new StairBlock(((Block)JUPITER_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> JUPITER_COBBLESTONE_SLAB = registerBlock("jupiter_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> JUPITER_STONE_BRICKS = registerBlock("jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> JUPITER_STONE_BRICK_STAIRS = registerBlock("jupiter_stone_brick_stairs", () -> new StairBlock(((Block)JUPITER_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> JUPITER_STONE_BRICK_SLAB = registerBlock("jupiter_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> JUPITER_STONE_BRICK_WALL = registerBlock("jupiter_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_JUPITER_STONE_BRICKS = registerBlock("cracked_jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_JUPITER_STONE_BRICKS = registerBlock("chiseled_jupiter_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_JUPITER_STONE_STAIRS = registerBlock("chiseled_jupiter_stone_stairs", () -> new StairBlock(((Block)CHISELED_JUPITER_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_JUPITER_STONE_SLAB = registerBlock("chiseled_jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_JUPITER_STONE = registerBlock("polished_jupiter_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_JUPITER_STONE_STAIRS = registerBlock("polished_jupiter_stone_stairs", () -> new StairBlock(((Block)POLISHED_JUPITER_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_JUPITER_STONE_SLAB = registerBlock("polished_jupiter_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> JUPITER_PILLAR = registerBlock("jupiter_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Ceres
    public static final RegistryObject<Block> CERES_COPPER_ORE = registerBlock("ceres_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> CERES_IRON_ORE = registerBlock("ceres_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<FallingBlock> CERES_SAND = registerBlock("ceres_sand", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> CERES_STONE = registerBlock("ceres_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> CERES_STONE_STAIRS = registerBlock("ceres_stone_stairs", () -> new StairBlock(((Block)CERES_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> CERES_STONE_SLAB = registerBlock("ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CERES_COBBLESTONE = registerBlock("ceres_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> CERES_COBBLESTONE_STAIRS = registerBlock("ceres_cobblestone_stairs", () -> new StairBlock(((Block)CERES_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> CERES_COBBLESTONE_SLAB = registerBlock("ceres_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> CERES_STONE_BRICKS = registerBlock("ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CERES_STONE_BRICK_STAIRS = registerBlock("ceres_stone_brick_stairs", () -> new StairBlock(((Block)CERES_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CERES_STONE_BRICK_SLAB = registerBlock("ceres_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> CERES_STONE_BRICK_WALL = registerBlock("ceres_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_CERES_STONE_BRICKS = registerBlock("cracked_ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_CERES_STONE_BRICKS = registerBlock("chiseled_ceres_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_CERES_STONE_STAIRS = registerBlock("chiseled_ceres_stone_stairs", () -> new StairBlock(((Block)CHISELED_CERES_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_CERES_STONE_SLAB = registerBlock("chiseled_ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_CERES_STONE = registerBlock("polished_ceres_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_CERES_STONE_STAIRS = registerBlock("polished_ceres_stone_stairs", () -> new StairBlock(((Block)POLISHED_CERES_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_CERES_STONE_SLAB = registerBlock("polished_ceres_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> CERES_PILLAR = registerBlock("ceres_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Saturn
    public static final RegistryObject<Block> SATURLYTE_BLOCK = registerBlock("saturlyte_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_SATURLYTE_BLOCK = registerBlock("raw_saturlyte_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> SATURLYTE_PLATING = registerBlock("saturlyte_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<StairBlock> SATURLYTE_PLATING_STAIRS = registerBlock("saturlyte_plating_stairs", () -> new StairBlock(((Block)SATURLYTE_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<SlabBlock> SATURLYTE_PLATING_SLAB = registerBlock("saturlyte_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> SATURLYTE_PILLAR = registerBlock("saturlyte_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> GLOWING_SATURLYTE_PILLAR = registerBlock("glowing_saturlyte_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<ButtonBlock> SATURLYTE_PLATING_BUTTON = registerBlock("saturlyte_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_PURPLE), BlockSetType.IRON, 20, false));
    public static final RegistryObject<PressurePlateBlock> SATURLYTE_PLATING_PRESSURE_PLATE = registerBlock("saturlyte_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_PURPLE), BlockSetType.IRON));
    public static final RegistryObject<Block> SATURN_SATURLYTE_ORE = registerBlock("saturn_saturlyte_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> SATURN_COAL_ORE = registerBlock("saturn_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> SATURN_DIAMOND_ORE = registerBlock("saturn_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> SATURN_GOLD_ORE = registerBlock("saturn_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<FallingBlock> SATURN_SAND = registerBlock("saturn_sand", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<IceBlock> SATURN_ICE = registerBlock("saturn_ice", () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SATURN_STONE = registerBlock("saturn_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> SATURN_STONE_STAIRS = registerBlock("saturn_stone_stairs", () -> new StairBlock(((Block)SATURN_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> SATURN_STONE_SLAB = registerBlock("saturn_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SATURN_COBBLESTONE = registerBlock("saturn_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> SATURN_COBBLESTONE_STAIRS = registerBlock("saturn_cobblestone_stairs", () -> new StairBlock(((Block)SATURN_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> SATURN_COBBLESTONE_SLAB = registerBlock("saturn_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SATURN_STONE_BRICKS = registerBlock("saturn_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> SATURN_STONE_BRICK_STAIRS = registerBlock("saturn_stone_brick_stairs", () -> new StairBlock(((Block)SATURN_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> SATURN_STONE_BRICK_SLAB = registerBlock("saturn_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> SATURN_STONE_BRICK_WALL = registerBlock("saturn_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_SATURN_STONE_BRICKS = registerBlock("cracked_saturn_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_SATURN_STONE_BRICKS = registerBlock("chiseled_saturn_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_SATURN_STONE_STAIRS = registerBlock("chiseled_saturn_stone_stairs", () -> new StairBlock(((Block)CHISELED_SATURN_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_SATURN_STONE_SLAB = registerBlock("chiseled_saturn_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_SATURN_STONE = registerBlock("polished_saturn_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_SATURN_STONE_STAIRS = registerBlock("polished_saturn_stone_stairs", () -> new StairBlock(((Block)POLISHED_SATURN_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_SATURN_STONE_SLAB = registerBlock("polished_saturn_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> SATURN_PILLAR = registerBlock("saturn_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Uranus
    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> URANIUM_PLATING = registerBlock("uranium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<StairBlock> URANIUM_PLATING_STAIRS = registerBlock("uranium_plating_stairs", () -> new StairBlock(((Block)URANIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<SlabBlock> URANIUM_PLATING_SLAB = registerBlock("uranium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> URANIUM_PILLAR = registerBlock("uranium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> GLOWING_URANIUM_PILLAR = registerBlock("glowing_uranium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<ButtonBlock> URANIUM_PLATING_BUTTON = registerBlock("uranium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_GREEN), BlockSetType.IRON, 20, false));
    public static final RegistryObject<PressurePlateBlock> URANIUM_PLATING_PRESSURE_PLATE = registerBlock("uranium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_GREEN), BlockSetType.IRON));
    public static final RegistryObject<Block> URANUS_URANIUM_ORE = registerBlock("uranus_uranium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> URANUS_DIAMOND_ORE = registerBlock("uranus_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<DropExperienceBlock> URANUS_ICE_SHARD_ORE = registerBlock("uranus_ice_shard_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE), UniformInt.of(2, 5)));
    public static final RegistryObject<Block> URANUS_IRON_ORE = registerBlock("uranus_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> URANUS_LAPIS_ORE = registerBlock("uranus_lapis_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> URANUS_STONE = registerBlock("uranus_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> URANUS_STONE_STAIRS = registerBlock("uranus_stone_stairs", () -> new StairBlock(((Block)URANUS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> URANUS_STONE_SLAB = registerBlock("uranus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> URANUS_COBBLESTONE = registerBlock("uranus_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> URANUS_COBBLESTONE_STAIRS = registerBlock("uranus_cobblestone_stairs", () -> new StairBlock(((Block)URANUS_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> URANUS_COBBLESTONE_SLAB = registerBlock("uranus_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> URANUS_STONE_BRICKS = registerBlock("uranus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> URANUS_STONE_BRICK_STAIRS = registerBlock("uranus_stone_brick_stairs", () -> new StairBlock(((Block)URANUS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> URANUS_STONE_BRICK_SLAB = registerBlock("uranus_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> URANUS_STONE_BRICK_WALL = registerBlock("uranus_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_URANUS_STONE_BRICKS = registerBlock("cracked_uranus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_URANUS_STONE_BRICKS = registerBlock("chiseled_uranus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_URANUS_STONE_STAIRS = registerBlock("chiseled_uranus_stone_stairs", () -> new StairBlock(((Block)CHISELED_URANUS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_URANUS_STONE_SLAB = registerBlock("chiseled_uranus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_URANUS_STONE = registerBlock("polished_uranus_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_URANUS_STONE_STAIRS = registerBlock("polished_uranus_stone_stairs", () -> new StairBlock(((Block)POLISHED_URANUS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_URANUS_STONE_SLAB = registerBlock("polished_uranus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> URANUS_PILLAR = registerBlock("uranus_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Neptune
    public static final RegistryObject<Block> NEPTUNIUM_BLOCK = registerBlock("neptunium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_NEPTUNIUM_BLOCK = registerBlock("raw_neptunium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> NEPTUNIUM_PLATING = registerBlock("neptunium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<StairBlock> NEPTUNIUM_PLATING_STAIRS = registerBlock("neptunium_plating_stairs", () -> new StairBlock(((Block)NEPTUNIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<SlabBlock> NEPTUNIUM_PLATING_SLAB = registerBlock("neptunium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> NEPTUNIUM_PILLAR = registerBlock("neptunium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> GLOWING_NEPTUNIUM_PILLAR = registerBlock("glowing_neptunium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<ButtonBlock> NEPTUNIUM_PLATING_BUTTON = registerBlock("neptunium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_LIGHT_GREEN), BlockSetType.IRON, 20, false));
    public static final RegistryObject<PressurePlateBlock> NEPTUNIUM_PLATING_PRESSURE_PLATE = registerBlock("neptunium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_LIGHT_GREEN), BlockSetType.IRON));
    public static final RegistryObject<Block> NEPTUNE_NEPTUNIUM_ORE = registerBlock("neptune_neptunium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> NEPTUNE_COAL_ORE = registerBlock("neptune_coal_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> NEPTUNE_COPPER_ORE = registerBlock("neptune_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> NEPTUNE_IRON_ORE = registerBlock("neptune_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> NEPTUNE_STONE = registerBlock("neptune_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> NEPTUNE_STONE_STAIRS = registerBlock("neptune_stone_stairs", () -> new StairBlock(((Block)NEPTUNE_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> NEPTUNE_STONE_SLAB = registerBlock("neptune_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> NEPTUNE_COBBLESTONE = registerBlock("neptune_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> NEPTUNE_COBBLESTONE_STAIRS = registerBlock("neptune_cobblestone_stairs", () -> new StairBlock(((Block)NEPTUNE_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> NEPTUNE_COBBLESTONE_SLAB = registerBlock("neptune_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> NEPTUNE_STONE_BRICKS = registerBlock("neptune_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> NEPTUNE_STONE_BRICK_STAIRS = registerBlock("neptune_stone_brick_stairs", () -> new StairBlock(((Block)NEPTUNE_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> NEPTUNE_STONE_BRICK_SLAB = registerBlock("neptune_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> NEPTUNE_STONE_BRICK_WALL = registerBlock("neptune_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_NEPTUNE_STONE_BRICKS = registerBlock("cracked_neptune_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_NEPTUNE_STONE_BRICKS = registerBlock("chiseled_neptune_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_NEPTUNE_STONE_STAIRS = registerBlock("chiseled_neptune_stone_stairs", () -> new StairBlock(((Block)CHISELED_NEPTUNE_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_NEPTUNE_STONE_SLAB = registerBlock("chiseled_neptune_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_NEPTUNE_STONE = registerBlock("polished_neptune_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_NEPTUNE_STONE_STAIRS = registerBlock("polished_neptune_stone_stairs", () -> new StairBlock(((Block)POLISHED_NEPTUNE_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_NEPTUNE_STONE_SLAB = registerBlock("polished_neptune_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> NEPTUNE_PILLAR = registerBlock("neptune_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Orcus
    public static final RegistryObject<Block> RADIUM_BLOCK = registerBlock("radium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_RADIUM_BLOCK = registerBlock("raw_radium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> RADIUM_PLATING = registerBlock("radium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<StairBlock> RADIUM_PLATING_STAIRS = registerBlock("radium_plating_stairs", () -> new StairBlock(((Block)RADIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<SlabBlock> RADIUM_PLATING_SLAB = registerBlock("radium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> RADIUM_PILLAR = registerBlock("radium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> GLOWING_RADIUM_PILLAR = registerBlock("glowing_radium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_LIGHT_GREEN).sound(SoundType.AMETHYST)));
    public static final RegistryObject<ButtonBlock> RADIUM_PLATING_BUTTON = registerBlock("radium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_LIGHT_GREEN), BlockSetType.IRON, 20, false));
    public static final RegistryObject<PressurePlateBlock> RADIUM_PLATING_PRESSURE_PLATE = registerBlock("radium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_LIGHT_GREEN), BlockSetType.IRON));
    public static final RegistryObject<Block> ORCUS_RADIUM_ORE = registerBlock("orcus_radium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> ORCUS_COPPER_ORE = registerBlock("orcus_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> ORCUS_IRON_ORE = registerBlock("orcus_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> ORCUS_STONE = registerBlock("orcus_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> ORCUS_STONE_STAIRS = registerBlock("orcus_stone_stairs", () -> new StairBlock(((Block)ORCUS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> ORCUS_STONE_SLAB = registerBlock("orcus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ORCUS_COBBLESTONE = registerBlock("orcus_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> ORCUS_COBBLESTONE_STAIRS = registerBlock("orcus_cobblestone_stairs", () -> new StairBlock(((Block)ORCUS_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> ORCUS_COBBLESTONE_SLAB = registerBlock("orcus_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> ORCUS_STONE_BRICKS = registerBlock("orcus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> ORCUS_STONE_BRICK_STAIRS = registerBlock("orcus_stone_brick_stairs", () -> new StairBlock(((Block)ORCUS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> ORCUS_STONE_BRICK_SLAB = registerBlock("orcus_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> ORCUS_STONE_BRICK_WALL = registerBlock("orcus_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_ORCUS_STONE_BRICKS = registerBlock("cracked_orcus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_ORCUS_STONE_BRICKS = registerBlock("chiseled_orcus_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_ORCUS_STONE_STAIRS = registerBlock("chiseled_orcus_stone_stairs", () -> new StairBlock(((Block)CHISELED_ORCUS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_ORCUS_STONE_SLAB = registerBlock("chiseled_orcus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_ORCUS_STONE = registerBlock("polished_orcus_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_ORCUS_STONE_STAIRS = registerBlock("polished_orcus_stone_stairs", () -> new StairBlock(((Block)POLISHED_ORCUS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_ORCUS_STONE_SLAB = registerBlock("polished_orcus_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> ORCUS_PILLAR = registerBlock("orcus_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Pluto
    public static final RegistryObject<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_PLUTONIUM_BLOCK = registerBlock("raw_plutonium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> PLUTONIUM_PLATING = registerBlock("plutonium_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryObject<StairBlock> PLUTONIUM_PLATING_STAIRS = registerBlock("plutonium_plating_stairs", () -> new StairBlock(((Block)PLUTONIUM_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryObject<SlabBlock> PLUTONIUM_PLATING_SLAB = registerBlock("plutonium_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> PLUTONIUM_PILLAR = registerBlock("plutonium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> GLOWING_PLUTONIUM_PILLAR = registerBlock("glowing_plutonium_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_YELLOW).sound(SoundType.AMETHYST)));
    public static final RegistryObject<ButtonBlock> PLUTONIUM_PLATING_BUTTON = registerBlock("plutonium_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_YELLOW), BlockSetType.IRON, 20, false));
    public static final RegistryObject<PressurePlateBlock> PLUTONIUM_PLATING_PRESSURE_PLATE = registerBlock("plutonium_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_YELLOW), BlockSetType.IRON));
    public static final RegistryObject<Block> PLUTO_PLUTONIUM_ORE = registerBlock("pluto_plutonium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> PLUTO_DIAMOND_ORE = registerBlock("pluto_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> PLUTO_GOLD_ORE = registerBlock("pluto_gold_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<FallingBlock> PLUTO_SAND = registerBlock("pluto_sand", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> PLUTO_STONE = registerBlock("pluto_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> PLUTO_STONE_STAIRS = registerBlock("pluto_stone_stairs", () -> new StairBlock(((Block)PLUTO_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> PLUTO_STONE_SLAB = registerBlock("pluto_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> PLUTO_COBBLESTONE = registerBlock("pluto_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> PLUTO_COBBLESTONE_STAIRS = registerBlock("pluto_cobblestone_stairs", () -> new StairBlock(((Block)PLUTO_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> PLUTO_COBBLESTONE_SLAB = registerBlock("pluto_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> PLUTO_STONE_BRICKS = registerBlock("pluto_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> PLUTO_STONE_BRICK_STAIRS = registerBlock("pluto_stone_brick_stairs", () -> new StairBlock(((Block)PLUTO_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> PLUTO_STONE_BRICK_SLAB = registerBlock("pluto_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> PLUTO_STONE_BRICK_WALL = registerBlock("pluto_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_PLUTO_STONE_BRICKS = registerBlock("cracked_pluto_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_PLUTO_STONE_BRICKS = registerBlock("chiseled_pluto_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_PLUTO_STONE_STAIRS = registerBlock("chiseled_pluto_stone_stairs", () -> new StairBlock(((Block)CHISELED_PLUTO_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_PLUTO_STONE_SLAB = registerBlock("chiseled_pluto_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_PLUTO_STONE = registerBlock("polished_pluto_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_PLUTO_STONE_STAIRS = registerBlock("polished_pluto_stone_stairs", () -> new StairBlock(((Block)POLISHED_PLUTO_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_PLUTO_STONE_SLAB = registerBlock("polished_pluto_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> PLUTO_PILLAR = registerBlock("pluto_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Haumea
    public static final RegistryObject<Block> HAUMEA_COPPER_ORE = registerBlock("haumea_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> HAUMEA_IRON_ORE = registerBlock("haumea_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> HAUMEA_STONE = registerBlock("haumea_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> HAUMEA_STONE_STAIRS = registerBlock("haumea_stone_stairs", () -> new StairBlock(((Block)HAUMEA_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> HAUMEA_STONE_SLAB = registerBlock("haumea_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> HAUMEA_COBBLESTONE = registerBlock("haumea_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> HAUMEA_COBBLESTONE_STAIRS = registerBlock("haumea_cobblestone_stairs", () -> new StairBlock(((Block)HAUMEA_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> HAUMEA_COBBLESTONE_SLAB = registerBlock("haumea_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> HAUMEA_STONE_BRICKS = registerBlock("haumea_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> HAUMEA_STONE_BRICK_STAIRS = registerBlock("haumea_stone_brick_stairs", () -> new StairBlock(((Block)HAUMEA_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> HAUMEA_STONE_BRICK_SLAB = registerBlock("haumea_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> HAUMEA_STONE_BRICK_WALL = registerBlock("haumea_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_HAUMEA_STONE_BRICKS = registerBlock("cracked_haumea_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_HAUMEA_STONE_BRICKS = registerBlock("chiseled_haumea_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_HAUMEA_STONE_STAIRS = registerBlock("chiseled_haumea_stone_stairs", () -> new StairBlock(((Block)CHISELED_HAUMEA_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_HAUMEA_STONE_SLAB = registerBlock("chiseled_haumea_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_HAUMEA_STONE = registerBlock("polished_haumea_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_HAUMEA_STONE_STAIRS = registerBlock("polished_haumea_stone_stairs", () -> new StairBlock(((Block)POLISHED_HAUMEA_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_HAUMEA_STONE_SLAB = registerBlock("polished_haumea_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> HAUMEA_PILLAR = registerBlock("haumea_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Quaoar
    public static final RegistryObject<Block> QUAOAR_COPPER_ORE = registerBlock("quaoar_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> QUAOAR_IRON_ORE = registerBlock("quaoar_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> QUAOAR_STONE = registerBlock("quaoar_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> QUAOAR_STONE_STAIRS = registerBlock("quaoar_stone_stairs", () -> new StairBlock(((Block)QUAOAR_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> QUAOAR_STONE_SLAB = registerBlock("quaoar_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> QUAOAR_COBBLESTONE = registerBlock("quaoar_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> QUAOAR_COBBLESTONE_STAIRS = registerBlock("quaoar_cobblestone_stairs", () -> new StairBlock(((Block)QUAOAR_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> QUAOAR_COBBLESTONE_SLAB = registerBlock("quaoar_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> QUAOAR_STONE_BRICKS = registerBlock("quaoar_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> QUAOAR_STONE_BRICK_STAIRS = registerBlock("quaoar_stone_brick_stairs", () -> new StairBlock(((Block)QUAOAR_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> QUAOAR_STONE_BRICK_SLAB = registerBlock("quaoar_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> QUAOAR_STONE_BRICK_WALL = registerBlock("quaoar_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_QUAOAR_STONE_BRICKS = registerBlock("cracked_quaoar_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_QUAOAR_STONE_BRICKS = registerBlock("chiseled_quaoar_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_QUAOAR_STONE_STAIRS = registerBlock("chiseled_quaoar_stone_stairs", () -> new StairBlock(((Block)CHISELED_QUAOAR_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_QUAOAR_STONE_SLAB = registerBlock("chiseled_quaoar_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_QUAOAR_STONE = registerBlock("polished_quaoar_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_QUAOAR_STONE_STAIRS = registerBlock("polished_quaoar_stone_stairs", () -> new StairBlock(((Block)POLISHED_QUAOAR_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_QUAOAR_STONE_SLAB = registerBlock("polished_quaoar_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> QUAOAR_PILLAR = registerBlock("quaoar_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Makemake
    public static final RegistryObject<Block> MAKEMAKE_COPPER_ORE = registerBlock("makemake_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> MAKEMAKE_IRON_ORE = registerBlock("makemake_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> MAKEMAKE_STONE = registerBlock("makemake_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> MAKEMAKE_STONE_STAIRS = registerBlock("makemake_stone_stairs", () -> new StairBlock(((Block)MAKEMAKE_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> MAKEMAKE_STONE_SLAB = registerBlock("makemake_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MAKEMAKE_COBBLESTONE = registerBlock("makemake_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> MAKEMAKE_COBBLESTONE_STAIRS = registerBlock("makemake_cobblestone_stairs", () -> new StairBlock(((Block)MAKEMAKE_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> MAKEMAKE_COBBLESTONE_SLAB = registerBlock("makemake_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> MAKEMAKE_STONE_BRICKS = registerBlock("makemake_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> MAKEMAKE_STONE_BRICK_STAIRS = registerBlock("makemake_stone_brick_stairs", () -> new StairBlock(((Block)MAKEMAKE_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> MAKEMAKE_STONE_BRICK_SLAB = registerBlock("makemake_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> MAKEMAKE_STONE_BRICK_WALL = registerBlock("makemake_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_MAKEMAKE_STONE_BRICKS = registerBlock("cracked_makemake_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_MAKEMAKE_STONE_BRICKS = registerBlock("chiseled_makemake_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_MAKEMAKE_STONE_STAIRS = registerBlock("chiseled_makemake_stone_stairs", () -> new StairBlock(((Block)CHISELED_MAKEMAKE_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_MAKEMAKE_STONE_SLAB = registerBlock("chiseled_makemake_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_MAKEMAKE_STONE = registerBlock("polished_makemake_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_MAKEMAKE_STONE_STAIRS = registerBlock("polished_makemake_stone_stairs", () -> new StairBlock(((Block)POLISHED_MAKEMAKE_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_MAKEMAKE_STONE_SLAB = registerBlock("polished_makemake_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> MAKEMAKE_PILLAR = registerBlock("makemake_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Gonggong
    public static final RegistryObject<Block> GONGGONG_COPPER_ORE = registerBlock("gonggong_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> GONGGONG_IRON_ORE = registerBlock("gonggong_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> GONGGONG_STONE = registerBlock("gonggong_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> GONGGONG_STONE_STAIRS = registerBlock("gonggong_stone_stairs", () -> new StairBlock(((Block)GONGGONG_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> GONGGONG_STONE_SLAB = registerBlock("gonggong_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GONGGONG_COBBLESTONE = registerBlock("gonggong_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> GONGGONG_COBBLESTONE_STAIRS = registerBlock("gonggong_cobblestone_stairs", () -> new StairBlock(((Block)GONGGONG_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> GONGGONG_COBBLESTONE_SLAB = registerBlock("gonggong_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GONGGONG_STONE_BRICKS = registerBlock("gonggong_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> GONGGONG_STONE_BRICK_STAIRS = registerBlock("gonggong_stone_brick_stairs", () -> new StairBlock(((Block)GONGGONG_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> GONGGONG_STONE_BRICK_SLAB = registerBlock("gonggong_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> GONGGONG_STONE_BRICK_WALL = registerBlock("gonggong_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_GONGGONG_STONE_BRICKS = registerBlock("cracked_gonggong_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_GONGGONG_STONE_BRICKS = registerBlock("chiseled_gonggong_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_GONGGONG_STONE_STAIRS = registerBlock("chiseled_gonggong_stone_stairs", () -> new StairBlock(((Block)CHISELED_GONGGONG_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_GONGGONG_STONE_SLAB = registerBlock("chiseled_gonggong_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_GONGGONG_STONE = registerBlock("polished_gonggong_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_GONGGONG_STONE_STAIRS = registerBlock("polished_gonggong_stone_stairs", () -> new StairBlock(((Block)POLISHED_GONGGONG_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_GONGGONG_STONE_SLAB = registerBlock("polished_gonggong_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> GONGGONG_PILLAR = registerBlock("gonggong_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Eris
    public static final RegistryObject<Block> ERIS_COPPER_ORE = registerBlock("eris_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> ERIS_IRON_ORE = registerBlock("eris_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> ERIS_STONE = registerBlock("eris_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> ERIS_STONE_STAIRS = registerBlock("eris_stone_stairs", () -> new StairBlock(((Block)ERIS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> ERIS_STONE_SLAB = registerBlock("eris_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ERIS_COBBLESTONE = registerBlock("eris_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> ERIS_COBBLESTONE_STAIRS = registerBlock("eris_cobblestone_stairs", () -> new StairBlock(((Block)ERIS_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> ERIS_COBBLESTONE_SLAB = registerBlock("eris_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> ERIS_STONE_BRICKS = registerBlock("eris_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> ERIS_STONE_BRICK_STAIRS = registerBlock("eris_stone_brick_stairs", () -> new StairBlock(((Block)ERIS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> ERIS_STONE_BRICK_SLAB = registerBlock("eris_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> ERIS_STONE_BRICK_WALL = registerBlock("eris_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_ERIS_STONE_BRICKS = registerBlock("cracked_eris_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_ERIS_STONE_BRICKS = registerBlock("chiseled_eris_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_ERIS_STONE_STAIRS = registerBlock("chiseled_eris_stone_stairs", () -> new StairBlock(((Block)CHISELED_ERIS_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_ERIS_STONE_SLAB = registerBlock("chiseled_eris_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_ERIS_STONE = registerBlock("polished_eris_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_ERIS_STONE_STAIRS = registerBlock("polished_eris_stone_stairs", () -> new StairBlock(((Block)POLISHED_ERIS_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_ERIS_STONE_SLAB = registerBlock("polished_eris_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> ERIS_PILLAR = registerBlock("eris_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Sedna
    public static final RegistryObject<Block> ELECTROLYTE_BLOCK = registerBlock("electrolyte_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> RAW_ELECTROLYTE_BLOCK = registerBlock("raw_electrolyte_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistryObject<Block> ELECTROLYTE_PLATING = registerBlock("electrolyte_plating", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<StairBlock> ELECTROLYTE_PLATING_STAIRS = registerBlock("electrolyte_plating_stairs", () -> new StairBlock(((Block)ELECTROLYTE_PLATING.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_STAIRS).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<SlabBlock> ELECTROLYTE_PLATING_SLAB = registerBlock("electrolyte_plating_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> ELECTROLYTE_PILLAR = registerBlock("electrolyte_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<RotatedPillarBlock> GLOWING_ELECTROLYTE_PILLAR = registerBlock("glowing_electrolyte_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).lightLevel((state) -> {
        return 15;
    }).mapColor(MapColor.COLOR_BLUE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<ButtonBlock> ELECTROLYTE_PLATING_BUTTON = registerBlock("electrolyte_plating_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).mapColor(MapColor.COLOR_BLUE), BlockSetType.IRON, 20, false));
    public static final RegistryObject<PressurePlateBlock> ELECTROLYTE_PLATING_PRESSURE_PLATE = registerBlock("electrolyte_plating_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(MapColor.COLOR_BLUE), BlockSetType.IRON));
    public static final RegistryObject<Block> SEDNA_ELECTROLYTE_ORE = registerBlock("sedna_electrolyte_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> SEDNA_COPPER_ORE = registerBlock("sedna_copper_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> SEDNA_IRON_ORE = registerBlock("sedna_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> SEDNA_STONE = registerBlock("sedna_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> SEDNA_STONE_STAIRS = registerBlock("sedna_stone_stairs", () -> new StairBlock(((Block)SEDNA_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> SEDNA_STONE_SLAB = registerBlock("sedna_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SEDNA_COBBLESTONE = registerBlock("sedna_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> SEDNA_COBBLESTONE_STAIRS = registerBlock("sedna_cobblestone_stairs", () -> new StairBlock(((Block)SEDNA_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> SEDNA_COBBLESTONE_SLAB = registerBlock("sedna_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SEDNA_STONE_BRICKS = registerBlock("sedna_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> SEDNA_STONE_BRICK_STAIRS = registerBlock("sedna_stone_brick_stairs", () -> new StairBlock(((Block)SEDNA_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> SEDNA_STONE_BRICK_SLAB = registerBlock("sedna_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> SEDNA_STONE_BRICK_WALL = registerBlock("sedna_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_SEDNA_STONE_BRICKS = registerBlock("cracked_sedna_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_SEDNA_STONE_BRICKS = registerBlock("chiseled_sedna_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_SEDNA_STONE_STAIRS = registerBlock("chiseled_sedna_stone_stairs", () -> new StairBlock(((Block)CHISELED_SEDNA_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_SEDNA_STONE_SLAB = registerBlock("chiseled_sedna_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_SEDNA_STONE = registerBlock("polished_sedna_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_SEDNA_STONE_STAIRS = registerBlock("polished_sedna_stone_stairs", () -> new StairBlock(((Block)POLISHED_SEDNA_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_SEDNA_STONE_SLAB = registerBlock("polished_sedna_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> SEDNA_PILLAR = registerBlock("sedna_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Proxima Centauri b
    public static final RegistryObject<Block> B_DIAMOND_ORE = registerBlock("b_diamond_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> B_EMERALD_ORE = registerBlock("b_emerald_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));
    public static final RegistryObject<Block> B_IRON_ORE = registerBlock("b_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<RedStoneOreBlock> B_REDSTONE_ORE = registerBlock("b_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<FallingBlock> B_SAND = registerBlock("b_sand", () -> new FallingBlock(BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryObject<Block> B_SANDSTONE = registerBlock("b_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> B_SANDSTONE_BRICKS = registerBlock("b_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<StairBlock> B_SANDSTONE_BRICK_STAIRS = registerBlock("b_sandstone_brick_stairs", () -> new StairBlock(((Block)B_SANDSTONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<SlabBlock> B_SANDSTONE_BRICK_SLAB = registerBlock("b_sandstone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> CRACKED_B_SANDSTONE_BRICKS = registerBlock("cracked_b_sandstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistryObject<Block> B_STONE = registerBlock("b_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> B_STONE_STAIRS = registerBlock("b_stone_stairs", () -> new StairBlock(((Block)B_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> B_STONE_SLAB = registerBlock("b_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> B_COBBLESTONE = registerBlock("b_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<StairBlock> B_COBBLESTONE_STAIRS = registerBlock("b_cobblestone_stairs", () -> new StairBlock(((Block)B_COBBLESTONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<SlabBlock> B_COBBLESTONE_SLAB = registerBlock("b_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> B_STONE_BRICKS = registerBlock("b_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<StairBlock> B_STONE_BRICK_STAIRS = registerBlock("b_stone_brick_stairs", () -> new StairBlock(((Block)B_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> B_STONE_BRICK_SLAB = registerBlock("b_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<WallBlock> B_STONE_BRICK_WALL = registerBlock("b_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_B_STONE_BRICKS = registerBlock("cracked_b_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_B_STONE_BRICKS = registerBlock("chiseled_b_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<StairBlock> CHISELED_B_STONE_STAIRS = registerBlock("chiseled_b_stone_stairs", () -> new StairBlock(((Block)CHISELED_B_STONE_BRICKS.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<SlabBlock> CHISELED_B_STONE_SLAB = registerBlock("chiseled_b_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_B_STONE = registerBlock("polished_b_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> POLISHED_B_STONE_STAIRS = registerBlock("polished_b_stone_stairs", () -> new StairBlock(((Block)POLISHED_B_STONE.get()).defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock> POLISHED_B_STONE_SLAB = registerBlock("polished_b_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<RotatedPillarBlock> B_PILLAR = registerBlock("b_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));

    // Glacio
    public static final RegistryObject<GlacianSaplingBlock> GLACIAN_SAPLING = registerBlock("glacian_sapling",
            () -> new GlacianSaplingBlock(new GlacianTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<FlowerPotBlock> POTTED_GLACIAN_SAPLING = BLOCKS.register("potted_glacian_sapling",
            () -> new FlowerPotBlock(GLACIAN_SAPLING.get(), BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<CustomCeilingHangingSignBlock> GLACIAN_HANGING_SIGN = BLOCKS.register("glacian_hanging_sign",
            () -> new CustomCeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.GLACIAN));
    public static final RegistryObject<CustomWallHangingSignBlock> GLACIAN_WALL_HANGING_SIGN = BLOCKS.register("glacian_wall_hanging_sign",
            () -> new CustomWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.GLACIAN));

    // Globes
    public static final RegistryObject<StandardGlobeBlock> CERES_GLOBE = BLOCKS.register("ceres_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> JUPITER_GLOBE = BLOCKS.register("jupiter_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> NEPTUNE_GLOBE = BLOCKS.register("neptune_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> ORCUS_GLOBE = BLOCKS.register("orcus_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> PLUTO_GLOBE = BLOCKS.register("pluto_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> QUAOAR_GLOBE = BLOCKS.register("quaoar_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> MAKEMAKE_GLOBE = BLOCKS.register("makemake_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> GONGGONG_GLOBE = BLOCKS.register("gonggong_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> ERIS_GLOBE = BLOCKS.register("eris_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));
    public static final RegistryObject<StandardGlobeBlock> B_GLOBE = BLOCKS.register("b_globe",
            () -> new StandardGlobeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).noOcclusion()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
