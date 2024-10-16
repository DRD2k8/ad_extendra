package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.common.entities.mobs.Freeze;
import com.drd.ad_extendra.common.entities.projectiles.IceCharge;
import com.drd.ad_extendra.common.entities.vehicles.CustomBoat;
import com.drd.ad_extendra.common.entities.vehicles.CustomChestBoat;
import com.drd.ad_extendra.common.entities.vehicles.CustomRocket;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.adastra.AdAstra;
import earth.terrarium.adastra.common.entities.vehicles.Rocket;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ModEntityTypes {
    public static final ResourcefulRegistry<EntityType<?>> ENTITY_TYPES = ResourcefulRegistries.create(BuiltInRegistries.ENTITY_TYPE, AdExtendra.MOD_ID);
    public static final ResourcefulRegistry<EntityType<?>> ROCKETS = ResourcefulRegistries.create(BuiltInRegistries.ENTITY_TYPE, AdAstra.MOD_ID);

    public static final RegistryEntry<EntityType<Freeze>> FREEZE =
            ENTITY_TYPES.register("freeze", () -> EntityType.Builder.of(Freeze::new, MobCategory.MONSTER)
                    .sized(1.125f, 1.8125f).build("freeze"));

    public static final RegistryEntry<EntityType<IceCharge>> ICE_CHARGE =
            ENTITY_TYPES.register("ice_charge", () -> EntityType.Builder.<IceCharge>of(IceCharge::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("ice_charge"));

    public static final RegistryEntry<EntityType<CustomBoat>> BOAT =
            ENTITY_TYPES.register("boat", () -> EntityType.Builder.<CustomBoat>of(CustomBoat::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("boat"));
    public static final RegistryEntry<EntityType<CustomChestBoat>> CHEST_BOAT =
            ENTITY_TYPES.register("chest_boat", () -> EntityType.Builder.<CustomChestBoat>of(CustomChestBoat::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("chest_boat"));

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

    public static void registerAttributes(BiConsumer<Supplier<? extends EntityType<? extends LivingEntity>>, Supplier<AttributeSupplier.Builder>> attributes) {
        attributes.accept(FREEZE, Freeze::createAttributes);
    }
}
