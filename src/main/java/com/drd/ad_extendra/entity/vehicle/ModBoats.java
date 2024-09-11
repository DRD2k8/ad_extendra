package com.drd.ad_extendra.entity.vehicle;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.item.ModItems;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class ModBoats {
    public static final ResourceLocation GLACIAN_BOAT_ID = new ResourceLocation(Main.MOD_ID, "glacian_boat");
    public static final ResourceLocation GLACIAN_CHEST_BOAT_ID = new ResourceLocation(Main.MOD_ID, "glacian_chest_boat");

    public static final ResourceKey<TerraformBoatType> GLACIAN_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GLACIAN_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType glacianBoat = new TerraformBoatType.Builder()
                .item(ModItems.GLACIAN_BOAT)
                .chestItem(ModItems.GLACIAN_CHEST_BOAT)
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, GLACIAN_BOAT_KEY, glacianBoat);
    }
}
