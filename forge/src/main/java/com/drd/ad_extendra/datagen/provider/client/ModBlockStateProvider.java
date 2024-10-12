package com.drd.ad_extendra.datagen.provider.client;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockStateProvider extends BlockStateProvider {
    protected static final ExistingFileHelper.ResourceType TEXTURE = new ExistingFileHelper.ResourceType(PackType.CLIENT_RESOURCES, ".png", "textures");

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AdExtendra.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        ModBlocks.BASIC_BLOCKS.stream().map(RegistryEntry::get).forEach(this::basicBlock);
        ModBlocks.CTM_CUBES.stream().map(RegistryEntry::get).forEach(this::basicBlockNoState);
        ModBlocks.PILLARS.stream().map(RegistryEntry::get).forEach(b -> logBlock((RotatedPillarBlock) b));
        ModBlocks.STAIRS.stream().map(RegistryEntry::get).forEach(b -> stairsBlock((StairBlock) b, findTexture(b, "_stairs")));
        ModBlocks.SLABS.stream().map(RegistryEntry::get).forEach(b -> slabBlock((SlabBlock) b, findTexture(b, "_slab"), findTexture(b, "_slab")));
        ModBlocks.WALLS.stream().map(RegistryEntry::get).forEach(b -> wallBlock((WallBlock) b, findTexture(b, "_wall")));
        ModBlocks.METAL_PRESSURE_PLATES.stream().map(RegistryEntry::get).forEach(b -> pressurePlateBlock((PressurePlateBlock) b, findTexture(b, "_pressure_plate")));
        ModBlocks.METAL_BUTTONS.stream().map(RegistryEntry::get).forEach(b -> buttonBlock((ButtonBlock) b, findTexture(b, "_button")));

        ModBlocks.PILLARS.stream().map(RegistryEntry::get).forEach(b -> simpleBlockItem(b, models().getBuilder(name(b))));
        ModBlocks.STAIRS.stream().map(RegistryEntry::get).forEach(b -> simpleBlockItem(b, models().getBuilder(name(b))));
        ModBlocks.SLABS.stream().map(RegistryEntry::get).forEach(b -> simpleBlockItem(b, models().getBuilder(name(b))));
        ModBlocks.WALLS.stream().map(RegistryEntry::get).forEach(b -> itemModels().wallInventory(name(b), findTexture(b, "_wall")));
        ModBlocks.METAL_PRESSURE_PLATES.stream().map(RegistryEntry::get).forEach(b -> simpleBlockItem(b, models().getBuilder(name(b))));
        ModBlocks.METAL_BUTTONS.stream().map(RegistryEntry::get).forEach(b -> itemModels().buttonInventory(name(b), findTexture(b, "_button")));
    }

    public void basicBlock(Block block) {
        simpleBlockItem(block, models().getBuilder(name(block)));
        simpleBlock(block);
    }

    public void basicBlock(Block block, ModelFile model) {
        simpleBlockItem(block, models().getBuilder(name(block)));
        simpleBlock(block, model);
    }

    public void basicBlockNoState(Block block) {
        simpleBlockItem(block, models().getBuilder(name(block)));
        cubeAll(block);
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private String name(Block block) {
        return this.key(block).getPath();
    }

    private ResourceLocation findTexture(Block block, String replace) {
        ResourceLocation path = new ResourceLocation(AdExtendra.MOD_ID, blockTexture(block).getPath().replace(replace, ""));
        if (!models().existingFileHelper.exists(path, TEXTURE)) {
            path = new ResourceLocation(AdExtendra.MOD_ID, blockTexture(block).getPath().replace(replace, "s"));
            if (!models().existingFileHelper.exists(path, TEXTURE)) {
                path = new ResourceLocation(AdExtendra.MOD_ID, blockTexture(block).getPath().replace(replace, "_bricks"));
                if (!models().existingFileHelper.exists(path, TEXTURE)) {
                    path = new ResourceLocation(AdExtendra.MOD_ID, blockTexture(block).getPath().replace(replace, "_planks"));
                }
            }
        }
        return path;
    }
}
