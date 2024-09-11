package com.drd.ad_extendra.client.renderer.block.globe;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.block.globe.CustomGlobeBlockEntity;
import com.drd.ad_extendra.client.ClientPlatformUtils;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.teamresourceful.resourcefullib.client.CloseablePoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class CustomGlobeRenderer implements BlockEntityRenderer<CustomGlobeBlockEntity> {
    public CustomGlobeRenderer(BlockEntityRendererProvider.Context ctx) {
    }

    public void render(CustomGlobeBlockEntity entity, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        float yaw = Mth.lerp(partialTicks, entity.prevYaw, entity.getYaw());
        render(entity.getBlockState(), yaw, poseStack, buffer, packedLight, packedOverlay);
    }

    private static void render(BlockState state, float yaw, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        ModelManager var10000 = Minecraft.getInstance().getModelManager();
        String var10004 = BuiltInRegistries.BLOCK.getKey(state.getBlock()).getPath();
        BakedModel blockModel = ClientPlatformUtils.getModel(var10000, new ResourceLocation(Main.MOD_ID, "block/" + var10004 + "_cube"));
        CloseablePoseStack ignored = new CloseablePoseStack(poseStack);

        try {
            poseStack.translate(0.5, 0.0, 0.5);
            poseStack.mulPose(Axis.YP.rotationDegrees(-yaw));
            poseStack.translate(-0.5, 0.0, -0.5);
            Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(poseStack.last(), buffer.getBuffer(Sheets.cutoutBlockSheet()), state, blockModel, 1.0F, 1.0F, 1.0F, packedLight, packedOverlay);
        } catch (Throwable var11) {
            try {
                ignored.close();
            } catch (Throwable var10) {
                var11.addSuppressed(var10);
            }

            throw var11;
        }

        ignored.close();
    }

    public static class ItemRenderer extends BlockEntityWithoutLevelRenderer {
        private long prevWorldTime;

        public ItemRenderer() {
            super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
        }

        public void renderByItem(ItemStack stack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
            BlockState state = ((Block)BuiltInRegistries.BLOCK.get(BuiltInRegistries.ITEM.getKey(stack.getItem()))).defaultBlockState();
            Minecraft minecraft = Minecraft.getInstance();
            if (minecraft.level != null) {
                float partialTicks = minecraft.getFrameTime();
                float yaw = Mth.lerp(partialTicks, (float)this.prevWorldTime, (float)minecraft.level.getGameTime()) * -2.0F;
                this.prevWorldTime = minecraft.level.getGameTime();
                CloseablePoseStack ignored = new CloseablePoseStack(poseStack);

                try {
                    BakedModel blockModel = Minecraft.getInstance().getBlockRenderer().getBlockModel(state);
                    Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(poseStack.last(), buffer.getBuffer(Sheets.cutoutBlockSheet()), state, blockModel, 1.0F, 1.0F, 1.0F, packedLight, packedOverlay);
                    CustomGlobeRenderer.render(state, yaw, poseStack, buffer, packedLight, packedOverlay);
                } catch (Throwable var15) {
                    try {
                        ignored.close();
                    } catch (Throwable var14) {
                        var15.addSuppressed(var14);
                    }

                    throw var15;
                }

                ignored.close();
            }
        }
    }
}
