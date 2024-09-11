package com.drd.ad_extendra.client.renderer.block.door;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.block.ModBlocks;
import com.drd.ad_extendra.block.door.CustomSlidingDoorBlock;
import com.drd.ad_extendra.block.door.CustomSlidingDoorBlockEntity;
import com.drd.ad_extendra.client.renderer.RendererRegistry;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.Block;

public class CustomSlidingDoorRenderer implements BlockEntityRenderer<CustomSlidingDoorBlockEntity> {
    public static final ResourceLocation JUPERIUM_SLIDING_DOOR_MODEL = new ResourceLocation(Main.MOD_ID, "block/door/juperium_sliding_door");
    public static final ResourceLocation JUPERIUM_SLIDING_DOOR_MODEL_FLIPPED = new ResourceLocation(Main.MOD_ID, "block/door/juperium_sliding_door_flipped");
    public static final ResourceLocation SATURLYTE_SLIDING_DOOR_MODEL = new ResourceLocation(Main.MOD_ID, "block/door/saturlyte_sliding_door");
    public static final ResourceLocation SATURLYTE_SLIDING_DOOR_MODEL_FLIPPED = new ResourceLocation(Main.MOD_ID, "block/door/saturlyte_sliding_door_flipped");
    public static final ResourceLocation URANIUM_SLIDING_DOOR_MODEL = new ResourceLocation(Main.MOD_ID, "block/door/uranium_sliding_door");
    public static final ResourceLocation URANIUM_SLIDING_DOOR_MODEL_FLIPPED = new ResourceLocation(Main.MOD_ID, "block/door/uranium_sliding_door_flipped");
    public static final ResourceLocation NEPTUNIUM_SLIDING_DOOR_MODEL = new ResourceLocation(Main.MOD_ID, "block/door/neptunium_sliding_door");
    public static final ResourceLocation NEPTUNIUM_SLIDING_DOOR_MODEL_FLIPPED = new ResourceLocation(Main.MOD_ID, "block/door/neptunium_sliding_door_flipped");
    public static final ResourceLocation RADIUM_SLIDING_DOOR_MODEL = new ResourceLocation(Main.MOD_ID, "block/door/radium_sliding_door");
    public static final ResourceLocation RADIUM_SLIDING_DOOR_MODEL_FLIPPED = new ResourceLocation(Main.MOD_ID, "block/door/radium_sliding_door_flipped");
    public static final ResourceLocation PLUTONIUM_SLIDING_DOOR_MODEL = new ResourceLocation(Main.MOD_ID, "block/door/plutonium_sliding_door");
    public static final ResourceLocation PLUTONIUM_SLIDING_DOOR_MODEL_FLIPPED = new ResourceLocation(Main.MOD_ID, "block/door/plutonium_sliding_door_flipped");
    public static final ResourceLocation ELECTROLYTE_SLIDING_DOOR_MODEL = new ResourceLocation(Main.MOD_ID, "block/door/electrolyte_sliding_door");
    public static final ResourceLocation ELECTROLYTE_SLIDING_DOOR_MODEL_FLIPPED = new ResourceLocation(Main.MOD_ID, "block/door/electrolyte_sliding_door_flipped");

    public CustomSlidingDoorRenderer(BlockEntityRendererProvider.Context ctx) {
    }

