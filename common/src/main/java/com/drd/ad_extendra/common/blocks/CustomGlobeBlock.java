package com.drd.ad_extendra.common.blocks;

import com.drd.ad_extendra.common.blockentities.CustomGlobeBlockEntity;
import earth.terrarium.adastra.common.blocks.GlobeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CustomGlobeBlock extends GlobeBlock {
    public CustomGlobeBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.getBlockEntity(pos) instanceof CustomGlobeBlockEntity entity) {
            entity.rotateGlobe();
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public void onProjectileHit(Level level, BlockState state, BlockHitResult hit, Projectile projectile) {
        if (level.getBlockEntity(hit.getBlockPos()) instanceof CustomGlobeBlockEntity entity) {
            entity.rotateGlobe();
        }
        super.onProjectileHit(level, state, hit, projectile);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CustomGlobeBlockEntity(pos, state);
    }
}
