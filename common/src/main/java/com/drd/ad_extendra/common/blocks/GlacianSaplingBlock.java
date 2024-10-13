package com.drd.ad_extendra.common.blocks;

import com.drd.ad_extendra.worldgen.tree.GlacianTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GlacianSaplingBlock extends SaplingBlock {
    public GlacianSaplingBlock(Properties pProperties) {
        super(new GlacianTreeGrower(), pProperties);
    }

    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(Blocks.SNOW_BLOCK) || pState.is(Blocks.POWDER_SNOW);
    }
}
