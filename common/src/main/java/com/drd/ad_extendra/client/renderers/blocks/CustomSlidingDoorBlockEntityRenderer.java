package com.drd.ad_extendra.client.renderers.blocks;

import com.drd.ad_extendra.client.ClientPlatformUtils;
import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.blockentities.CustomSlidingDoorBlockEntity;
import com.drd.ad_extendra.common.blocks.CustomSlidingDoorBlock;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.teamresourceful.resourcefullib.client.CloseablePoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class CustomSlidingDoorBlockEntityRenderer implements BlockEntityRenderer<CustomSlidingDoorBlockEntity> {
    @Override
    public void render(CustomSlidingDoorBlockEntity entity, float partialTick, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        float slide = Mth.lerp(partialTick, entity.lastSlideTicks(), entity.slideTicks()) / 81.0f;
        var state = entity.getBlockState();
        var direction = state.getValue(CustomSlidingDoorBlock.FACING);
        var minecraft = Minecraft.getInstance();
        var model = minecraft.getBlockRenderer().getBlockModel(state);
        boolean flipSecondDoor = ModBlocks.SLIDING_DOORS.stream().noneMatch(block -> block.get().equals(state.getBlock()));

        try (var pose = new CloseablePoseStack(poseStack)) {
            pose.translate(0.5f, 1, 0.5f);
            pose.mulPose(Axis.YP.rotationDegrees(direction.toYRot()));
            pose.translate(-0.5f, 0, -0.5f);

            pose.translate(slide, 0, 0.0625f);
            if (direction.getAxis() == Direction.Axis.Z) {
                pose.translate(0, 0, 0.6875f);
            }

            minecraft.getBlockRenderer().getModelRenderer().renderModel(poseStack.last(),
                    buffer.getBuffer(Sheets.cutoutBlockSheet()),
                    state,
                    model,
                    1f, 1f, 1f,
                    packedLight, packedOverlay);

            pose.translate(-slide - slide, 0, 0);

            if (!flipSecondDoor) {
                pose.translate(0.5f, 0, 0.5f);
                pose.mulPose(Axis.YP.rotationDegrees(180));
                pose.translate(-0.5f, 0, -0.5f);
                pose.translate(0, 0, 0.8125f);

                minecraft.getBlockRenderer().getModelRenderer().renderModel(poseStack.last(),
                        buffer.getBuffer(Sheets.cutoutBlockSheet()),
                        state,
                        model,
                        1f, 1f, 1f,
                        packedLight, packedOverlay);
            } else {
                pose.translate(-1.25f, 0, 0);
                String blockId = BuiltInRegistries.BLOCK.getKey(state.getBlock()).getPath();
                BakedModel blockModel = ClientPlatformUtils.getModel(
                        Minecraft.getInstance().getModelManager(),
                        new ResourceLocation(AdExtendra.MOD_ID, "block/%s_flipped".formatted(blockId)));
                Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(
                        poseStack.last(),
                        buffer.getBuffer(Sheets.cutoutBlockSheet()),
                        state,
                        blockModel,
                        1f, 1f, 1f,
                        packedLight, packedOverlay);
            }
        }
    }
}
