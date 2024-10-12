package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.blocks.CustomSlidingDoorBlock;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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
    public static final ResourcefulRegistry<Block> PILLARS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> BUTTONS = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> METAL_BUTTONS = ResourcefulRegistries.create(BUTTONS);
    public static final ResourcefulRegistry<Block> PRESSURE_PLATES = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> METAL_PRESSURE_PLATES = ResourcefulRegistries.create(PRESSURE_PLATES);
    public static final ResourcefulRegistry<Block> CTM_CUBES = ResourcefulRegistries.create(BLOCKS);
    public static final ResourcefulRegistry<Block> SLIDING_DOORS = ResourcefulRegistries.create(BLOCKS);

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
    public static final RegistryEntry<ButtonBlock> JUPERIUM_PLATING_BUTTON = registerMetalButton("juperium_plating_button", MapColor.DIAMOND, 9, 26, SoundType.NETHERITE_BLOCK);
    public static final RegistryEntry<PressurePlateBlock> JUPERIUM_PLATING_PRESSURE_PLATE = registerMetalPressurePlate("juperium_plating_pressure_plate", MapColor.DIAMOND, 9, 26, SoundType.NETHERITE_BLOCK);
    public static final RegistryEntry<CustomSlidingDoorBlock> JUPERIUM_SLIDING_DOOR = registerSlidingDoor("juperium_sliding_door", MapColor.DIAMOND, 9, 26, SoundType.NETHERITE_BLOCK);

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

    private static <T extends Block> RegistryEntry<Item> registerBlockItem(String name, RegistryEntry<T> block) {
        return ModItems.BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryEntry<Item> registerSlidingDoorItem(String name, RegistryEntry<T> block) {
        return ModItems.SLIDING_DOORS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static BlockBehaviour.Properties juperiumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.DIAMOND)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(9, 26)
                .sound(SoundType.NETHERITE_BLOCK);
    }
}
