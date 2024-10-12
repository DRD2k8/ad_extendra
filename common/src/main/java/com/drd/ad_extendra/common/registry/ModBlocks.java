package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.blocks.CustomGlobeBlock;
import com.drd.ad_extendra.common.blocks.CustomSlidingDoorBlock;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.adastra.common.items.rendered.RenderedBlockItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class ModBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, AdExtendra.MOD_ID);
    public static final ResourcefulRegistry<Block> BASIC_BLOCKS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> STAIRS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> SLABS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> WALLS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> PILLARS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> BUTTONS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> METAL_BUTTONS = ResourcefulRegistries.create(BUTTONS);
    public static final ResourcefulRegistry<Block> PRESSURE_PLATES = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> METAL_PRESSURE_PLATES = ResourcefulRegistries.create(PRESSURE_PLATES);
    public static final ResourcefulRegistry<Block> CTM_CUBES = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> SLIDING_DOORS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> GLOBES = ResourcefulRegistries.create(BLOCKS);

    // Globes
    public static final RegistryEntry<CustomGlobeBlock> CERES_GLOBE = registerGlobe("ceres_globe");
    public static final RegistryEntry<CustomGlobeBlock> JUPITER_GLOBE = registerGlobe("jupiter_globe");
    public static final RegistryEntry<CustomGlobeBlock> SATURN_GLOBE = registerGlobe("saturn_globe");
    public static final RegistryEntry<CustomGlobeBlock> URANUS_GLOBE = registerGlobe("uranus_globe");
    public static final RegistryEntry<CustomGlobeBlock> NEPTUNE_GLOBE = registerGlobe("neptune_globe");
    public static final RegistryEntry<CustomGlobeBlock> ORCUS_GLOBE = registerGlobe("orcus_globe");
    public static final RegistryEntry<CustomGlobeBlock> PLUTO_GLOBE = registerGlobe("pluto_globe");
    public static final RegistryEntry<CustomGlobeBlock> HAUMEA_GLOBE = registerGlobe("haumea_globe");
    public static final RegistryEntry<CustomGlobeBlock> QUAOAR_GLOBE = registerGlobe("quaoar_globe");
    public static final RegistryEntry<CustomGlobeBlock> MAKEMAKE_GLOBE = registerGlobe("makemake_globe");
    public static final RegistryEntry<CustomGlobeBlock> GONGGONG_GLOBE = registerGlobe("gonggong_globe");
    public static final RegistryEntry<CustomGlobeBlock> ERIS_GLOBE = registerGlobe("eris_globe");
    public static final RegistryEntry<CustomGlobeBlock> SEDNA_GLOBE = registerGlobe("sedna_globe");
    public static final RegistryEntry<CustomGlobeBlock> B_GLOBE = registerGlobe("b_globe");

    // Ceres
    public static final RegistryEntry<Block> CERES_SAND = registerBlock("ceres_sand", () -> new SandBlock(6974058, BlockBehaviour.Properties.copy(Blocks.SAND).mapColor(MapColor.STONE)));
    public static final RegistryEntry<Block> CERES_STONE = registerBlock("ceres_stone", () -> new Block(ceresStoneProperties()));
    public static final RegistryEntry<StairBlock> CERES_STONE_STAIRS = registerStairs("ceres_stone_stairs", CERES_STONE, ceresStoneProperties());
    public static final RegistryEntry<SlabBlock> CERES_STONE_SLAB = registerSlab("ceres_stone_slab", ceresStoneProperties());
    public static final RegistryEntry<Block> CERES_COBBLESTONE = registerBlock("ceres_cobblestone", () -> new Block(ceresStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> CERES_COBBLESTONE_STAIRS = registerStairs("ceres_cobblestone_stairs", CERES_COBBLESTONE, ceresStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> CERES_COBBLESTONE_SLAB = registerSlab("ceres_cobblestone_slab", ceresStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> CERES_STONE_BRICKS = registerBlock("ceres_stone_bricks", () -> new Block(ceresStoneProperties()));
    public static final RegistryEntry<StairBlock> CERES_STONE_BRICK_STAIRS = registerStairs("ceres_stone_brick_stairs", CERES_STONE_BRICKS, ceresStoneProperties());
    public static final RegistryEntry<SlabBlock> CERES_STONE_BRICK_SLAB = registerSlab("ceres_stone_brick_slab", ceresStoneProperties());
    public static final RegistryEntry<WallBlock> CERES_STONE_BRICK_WALL = registerWall("ceres_stone_brick_wall", ceresStoneProperties());
    public static final RegistryEntry<Block> CRACKED_CERES_STONE_BRICKS = registerBlock("cracked_ceres_stone_bricks", () -> new Block(ceresStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_CERES_STONE_BRICKS = registerBlock("chiseled_ceres_stone_bricks", () -> new Block(ceresStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_CERES_STONE_STAIRS = registerStairs("chiseled_ceres_stone_stairs", CHISELED_CERES_STONE_BRICKS, ceresStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_CERES_STONE_SLAB = registerSlab("chiseled_ceres_stone_slab", ceresStoneProperties());
    public static final RegistryEntry<Block> POLISHED_CERES_STONE = registerBlock("polished_ceres_stone", () -> new Block(ceresStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_CERES_STONE_STAIRS = registerStairs("polished_ceres_stone_stairs", POLISHED_CERES_STONE, ceresStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_CERES_STONE_SLAB = registerSlab("polished_ceres_stone_slab", ceresStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> CERES_PILLAR = registerPillar("ceres_pillar", ceresStoneProperties());

    // Jupiter
    public static final RegistryEntry<Block> JUPERIUM_BLOCK = registerBlock("juperium_block", () -> new Block(juperiumProperties()));
    public static final RegistryEntry<Block> RAW_JUPERIUM_BLOCK = registerBlock("raw_juperium_block", () -> new Block(juperiumProperties()));
    public static final RegistryEntry<Block> JUPERIUM_FACTORY_BLOCK = registerCtmCube("juperium_factory_block", () -> new Block(juperiumProperties()));
    public static final RegistryEntry<Block> ENCASED_JUPERIUM_BLOCK = registerBlock("encased_juperium_block", () -> new Block(juperiumProperties()));
    public static final RegistryEntry<Block> JUPERIUM_PLATEBLOCK = registerBlock("juperium_plateblock", () -> new Block(juperiumProperties()));
    public static final RegistryEntry<Block> JUPERIUM_PANEL = registerBlock("juperium_panel", () -> new Block(juperiumProperties()));
    public static final RegistryEntry<Block> JUPERIUM_PLATING = registerBlock("juperium_plating", () -> new Block(juperiumProperties()));
    public static final RegistryEntry<StairBlock> JUPERIUM_PLATING_STAIRS = registerStairs("juperium_plating_stairs", JUPERIUM_PLATING, juperiumProperties());
    public static final RegistryEntry<SlabBlock> JUPERIUM_PLATING_SLAB = registerSlab("juperium_plating_slab", juperiumProperties());
    public static final RegistryEntry<RotatedPillarBlock> JUPERIUM_PILLAR = registerPillar("juperium_pillar", juperiumProperties());
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_JUPERIUM_PILLAR = registerGlowingPillar("glowing_juperium_pillar", juperiumProperties());
    public static final RegistryEntry<ButtonBlock> JUPERIUM_PLATING_BUTTON = registerMetalButton("juperium_plating_button", MapColor.DIAMOND, 9, 30, SoundType.NETHERITE_BLOCK);
    public static final RegistryEntry<PressurePlateBlock> JUPERIUM_PLATING_PRESSURE_PLATE = registerMetalPressurePlate("juperium_plating_pressure_plate", MapColor.DIAMOND, 9, 30, SoundType.NETHERITE_BLOCK);
    public static final RegistryEntry<CustomSlidingDoorBlock> JUPERIUM_SLIDING_DOOR = registerSlidingDoor("juperium_sliding_door", MapColor.DIAMOND, 9, 30, SoundType.NETHERITE_BLOCK);
    public static final RegistryEntry<Block> JUPITER_SAND = registerBlock("jupiter_sand", () -> new SandBlock(12359294, BlockBehaviour.Properties.copy(Blocks.SAND).mapColor(MapColor.RAW_IRON)));
    public static final RegistryEntry<Block> JUPITER_STONE = registerBlock("jupiter_stone", () -> new Block(jupiterStoneProperties()));
    public static final RegistryEntry<StairBlock> JUPITER_STONE_STAIRS = registerStairs("jupiter_stone_stairs", JUPITER_STONE, jupiterStoneProperties());
    public static final RegistryEntry<SlabBlock> JUPITER_STONE_SLAB = registerSlab("jupiter_stone_slab", jupiterStoneProperties());
    public static final RegistryEntry<Block> JUPITER_COBBLESTONE = registerBlock("jupiter_cobblestone", () -> new Block(jupiterStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> JUPITER_COBBLESTONE_STAIRS = registerStairs("jupiter_cobblestone_stairs", JUPITER_COBBLESTONE, jupiterStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> JUPITER_COBBLESTONE_SLAB = registerSlab("jupiter_cobblestone_slab", jupiterStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> JUPITER_STONE_BRICKS = registerBlock("jupiter_stone_bricks", () -> new Block(jupiterStoneProperties()));
    public static final RegistryEntry<StairBlock> JUPITER_STONE_BRICK_STAIRS = registerStairs("jupiter_stone_brick_stairs", JUPITER_STONE_BRICKS, jupiterStoneProperties());
    public static final RegistryEntry<SlabBlock> JUPITER_STONE_BRICK_SLAB = registerSlab("jupiter_stone_brick_slab", jupiterStoneProperties());
    public static final RegistryEntry<WallBlock> JUPITER_STONE_BRICK_WALL = registerWall("jupiter_stone_brick_wall", jupiterStoneProperties());
    public static final RegistryEntry<Block> CRACKED_JUPITER_STONE_BRICKS = registerBlock("cracked_jupiter_stone_bricks", () -> new Block(jupiterStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_JUPITER_STONE_BRICKS = registerBlock("chiseled_jupiter_stone_bricks", () -> new Block(jupiterStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_JUPITER_STONE_STAIRS = registerStairs("chiseled_jupiter_stone_stairs", CHISELED_JUPITER_STONE_BRICKS, jupiterStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_JUPITER_STONE_SLAB = registerSlab("chiseled_jupiter_stone_slab", jupiterStoneProperties());
    public static final RegistryEntry<Block> POLISHED_JUPITER_STONE = registerBlock("polished_jupiter_stone", () -> new Block(jupiterStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_JUPITER_STONE_STAIRS = registerStairs("polished_jupiter_stone_stairs", POLISHED_JUPITER_STONE, jupiterStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_JUPITER_STONE_SLAB = registerSlab("polished_jupiter_stone_slab", jupiterStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> JUPITER_PILLAR = registerPillar("jupiter_pillar", jupiterStoneProperties());
    
    // Saturn
    public static final RegistryEntry<Block> SATURLYTE_BLOCK = registerBlock("saturlyte_block", () -> new Block(saturlyteProperties()));
    public static final RegistryEntry<Block> RAW_SATURLYTE_BLOCK = registerBlock("raw_saturlyte_block", () -> new Block(saturlyteProperties()));
    public static final RegistryEntry<Block> SATURLYTE_FACTORY_BLOCK = registerCtmCube("saturlyte_factory_block", () -> new Block(saturlyteProperties()));
    public static final RegistryEntry<Block> ENCASED_SATURLYTE_BLOCK = registerBlock("encased_saturlyte_block", () -> new Block(saturlyteProperties()));
    public static final RegistryEntry<Block> SATURLYTE_PLATEBLOCK = registerBlock("saturlyte_plateblock", () -> new Block(saturlyteProperties()));
    public static final RegistryEntry<Block> SATURLYTE_PANEL = registerBlock("saturlyte_panel", () -> new Block(saturlyteProperties()));
    public static final RegistryEntry<Block> SATURLYTE_PLATING = registerBlock("saturlyte_plating", () -> new Block(saturlyteProperties()));
    public static final RegistryEntry<StairBlock> SATURLYTE_PLATING_STAIRS = registerStairs("saturlyte_plating_stairs", SATURLYTE_PLATING, saturlyteProperties());
    public static final RegistryEntry<SlabBlock> SATURLYTE_PLATING_SLAB = registerSlab("saturlyte_plating_slab", saturlyteProperties());
    public static final RegistryEntry<RotatedPillarBlock> SATURLYTE_PILLAR = registerPillar("saturlyte_pillar", saturlyteProperties());
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_SATURLYTE_PILLAR = registerGlowingPillar("glowing_saturlyte_pillar", saturlyteProperties());
    public static final RegistryEntry<ButtonBlock> SATURLYTE_PLATING_BUTTON = registerMetalButton("saturlyte_plating_button", MapColor.COLOR_PURPLE, 12, 40, SoundType.AMETHYST);
    public static final RegistryEntry<PressurePlateBlock> SATURLYTE_PLATING_PRESSURE_PLATE = registerMetalPressurePlate("saturlyte_plating_pressure_plate", MapColor.COLOR_PURPLE, 12, 40, SoundType.AMETHYST);
    public static final RegistryEntry<CustomSlidingDoorBlock> SATURLYTE_SLIDING_DOOR = registerSlidingDoor("saturlyte_sliding_door", MapColor.COLOR_PURPLE, 12, 40, SoundType.AMETHYST);
    public static final RegistryEntry<Block> SATURN_SAND = registerBlock("saturn_sand", () -> new SandBlock(16640684, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistryEntry<Block> SATURN_STONE = registerBlock("saturn_stone", () -> new Block(saturnStoneProperties()));
    public static final RegistryEntry<StairBlock> SATURN_STONE_STAIRS = registerStairs("saturn_stone_stairs", SATURN_STONE, saturnStoneProperties());
    public static final RegistryEntry<SlabBlock> SATURN_STONE_SLAB = registerSlab("saturn_stone_slab", saturnStoneProperties());
    public static final RegistryEntry<Block> SATURN_COBBLESTONE = registerBlock("saturn_cobblestone", () -> new Block(saturnStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> SATURN_COBBLESTONE_STAIRS = registerStairs("saturn_cobblestone_stairs", SATURN_COBBLESTONE, saturnStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> SATURN_COBBLESTONE_SLAB = registerSlab("saturn_cobblestone_slab", saturnStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> SATURN_STONE_BRICKS = registerBlock("saturn_stone_bricks", () -> new Block(saturnStoneProperties()));
    public static final RegistryEntry<StairBlock> SATURN_STONE_BRICK_STAIRS = registerStairs("saturn_stone_brick_stairs", SATURN_STONE_BRICKS, saturnStoneProperties());
    public static final RegistryEntry<SlabBlock> SATURN_STONE_BRICK_SLAB = registerSlab("saturn_stone_brick_slab", saturnStoneProperties());
    public static final RegistryEntry<WallBlock> SATURN_STONE_BRICK_WALL = registerWall("saturn_stone_brick_wall", saturnStoneProperties());
    public static final RegistryEntry<Block> CRACKED_SATURN_STONE_BRICKS = registerBlock("cracked_saturn_stone_bricks", () -> new Block(saturnStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_SATURN_STONE_BRICKS = registerBlock("chiseled_saturn_stone_bricks", () -> new Block(saturnStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_SATURN_STONE_STAIRS = registerStairs("chiseled_saturn_stone_stairs", CHISELED_SATURN_STONE_BRICKS, saturnStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_SATURN_STONE_SLAB = registerSlab("chiseled_saturn_stone_slab", saturnStoneProperties());
    public static final RegistryEntry<Block> POLISHED_SATURN_STONE = registerBlock("polished_saturn_stone", () -> new Block(saturnStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_SATURN_STONE_STAIRS = registerStairs("polished_saturn_stone_stairs", POLISHED_SATURN_STONE, saturnStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_SATURN_STONE_SLAB = registerSlab("polished_saturn_stone_slab", saturnStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> SATURN_PILLAR = registerPillar("saturn_pillar", saturnStoneProperties());
    
    // Uranus
    public static final RegistryEntry<Block> URANIUM_BLOCK = registerBlock("uranium_block", () -> new Block(uraniumProperties()));
    public static final RegistryEntry<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", () -> new Block(uraniumProperties()));
    public static final RegistryEntry<Block> URANIUM_FACTORY_BLOCK = registerCtmCube("uranium_factory_block", () -> new Block(uraniumProperties()));
    public static final RegistryEntry<Block> ENCASED_URANIUM_BLOCK = registerBlock("encased_uranium_block", () -> new Block(uraniumProperties()));
    public static final RegistryEntry<Block> URANIUM_PLATEBLOCK = registerBlock("uranium_plateblock", () -> new Block(uraniumProperties()));
    public static final RegistryEntry<Block> URANIUM_PANEL = registerBlock("uranium_panel", () -> new Block(uraniumProperties()));
    public static final RegistryEntry<Block> URANIUM_PLATING = registerBlock("uranium_plating", () -> new Block(uraniumProperties()));
    public static final RegistryEntry<StairBlock> URANIUM_PLATING_STAIRS = registerStairs("uranium_plating_stairs", URANIUM_PLATING, uraniumProperties());
    public static final RegistryEntry<SlabBlock> URANIUM_PLATING_SLAB = registerSlab("uranium_plating_slab", uraniumProperties());
    public static final RegistryEntry<RotatedPillarBlock> URANIUM_PILLAR = registerPillar("uranium_pillar", uraniumProperties());
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_URANIUM_PILLAR = registerGlowingPillar("glowing_uranium_pillar", uraniumProperties());
    public static final RegistryEntry<ButtonBlock> URANIUM_PLATING_BUTTON = registerMetalButton("uranium_plating_button", MapColor.EMERALD, 16, 52, SoundType.AMETHYST);
    public static final RegistryEntry<PressurePlateBlock> URANIUM_PLATING_PRESSURE_PLATE = registerMetalPressurePlate("uranium_plating_pressure_plate", MapColor.EMERALD, 16, 52, SoundType.AMETHYST);
    public static final RegistryEntry<CustomSlidingDoorBlock> URANIUM_SLIDING_DOOR = registerSlidingDoor("uranium_sliding_door", MapColor.EMERALD, 16, 52, SoundType.AMETHYST);
    public static final RegistryEntry<Block> URANUS_STONE = registerBlock("uranus_stone", () -> new Block(uranusStoneProperties()));
    public static final RegistryEntry<StairBlock> URANUS_STONE_STAIRS = registerStairs("uranus_stone_stairs", URANUS_STONE, uranusStoneProperties());
    public static final RegistryEntry<SlabBlock> URANUS_STONE_SLAB = registerSlab("uranus_stone_slab", uranusStoneProperties());
    public static final RegistryEntry<Block> URANUS_COBBLESTONE = registerBlock("uranus_cobblestone", () -> new Block(uranusStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> URANUS_COBBLESTONE_STAIRS = registerStairs("uranus_cobblestone_stairs", URANUS_COBBLESTONE, uranusStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> URANUS_COBBLESTONE_SLAB = registerSlab("uranus_cobblestone_slab", uranusStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> URANUS_STONE_BRICKS = registerBlock("uranus_stone_bricks", () -> new Block(uranusStoneProperties()));
    public static final RegistryEntry<StairBlock> URANUS_STONE_BRICK_STAIRS = registerStairs("uranus_stone_brick_stairs", URANUS_STONE_BRICKS, uranusStoneProperties());
    public static final RegistryEntry<SlabBlock> URANUS_STONE_BRICK_SLAB = registerSlab("uranus_stone_brick_slab", uranusStoneProperties());
    public static final RegistryEntry<WallBlock> URANUS_STONE_BRICK_WALL = registerWall("uranus_stone_brick_wall", uranusStoneProperties());
    public static final RegistryEntry<Block> CRACKED_URANUS_STONE_BRICKS = registerBlock("cracked_uranus_stone_bricks", () -> new Block(uranusStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_URANUS_STONE_BRICKS = registerBlock("chiseled_uranus_stone_bricks", () -> new Block(uranusStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_URANUS_STONE_STAIRS = registerStairs("chiseled_uranus_stone_stairs", CHISELED_URANUS_STONE_BRICKS, uranusStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_URANUS_STONE_SLAB = registerSlab("chiseled_uranus_stone_slab", uranusStoneProperties());
    public static final RegistryEntry<Block> POLISHED_URANUS_STONE = registerBlock("polished_uranus_stone", () -> new Block(uranusStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_URANUS_STONE_STAIRS = registerStairs("polished_uranus_stone_stairs", POLISHED_URANUS_STONE, uranusStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_URANUS_STONE_SLAB = registerSlab("polished_uranus_stone_slab", uranusStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> URANUS_PILLAR = registerPillar("uranus_pillar", uranusStoneProperties());
    
    // Neptune
    public static final RegistryEntry<Block> NEPTUNIUM_BLOCK = registerBlock("neptunium_block", () -> new Block(neptuniumProperties()));
    public static final RegistryEntry<Block> RAW_NEPTUNIUM_BLOCK = registerBlock("raw_neptunium_block", () -> new Block(neptuniumProperties()));
    public static final RegistryEntry<Block> NEPTUNIUM_FACTORY_BLOCK = registerCtmCube("neptunium_factory_block", () -> new Block(neptuniumProperties()));
    public static final RegistryEntry<Block> ENCASED_NEPTUNIUM_BLOCK = registerBlock("encased_neptunium_block", () -> new Block(neptuniumProperties()));
    public static final RegistryEntry<Block> NEPTUNIUM_PLATEBLOCK = registerBlock("neptunium_plateblock", () -> new Block(neptuniumProperties()));
    public static final RegistryEntry<Block> NEPTUNIUM_PANEL = registerBlock("neptunium_panel", () -> new Block(neptuniumProperties()));
    public static final RegistryEntry<Block> NEPTUNIUM_PLATING = registerBlock("neptunium_plating", () -> new Block(neptuniumProperties()));
    public static final RegistryEntry<StairBlock> NEPTUNIUM_PLATING_STAIRS = registerStairs("neptunium_plating_stairs", NEPTUNIUM_PLATING, neptuniumProperties());
    public static final RegistryEntry<SlabBlock> NEPTUNIUM_PLATING_SLAB = registerSlab("neptunium_plating_slab", neptuniumProperties());
    public static final RegistryEntry<RotatedPillarBlock> NEPTUNIUM_PILLAR = registerPillar("neptunium_pillar", neptuniumProperties());
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_NEPTUNIUM_PILLAR = registerGlowingPillar("glowing_neptunium_pillar", neptuniumProperties());
    public static final RegistryEntry<ButtonBlock> NEPTUNIUM_PLATING_BUTTON = registerMetalButton("neptunium_plating_button", MapColor.COLOR_GREEN, 20, 64, SoundType.AMETHYST);
    public static final RegistryEntry<PressurePlateBlock> NEPTUNIUM_PLATING_PRESSURE_PLATE = registerMetalPressurePlate("neptunium_plating_pressure_plate", MapColor.COLOR_GREEN, 20, 64, SoundType.AMETHYST);
    public static final RegistryEntry<CustomSlidingDoorBlock> NEPTUNIUM_SLIDING_DOOR = registerSlidingDoor("neptunium_sliding_door", MapColor.COLOR_GREEN, 20, 64, SoundType.AMETHYST);
    public static final RegistryEntry<Block> NEPTUNE_STONE = registerBlock("neptune_stone", () -> new Block(neptuneStoneProperties()));
    public static final RegistryEntry<StairBlock> NEPTUNE_STONE_STAIRS = registerStairs("neptune_stone_stairs", NEPTUNE_STONE, neptuneStoneProperties());
    public static final RegistryEntry<SlabBlock> NEPTUNE_STONE_SLAB = registerSlab("neptune_stone_slab", neptuneStoneProperties());
    public static final RegistryEntry<Block> NEPTUNE_COBBLESTONE = registerBlock("neptune_cobblestone", () -> new Block(neptuneStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> NEPTUNE_COBBLESTONE_STAIRS = registerStairs("neptune_cobblestone_stairs", NEPTUNE_COBBLESTONE, neptuneStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> NEPTUNE_COBBLESTONE_SLAB = registerSlab("neptune_cobblestone_slab", neptuneStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> NEPTUNE_STONE_BRICKS = registerBlock("neptune_stone_bricks", () -> new Block(neptuneStoneProperties()));
    public static final RegistryEntry<StairBlock> NEPTUNE_STONE_BRICK_STAIRS = registerStairs("neptune_stone_brick_stairs", NEPTUNE_STONE_BRICKS, neptuneStoneProperties());
    public static final RegistryEntry<SlabBlock> NEPTUNE_STONE_BRICK_SLAB = registerSlab("neptune_stone_brick_slab", neptuneStoneProperties());
    public static final RegistryEntry<WallBlock> NEPTUNE_STONE_BRICK_WALL = registerWall("neptune_stone_brick_wall", neptuneStoneProperties());
    public static final RegistryEntry<Block> CRACKED_NEPTUNE_STONE_BRICKS = registerBlock("cracked_neptune_stone_bricks", () -> new Block(neptuneStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_NEPTUNE_STONE_BRICKS = registerBlock("chiseled_neptune_stone_bricks", () -> new Block(neptuneStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_NEPTUNE_STONE_STAIRS = registerStairs("chiseled_neptune_stone_stairs", CHISELED_NEPTUNE_STONE_BRICKS, neptuneStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_NEPTUNE_STONE_SLAB = registerSlab("chiseled_neptune_stone_slab", neptuneStoneProperties());
    public static final RegistryEntry<Block> POLISHED_NEPTUNE_STONE = registerBlock("polished_neptune_stone", () -> new Block(neptuneStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_NEPTUNE_STONE_STAIRS = registerStairs("polished_neptune_stone_stairs", POLISHED_NEPTUNE_STONE, neptuneStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_NEPTUNE_STONE_SLAB = registerSlab("polished_neptune_stone_slab", neptuneStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> NEPTUNE_PILLAR = registerPillar("neptune_pillar", neptuneStoneProperties());
    
    // Orcus
    public static final RegistryEntry<Block> RADIUM_BLOCK = registerBlock("radium_block", () -> new Block(radiumProperties()));
    public static final RegistryEntry<Block> RAW_RADIUM_BLOCK = registerBlock("raw_radium_block", () -> new Block(radiumProperties()));
    public static final RegistryEntry<Block> RADIUM_FACTORY_BLOCK = registerCtmCube("radium_factory_block", () -> new Block(radiumProperties()));
    public static final RegistryEntry<Block> ENCASED_RADIUM_BLOCK = registerBlock("encased_radium_block", () -> new Block(radiumProperties()));
    public static final RegistryEntry<Block> RADIUM_PLATEBLOCK = registerBlock("radium_plateblock", () -> new Block(radiumProperties()));
    public static final RegistryEntry<Block> RADIUM_PANEL = registerBlock("radium_panel", () -> new Block(radiumProperties()));
    public static final RegistryEntry<Block> RADIUM_PLATING = registerBlock("radium_plating", () -> new Block(radiumProperties()));
    public static final RegistryEntry<StairBlock> RADIUM_PLATING_STAIRS = registerStairs("radium_plating_stairs", RADIUM_PLATING, radiumProperties());
    public static final RegistryEntry<SlabBlock> RADIUM_PLATING_SLAB = registerSlab("radium_plating_slab", radiumProperties());
    public static final RegistryEntry<RotatedPillarBlock> RADIUM_PILLAR = registerPillar("radium_pillar", radiumProperties());
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_RADIUM_PILLAR = registerGlowingPillar("glowing_radium_pillar", radiumProperties());
    public static final RegistryEntry<ButtonBlock> RADIUM_PLATING_BUTTON = registerMetalButton("radium_plating_button", MapColor.COLOR_LIGHT_GREEN, 25, 80, SoundType.AMETHYST);
    public static final RegistryEntry<PressurePlateBlock> RADIUM_PLATING_PRESSURE_PLATE = registerMetalPressurePlate("radium_plating_pressure_plate", MapColor.COLOR_LIGHT_GREEN, 25, 80, SoundType.AMETHYST);
    public static final RegistryEntry<CustomSlidingDoorBlock> RADIUM_SLIDING_DOOR = registerSlidingDoor("radium_sliding_door", MapColor.COLOR_LIGHT_GREEN, 25, 80, SoundType.AMETHYST);
    public static final RegistryEntry<Block> ORCUS_STONE = registerBlock("orcus_stone", () -> new Block(orcusStoneProperties()));
    public static final RegistryEntry<StairBlock> ORCUS_STONE_STAIRS = registerStairs("orcus_stone_stairs", ORCUS_STONE, orcusStoneProperties());
    public static final RegistryEntry<SlabBlock> ORCUS_STONE_SLAB = registerSlab("orcus_stone_slab", orcusStoneProperties());
    public static final RegistryEntry<Block> ORCUS_COBBLESTONE = registerBlock("orcus_cobblestone", () -> new Block(orcusStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> ORCUS_COBBLESTONE_STAIRS = registerStairs("orcus_cobblestone_stairs", ORCUS_COBBLESTONE, orcusStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> ORCUS_COBBLESTONE_SLAB = registerSlab("orcus_cobblestone_slab", orcusStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> ORCUS_STONE_BRICKS = registerBlock("orcus_stone_bricks", () -> new Block(orcusStoneProperties()));
    public static final RegistryEntry<StairBlock> ORCUS_STONE_BRICK_STAIRS = registerStairs("orcus_stone_brick_stairs", ORCUS_STONE_BRICKS, orcusStoneProperties());
    public static final RegistryEntry<SlabBlock> ORCUS_STONE_BRICK_SLAB = registerSlab("orcus_stone_brick_slab", orcusStoneProperties());
    public static final RegistryEntry<WallBlock> ORCUS_STONE_BRICK_WALL = registerWall("orcus_stone_brick_wall", orcusStoneProperties());
    public static final RegistryEntry<Block> CRACKED_ORCUS_STONE_BRICKS = registerBlock("cracked_orcus_stone_bricks", () -> new Block(orcusStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_ORCUS_STONE_BRICKS = registerBlock("chiseled_orcus_stone_bricks", () -> new Block(orcusStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_ORCUS_STONE_STAIRS = registerStairs("chiseled_orcus_stone_stairs", CHISELED_ORCUS_STONE_BRICKS, orcusStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_ORCUS_STONE_SLAB = registerSlab("chiseled_orcus_stone_slab", orcusStoneProperties());
    public static final RegistryEntry<Block> POLISHED_ORCUS_STONE = registerBlock("polished_orcus_stone", () -> new Block(orcusStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_ORCUS_STONE_STAIRS = registerStairs("polished_orcus_stone_stairs", POLISHED_ORCUS_STONE, orcusStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_ORCUS_STONE_SLAB = registerSlab("polished_orcus_stone_slab", orcusStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> ORCUS_PILLAR = registerPillar("orcus_pillar", orcusStoneProperties());
    
    // Pluto
    public static final RegistryEntry<Block> PLUTONIUM_BLOCK = registerBlock("plutonium_block", () -> new Block(plutoniumProperties()));
    public static final RegistryEntry<Block> RAW_PLUTONIUM_BLOCK = registerBlock("raw_plutonium_block", () -> new Block(plutoniumProperties()));
    public static final RegistryEntry<Block> PLUTONIUM_FACTORY_BLOCK = registerCtmCube("plutonium_factory_block", () -> new Block(plutoniumProperties()));
    public static final RegistryEntry<Block> ENCASED_PLUTONIUM_BLOCK = registerBlock("encased_plutonium_block", () -> new Block(plutoniumProperties()));
    public static final RegistryEntry<Block> PLUTONIUM_PLATEBLOCK = registerBlock("plutonium_plateblock", () -> new Block(plutoniumProperties()));
    public static final RegistryEntry<Block> PLUTONIUM_PANEL = registerBlock("plutonium_panel", () -> new Block(plutoniumProperties()));
    public static final RegistryEntry<Block> PLUTONIUM_PLATING = registerBlock("plutonium_plating", () -> new Block(plutoniumProperties()));
    public static final RegistryEntry<StairBlock> PLUTONIUM_PLATING_STAIRS = registerStairs("plutonium_plating_stairs", PLUTONIUM_PLATING, plutoniumProperties());
    public static final RegistryEntry<SlabBlock> PLUTONIUM_PLATING_SLAB = registerSlab("plutonium_plating_slab", plutoniumProperties());
    public static final RegistryEntry<RotatedPillarBlock> PLUTONIUM_PILLAR = registerPillar("plutonium_pillar", plutoniumProperties());
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_PLUTONIUM_PILLAR = registerGlowingPillar("glowing_plutonium_pillar", plutoniumProperties());
    public static final RegistryEntry<ButtonBlock> PLUTONIUM_PLATING_BUTTON = registerMetalButton("plutonium_plating_button", MapColor.COLOR_YELLOW, 32, 100, SoundType.AMETHYST);
    public static final RegistryEntry<PressurePlateBlock> PLUTONIUM_PLATING_PRESSURE_PLATE = registerMetalPressurePlate("plutonium_plating_pressure_plate", MapColor.COLOR_YELLOW, 32, 100, SoundType.AMETHYST);
    public static final RegistryEntry<CustomSlidingDoorBlock> PLUTONIUM_SLIDING_DOOR = registerSlidingDoor("plutonium_sliding_door", MapColor.COLOR_YELLOW, 32, 100, SoundType.AMETHYST);
    public static final RegistryEntry<Block> PLUTO_SAND = registerBlock("pluto_sand", () -> new SandBlock(16770711, BlockBehaviour.Properties.copy(Blocks.SAND).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryEntry<Block> PLUTO_STONE = registerBlock("pluto_stone", () -> new Block(plutoStoneProperties()));
    public static final RegistryEntry<StairBlock> PLUTO_STONE_STAIRS = registerStairs("pluto_stone_stairs", PLUTO_STONE, plutoStoneProperties());
    public static final RegistryEntry<SlabBlock> PLUTO_STONE_SLAB = registerSlab("pluto_stone_slab", plutoStoneProperties());
    public static final RegistryEntry<Block> PLUTO_COBBLESTONE = registerBlock("pluto_cobblestone", () -> new Block(plutoStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> PLUTO_COBBLESTONE_STAIRS = registerStairs("pluto_cobblestone_stairs", PLUTO_COBBLESTONE, plutoStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> PLUTO_COBBLESTONE_SLAB = registerSlab("pluto_cobblestone_slab", plutoStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> PLUTO_STONE_BRICKS = registerBlock("pluto_stone_bricks", () -> new Block(plutoStoneProperties()));
    public static final RegistryEntry<StairBlock> PLUTO_STONE_BRICK_STAIRS = registerStairs("pluto_stone_brick_stairs", PLUTO_STONE_BRICKS, plutoStoneProperties());
    public static final RegistryEntry<SlabBlock> PLUTO_STONE_BRICK_SLAB = registerSlab("pluto_stone_brick_slab", plutoStoneProperties());
    public static final RegistryEntry<WallBlock> PLUTO_STONE_BRICK_WALL = registerWall("pluto_stone_brick_wall", plutoStoneProperties());
    public static final RegistryEntry<Block> CRACKED_PLUTO_STONE_BRICKS = registerBlock("cracked_pluto_stone_bricks", () -> new Block(plutoStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_PLUTO_STONE_BRICKS = registerBlock("chiseled_pluto_stone_bricks", () -> new Block(plutoStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_PLUTO_STONE_STAIRS = registerStairs("chiseled_pluto_stone_stairs", CHISELED_PLUTO_STONE_BRICKS, plutoStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_PLUTO_STONE_SLAB = registerSlab("chiseled_pluto_stone_slab", plutoStoneProperties());
    public static final RegistryEntry<Block> POLISHED_PLUTO_STONE = registerBlock("polished_pluto_stone", () -> new Block(plutoStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_PLUTO_STONE_STAIRS = registerStairs("polished_pluto_stone_stairs", POLISHED_PLUTO_STONE, plutoStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_PLUTO_STONE_SLAB = registerSlab("polished_pluto_stone_slab", plutoStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> PLUTO_PILLAR = registerPillar("pluto_pillar", plutoStoneProperties());
    
    // Haumea
    public static final RegistryEntry<Block> HAUMEA_STONE = registerBlock("haumea_stone", () -> new Block(haumeaStoneProperties()));
    public static final RegistryEntry<StairBlock> HAUMEA_STONE_STAIRS = registerStairs("haumea_stone_stairs", HAUMEA_STONE, haumeaStoneProperties());
    public static final RegistryEntry<SlabBlock> HAUMEA_STONE_SLAB = registerSlab("haumea_stone_slab", haumeaStoneProperties());
    public static final RegistryEntry<Block> HAUMEA_COBBLESTONE = registerBlock("haumea_cobblestone", () -> new Block(haumeaStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> HAUMEA_COBBLESTONE_STAIRS = registerStairs("haumea_cobblestone_stairs", HAUMEA_COBBLESTONE, haumeaStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> HAUMEA_COBBLESTONE_SLAB = registerSlab("haumea_cobblestone_slab", haumeaStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> HAUMEA_STONE_BRICKS = registerBlock("haumea_stone_bricks", () -> new Block(haumeaStoneProperties()));
    public static final RegistryEntry<StairBlock> HAUMEA_STONE_BRICK_STAIRS = registerStairs("haumea_stone_brick_stairs", HAUMEA_STONE_BRICKS, haumeaStoneProperties());
    public static final RegistryEntry<SlabBlock> HAUMEA_STONE_BRICK_SLAB = registerSlab("haumea_stone_brick_slab", haumeaStoneProperties());
    public static final RegistryEntry<WallBlock> HAUMEA_STONE_BRICK_WALL = registerWall("haumea_stone_brick_wall", haumeaStoneProperties());
    public static final RegistryEntry<Block> CRACKED_HAUMEA_STONE_BRICKS = registerBlock("cracked_haumea_stone_bricks", () -> new Block(haumeaStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_HAUMEA_STONE_BRICKS = registerBlock("chiseled_haumea_stone_bricks", () -> new Block(haumeaStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_HAUMEA_STONE_STAIRS = registerStairs("chiseled_haumea_stone_stairs", CHISELED_HAUMEA_STONE_BRICKS, haumeaStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_HAUMEA_STONE_SLAB = registerSlab("chiseled_haumea_stone_slab", haumeaStoneProperties());
    public static final RegistryEntry<Block> POLISHED_HAUMEA_STONE = registerBlock("polished_haumea_stone", () -> new Block(haumeaStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_HAUMEA_STONE_STAIRS = registerStairs("polished_haumea_stone_stairs", POLISHED_HAUMEA_STONE, haumeaStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_HAUMEA_STONE_SLAB = registerSlab("polished_haumea_stone_slab", haumeaStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> HAUMEA_PILLAR = registerPillar("haumea_pillar", haumeaStoneProperties());
    
    // Quaoar
    public static final RegistryEntry<Block> QUAOAR_STONE = registerBlock("quaoar_stone", () -> new Block(quaoarStoneProperties()));
    public static final RegistryEntry<StairBlock> QUAOAR_STONE_STAIRS = registerStairs("quaoar_stone_stairs", QUAOAR_STONE, quaoarStoneProperties());
    public static final RegistryEntry<SlabBlock> QUAOAR_STONE_SLAB = registerSlab("quaoar_stone_slab", quaoarStoneProperties());
    public static final RegistryEntry<Block> QUAOAR_COBBLESTONE = registerBlock("quaoar_cobblestone", () -> new Block(quaoarStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> QUAOAR_COBBLESTONE_STAIRS = registerStairs("quaoar_cobblestone_stairs", QUAOAR_COBBLESTONE, quaoarStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> QUAOAR_COBBLESTONE_SLAB = registerSlab("quaoar_cobblestone_slab", quaoarStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> QUAOAR_STONE_BRICKS = registerBlock("quaoar_stone_bricks", () -> new Block(quaoarStoneProperties()));
    public static final RegistryEntry<StairBlock> QUAOAR_STONE_BRICK_STAIRS = registerStairs("quaoar_stone_brick_stairs", QUAOAR_STONE_BRICKS, quaoarStoneProperties());
    public static final RegistryEntry<SlabBlock> QUAOAR_STONE_BRICK_SLAB = registerSlab("quaoar_stone_brick_slab", quaoarStoneProperties());
    public static final RegistryEntry<WallBlock> QUAOAR_STONE_BRICK_WALL = registerWall("quaoar_stone_brick_wall", quaoarStoneProperties());
    public static final RegistryEntry<Block> CRACKED_QUAOAR_STONE_BRICKS = registerBlock("cracked_quaoar_stone_bricks", () -> new Block(quaoarStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_QUAOAR_STONE_BRICKS = registerBlock("chiseled_quaoar_stone_bricks", () -> new Block(quaoarStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_QUAOAR_STONE_STAIRS = registerStairs("chiseled_quaoar_stone_stairs", CHISELED_QUAOAR_STONE_BRICKS, quaoarStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_QUAOAR_STONE_SLAB = registerSlab("chiseled_quaoar_stone_slab", quaoarStoneProperties());
    public static final RegistryEntry<Block> POLISHED_QUAOAR_STONE = registerBlock("polished_quaoar_stone", () -> new Block(quaoarStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_QUAOAR_STONE_STAIRS = registerStairs("polished_quaoar_stone_stairs", POLISHED_QUAOAR_STONE, quaoarStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_QUAOAR_STONE_SLAB = registerSlab("polished_quaoar_stone_slab", quaoarStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> QUAOAR_PILLAR = registerPillar("quaoar_pillar", quaoarStoneProperties());
    
    // Makemake
    public static final RegistryEntry<Block> MAKEMAKE_STONE = registerBlock("makemake_stone", () -> new Block(makemakeStoneProperties()));
    public static final RegistryEntry<StairBlock> MAKEMAKE_STONE_STAIRS = registerStairs("makemake_stone_stairs", MAKEMAKE_STONE, makemakeStoneProperties());
    public static final RegistryEntry<SlabBlock> MAKEMAKE_STONE_SLAB = registerSlab("makemake_stone_slab", makemakeStoneProperties());
    public static final RegistryEntry<Block> MAKEMAKE_COBBLESTONE = registerBlock("makemake_cobblestone", () -> new Block(makemakeStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> MAKEMAKE_COBBLESTONE_STAIRS = registerStairs("makemake_cobblestone_stairs", MAKEMAKE_COBBLESTONE, makemakeStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> MAKEMAKE_COBBLESTONE_SLAB = registerSlab("makemake_cobblestone_slab", makemakeStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> MAKEMAKE_STONE_BRICKS = registerBlock("makemake_stone_bricks", () -> new Block(makemakeStoneProperties()));
    public static final RegistryEntry<StairBlock> MAKEMAKE_STONE_BRICK_STAIRS = registerStairs("makemake_stone_brick_stairs", MAKEMAKE_STONE_BRICKS, makemakeStoneProperties());
    public static final RegistryEntry<SlabBlock> MAKEMAKE_STONE_BRICK_SLAB = registerSlab("makemake_stone_brick_slab", makemakeStoneProperties());
    public static final RegistryEntry<WallBlock> MAKEMAKE_STONE_BRICK_WALL = registerWall("makemake_stone_brick_wall", makemakeStoneProperties());
    public static final RegistryEntry<Block> CRACKED_MAKEMAKE_STONE_BRICKS = registerBlock("cracked_makemake_stone_bricks", () -> new Block(makemakeStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_MAKEMAKE_STONE_BRICKS = registerBlock("chiseled_makemake_stone_bricks", () -> new Block(makemakeStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_MAKEMAKE_STONE_STAIRS = registerStairs("chiseled_makemake_stone_stairs", CHISELED_MAKEMAKE_STONE_BRICKS, makemakeStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_MAKEMAKE_STONE_SLAB = registerSlab("chiseled_makemake_stone_slab", makemakeStoneProperties());
    public static final RegistryEntry<Block> POLISHED_MAKEMAKE_STONE = registerBlock("polished_makemake_stone", () -> new Block(makemakeStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_MAKEMAKE_STONE_STAIRS = registerStairs("polished_makemake_stone_stairs", POLISHED_MAKEMAKE_STONE, makemakeStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_MAKEMAKE_STONE_SLAB = registerSlab("polished_makemake_stone_slab", makemakeStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> MAKEMAKE_PILLAR = registerPillar("makemake_pillar", makemakeStoneProperties());
    
    // Gonggong
    public static final RegistryEntry<Block> GONGGONG_STONE = registerBlock("gonggong_stone", () -> new Block(gonggongStoneProperties()));
    public static final RegistryEntry<StairBlock> GONGGONG_STONE_STAIRS = registerStairs("gonggong_stone_stairs", GONGGONG_STONE, gonggongStoneProperties());
    public static final RegistryEntry<SlabBlock> GONGGONG_STONE_SLAB = registerSlab("gonggong_stone_slab", gonggongStoneProperties());
    public static final RegistryEntry<Block> GONGGONG_COBBLESTONE = registerBlock("gonggong_cobblestone", () -> new Block(gonggongStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> GONGGONG_COBBLESTONE_STAIRS = registerStairs("gonggong_cobblestone_stairs", GONGGONG_COBBLESTONE, gonggongStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> GONGGONG_COBBLESTONE_SLAB = registerSlab("gonggong_cobblestone_slab", gonggongStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> GONGGONG_STONE_BRICKS = registerBlock("gonggong_stone_bricks", () -> new Block(gonggongStoneProperties()));
    public static final RegistryEntry<StairBlock> GONGGONG_STONE_BRICK_STAIRS = registerStairs("gonggong_stone_brick_stairs", GONGGONG_STONE_BRICKS, gonggongStoneProperties());
    public static final RegistryEntry<SlabBlock> GONGGONG_STONE_BRICK_SLAB = registerSlab("gonggong_stone_brick_slab", gonggongStoneProperties());
    public static final RegistryEntry<WallBlock> GONGGONG_STONE_BRICK_WALL = registerWall("gonggong_stone_brick_wall", gonggongStoneProperties());
    public static final RegistryEntry<Block> CRACKED_GONGGONG_STONE_BRICKS = registerBlock("cracked_gonggong_stone_bricks", () -> new Block(gonggongStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_GONGGONG_STONE_BRICKS = registerBlock("chiseled_gonggong_stone_bricks", () -> new Block(gonggongStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_GONGGONG_STONE_STAIRS = registerStairs("chiseled_gonggong_stone_stairs", CHISELED_GONGGONG_STONE_BRICKS, gonggongStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_GONGGONG_STONE_SLAB = registerSlab("chiseled_gonggong_stone_slab", gonggongStoneProperties());
    public static final RegistryEntry<Block> POLISHED_GONGGONG_STONE = registerBlock("polished_gonggong_stone", () -> new Block(gonggongStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_GONGGONG_STONE_STAIRS = registerStairs("polished_gonggong_stone_stairs", POLISHED_GONGGONG_STONE, gonggongStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_GONGGONG_STONE_SLAB = registerSlab("polished_gonggong_stone_slab", gonggongStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> GONGGONG_PILLAR = registerPillar("gonggong_pillar", gonggongStoneProperties());
    
    // Eris
    public static final RegistryEntry<Block> ERIS_STONE = registerBlock("eris_stone", () -> new Block(erisStoneProperties()));
    public static final RegistryEntry<StairBlock> ERIS_STONE_STAIRS = registerStairs("eris_stone_stairs", ERIS_STONE, erisStoneProperties());
    public static final RegistryEntry<SlabBlock> ERIS_STONE_SLAB = registerSlab("eris_stone_slab", erisStoneProperties());
    public static final RegistryEntry<Block> ERIS_COBBLESTONE = registerBlock("eris_cobblestone", () -> new Block(erisStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> ERIS_COBBLESTONE_STAIRS = registerStairs("eris_cobblestone_stairs", ERIS_COBBLESTONE, erisStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> ERIS_COBBLESTONE_SLAB = registerSlab("eris_cobblestone_slab", erisStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> ERIS_STONE_BRICKS = registerBlock("eris_stone_bricks", () -> new Block(erisStoneProperties()));
    public static final RegistryEntry<StairBlock> ERIS_STONE_BRICK_STAIRS = registerStairs("eris_stone_brick_stairs", ERIS_STONE_BRICKS, erisStoneProperties());
    public static final RegistryEntry<SlabBlock> ERIS_STONE_BRICK_SLAB = registerSlab("eris_stone_brick_slab", erisStoneProperties());
    public static final RegistryEntry<WallBlock> ERIS_STONE_BRICK_WALL = registerWall("eris_stone_brick_wall", erisStoneProperties());
    public static final RegistryEntry<Block> CRACKED_ERIS_STONE_BRICKS = registerBlock("cracked_eris_stone_bricks", () -> new Block(erisStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_ERIS_STONE_BRICKS = registerBlock("chiseled_eris_stone_bricks", () -> new Block(erisStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_ERIS_STONE_STAIRS = registerStairs("chiseled_eris_stone_stairs", CHISELED_ERIS_STONE_BRICKS, erisStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_ERIS_STONE_SLAB = registerSlab("chiseled_eris_stone_slab", erisStoneProperties());
    public static final RegistryEntry<Block> POLISHED_ERIS_STONE = registerBlock("polished_eris_stone", () -> new Block(erisStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_ERIS_STONE_STAIRS = registerStairs("polished_eris_stone_stairs", POLISHED_ERIS_STONE, erisStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_ERIS_STONE_SLAB = registerSlab("polished_eris_stone_slab", erisStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> ERIS_PILLAR = registerPillar("eris_pillar", erisStoneProperties());
    
    // Sedna
    public static final RegistryEntry<Block> ELECTROLYTE_BLOCK = registerBlock("electrolyte_block", () -> new Block(electrolyteProperties()));
    public static final RegistryEntry<Block> RAW_ELECTROLYTE_BLOCK = registerBlock("raw_electrolyte_block", () -> new Block(electrolyteProperties()));
    public static final RegistryEntry<Block> ELECTROLYTE_FACTORY_BLOCK = registerCtmCube("electrolyte_factory_block", () -> new Block(electrolyteProperties()));
    public static final RegistryEntry<Block> ENCASED_ELECTROLYTE_BLOCK = registerBlock("encased_electrolyte_block", () -> new Block(electrolyteProperties()));
    public static final RegistryEntry<Block> ELECTROLYTE_PLATEBLOCK = registerBlock("electrolyte_plateblock", () -> new Block(electrolyteProperties()));
    public static final RegistryEntry<Block> ELECTROLYTE_PANEL = registerBlock("electrolyte_panel", () -> new Block(electrolyteProperties()));
    public static final RegistryEntry<Block> ELECTROLYTE_PLATING = registerBlock("electrolyte_plating", () -> new Block(electrolyteProperties()));
    public static final RegistryEntry<StairBlock> ELECTROLYTE_PLATING_STAIRS = registerStairs("electrolyte_plating_stairs", ELECTROLYTE_PLATING, electrolyteProperties());
    public static final RegistryEntry<SlabBlock> ELECTROLYTE_PLATING_SLAB = registerSlab("electrolyte_plating_slab", electrolyteProperties());
    public static final RegistryEntry<RotatedPillarBlock> ELECTROLYTE_PILLAR = registerPillar("electrolyte_pillar", electrolyteProperties());
    public static final RegistryEntry<RotatedPillarBlock> GLOWING_ELECTROLYTE_PILLAR = registerGlowingPillar("glowing_electrolyte_pillar", electrolyteProperties());
    public static final RegistryEntry<ButtonBlock> ELECTROLYTE_PLATING_BUTTON = registerMetalButton("electrolyte_plating_button", MapColor.COLOR_BLUE, 40, 128, SoundType.AMETHYST);
    public static final RegistryEntry<PressurePlateBlock> ELECTROLYTE_PLATING_PRESSURE_PLATE = registerMetalPressurePlate("electrolyte_plating_pressure_plate", MapColor.COLOR_BLUE, 40, 128, SoundType.AMETHYST);
    public static final RegistryEntry<CustomSlidingDoorBlock> ELECTROLYTE_SLIDING_DOOR = registerSlidingDoor("electrolyte_sliding_door", MapColor.COLOR_BLUE, 40, 128, SoundType.AMETHYST);
    public static final RegistryEntry<Block> SEDNA_STONE = registerBlock("sedna_stone", () -> new Block(sednaStoneProperties()));
    public static final RegistryEntry<StairBlock> SEDNA_STONE_STAIRS = registerStairs("sedna_stone_stairs", SEDNA_STONE, sednaStoneProperties());
    public static final RegistryEntry<SlabBlock> SEDNA_STONE_SLAB = registerSlab("sedna_stone_slab", sednaStoneProperties());
    public static final RegistryEntry<Block> SEDNA_COBBLESTONE = registerBlock("sedna_cobblestone", () -> new Block(sednaStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> SEDNA_COBBLESTONE_STAIRS = registerStairs("sedna_cobblestone_stairs", SEDNA_COBBLESTONE, sednaStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> SEDNA_COBBLESTONE_SLAB = registerSlab("sedna_cobblestone_slab", sednaStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> SEDNA_STONE_BRICKS = registerBlock("sedna_stone_bricks", () -> new Block(sednaStoneProperties()));
    public static final RegistryEntry<StairBlock> SEDNA_STONE_BRICK_STAIRS = registerStairs("sedna_stone_brick_stairs", SEDNA_STONE_BRICKS, sednaStoneProperties());
    public static final RegistryEntry<SlabBlock> SEDNA_STONE_BRICK_SLAB = registerSlab("sedna_stone_brick_slab", sednaStoneProperties());
    public static final RegistryEntry<WallBlock> SEDNA_STONE_BRICK_WALL = registerWall("sedna_stone_brick_wall", sednaStoneProperties());
    public static final RegistryEntry<Block> CRACKED_SEDNA_STONE_BRICKS = registerBlock("cracked_sedna_stone_bricks", () -> new Block(sednaStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_SEDNA_STONE_BRICKS = registerBlock("chiseled_sedna_stone_bricks", () -> new Block(sednaStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_SEDNA_STONE_STAIRS = registerStairs("chiseled_sedna_stone_stairs", CHISELED_SEDNA_STONE_BRICKS, sednaStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_SEDNA_STONE_SLAB = registerSlab("chiseled_sedna_stone_slab", sednaStoneProperties());
    public static final RegistryEntry<Block> POLISHED_SEDNA_STONE = registerBlock("polished_sedna_stone", () -> new Block(sednaStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_SEDNA_STONE_STAIRS = registerStairs("polished_sedna_stone_stairs", POLISHED_SEDNA_STONE, sednaStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_SEDNA_STONE_SLAB = registerSlab("polished_sedna_stone_slab", sednaStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> SEDNA_PILLAR = registerPillar("sedna_pillar", sednaStoneProperties());

    // Proxima Centauri b
    public static final RegistryEntry<Block> B_SAND = registerBlock("b_sand", () -> new SandBlock(12945208, BlockBehaviour.Properties.copy(Blocks.SAND).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final RegistryEntry<Block> B_SANDSTONE = registerBlock("b_sandstone", () -> new Block(proximaCentauriBStoneProperties()));
    public static final RegistryEntry<Block> B_SANDSTONE_BRICKS = registerBlock("b_sandstone_bricks", () -> new Block(proximaCentauriBStoneProperties()));
    public static final RegistryEntry<StairBlock> B_SANDSTONE_BRICK_STAIRS = registerStairs("b_sandstone_brick_stairs", B_SANDSTONE_BRICKS, proximaCentauriBStoneProperties());
    public static final RegistryEntry<SlabBlock> B_SANDSTONE_BRICK_SLAB = registerSlab("b_sandstone_brick_slab", proximaCentauriBStoneProperties());
    public static final RegistryEntry<Block> CRACKED_B_SANDSTONE_BRICKS = registerBlock("cracked_b_sandstone_bricks", () -> new Block(proximaCentauriBStoneProperties()));
    public static final RegistryEntry<Block> B_STONE = registerBlock("b_stone", () -> new Block(proximaCentauriBStoneProperties()));
    public static final RegistryEntry<StairBlock> B_STONE_STAIRS = registerStairs("b_stone_stairs", B_STONE, proximaCentauriBStoneProperties());
    public static final RegistryEntry<SlabBlock> B_STONE_SLAB = registerSlab("b_stone_slab", proximaCentauriBStoneProperties());
    public static final RegistryEntry<Block> B_COBBLESTONE = registerBlock("b_cobblestone", () -> new Block(proximaCentauriBStoneProperties().strength(2, 6)));
    public static final RegistryEntry<StairBlock> B_COBBLESTONE_STAIRS = registerStairs("b_cobblestone_stairs", B_COBBLESTONE, proximaCentauriBStoneProperties().strength(2, 6));
    public static final RegistryEntry<SlabBlock> B_COBBLESTONE_SLAB = registerSlab("b_cobblestone_slab", proximaCentauriBStoneProperties().strength(2, 6));
    public static final RegistryEntry<Block> B_STONE_BRICKS = registerBlock("b_stone_bricks", () -> new Block(proximaCentauriBStoneProperties()));
    public static final RegistryEntry<StairBlock> B_STONE_BRICK_STAIRS = registerStairs("b_stone_brick_stairs", B_STONE_BRICKS, proximaCentauriBStoneProperties());
    public static final RegistryEntry<SlabBlock> B_STONE_BRICK_SLAB = registerSlab("b_stone_brick_slab", proximaCentauriBStoneProperties());
    public static final RegistryEntry<WallBlock> B_STONE_BRICK_WALL = registerWall("b_stone_brick_wall", proximaCentauriBStoneProperties());
    public static final RegistryEntry<Block> CRACKED_B_STONE_BRICKS = registerBlock("cracked_b_stone_bricks", () -> new Block(proximaCentauriBStoneProperties()));
    public static final RegistryEntry<Block> CHISELED_B_STONE_BRICKS = registerBlock("chiseled_b_stone_bricks", () -> new Block(proximaCentauriBStoneProperties()));
    public static final RegistryEntry<StairBlock> CHISELED_B_STONE_STAIRS = registerStairs("chiseled_b_stone_stairs", CHISELED_B_STONE_BRICKS, proximaCentauriBStoneProperties());
    public static final RegistryEntry<SlabBlock> CHISELED_B_STONE_SLAB = registerSlab("chiseled_b_stone_slab", proximaCentauriBStoneProperties());
    public static final RegistryEntry<Block> POLISHED_B_STONE = registerBlock("polished_b_stone", () -> new Block(proximaCentauriBStoneProperties()));
    public static final RegistryEntry<StairBlock> POLISHED_B_STONE_STAIRS = registerStairs("polished_b_stone_stairs", POLISHED_B_STONE, proximaCentauriBStoneProperties());
    public static final RegistryEntry<SlabBlock> POLISHED_B_STONE_SLAB = registerSlab("polished_b_stone_slab", proximaCentauriBStoneProperties());
    public static final RegistryEntry<RotatedPillarBlock> B_PILLAR = registerPillar("b_pillar", proximaCentauriBStoneProperties());

    private static <T extends Block> RegistryEntry<T> registerBlock(String name, Supplier<T> block) {
        RegistryEntry<T> toReturn = BASIC_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryEntry<StairBlock> registerStairs(String name, Supplier<T> baseBlock, BlockBehaviour.Properties properties) {
        RegistryEntry<StairBlock> toReturn = STAIRS.register(name, () -> new StairBlock(baseBlock.get().defaultBlockState(), properties));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryEntry<SlabBlock> registerSlab(String name, BlockBehaviour.Properties properties) {
        RegistryEntry<SlabBlock> toReturn = SLABS.register(name, () -> new SlabBlock(properties));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryEntry<WallBlock> registerWall(String name, BlockBehaviour.Properties properties) {
        RegistryEntry<WallBlock> toReturn = WALLS.register(name, () -> new WallBlock(properties));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryEntry<RotatedPillarBlock> registerPillar(String name, BlockBehaviour.Properties properties) {
        RegistryEntry<RotatedPillarBlock> toReturn = PILLARS.register(name, () -> new RotatedPillarBlock(properties));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryEntry<RotatedPillarBlock> registerGlowingPillar(String name, BlockBehaviour.Properties properties) {
        RegistryEntry<RotatedPillarBlock> toReturn = PILLARS.register(name, () -> new RotatedPillarBlock(properties.lightLevel((state) -> {
            return 15;
        })));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryEntry<ButtonBlock> registerMetalButton(String name, MapColor mapColor, int hardness, int resistance, SoundType sound) {
        RegistryEntry<ButtonBlock> toReturn = METAL_BUTTONS.register(name, () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON)
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(hardness, resistance)
                .sound(sound), BlockSetType.IRON, 20, false));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryEntry<PressurePlateBlock> registerMetalPressurePlate(String name, MapColor mapColor, int hardness, int resistance, SoundType sound) {
        RegistryEntry<PressurePlateBlock> toReturn = METAL_PRESSURE_PLATES.register(name, () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.STONE_PRESSURE_PLATE).mapColor(mapColor)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(hardness, resistance)
                .sound(sound), BlockSetType.IRON));
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryEntry<T> registerCtmCube(String name, Supplier<T> block) {
        RegistryEntry<T> toReturn = CTM_CUBES.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryEntry<CustomSlidingDoorBlock> registerSlidingDoor(String name, MapColor mapColor, int hardness, int resistance, SoundType sound) {
        RegistryEntry<CustomSlidingDoorBlock> toReturn = SLIDING_DOORS.register(name, () -> new CustomSlidingDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(hardness, resistance)
                .sound(sound)));
        registerSlidingDoorItem(name, toReturn);
        return toReturn;
    }

    private static RegistryEntry<CustomGlobeBlock> registerGlobe(String name) {
        RegistryEntry<CustomGlobeBlock> toReturn = GLOBES.register(name, () -> new CustomGlobeBlock(BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5, 6)
                .sound(SoundType.COPPER)
                .noOcclusion()));
        registerGlobeItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryEntry<Item> registerBlockItem(String name, RegistryEntry<T> block) {
        return ModItems.BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryEntry<Item> registerSlidingDoorItem(String name, RegistryEntry<T> block) {
        return ModItems.SLIDING_DOORS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryEntry<Item> registerGlobeItem(String name, RegistryEntry<T> block) {
        return ModItems.GLOBES.register(name, () -> new RenderedBlockItem(block.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));
    }

    private static BlockBehaviour.Properties ceresStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE);
    }

    private static BlockBehaviour.Properties jupiterStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.RAW_IRON);
    }

    private static BlockBehaviour.Properties saturnStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.SAND);
    }

    private static BlockBehaviour.Properties uranusStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE);
    }

    private static BlockBehaviour.Properties neptuneStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BLUE);
    }

    private static BlockBehaviour.Properties orcusStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_CYAN);
    }

    private static BlockBehaviour.Properties plutoStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_ORANGE);
    }

    private static BlockBehaviour.Properties haumeaStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY);
    }

    private static BlockBehaviour.Properties quaoarStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.PODZOL);
    }

    private static BlockBehaviour.Properties makemakeStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_RED);
    }

    private static BlockBehaviour.Properties gonggongStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.WARPED_HYPHAE);
    }

    private static BlockBehaviour.Properties erisStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.SNOW);
    }

    private static BlockBehaviour.Properties sednaStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.NETHER);
    }

    private static BlockBehaviour.Properties proximaCentauriBStoneProperties() {
        return BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE);
    }

    private static BlockBehaviour.Properties juperiumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.DIAMOND)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(9, 30)
                .sound(SoundType.NETHERITE_BLOCK);
    }

    private static BlockBehaviour.Properties saturlyteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_PURPLE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(12, 40)
                .sound(SoundType.AMETHYST);
    }

    private static BlockBehaviour.Properties uraniumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.EMERALD)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(16, 52)
                .sound(SoundType.AMETHYST);
    }

    private static BlockBehaviour.Properties neptuniumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_GREEN)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(20, 64)
                .sound(SoundType.AMETHYST);
    }

    private static BlockBehaviour.Properties radiumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_LIGHT_GREEN)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(25, 80)
                .sound(SoundType.AMETHYST);
    }

    private static BlockBehaviour.Properties plutoniumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_YELLOW)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(32, 100)
                .sound(SoundType.AMETHYST);
    }

    private static BlockBehaviour.Properties electrolyteProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BLUE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(40, 128)
                .sound(SoundType.AMETHYST);
    }
}
