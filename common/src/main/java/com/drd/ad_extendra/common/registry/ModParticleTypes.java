package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.particles.base.ModSimpleParticleType;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;

public class ModParticleTypes {
    public static ResourcefulRegistry<ParticleType<?>> PARTICLE_TYPES = ResourcefulRegistries.create(BuiltInRegistries.PARTICLE_TYPE, AdExtendra.MOD_ID);

    public static final RegistryEntry<SimpleParticleType> WIND =
            PARTICLE_TYPES.register("wind", () -> new ModSimpleParticleType(true));
}
