package com.drd.ad_extendra.client.renderers.entities.vehicles;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.entities.vehicles.CustomBoat;
import com.drd.ad_extendra.common.entities.vehicles.CustomChestBoat;
import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.datafixers.util.Pair;
import com.mojang.math.Axis;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.WaterPatchModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.vehicle.Boat;
import org.joml.Quaternionf;

import java.util.Map;
import java.util.stream.Stream;

public class CustomBoatRenderer extends BoatRenderer {
    private final Map<CustomBoat.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

    public CustomBoatRenderer(EntityRendererProvider.Context context, boolean chest) {
        super(context, false);
        this.boatResources = Stream.of(CustomBoat.Type.values()).collect(ImmutableMap.toImmutableMap((key) -> key, (model) ->
                Pair.of(new ResourceLocation(AdExtendra.MOD_ID, getTextureLocation(model, chest)), createBoatModel(context, model, chest))));
    }

    @Override
    public void render(Boat entity, float entityYaw, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int packedLight) {
        Pair<ResourceLocation, ListModel<Boat>> pair = null;
        if(entity instanceof CustomBoat entity1){
            pair = this.boatResources.get(entity1.getModVariant());
        }else if (entity instanceof CustomChestBoat entity2){
            pair = this.boatResources.get(entity2.getModVariant());
        }
        matrixStack.pushPose();
        matrixStack.translate(0.0F, 0.375F, 0.0F);
        matrixStack.mulPose(Axis.YP.rotationDegrees(180.0F - entityYaw));
        float f = (float)entity.getHurtTime() - partialTicks;
        float g = entity.getDamage() - partialTicks;
        if (g < 0.0F) {
            g = 0.0F;
        }

        if (f > 0.0F) {
            matrixStack.mulPose(Axis.XP.rotationDegrees(Mth.sin(f) * f * g / 10.0F * (float)entity.getHurtDir()));
        }

        float h = entity.getBubbleAngle(partialTicks);
        if (!Mth.equal(h, 0.0F)) {
            matrixStack.mulPose((new Quaternionf()).setAngleAxis(entity.getBubbleAngle(partialTicks) * 0.017453292F, 1.0F, 0.0F, 1.0F));
        }
        ResourceLocation resourceLocation = pair.getFirst();
        ListModel<Boat> listModel = pair.getSecond();
        matrixStack.scale(-1.0F, -1.0F, 1.0F);
        matrixStack.mulPose(Axis.YP.rotationDegrees(90.0F));
        listModel.setupAnim(entity, partialTicks, 0.0F, -0.1F, 0.0F, 0.0F);
        VertexConsumer vertexConsumer = buffer.getBuffer(listModel.renderType(resourceLocation));
        listModel.renderToBuffer(matrixStack, vertexConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        if (!entity.isUnderWater()) {
            VertexConsumer vertexConsumer2 = buffer.getBuffer(RenderType.waterMask());
            if (listModel instanceof WaterPatchModel waterPatchModel) {
                waterPatchModel.waterPatch().render(matrixStack, vertexConsumer2, packedLight, OverlayTexture.NO_OVERLAY);
            }
        }

        matrixStack.popPose();
    }

    private static String getTextureLocation(CustomBoat.Type type, boolean chest) {
        return chest ? "textures/entity/chest_boat/" + type.getName() + ".png" : "textures/entity/boat/" + type.getName() + ".png";
    }

    private BoatModel createBoatModel(EntityRendererProvider.Context context, CustomBoat.Type type, boolean chest) {
        ModelLayerLocation modellayerlocation = chest ? chestBoatTextureLocation(type) : boatTextureLocation(type);
        ModelPart baked = context.bakeLayer(modellayerlocation);
        return chest ? new ChestBoatModel(baked) : new BoatModel(baked);
    }

    private static ModelLayerLocation getModel(String name, String model) {
        return new ModelLayerLocation(new ResourceLocation(AdExtendra.MOD_ID, name), model);
    }

    public static ModelLayerLocation boatTextureLocation(CustomBoat.Type type) {
        return getModel("boat/" + type.getName(), "main");
    }

    public static ModelLayerLocation chestBoatTextureLocation(CustomBoat.Type type) {
        return getModel("chest_boat/" + type.getName(), "main");
    }
}