    public void render(CustomSlidingDoorBlockEntity entity, float tickDelta, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        float slide = Mth.lerp(tickDelta, (float)entity.getPreviousSlideTicks(), (float)entity.getSlideTicks()) / 81.0F;
        Block type = entity.getBlockState().getBlock();
        float offset = 0.0F;
        ResourceLocation doorModelFlipped;
        ResourceLocation doorModel;
        if (type.equals(ModBlocks.JUPERIUM_SLIDING_DOOR.get())) {
            doorModel = JUPERIUM_SLIDING_DOOR_MODEL;
            doorModelFlipped = JUPERIUM_SLIDING_DOOR_MODEL_FLIPPED;
        } else if (type.equals(ModBlocks.SATURLYTE_SLIDING_DOOR.get())) {
            doorModel = SATURLYTE_SLIDING_DOOR_MODEL;
            doorModelFlipped = SATURLYTE_SLIDING_DOOR_MODEL_FLIPPED;
        } else if (type.equals(ModBlocks.URANIUM_SLIDING_DOOR.get())) {
            doorModel = URANIUM_SLIDING_DOOR_MODEL;
            doorModelFlipped = URANIUM_SLIDING_DOOR_MODEL_FLIPPED;
        } else if (type.equals(ModBlocks.NEPTUNIUM_SLIDING_DOOR.get())) {
            doorModel = NEPTUNIUM_SLIDING_DOOR_MODEL;
            doorModelFlipped = NEPTUNIUM_SLIDING_DOOR_MODEL_FLIPPED;
        } else if (type.equals(ModBlocks.RADIUM_SLIDING_DOOR.get())) {
            doorModel = RADIUM_SLIDING_DOOR_MODEL;
            doorModelFlipped = RADIUM_SLIDING_DOOR_MODEL_FLIPPED;
        } else if (type.equals(ModBlocks.PLUTONIUM_SLIDING_DOOR.get())) {
            doorModel = PLUTONIUM_SLIDING_DOOR_MODEL;
            doorModelFlipped = PLUTONIUM_SLIDING_DOOR_MODEL_FLIPPED;
        } else {
            if (!type.equals(ModBlocks.ELECTROLYTE_SLIDING_DOOR.get())) {
                return;
            }

            doorModel = ELECTROLYTE_SLIDING_DOOR_MODEL;
            doorModelFlipped = ELECTROLYTE_SLIDING_DOOR_MODEL_FLIPPED;
        }

        Direction degrees = (Direction)entity.getBlockState().getValue(CustomSlidingDoorBlock.FACING);
        poseStack.pushPose();
        if (degrees.equals(Direction.NORTH)) {
            poseStack.translate(-1.5F, 1.0F, 0.42F);
            poseStack.translate((double)(-slide), 0.0, 0.0);
            poseStack.translate((double)offset, 0.0, 0.0);
        } else if (degrees.equals(Direction.EAST)) {
            poseStack.translate(0.38F, 1.0F, 1.0F);
            poseStack.translate(0.0F, 0.0F, -slide);
            poseStack.translate(0.0F, 0.0F, -offset);
        } else if (degrees.equals(Direction.SOUTH)) {
            poseStack.translate(2.5F, 1.0F, 0.56F);
            poseStack.translate((double)slide, 0.0, 0.0);
            poseStack.translate(-offset, 0.0F, 0.0F);
        } else if (degrees.equals(Direction.WEST)) {
            poseStack.translate(0.56F, 1.0F, 0.0F);
            poseStack.translate(0.0F, 0.0F, slide);
            poseStack.translate(0.0F, 0.0F, offset);
        }

        poseStack.mulPose(Axis.YP.rotationDegrees(degrees.getOpposite().toYRot()));
        boolean shouldNotFlip = degrees.equals(Direction.WEST) || degrees.equals(Direction.EAST);
        RendererRegistry.renderBlock(shouldNotFlip ? doorModel : doorModelFlipped, poseStack, buffer, packedLight, packedOverlay);
        poseStack.popPose();
        poseStack.pushPose();
        if (degrees.equals(Direction.NORTH)) {
            poseStack.translate(0.0F, 1.0F, 0.42F);
            poseStack.translate((double)slide, 0.0, 0.0);
            poseStack.translate((double)offset, 0.0, 0.0);
        } else if (degrees.equals(Direction.EAST)) {
            poseStack.translate(0.38F, 1.0F, 2.5F);
            poseStack.translate(0.0F, 0.0F, slide);
            poseStack.translate(0.0F, 0.0F, -offset);
        } else if (degrees.equals(Direction.SOUTH)) {
            poseStack.translate(1.0F, 1.0F, 0.56F);
            poseStack.translate((double)(-slide), 0.0, 0.0);
            poseStack.translate(-offset, 0.0F, 0.0F);
        } else if (degrees.equals(Direction.WEST)) {
            poseStack.translate(0.56F, 1.0F, -1.5F);
            poseStack.translate(0.0F, 0.0F, -slide);
            poseStack.translate(0.0F, 0.0F, offset);
        }

        poseStack.mulPose(Axis.YP.rotationDegrees(degrees.getOpposite().toYRot()));
        RendererRegistry.renderBlock(shouldNotFlip ? doorModelFlipped : doorModel, poseStack, buffer, packedLight, packedOverlay);
        poseStack.popPose();
    }
}
