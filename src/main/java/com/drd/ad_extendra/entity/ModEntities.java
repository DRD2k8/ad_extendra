package com.drd.ad_extendra.entity;

import com.drd.ad_extendra.Main;
import com.drd.ad_extendra.entity.mob.Freeze;
import com.drd.ad_extendra.entity.projectile.IceCharge;
import com.drd.ad_extendra.entity.vehicle.*;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.monster.Monster;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ModEntities {
    public static final ResourcefulRegistry<EntityType<?>> ENTITIES = ResourcefulRegistries.create(BuiltInRegistries.ENTITY_TYPE, Main.MOD_ID);
    public static final ResourcefulRegistry<EntityType<?>> ROCKETS = ResourcefulRegistries.create(BuiltInRegistries.ENTITY_TYPE, "ad_astra");

    public static final RegistryEntry<EntityType<Freeze>> FREEZE =
            ENTITIES.register("freeze", () -> EntityType.Builder.of(Freeze::new, MobCategory.MONSTER)
                    .sized(1.125f, 1.8125f).build("freeze"));

    public static final RegistryEntry<EntityType<IceCharge>> ICE_CHARGE =
            ENTITIES.register("ice_charge", () -> EntityType.Builder.<IceCharge>of(IceCharge::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("ice_charge"));

    public static final RegistryEntry<EntityType<RocketTier5>> TIER_5_ROCKET = ROCKETS.register("tier_5_rocket", () ->
            EntityType.Builder.<RocketTier5>of(RocketTier5::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.0f)
                    .build("tier_5_rocket"));

    public static final RegistryEntry<EntityType<RocketTier6>> TIER_6_ROCKET = ROCKETS.register("tier_6_rocket", () ->
            EntityType.Builder.<RocketTier6>of(RocketTier6::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.5f)
                    .build("tier_6_rocket"));

    public static final RegistryEntry<EntityType<RocketTier7>> TIER_7_ROCKET = ROCKETS.register("tier_7_rocket", () ->
            EntityType.Builder.<RocketTier7>of(RocketTier7::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.5f)
                    .build("tier_7_rocket"));

    public static final RegistryEntry<EntityType<RocketTier8>> TIER_8_ROCKET = ROCKETS.register("tier_8_rocket", () ->
            EntityType.Builder.<RocketTier8>of(RocketTier8::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 8.5f)
                    .build("tier_8_rocket"));

    public static final RegistryEntry<EntityType<RocketTier9>> TIER_9_ROCKET = ROCKETS.register("tier_9_rocket", () ->
            EntityType.Builder.<RocketTier9>of(RocketTier9::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 8.5f)
                    .build("tier_9_rocket"));

    public static final RegistryEntry<EntityType<RocketTier10>> TIER_10_ROCKET = ROCKETS.register("tier_10_rocket", () ->
            EntityType.Builder.<RocketTier10>of(RocketTier10::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 9.0f)
                    .build("tier_10_rocket"));

    public static final RegistryEntry<EntityType<RocketTier11>> TIER_11_ROCKET = ROCKETS.register("tier_11_rocket", () ->
            EntityType.Builder.<RocketTier11>of(RocketTier11::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 9.0f)
                    .build("tier_11_rocket"));

    public static void registerAttributes(BiConsumer<Supplier<? extends EntityType<? extends LivingEntity>>, Supplier<AttributeSupplier.Builder>> attributes) {
        attributes.accept(FREEZE, Monster::createMonsterAttributes);
    }
}
