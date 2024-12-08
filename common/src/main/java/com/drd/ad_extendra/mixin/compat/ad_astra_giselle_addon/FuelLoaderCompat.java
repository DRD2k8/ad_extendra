package com.drd.ad_extendra.mixin.compat.ad_astra_giselle_addon;

import ad_astra_giselle_addon.common.entity.VehicleHelper;
import com.drd.ad_extendra.common.compat.ad_astra_giselle_addon.VehicleFuelInformation;
import com.drd.ad_extendra.common.entities.vehicles.CustomRocket;
import earth.terrarium.adastra.common.entities.vehicles.Rocket;
import earth.terrarium.adastra.common.entities.vehicles.Vehicle;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(VehicleHelper.class)
public class FuelLoaderCompat {
    @Unique
    private static @Nullable VehicleFuelInformation ad_extendra$getFuelInformation(Vehicle vehicle) {
        if (vehicle instanceof CustomRocket rocket) {
            Rocket.RocketProperties properties = CustomRocket.AD_EXTENDRA_ROCKET_PROPERTIES.get(rocket.getType());
            if (properties == null) {
                return null;
            }
            return new VehicleFuelInformation(rocket.fluidContainer(), properties.fuel());
        }
        else {
            return null;
        }
    }
}
