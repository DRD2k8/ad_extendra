package com.drd.ad_extendra.mixin.client;

import com.drd.ad_extendra.block.HangingSign;
import net.minecraft.client.gui.screens.inventory.HangingSignEditScreen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HangingSignEditScreen.class)
public class ModHangingSignEditScreenMixin {
    @Shadow
    @Final
    @Mutable
    private ResourceLocation texture;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void initSignTextureId(SignBlockEntity signBlockEntity, boolean front, boolean filtered, CallbackInfo ci) {
        if (signBlockEntity.getBlockState().getBlock() instanceof HangingSign signBlock) {
            ResourceLocation guiTexture = signBlock.getGuiTexture();
            this.texture = new ResourceLocation(guiTexture.getNamespace(), guiTexture.getPath() + ".png");
        }
    }
}
