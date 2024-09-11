package com.drd.ad_extendra.particle;

import com.drd.ad_extendra.Main;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;

public class ModParticles {
    public static ResourcefulRegistry<ParticleType<?>> PARTICLES = ResourcefulRegistries.create(BuiltInRegistries.PARTICLE_TYPE, Main.MOD_ID);

    public static final RegistryEntry<SimpleParticleType> WIND =
            PARTICLES.register("wind", () -> new ModSimpleParticleType(true));
}
