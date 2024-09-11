package com.drd.ad_extendra.block;

import com.drd.ad_extendra.block.entity.ModBlockEntities;
import com.teamresourceful.resourcefullib.common.caches.CacheableFunction;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class ModBasicEntityBlock extends BaseEntityBlock {
    private static final CacheableFunction<Block, BlockEntityType<?>> BLOCK_TO_ENTITY = new CacheableFunction<>(block ->
            ModBlockEntities.BLOCK_ENTITIES.getEntries()
                    .stream()
                    .map(RegistryEntry::get)
                    .filter(type -> type.isValid(block.defaultBlockState()))
                    .findFirst()
                    .orElse(null)
    );
    private BlockEntityType<?> entity;

    public ModBasicEntityBlock(Properties properties) {
        super(properties);
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (this.entity == null) {
            this.entity = (BlockEntityType)BLOCK_TO_ENTITY.apply(state.getBlock());
        }

        return this.entity.create(pos, state);
    }

    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}
