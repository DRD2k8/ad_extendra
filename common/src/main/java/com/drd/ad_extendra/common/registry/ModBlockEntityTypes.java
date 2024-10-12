package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.blockentities.CustomGlobeBlockEntity;
import com.drd.ad_extendra.common.blockentities.CustomSlidingDoorBlockEntity;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntityTypes {
    public static final ResourcefulRegistry<BlockEntityType<?>> BLOCK_ENTITY_TYPES = ResourcefulRegistries.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, AdExtendra.MOD_ID);

    public static final RegistryEntry<BlockEntityType<CustomSlidingDoorBlockEntity>> SLIDING_DOOR = BLOCK_ENTITY_TYPES.register(
            "sliding_door",
            () -> createBlockEntityType(
                    CustomSlidingDoorBlockEntity::new,
                    ModBlocks.SLIDING_DOORS));

    public static final RegistryEntry<BlockEntityType<CustomGlobeBlockEntity>> GLOBE = BLOCK_ENTITY_TYPES.register(
            "globe",
            () -> createBlockEntityType(
                    CustomGlobeBlockEntity::new,
                    ModBlocks.GLOBES));

    public static <E extends BlockEntity> BlockEntityType<E> createBlockEntityType(BlockEntityType.BlockEntitySupplier<E> factory, ResourcefulRegistry<Block> registry) {
        return BlockEntityType.Builder.of(factory,
                        registry.stream()
                                .map(RegistryEntry::get)
                                .toArray(Block[]::new))
                .build(null);
    }
}
