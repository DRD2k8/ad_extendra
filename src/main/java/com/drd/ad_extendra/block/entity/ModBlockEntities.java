package com.drd.ad_extendra.block.entity;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.block.ModBlocks;
import com.drd.ad_extendra.block.door.CustomSlidingDoorBlockEntity;
import com.drd.ad_extendra.block.globe.CustomGlobeBlockEntity;
import com.mojang.datafixers.types.Type;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {
    public static final ResourcefulRegistry<BlockEntityType<?>> BLOCK_ENTITIES = ResourcefulRegistries.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Main.MOD_ID);

    public static final RegistryEntry<BlockEntityType<CustomSlidingDoorBlockEntity>> SLIDING_DOOR = BLOCK_ENTITIES.register("sliding_door", () -> {
        return createBlockEntityType(CustomSlidingDoorBlockEntity::new, ModBlocks.SLIDING_DOORS);
    });

    public static final RegistryEntry<BlockEntityType<CustomGlobeBlockEntity>> GLOBE = BLOCK_ENTITIES.register("globe", () -> {
        return createBlockEntityType(CustomGlobeBlockEntity::new, ModBlocks.GLOBES);
    });

    public static <E extends BlockEntity> BlockEntityType<E> createBlockEntityType(BlockEntityType.BlockEntitySupplier<E> factory, ResourcefulRegistry<Block> registry) {
        return BlockEntityType.Builder.of(factory, (Block[])registry.stream().map(RegistryEntry::get).toArray((x$0) -> {
            return new Block[x$0];
        })).build((Type)null);
    }
}
