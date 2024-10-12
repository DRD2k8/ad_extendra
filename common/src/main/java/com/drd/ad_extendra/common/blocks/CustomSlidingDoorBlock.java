package com.drd.ad_extendra.common.blocks;

import com.drd.ad_extendra.common.blockentities.CustomSlidingDoorBlockEntity;
import earth.terrarium.adastra.common.blocks.SlidingDoorBlock;
import earth.terrarium.adastra.common.blocks.properties.SlidingDoorPartProperty;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CustomSlidingDoorBlock extends SlidingDoorBlock {
    public CustomSlidingDoorBlock(Properties properties) {
        super(properties);
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ((SlidingDoorPartProperty)state.getValue(SlidingDoorBlock.PART)).equals(SlidingDoorPartProperty.BOTTOM) ? new CustomSlidingDoorBlockEntity(pos, state) : null;
    }
}
