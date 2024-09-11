package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_10;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier10;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class RocketModelTier10 extends VehicleModel<RocketTier10> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Main.MOD_ID, "tier_10_rocket"), "main");

    public RocketModelTier10(ModelPart root) {
        super(root, "rocket");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket = partdefinition.addOrReplaceChild("rocket", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -23.0F, -8.0F));

        PartDefinition base = body.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 90.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 55).addBox(-1.0F, 8.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 55).addBox(-1.0F, 0.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 90.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.998F, 0.0F, 16.001F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 90.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.999F, 0.0F, 16.001F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r3 = base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 90.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.001F, 0.0F, -1.5708F, 0.0F));

        PartDefinition frame = base.addOrReplaceChild("frame", CubeListBuilder.create().texOffs(36, 59).addBox(2.0F, -39.0F, -2.25F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = frame.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(168, -7).addBox(-1.0F, -15.0F, -1.0F, 0.0F, 15.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -67.0F, 8.0F, 0.0F, 1.5708F, 0.5236F));

        PartDefinition cube_r5 = frame.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(168, -7).addBox(-1.0F, -15.0F, -1.0F, 0.0F, 15.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -67.0F, 8.0F, 0.0F, -1.5708F, -0.5236F));

        PartDefinition cube_r6 = frame.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(168, -7).addBox(-1.0F, -15.0F, -1.0F, 0.0F, 15.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -67.0F, 16.0F, -0.5236F, 0.0F, 0.0F));

        PartDefinition bottom_frame = frame.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(88, 100).addBox(-2.0F, -12.0F, -2.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r7 = bottom_frame.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r8 = bottom_frame.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r9 = bottom_frame.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition lower_middle_frame = frame.addOrReplaceChild("lower_middle_frame", CubeListBuilder.create().texOffs(88, 115).addBox(-2.0F, -11.0F, -2.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

        PartDefinition cube_r10 = lower_middle_frame.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r11 = lower_middle_frame.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r12 = lower_middle_frame.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition upper_middle_frame = frame.addOrReplaceChild("upper_middle_frame", CubeListBuilder.create().texOffs(88, 108).addBox(-2.0F, -11.0F, -2.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -37.0F, 0.0F));

        PartDefinition cube_r13 = upper_middle_frame.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r14 = upper_middle_frame.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r15 = upper_middle_frame.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top_frame = frame.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(88, 122).addBox(-2.0F, -19.0F, -2.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -64.0F, 0.0F));

        PartDefinition cube_r16 = top_frame.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 4.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r17 = top_frame.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 4.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r18 = top_frame.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition boosters = frame.addOrReplaceChild("boosters", CubeListBuilder.create().texOffs(40, 101).addBox(-7.0F, -26.0F, 4.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r19 = boosters.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, -12.0F, 11.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r20 = boosters.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -12.0F, 18.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r21 = boosters.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -12.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition pyramid = base.addOrReplaceChild("pyramid", CubeListBuilder.create(), PartPose.offset(0.0F, -15.75F, 0.0F));

        PartDefinition cube_r22 = pyramid.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -67.0F, 1.0F, 0.0F, -1.5708F, -0.1745F));

        PartDefinition cube_r23 = pyramid.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, -67.0F, 16.0F, 2.9671F, 0.0F, 3.1416F));

        PartDefinition cube_r24 = pyramid.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -67.0F, 15.0F, 0.0F, 1.5708F, 0.1745F));

        PartDefinition cube_r25 = pyramid.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -67.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition pyramid_holder = pyramid.addOrReplaceChild("pyramid_holder", CubeListBuilder.create().texOffs(72, 2).addBox(0.75F, -88.0F, 0.75F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(13.25F, -88.0F, 0.75F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(13.0F, -88.0F, 13.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(0.75F, -88.0F, 13.25F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(80, 0).addBox(4.0F, -103.5F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(80, 16).addBox(5.0F, -115.5F, 5.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r26 = pyramid_holder.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(3.75F, -103.75F, 3.75F, -0.3927F, 0.7854F, 0.0F));

        PartDefinition cube_r27 = pyramid_holder.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(12.25F, -103.75F, 3.75F, -0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r28 = pyramid_holder.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(12.0F, -103.75F, 12.0F, 0.4326F, -0.678F, -0.6346F));

        PartDefinition cube_r29 = pyramid_holder.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(3.75F, -103.75F, 12.25F, 0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r30 = pyramid_holder.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -103.5F, 8.0F, 0.0F, 1.5708F, 0.2182F));

        PartDefinition cube_r31 = pyramid_holder.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -103.5F, 12.0F, 2.9234F, 0.0F, 3.1416F));

        PartDefinition cube_r32 = pyramid_holder.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, -103.5F, 8.0F, 0.0F, -1.5708F, -0.2182F));

        PartDefinition cube_r33 = pyramid_holder.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -103.5F, 4.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r34 = pyramid_holder.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.75F, -87.5F, 3.75F, 0.0F, -1.5708F, -0.2182F));

        PartDefinition cube_r35 = pyramid_holder.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.5F, -87.75F, 12.75F, 2.9234F, 0.0F, 3.1416F));

        PartDefinition cube_r36 = pyramid_holder.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -87.75F, 12.25F, 0.0F, 1.5708F, 0.2182F));

        PartDefinition cube_r37 = pyramid_holder.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -87.5F, 3.25F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r38 = pyramid_holder.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -78.5F, 9.0F, 0.0F, -1.5708F, -0.1309F));

        PartDefinition cube_r39 = pyramid_holder.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -78.5F, 11.0F, 3.0107F, 0.0F, 3.1416F));

        PartDefinition cube_r40 = pyramid_holder.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -78.5F, 7.0F, 0.0F, 1.5708F, 0.1309F));

        PartDefinition cube_r41 = pyramid_holder.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -78.25F, 5.0F, -0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r42 = pyramid_holder.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -87.75F, 14.25F, 0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r43 = pyramid_holder.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -87.75F, 14.0F, 0.4326F, -0.678F, -0.6346F));

        PartDefinition cube_r44 = pyramid_holder.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.25F, -87.75F, 1.75F, -0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r45 = pyramid_holder.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -87.75F, 1.75F, -0.3927F, 0.7854F, 0.0F));

        PartDefinition cube_r46 = pyramid_holder.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -65.75F, 16.75F, 2.8883F, -0.7519F, -2.7794F));

        PartDefinition cube_r47 = pyramid_holder.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.75F, -66.25F, 16.75F, 0.2533F, -0.7519F, -0.3622F));

        PartDefinition cube_r48 = pyramid_holder.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.5F, -65.75F, -0.5F, -0.2618F, -0.7854F, 0.0F));

        PartDefinition cube_r49 = pyramid_holder.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -65.75F, -0.75F, -0.2618F, 0.7854F, 0.0F));

        PartDefinition middle_rod = pyramid_holder.addOrReplaceChild("middle_rod", CubeListBuilder.create().texOffs(72, 0).addBox(7.0F, -142.5F, 7.0F, 2.0F, 27.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(4.0F, -150.25F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -117.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -120.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -123.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -126.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -129.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -132.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -135.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -138.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -141.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition north_rod = pyramid_holder.addOrReplaceChild("north_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(104, 16).addBox(-3.0F, -16.75F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, 0.6155F, -0.5236F, -0.9553F));

        PartDefinition south_rod = pyramid_holder.addOrReplaceChild("south_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(104, 16).addBox(-3.0F, -16.75F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, 0.7854F, -0.7854F, 0.0F));

        PartDefinition west_rod = pyramid_holder.addOrReplaceChild("west_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(104, 16).addBox(-3.0F, -16.75F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, -0.7854F, 0.7854F, 0.0F));

        PartDefinition east_rod = pyramid_holder.addOrReplaceChild("east_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(104, 16).addBox(-3.0F, -16.75F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, -0.7854F, -0.7854F, 0.0F));

        PartDefinition north_thruster = body.addOrReplaceChild("north_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(128, 55).addBox(-9.7788F, 22.1725F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2212F, -32.1725F, -7.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r50 = north_thruster.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, -4.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r51 = north_thruster.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 2.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r52 = north_thruster.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -11.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r53 = north_thruster.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 17.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r54 = north_thruster.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 7.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition south_thruster = body.addOrReplaceChild("south_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(128, 55).addBox(-9.7788F, 22.1725F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.2212F, -32.1725F, -7.0F, 0.0F, -2.3562F, 0.0F));

        PartDefinition cube_r55 = south_thruster.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, 0.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r56 = south_thruster.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -7.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 7.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r57 = south_thruster.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -14.0F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -6.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r58 = south_thruster.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 93).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 22.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r59 = south_thruster.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 85).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 12.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition west_thruster = body.addOrReplaceChild("west_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(128, 55).addBox(-9.7788F, 22.1725F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.2212F, -32.1725F, 23.0F, 0.0F, 2.3562F, 0.0F));

        PartDefinition cube_r60 = west_thruster.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, 0.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r61 = west_thruster.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -7.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 7.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r62 = west_thruster.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -14.0F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -6.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r63 = west_thruster.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(82, 93).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 22.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r64 = west_thruster.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(82, 85).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 12.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition east_thruster = body.addOrReplaceChild("east_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(128, 55).addBox(-9.7788F, 22.1725F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2212F, -32.1725F, 23.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r65 = east_thruster.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, -4.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r66 = east_thruster.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 2.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r67 = east_thruster.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -11.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r68 = east_thruster.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 17.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r69 = east_thruster.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 7.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition bottom_thrusters = body.addOrReplaceChild("bottom_thrusters", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition right = bottom_thrusters.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition north = right.addOrReplaceChild("north", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r70 = north.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition south = right.addOrReplaceChild("south", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r71 = south.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition left = bottom_thrusters.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offsetAndRotation(15.0F, 0.0F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition east = left.addOrReplaceChild("east", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r72 = east.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition west = left.addOrReplaceChild("west", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r73 = west.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition engine = rocket.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom = engine.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(214, 32).addBox(-8.0F, -9.0F, -8.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(198, 0).addBox(-8.0F, -9.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(198, 16).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r74 = bottom.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(214, 32).addBox(-2.0F, -10.0F, -1.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 1.0F, -6.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r75 = bottom.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(214, 32).addBox(-2.0F, -10.0F, -1.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r76 = bottom.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(214, 32).addBox(-2.0F, -10.0F, -1.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 1.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top = engine.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 114).addBox(-6.0F, -15.0F, -6.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r77 = top.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r78 = top.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r79 = top.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -9.0F, 5.0F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }
}
