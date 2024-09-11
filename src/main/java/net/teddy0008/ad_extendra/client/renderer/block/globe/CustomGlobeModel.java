package net.teddy0008.ad_extendra.client.renderer.block.globe;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.teddy0008.ad_extendra.Main;

public class CustomGlobeModel extends Model {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Main.MOD_ID, "globe"), "main");
    private final ModelPart globe;

    public CustomGlobeModel(ModelPart root) {
        super(RenderType::entityCutout);
        this.globe = root.getChild("globe");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        PartDefinition globe = modelPartData.addOrReplaceChild("globe", CubeListBuilder.create().texOffs(0, 16).addBox(-7.0F, -16.0F, 1.0F, 8.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 28).addBox(-4.0F, -1.0F, -2.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-3.0F, -5.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, -4.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 24.0F, -1.0F));
        PartDefinition planet = globe.addOrReplaceChild("planet", CubeListBuilder.create(), PartPose.offset(-1.0F, -10.0F, 1.0F));
        planet.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        return LayerDefinition.create(modelData, 64, 64);
    }

    public static CustomGlobeModel getModel() {
        return new CustomGlobeModel(Minecraft.getInstance().getEntityModels().bakeLayer(LAYER_LOCATION));
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertices, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.globe.render(poseStack, vertices, packedLight, packedOverlay);
    }

    public void setYaw(float yaw) {
        this.globe.getChild("planet").yRot = yaw;
    }
}
