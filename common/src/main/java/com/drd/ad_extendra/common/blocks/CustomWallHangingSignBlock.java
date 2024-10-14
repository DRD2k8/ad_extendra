package com.drd.ad_extendra.common.blocks;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.blockentities.CustomHangingSignBlockEntity;
import com.drd.ad_extendra.common.blocks.base.ModHangingSign;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CustomWallHangingSignBlock extends WallHangingSignBlock implements ModHangingSign {
    private final ResourceLocation guiTexture;

    public CustomWallHangingSignBlock(Properties properties, WoodType type) {
        super(properties, type);
        ResourceLocation location = new ResourceLocation(type.name());
        this.guiTexture = new ResourceLocation(AdExtendra.MOD_ID, "textures/gui/hanging_signs/" + location.getPath());
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new CustomHangingSignBlockEntity(pPos, pState);
    }

    @Override
    public ResourceLocation getGuiTexture() {
        return guiTexture;
    }
}
