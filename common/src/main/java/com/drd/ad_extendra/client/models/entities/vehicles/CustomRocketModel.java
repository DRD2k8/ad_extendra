package com.drd.ad_extendra.client.models.entities.vehicles;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.entities.vehicles.CustomRocket;
import earth.terrarium.adastra.client.ClientPlatformUtils;
import earth.terrarium.adastra.client.models.entities.vehicles.RocketModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class CustomRocketModel<T extends CustomRocket> extends RocketModel<T> {
    public static final ModelLayerLocation TIER_5_LAYER = new ModelLayerLocation(new ResourceLocation(AdExtendra.MOD_ID, "tier_5_rocket"), "main");
    public static final ModelLayerLocation TIER_6_LAYER = new ModelLayerLocation(new ResourceLocation(AdExtendra.MOD_ID, "tier_6_rocket"), "main");
    public static final ModelLayerLocation TIER_7_LAYER = new ModelLayerLocation(new ResourceLocation(AdExtendra.MOD_ID, "tier_7_rocket"), "main");
    public static final ModelLayerLocation TIER_8_LAYER = new ModelLayerLocation(new ResourceLocation(AdExtendra.MOD_ID, "tier_8_rocket"), "main");
    public static final ModelLayerLocation TIER_9_LAYER = new ModelLayerLocation(new ResourceLocation(AdExtendra.MOD_ID, "tier_9_rocket"), "main");
    public static final ModelLayerLocation TIER_10_LAYER = new ModelLayerLocation(new ResourceLocation(AdExtendra.MOD_ID, "tier_10_rocket"), "main");
    public static final ModelLayerLocation TIER_11_LAYER = new ModelLayerLocation(new ResourceLocation(AdExtendra.MOD_ID, "tier_11_rocket"), "main");

    public CustomRocketModel(ModelPart root) {
        super(root);
    }

    @SuppressWarnings({"unused", "DuplicatedCode"})
    public static LayerDefinition createTier5Layer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket5 = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket5.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -15.0F, -8.0F));

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

        PartDefinition engine = rocket5.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

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

    @SuppressWarnings({"unused", "DuplicatedCode"})
    public static LayerDefinition createTier6Layer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket6 = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket6.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -15.0F, -8.0F));

        PartDefinition base = body.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 128).addBox(-1.0F, -66.0F, -1.0F, 18.0F, 66.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 59).addBox(-1.0F, 0.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -66.0F, -1.0F, 18.0F, 66.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.998F, 0.0F, 16.001F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -66.0F, -1.0F, 18.0F, 66.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.999F, 0.0F, 16.001F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r3 = base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -66.0F, -1.0F, 18.0F, 66.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.001F, 0.0F, -1.5708F, 0.0F));

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

        PartDefinition top_frame = frame.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(88, 122).addBox(-2.0F, -19.0F, -2.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -48.0F, 0.0F));

        PartDefinition cube_r13 = top_frame.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 4.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r14 = top_frame.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 4.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r15 = top_frame.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition boosters = frame.addOrReplaceChild("boosters", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r16 = boosters.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -12.0F, 18.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r17 = boosters.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -12.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition pyramid = base.addOrReplaceChild("pyramid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.25F, 0.0F));

        PartDefinition cube_r18 = pyramid.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -67.0F, 1.0F, 0.0F, -1.5708F, -0.1745F));

        PartDefinition cube_r19 = pyramid.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, -67.0F, 16.0F, 2.9671F, 0.0F, 3.1416F));

        PartDefinition cube_r20 = pyramid.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -67.0F, 15.0F, 0.0F, 1.5708F, 0.1745F));

        PartDefinition cube_r21 = pyramid.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -67.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition pyramid_holder = pyramid.addOrReplaceChild("pyramid_holder", CubeListBuilder.create().texOffs(72, 2).addBox(0.75F, -88.0F, 0.75F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(13.25F, -88.0F, 0.75F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(13.0F, -88.0F, 13.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(0.75F, -88.0F, 13.25F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(80, 0).addBox(4.0F, -103.5F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(80, 16).addBox(5.0F, -115.5F, 5.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r22 = pyramid_holder.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(3.75F, -103.75F, 3.75F, -0.3927F, 0.7854F, 0.0F));

        PartDefinition cube_r23 = pyramid_holder.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(12.25F, -103.75F, 3.75F, -0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r24 = pyramid_holder.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(12.0F, -103.75F, 12.0F, 0.4326F, -0.678F, -0.6346F));

        PartDefinition cube_r25 = pyramid_holder.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(3.75F, -103.75F, 12.25F, 0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r26 = pyramid_holder.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -103.5F, 8.0F, 0.0F, 1.5708F, 0.2182F));

        PartDefinition cube_r27 = pyramid_holder.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -103.5F, 12.0F, 2.9234F, 0.0F, 3.1416F));

        PartDefinition cube_r28 = pyramid_holder.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, -103.5F, 8.0F, 0.0F, -1.5708F, -0.2182F));

        PartDefinition cube_r29 = pyramid_holder.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -103.5F, 4.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r30 = pyramid_holder.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.75F, -87.5F, 3.75F, 0.0F, -1.5708F, -0.2182F));

        PartDefinition cube_r31 = pyramid_holder.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.5F, -87.75F, 12.75F, 2.9234F, 0.0F, 3.1416F));

        PartDefinition cube_r32 = pyramid_holder.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -87.75F, 12.25F, 0.0F, 1.5708F, 0.2182F));

        PartDefinition cube_r33 = pyramid_holder.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -87.5F, 3.25F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r34 = pyramid_holder.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -78.5F, 9.0F, 0.0F, -1.5708F, -0.1309F));

        PartDefinition cube_r35 = pyramid_holder.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -78.5F, 11.0F, 3.0107F, 0.0F, 3.1416F));

        PartDefinition cube_r36 = pyramid_holder.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -78.5F, 7.0F, 0.0F, 1.5708F, 0.1309F));

        PartDefinition cube_r37 = pyramid_holder.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -78.25F, 5.0F, -0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r38 = pyramid_holder.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -87.75F, 14.25F, 0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r39 = pyramid_holder.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -87.75F, 14.0F, 0.4326F, -0.678F, -0.6346F));

        PartDefinition cube_r40 = pyramid_holder.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.25F, -87.75F, 1.75F, -0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r41 = pyramid_holder.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -87.75F, 1.75F, -0.3927F, 0.7854F, 0.0F));

        PartDefinition cube_r42 = pyramid_holder.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -65.75F, 16.75F, 2.8883F, -0.7519F, -2.7794F));

        PartDefinition cube_r43 = pyramid_holder.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.75F, -66.25F, 16.75F, 0.2533F, -0.7519F, -0.3622F));

        PartDefinition cube_r44 = pyramid_holder.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.5F, -65.75F, -0.5F, -0.2618F, -0.7854F, 0.0F));

        PartDefinition cube_r45 = pyramid_holder.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -65.75F, -0.75F, -0.2618F, 0.7854F, 0.0F));

        PartDefinition middle_rod = pyramid_holder.addOrReplaceChild("middle_rod", CubeListBuilder.create().texOffs(72, 0).addBox(7.0F, -142.5F, 7.0F, 2.0F, 27.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(6.0F, -146.25F, 6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
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
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, 0.6155F, -0.5236F, -0.9553F));

        PartDefinition south_rod = pyramid_holder.addOrReplaceChild("south_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, 0.7854F, -0.7854F, 0.0F));

        PartDefinition west_rod = pyramid_holder.addOrReplaceChild("west_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, -0.7854F, 0.7854F, 0.0F));

        PartDefinition east_rod = pyramid_holder.addOrReplaceChild("east_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, -0.7854F, -0.7854F, 0.0F));

        PartDefinition left_thruster = body.addOrReplaceChild("left_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-22.0F, -57.0F, 4.0F, 8.0F, 45.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(104, 16).addBox(-21.0F, -62.75F, 5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-21.0F, -12.0F, 5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-22.0F, -10.0F, 4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r46 = left_thruster.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.7824F, -36.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r47 = left_thruster.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7824F, -29.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r48 = left_thruster.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.7824F, -43.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r49 = left_thruster.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -15.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r50 = left_thruster.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -25.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition right_thruster = body.addOrReplaceChild("right_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-22.0F, -57.0F, 4.0F, 8.0F, 45.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(104, 16).addBox(-21.0F, -62.75F, 5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-21.0F, -12.0F, 5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-22.0F, -10.0F, 4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, 0.0F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r51 = right_thruster.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.7824F, -31.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r52 = right_thruster.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -7.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7824F, -24.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r53 = right_thruster.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -14.0F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.7824F, -38.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r54 = right_thruster.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(82, 93).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -10.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r55 = right_thruster.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(82, 85).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -20.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition bottom_thrusters = body.addOrReplaceChild("bottom_thrusters", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition right = bottom_thrusters.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition north = right.addOrReplaceChild("north", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r56 = north.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition south = right.addOrReplaceChild("south", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r57 = south.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition left = bottom_thrusters.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offsetAndRotation(15.0F, 0.0F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition east = left.addOrReplaceChild("east", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r58 = east.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition west = left.addOrReplaceChild("west", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r59 = west.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition engine = rocket6.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom = engine.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 105).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-14, 77).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(-14, 91).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r60 = bottom.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, -6.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r61 = bottom.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, 6.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r62 = bottom.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 1.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top = engine.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 114).addBox(-6.0F, -15.0F, -6.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r63 = top.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r64 = top.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r65 = top.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -9.0F, 5.0F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    @SuppressWarnings({"unused", "DuplicatedCode"})
    public static LayerDefinition createTier7Layer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket7 = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket7.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -15.0F, -8.0F));

        PartDefinition base = body.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 128).addBox(-1.0F, -66.0F, -1.0F, 18.0F, 66.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 59).addBox(-1.0F, 0.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -66.0F, -1.0F, 18.0F, 66.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.998F, 0.0F, 16.001F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -66.0F, -1.0F, 18.0F, 66.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.999F, 0.0F, 16.001F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r3 = base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -66.0F, -1.0F, 18.0F, 66.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.001F, 0.0F, -1.5708F, 0.0F));

        PartDefinition frame = base.addOrReplaceChild("frame", CubeListBuilder.create().texOffs(36, 59).addBox(2.0F, -39.0F, -2.25F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = frame.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(168, -7).addBox(-1.0F, -15.0F, -1.0F, 0.0F, 15.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -59.0F, 8.0F, 0.0F, 1.5708F, 0.5236F));

        PartDefinition cube_r5 = frame.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(168, -7).addBox(-1.0F, -15.0F, -1.0F, 0.0F, 15.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -59.0F, 8.0F, 0.0F, -1.5708F, -0.5236F));

        PartDefinition cube_r6 = frame.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(168, -7).addBox(-1.0F, -15.0F, -1.0F, 0.0F, 15.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -59.0F, 16.0F, -0.5236F, 0.0F, 0.0F));

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

        PartDefinition top_frame = frame.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(88, 122).addBox(-2.0F, -19.0F, -2.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -48.0F, 0.0F));

        PartDefinition cube_r16 = top_frame.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 4.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r17 = top_frame.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 4.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r18 = top_frame.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition boosters = frame.addOrReplaceChild("boosters", CubeListBuilder.create().texOffs(40, 101).addBox(-7.0F, -26.0F, 4.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r19 = boosters.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, -12.0F, 11.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r20 = boosters.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -12.0F, 18.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r21 = boosters.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -12.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition pyramid = base.addOrReplaceChild("pyramid", CubeListBuilder.create(), PartPose.offset(0.0F, 0.25F, 0.0F));

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
                .texOffs(104, 16).addBox(5.0F, -148.25F, 5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
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
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, 0.6155F, -0.5236F, -0.9553F));

        PartDefinition south_rod = pyramid_holder.addOrReplaceChild("south_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, 0.7854F, -0.7854F, 0.0F));

        PartDefinition west_rod = pyramid_holder.addOrReplaceChild("west_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, -0.7854F, 0.7854F, 0.0F));

        PartDefinition east_rod = pyramid_holder.addOrReplaceChild("east_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, -0.7854F, -0.7854F, 0.0F));

        PartDefinition left_thruster = body.addOrReplaceChild("left_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-23.0F, -57.0F, 3.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-22.0F, -64.75F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-21.0F, -12.0F, 5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-22.0F, -10.0F, 4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r50 = left_thruster.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.7824F, -36.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r51 = left_thruster.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7824F, -29.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r52 = left_thruster.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.7824F, -43.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r53 = left_thruster.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -15.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r54 = left_thruster.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -25.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition right_thruster = body.addOrReplaceChild("right_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-23.0F, -57.0F, 3.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-22.0F, -64.75F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-21.0F, -12.0F, 5.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-22.0F, -10.0F, 4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, 0.0F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r55 = right_thruster.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.7824F, -31.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r56 = right_thruster.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -7.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7824F, -24.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r57 = right_thruster.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -14.0F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.7824F, -38.25F, 8.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r58 = right_thruster.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 93).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -10.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r59 = right_thruster.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 85).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.25F, -20.0F, 9.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition bottom_thrusters = body.addOrReplaceChild("bottom_thrusters", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition right = bottom_thrusters.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition north = right.addOrReplaceChild("north", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r60 = north.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition south = right.addOrReplaceChild("south", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r61 = south.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition left = bottom_thrusters.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offsetAndRotation(15.0F, 0.0F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition east = left.addOrReplaceChild("east", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r62 = east.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition west = left.addOrReplaceChild("west", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r63 = west.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition engine = rocket7.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom = engine.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 105).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-14, 77).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(-14, 91).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r64 = bottom.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, -6.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r65 = bottom.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, 6.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r66 = bottom.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 1.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top = engine.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 114).addBox(-6.0F, -15.0F, -6.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r67 = top.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r68 = top.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r69 = top.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -9.0F, 5.0F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    @SuppressWarnings({"unused", "DuplicatedCode"})
    public static LayerDefinition createTier8Layer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket8 = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket8.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -15.0F, -8.0F));

        PartDefinition base = body.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 82.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 59).addBox(-1.0F, 0.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 82.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.998F, 0.0F, 16.001F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 82.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.999F, 0.0F, 16.001F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r3 = base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 82.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.001F, 0.0F, -1.5708F, 0.0F));

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
                .texOffs(104, 16).addBox(5.0F, -148.25F, 5.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
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
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, 0.6155F, -0.5236F, -0.9553F));

        PartDefinition south_rod = pyramid_holder.addOrReplaceChild("south_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, 0.7854F, -0.7854F, 0.0F));

        PartDefinition west_rod = pyramid_holder.addOrReplaceChild("west_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, -0.7854F, 0.7854F, 0.0F));

        PartDefinition east_rod = pyramid_holder.addOrReplaceChild("east_rod", CubeListBuilder.create().texOffs(120, 0).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 120).addBox(-2.0F, -15.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -1.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(104, 0).addBox(-2.0F, -4.75F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -115.5F, 8.0F, -0.7854F, -0.7854F, 0.0F));

        PartDefinition north_thruster = body.addOrReplaceChild("north_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-8.7788F, 22.1725F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2212F, -32.1725F, -7.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r50 = north_thruster.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, -4.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r51 = north_thruster.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 2.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r52 = north_thruster.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -11.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r53 = north_thruster.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 17.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r54 = north_thruster.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 7.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition south_thruster = body.addOrReplaceChild("south_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-8.7788F, 22.1725F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.2212F, -32.1725F, -7.0F, 0.0F, -2.3562F, 0.0F));

        PartDefinition cube_r55 = south_thruster.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, 0.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r56 = south_thruster.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -7.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 7.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r57 = south_thruster.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -14.0F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -6.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r58 = south_thruster.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(82, 93).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 22.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r59 = south_thruster.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(82, 85).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 12.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition west_thruster = body.addOrReplaceChild("west_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-8.7788F, 22.1725F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.2212F, -32.1725F, 23.0F, 0.0F, 2.3562F, 0.0F));

        PartDefinition cube_r60 = west_thruster.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, 0.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r61 = west_thruster.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -7.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 7.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r62 = west_thruster.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -14.0F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -6.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r63 = west_thruster.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(82, 93).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 22.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r64 = west_thruster.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(82, 85).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 12.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition east_thruster = body.addOrReplaceChild("east_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(16, 115).addBox(-8.7788F, 22.1725F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2212F, -32.1725F, 23.0F, 0.0F, 0.7854F, 0.0F));

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

        PartDefinition engine = rocket8.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom = engine.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(0, 105).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-14, 77).addBox(-7.0F, -9.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(-14, 91).addBox(-7.0F, 0.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r74 = bottom.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, -6.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r75 = bottom.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, 6.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r76 = bottom.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 105).addBox(-1.0F, -10.0F, -1.0F, 14.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, 1.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top = engine.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 114).addBox(-6.0F, -15.0F, -6.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r77 = top.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r78 = top.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r79 = top.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -9.0F, 5.0F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    @SuppressWarnings({"unused", "DuplicatedCode"})
    public static LayerDefinition createTier9Layer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket9 = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket9.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -15.0F, -8.0F));

        PartDefinition base = body.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 82.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 55).addBox(-1.0F, 0.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 82.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.998F, 0.0F, 16.001F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 82.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.999F, 0.0F, 16.001F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r3 = base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 82.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.001F, 0.0F, -1.5708F, 0.0F));

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

        PartDefinition engine = rocket9.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

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

    @SuppressWarnings({"unused", "DuplicatedCode"})
    public static LayerDefinition createTier10Layer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket10 = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket10.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -23.0F, -8.0F));

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

        PartDefinition engine = rocket10.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

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

    @SuppressWarnings({"unused", "DuplicatedCode"})
    public static LayerDefinition createTier11Layer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition rocket11 = partdefinition.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = rocket11.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-8.0F, -23.0F, -8.0F));

        PartDefinition base = body.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 90.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 55).addBox(-1.0F, 8.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(-18, 55).addBox(-1.0F, 0.0F, -1.0F, 18.0F, 0.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = base.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 90.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.998F, 0.0F, 16.001F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = base.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 90.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.999F, 0.0F, 16.001F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r3 = base.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 128).addBox(-1.0F, -82.0F, -1.0F, 18.0F, 90.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.001F, 0.0F, -1.5708F, 0.0F));

        PartDefinition frame = base.addOrReplaceChild("frame", CubeListBuilder.create().texOffs(36, 59).addBox(2.0F, -39.0F, -2.25F, 12.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(89, 128).addBox(-46.0F, -64.0F, 8.0F, 45.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = frame.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(89, 128).addBox(-22.5F, -15.0F, 0.0F, 45.0F, 30.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(39.5F, -49.0F, 8.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bottom_frame = frame.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(88, 100).addBox(-2.0F, -12.0F, -2.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r5 = bottom_frame.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r6 = bottom_frame.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r7 = bottom_frame.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(88, 100).addBox(-1.0F, -24.0F, -1.0F, 20.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition lower_middle_frame = frame.addOrReplaceChild("lower_middle_frame", CubeListBuilder.create().texOffs(88, 115).addBox(-2.0F, -11.0F, -2.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, 0.0F));

        PartDefinition cube_r8 = lower_middle_frame.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r9 = lower_middle_frame.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r10 = lower_middle_frame.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(88, 115).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition upper_middle_frame = frame.addOrReplaceChild("upper_middle_frame", CubeListBuilder.create().texOffs(88, 108).addBox(-2.0F, -11.0F, -2.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -37.0F, 0.0F));

        PartDefinition cube_r11 = upper_middle_frame.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r12 = upper_middle_frame.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 12.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r13 = upper_middle_frame.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 108).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 12.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top_frame = frame.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(88, 122).addBox(-2.0F, -19.0F, -2.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -64.0F, 0.0F));

        PartDefinition cube_r14 = top_frame.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 4.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r15 = top_frame.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 4.0F, 17.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r16 = top_frame.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(88, 122).addBox(-1.0F, -23.0F, -1.0F, 20.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 4.0F, 17.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition boosters = frame.addOrReplaceChild("boosters", CubeListBuilder.create().texOffs(40, 101).addBox(-7.0F, -26.0F, 4.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r17 = boosters.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, -12.0F, 11.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r18 = boosters.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -12.0F, 18.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r19 = boosters.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 101).addBox(-5.0F, -14.0F, -1.0F, 6.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -12.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition pyramid = base.addOrReplaceChild("pyramid", CubeListBuilder.create(), PartPose.offset(0.0F, -15.75F, 0.0F));

        PartDefinition cube_r20 = pyramid.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -67.0F, 1.0F, 0.0F, -1.5708F, -0.1745F));

        PartDefinition cube_r21 = pyramid.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, -67.0F, 16.0F, 2.9671F, 0.0F, 3.1416F));

        PartDefinition cube_r22 = pyramid.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -67.0F, 15.0F, 0.0F, 1.5708F, 0.1745F));

        PartDefinition cube_r23 = pyramid.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(28, 89).addBox(-1.0F, -12.0F, -1.0F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -67.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition pyramid_holder = pyramid.addOrReplaceChild("pyramid_holder", CubeListBuilder.create().texOffs(72, 2).addBox(0.75F, -88.0F, 0.75F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(13.25F, -88.0F, 0.75F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(13.0F, -88.0F, 13.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(72, 2).addBox(0.75F, -88.0F, 13.25F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(80, 0).addBox(4.0F, -103.5F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(80, 16).addBox(5.0F, -115.5F, 5.0F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r24 = pyramid_holder.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(3.75F, -103.75F, 3.75F, -0.3927F, 0.7854F, 0.0F));

        PartDefinition cube_r25 = pyramid_holder.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(12.25F, -103.75F, 3.75F, -0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r26 = pyramid_holder.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(12.0F, -103.75F, 12.0F, 0.4326F, -0.678F, -0.6346F));

        PartDefinition cube_r27 = pyramid_holder.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(3.75F, -103.75F, 12.25F, 0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r28 = pyramid_holder.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -103.5F, 8.0F, 0.0F, 1.5708F, 0.2182F));

        PartDefinition cube_r29 = pyramid_holder.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -103.5F, 12.0F, 2.9234F, 0.0F, 3.1416F));

        PartDefinition cube_r30 = pyramid_holder.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, -103.5F, 8.0F, 0.0F, -1.5708F, -0.2182F));

        PartDefinition cube_r31 = pyramid_holder.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(33, 77).addBox(-3.0F, -4.0F, 0.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -103.5F, 4.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r32 = pyramid_holder.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.75F, -87.5F, 3.75F, 0.0F, -1.5708F, -0.2182F));

        PartDefinition cube_r33 = pyramid_holder.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.5F, -87.75F, 12.75F, 2.9234F, 0.0F, 3.1416F));

        PartDefinition cube_r34 = pyramid_holder.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.25F, -87.75F, 12.25F, 0.0F, 1.5708F, 0.2182F));

        PartDefinition cube_r35 = pyramid_holder.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(31, 81).addBox(-1.0F, -8.0F, -1.0F, 10.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -87.5F, 3.25F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r36 = pyramid_holder.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -78.5F, 9.0F, 0.0F, -1.5708F, -0.1309F));

        PartDefinition cube_r37 = pyramid_holder.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -78.5F, 11.0F, 3.0107F, 0.0F, 3.1416F));

        PartDefinition cube_r38 = pyramid_holder.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -78.5F, 7.0F, 0.0F, 1.5708F, 0.1309F));

        PartDefinition cube_r39 = pyramid_holder.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(73, 39).addBox(-6.0F, -9.0F, -4.0F, 10.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -78.25F, 5.0F, -0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r40 = pyramid_holder.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -87.75F, 14.25F, 0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r41 = pyramid_holder.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.0F, -87.75F, 14.0F, 0.4326F, -0.678F, -0.6346F));

        PartDefinition cube_r42 = pyramid_holder.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.25F, -87.75F, 1.75F, -0.4363F, -0.7854F, 0.0F));

        PartDefinition cube_r43 = pyramid_holder.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(72, 5).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.75F, -87.75F, 1.75F, -0.3927F, 0.7854F, 0.0F));

        PartDefinition cube_r44 = pyramid_holder.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -65.75F, 16.75F, 2.8883F, -0.7519F, -2.7794F));

        PartDefinition cube_r45 = pyramid_holder.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.75F, -66.25F, 16.75F, 0.2533F, -0.7519F, -0.3622F));

        PartDefinition cube_r46 = pyramid_holder.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.5F, -65.75F, -0.5F, -0.2618F, -0.7854F, 0.0F));

        PartDefinition cube_r47 = pyramid_holder.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -65.75F, -0.75F, -0.2618F, 0.7854F, 0.0F));

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

        PartDefinition cube_r48 = north_thruster.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, -4.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r49 = north_thruster.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 2.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r50 = north_thruster.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -11.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r51 = north_thruster.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 17.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r52 = north_thruster.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 7.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition south_thruster = body.addOrReplaceChild("south_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(128, 55).addBox(-9.7788F, 22.1725F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.2212F, -32.1725F, -7.0F, 0.0F, -2.3562F, 0.0F));

        PartDefinition cube_r53 = south_thruster.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, 0.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r54 = south_thruster.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -7.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 7.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r55 = south_thruster.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -14.0F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -6.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r56 = south_thruster.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(82, 93).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 22.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r57 = south_thruster.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(82, 85).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 12.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition west_thruster = body.addOrReplaceChild("west_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(128, 55).addBox(-9.7788F, 22.1725F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.2212F, -32.1725F, 23.0F, 0.0F, 2.3562F, 0.0F));

        PartDefinition cube_r58 = west_thruster.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -11.0F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, 0.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r59 = west_thruster.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -7.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 7.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r60 = west_thruster.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(72, 0).addBox(-5.3301F, -14.0F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -6.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r61 = west_thruster.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(82, 93).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 22.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r62 = west_thruster.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(82, 85).addBox(1.5F, -19.3301F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 12.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition east_thruster = body.addOrReplaceChild("east_thruster", CubeListBuilder.create().texOffs(128, 0).addBox(-9.7788F, -24.8275F, -5.0F, 10.0F, 45.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(168, 0).addBox(-8.7788F, -32.5775F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(72, 30).addBox(-7.7788F, 20.1725F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(128, 55).addBox(-9.7788F, 22.1725F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2212F, -32.1725F, 23.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r63 = east_thruster.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4388F, -4.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r64 = east_thruster.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.4388F, 2.9225F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r65 = east_thruster.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(72, 0).addBox(-1.0F, -11.5F, -1.0F, 2.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4388F, -11.0775F, 0.0F, 0.0F, 0.0F, 1.0472F));

        PartDefinition cube_r66 = east_thruster.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(82, 93).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 17.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r67 = east_thruster.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(82, 85).addBox(-1.0F, -15.0F, -1.0F, 23.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0288F, 7.1725F, 1.0F, 0.0F, 0.0F, -0.5236F));

        PartDefinition bottom_thrusters = body.addOrReplaceChild("bottom_thrusters", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition right = bottom_thrusters.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition north = right.addOrReplaceChild("north", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r68 = north.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition south = right.addOrReplaceChild("south", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r69 = south.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition left = bottom_thrusters.addOrReplaceChild("left", CubeListBuilder.create(), PartPose.offsetAndRotation(15.0F, 0.0F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition east = left.addOrReplaceChild("east", CubeListBuilder.create().texOffs(64, 73).addBox(-6.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r70 = east.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, 0.0F, -6.5F, -0.6155F, -0.5236F, 0.9553F));

        PartDefinition west = left.addOrReplaceChild("west", CubeListBuilder.create().texOffs(64, 73).addBox(17.0F, -16.0F, -7.0F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r71 = west.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(105, 71).addBox(-5.0F, -16.0F, 0.0F, 10.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, 0.0F, -8.25F, -2.1538F, -0.6956F, 1.9706F));

        PartDefinition engine = rocket11.addOrReplaceChild("engine", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottom = engine.addOrReplaceChild("bottom", CubeListBuilder.create().texOffs(214, 32).addBox(-8.0F, -9.0F, -8.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(198, 0).addBox(-8.0F, -9.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(198, 16).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r72 = bottom.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(214, 32).addBox(-2.0F, -10.0F, -1.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 1.0F, -6.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r73 = bottom.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(214, 32).addBox(-2.0F, -10.0F, -1.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 1.0F, 7.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r74 = bottom.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(214, 32).addBox(-2.0F, -10.0F, -1.0F, 16.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 1.0F, 6.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition top = engine.addOrReplaceChild("top", CubeListBuilder.create().texOffs(0, 114).addBox(-6.0F, -15.0F, -6.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r75 = top.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, -5.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r76 = top.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -9.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r77 = top.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 114).addBox(-1.0F, -6.0F, -1.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, -9.0F, 5.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition warp_drive = engine.addOrReplaceChild("warp_drive", CubeListBuilder.create().texOffs(128, 70).addBox(-17.0F, -15.0F, -16.75F, 34.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(128, 86).addBox(-17.0F, -15.0F, -8.75F, 8.0F, 8.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(128, 86).addBox(9.0F, -15.0F, -8.75F, 8.0F, 8.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r78 = warp_drive.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(128, 70).addBox(-9.0F, -8.0F, -1.0F, 34.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -7.0F, 16.25F, 0.0F, 3.1416F, 0.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    public static void register(ClientPlatformUtils.LayerDefinitionRegistry registry) {
        registry.register(TIER_5_LAYER, CustomRocketModel::createTier5Layer);
        registry.register(TIER_6_LAYER, CustomRocketModel::createTier6Layer);
        registry.register(TIER_7_LAYER, CustomRocketModel::createTier7Layer);
        registry.register(TIER_8_LAYER, CustomRocketModel::createTier8Layer);
        registry.register(TIER_9_LAYER, CustomRocketModel::createTier9Layer);
        registry.register(TIER_10_LAYER, CustomRocketModel::createTier10Layer);
        registry.register(TIER_11_LAYER, CustomRocketModel::createTier11Layer);
    }
}
