package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.entities.vehicles.CustomRocket;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.adastra.AdAstra;
import earth.terrarium.adastra.common.entities.vehicles.Rocket;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypes {
    public static final ResourcefulRegistry<EntityType<?>> ENTITY_TYPES = ResourcefulRegistries.create(BuiltInRegistries.ENTITY_TYPE, AdExtendra.MOD_ID);
    public static final ResourcefulRegistry<EntityType<?>> ROCKETS = ResourcefulRegistries.create(BuiltInRegistries.ENTITY_TYPE, AdAstra.MOD_ID);

    public static final RegistryEntry<EntityType<Rocket>> TIER_5_ROCKET = registerRocket(5, 1.1f, 7.0f);
    public static final RegistryEntry<EntityType<Rocket>> TIER_6_ROCKET = registerRocket(6, 1.1f, 7.5f);
    public static final RegistryEntry<EntityType<Rocket>> TIER_7_ROCKET = registerRocket(7, 1.1f, 7.5f);
    public static final RegistryEntry<EntityType<Rocket>> TIER_8_ROCKET = registerRocket(8, 1.1f, 8.5f);
    public static final RegistryEntry<EntityType<Rocket>> TIER_9_ROCKET = registerRocket(9, 1.1f, 8.5f);
    public static final RegistryEntry<EntityType<Rocket>> TIER_10_ROCKET = registerRocket(10, 1.1f, 9.0f);
    public static final RegistryEntry<EntityType<Rocket>> TIER_11_ROCKET = registerRocket(11, 1.1f, 9.0f);

    private static RegistryEntry<EntityType<Rocket>> registerRocket(int tier, float width, float height) {
        return ROCKETS.register("tier_" + tier + "_rocket", () ->
                EntityType.Builder.<Rocket>of(CustomRocket::new, MobCategory.MISC)
                        .fireImmune()
                        .clientTrackingRange(10)
                        .sized(width, height)
                        .build("tier_" + tier + "_rocket"));
    }
}
