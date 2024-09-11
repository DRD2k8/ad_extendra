package com.drd.ad_extendra.client.renderer.entity.vehicle.rocket.tier_5;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.vehicle.RocketTier5;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class RocketModelTier5 extends VehicleModel<RocketTier5> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Main.MOD_ID, "tier_5_rocket"), "main");

    public RocketModelTier5(ModelPart root) {
        super(root, "rocket");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket = partdefinition.addOrReplaceChild("rocket", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -15.0F, -8.0F));

        PartDefinition base = body.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -59.0F, -1.0F, 18.0F, 59.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 59).addBox(-1.0F, 0.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -59.0F, -1.0F, 18.0F, 59.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.998F, 0.0F, 16.001F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -59.0F, -1.0F, 18.0F, 59.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.999F, 0.0F, 16.001F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r3 = base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 0).addBox(-1.0F, -59.0F, -1.0F, 18.0F, 59.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.001F, 0.0F, -1.5708F, 0.0F));

        PartDefinition frame = base.addOrReplaceChild("frame", CubeListBuilder.create().texOffs(36, 59).addBox(2.0F, -39.0F, -2.25F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom_frame = frame.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(88, 100).addBox(-2.0F, -12.0F, -2.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = bottom_frame.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r5 = bottom_frame.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r6 = bottom_frame.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition lower_middle_frame = frame.addOrReplaceChild("lower_middle_frame", CubeListBuilder.create().texOffs(88, 115).addBox(-2.0F, -11.0F, -2.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

        PartDefinition cube_r7 = lower_middle_frame.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r8 = lower_middle_frame.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r9 = lower_middle_frame.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition upper_middle_frame = frame.addOrReplaceChild("upper_middle_frame", CubeListBuilder.create().texOffs(88, 108).addBox(-2.0F, -11.0F, -2.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -37.0F, 0.0F));

        PartDefinition cube_r10 = upper_middle_frame.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r11 = upper_middle_frame.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r12 = upper_middle_frame.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top_frame = frame.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(88, 122).addBox(-2.0F, -11.0F, -2.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -48.0F, 0.0F));

        PartDefinition cube_r13 = top_frame.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r14 = top_frame.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r15 = top_frame.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition boosters = frame.addOrReplaceChild("boosters", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r16 = boosters.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -12.0F, 18.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r17 = boosters.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -12.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition pyramid = base.addOrReplaceChild("pyramid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.25F, 0.0F));

        PartDefinition cube_r18 = pyramid.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -59.0F, 1.0F, 0.0F, -1.5708F, -0.1745F));

        PartDefinition cube_r19 = pyramid.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, -59.0F, 16.0F, 2.9671F, 0.0F, 3.1416F));

        PartDefinition cube_r20 = pyramid.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -59.0F, 15.0F, 0.0F, 1.5708F, 0.1745F));

        PartDefinition cube_r21 = pyramid.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -59.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition pyramid_holder = pyramid.addOrReplaceChild("pyramid_holder", CubeListBuilder.create().texOffs(72, 2).addBox(0.75F, -80.0F, 0.75F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(13.25F, -80.0F, 0.75F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(13.0F, -80.0F, 13.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(0.75F, -80.0F, 13.25F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(80, 0).addBox(4.0F, -95.5F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(80, 16).addBox(5.0F, -103.5F, 5.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r22 = pyramid_holder.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.75F, -79.5F, 3.75F, 0.0F, -1.5708F, -0.2182F));

        PartDefinition cube_r23 = pyramid_holder.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.5F, -79.75F, 12.75F, 2.9234F, 0.0F, 3.1416F));

        PartDefinition cube_r24 = pyramid_holder.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -79.75F, 12.25F, 0.0F, 1.5708F, 0.2182F));

        PartDefinition cube_r25 = pyramid_holder.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -79.5F, 3.25F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r26 = pyramid_holder.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -70.5F, 9.0F, 0.0F, -1.5708F, -0.1309F));

        PartDefinition cube_r27 = pyramid_holder.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -70.5F, 11.0F, 3.0107F, 0.0F, 3.1416F));

        PartDefinition cube_r28 = pyramid_holder.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -70.5F, 7.0F, 0.0F, 1.5708F, 0.1309F));

        PartDefinition cube_r29 = pyramid_holder.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -70.25F, 5.0F, -0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r30 = pyramid_holder.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -79.75F, 14.25F, 0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r31 = pyramid_holder.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -79.75F, 14.0F, 0.4326F, -0.678F, -0.6346F));

        PartDefinition cube_r32 = pyramid_holder.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.25F, -79.75F, 1.75F, -0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r33 = pyramid_holder.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -79.75F, 1.75F, -0.3927F, 0.7854F, 0.0F));

        PartDefinition cube_r34 = pyramid_holder.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -57.75F, 16.75F, 2.8883F, -0.7519F, -2.7794F));

        PartDefinition cube_r35 = pyramid_holder.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.75F, -58.25F, 16.75F, 0.2533F, -0.7519F, -0.3622F));

        PartDefinition cube_r36 = pyramid_holder.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.5F, -57.75F, -0.5F, -0.2618F, -0.7854F, 0.0F));

        PartDefinition cube_r37 = pyramid_holder.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -57.75F, -0.75F, -0.2618F, 0.7854F, 0.0F));

        PartDefinition middle_rod = pyramid_holder.addOrReplaceChild("middle_rod", CubeListBuilder.create().texOffs(72, 0).addBox(7.0F, -130.5F, 7.0F, 2.0F, 27.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(6.0F, -134.25F, 6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -105.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -108.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -111.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -114.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -117.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -120.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -123.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -126.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(6.0F, -129.25F, 6.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition left_rod = pyramid_holder.addOrReplaceChild("left_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -103.5F, 8.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition right_rod = pyramid_holder.addOrReplaceChild("right_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -103.5F, 8.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition left_thruster = body.addOrReplaceChild("left_thruster", CubeListBuilder.create().texOffs(96, 28).addBox(-22.0F, -47.0F, 4.0F, 8.0F, 35.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(104, 16).addBox(-21.0F, -53.0F, 5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-21.0F, -12.0F, 5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-22.0F, -10.0F, 4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r38 = left_thruster.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.7824F, -31.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r39 = left_thruster.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7824F, -24.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r40 = left_thruster.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.7824F, -38.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r41 = left_thruster.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -10.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r42 = left_thruster.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -20.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition right_thruster = body.addOrReplaceChild("right_thruster", CubeListBuilder.create().texOffs(96, 28).addBox(-22.0F, -47.0F, 4.0F, 8.0F, 35.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(104, 16).addBox(-21.0F, -53.0F, 5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-21.0F, -12.0F, 5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-22.0F, -10.0F, 4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, 0.0F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r43 = right_thruster.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.7824F, -31.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r44 = right_thruster.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7824F, -24.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r45 = right_thruster.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.7824F, -38.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r46 = right_thruster.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -10.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r47 = right_thruster.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -20.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition bottom_thrusters = body.addOrReplaceChild("bottom_thrusters", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition right = bottom_thrusters.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition north = right.addOrReplaceChild("north", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r48 = north.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition south = right.addOrReplaceChild("south", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r49 = south.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition left = bottom_thrusters.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offsetAndRotation(15.0F, 0.0F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition east = left.addOrReplaceChild("east", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r50 = east.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition west = left.addOrReplaceChild("west", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r51 = west.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition engine = rocket.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom = engine.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 105).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-14, 77).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(-14, 91).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r52 = bottom.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, -6.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r53 = bottom.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, 6.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r54 = bottom.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 1.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top = engine.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 114).addBox(-6.0F, -15.0F, -6.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r55 = top.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r56 = top.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r57 = top.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -9.0F, 5.0F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }
}
