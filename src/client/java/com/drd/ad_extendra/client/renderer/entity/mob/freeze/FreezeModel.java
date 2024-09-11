package com.drd.ad_extendra.client.renderer.entity.mob.freeze;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.client.util.ModAnimationDefinitions;
import com.drd.ad_extendra.entity.mob.Freeze;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class FreezeModel<T extends Entity> extends HierarchicalModel<T> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Main.MOD_ID, "freeze"), "main");
	private final ModelPart freeze;
	private final ModelPart body;
	private final ModelPart rods;
	private final ModelPart head;
	private final ModelPart eyes;
	private final ModelPart tornado_body;
	private final ModelPart tornado_bottom;
	private final ModelPart tornado_mid;
	private final ModelPart tornado_top;

	public FreezeModel(ModelPart root) {
		this.freeze = root.getChild("freeze");
		this.body = freeze.getChild("body");
		this.rods = body.getChild("rods");
		this.head = body.getChild("head");
		this.eyes = head.getChild("eyes");
		this.tornado_body = freeze.getChild("tornado_body");
		this.tornado_bottom = tornado_body.getChild("tornado_bottom");
		this.tornado_mid = tornado_bottom.getChild("tornado_mid");
		this.tornado_top = tornado_mid.getChild("tornado_top");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition freeze = partdefinition.addOrReplaceChild("freeze", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = freeze.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rods = body.addOrReplaceChild("rods", CubeListBuilder.create(), PartPose.offset(0.0F, -14.5391F, 0.0F));

		PartDefinition rods_r1 = rods.addOrReplaceChild("rods_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5981F, -4.4609F, 1.5F, -2.7489F, -1.0472F, 3.1416F));

		PartDefinition rods_r2 = rods.addOrReplaceChild("rods_r2", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5981F, -4.4609F, 1.5F, -2.7489F, 1.0472F, 3.1416F));

		PartDefinition rods_r3 = rods.addOrReplaceChild("rods_r3", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4609F, -3.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.0F, 0.0F));

		PartDefinition eyes = head.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(4, 24).addBox(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tornado_body = freeze.addOrReplaceChild("tornado_body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tornado_bottom = tornado_body.addOrReplaceChild("tornado_bottom", CubeListBuilder.create().texOffs(1, 115).addBox(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tornado_mid = tornado_bottom.addOrReplaceChild("tornado_mid", CubeListBuilder.create().texOffs(74, 60).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition tornado_top = tornado_mid.addOrReplaceChild("tornado_top", CubeListBuilder.create().texOffs(0, 32).addBox(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 160);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animate(((Freeze) entity).idleAnimationState, ModAnimationDefinitions.FREEZE_IDLE, ageInTicks, 1f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		freeze.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return freeze;
	}
}