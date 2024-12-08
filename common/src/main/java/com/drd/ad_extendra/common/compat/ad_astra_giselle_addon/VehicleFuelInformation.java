package com.drd.ad_extendra.common.compat.ad_astra_giselle_addon;

import earth.terrarium.botarium.common.fluid.base.FluidContainer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public record VehicleFuelInformation(FluidContainer fuelTank, TagKey<Fluid> fuelTag) {
}