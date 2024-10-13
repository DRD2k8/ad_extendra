package com.drd.ad_extendra.client.renderers.entities.mobs;

import com.drd.ad_extendra.client.models.entities.mobs.FreezeModel;
import com.drd.ad_extendra.common.AdExtendra;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class FreezeEyesLayer<T extends LivingEntity> extends EyesLayer<T, FreezeModel<T>> {
    private static final RenderType FREEZE_EYES = RenderType.eyes(new ResourceLocation(AdExtendra.MOD_ID, "textures/entity/freeze/freeze_eyes.png"));

    public FreezeEyesLayer(RenderLayerParent<T, FreezeModel<T>> pRenderer) {
        super(pRenderer);
    }

    @Override
    public RenderType renderType() {
        return FREEZE_EYES;
    }
}
