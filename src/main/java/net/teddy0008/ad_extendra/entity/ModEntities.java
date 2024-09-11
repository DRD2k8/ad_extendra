package net.teddy0008.ad_extendra.entity;

import earth.terrarium.ad_astra.AdAstra;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teddy0008.ad_extendra.Main;
import net.teddy0008.ad_extendra.entity.mob.Freeze;
import net.teddy0008.ad_extendra.entity.projectile.IceCharge;
import net.teddy0008.ad_extendra.entity.vehicle.*;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Main.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ROCKETS = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AdAstra.MOD_ID);

    public static final RegistryObject<EntityType<Freeze>> FREEZE =
            ENTITIES.register("freeze", () -> EntityType.Builder.of(Freeze::new, MobCategory.MONSTER)
                    .sized(1.125f, 1.8125f).build("freeze"));

    public static final RegistryObject<EntityType<IceCharge>> ICE_CHARGE =
            ENTITIES.register("ice_charge", () -> EntityType.Builder.<IceCharge>of(IceCharge::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("ice_charge"));

    public static final RegistryObject<EntityType<CustomBoat>> BOAT =
            ENTITIES.register("boat", () -> EntityType.Builder.<CustomBoat>of(CustomBoat::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("boat"));
    public static final RegistryObject<EntityType<CustomChestBoat>> CHEST_BOAT =
            ENTITIES.register("chest_boat", () -> EntityType.Builder.<CustomChestBoat>of(CustomChestBoat::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("chest_boat"));

    public static final RegistryObject<EntityType<RocketTier5>> TIER_5_ROCKET = ROCKETS.register("tier_5_rocket", () ->
            EntityType.Builder.<RocketTier5>of(RocketTier5::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.0f)
                    .build("tier_5_rocket"));

    public static final RegistryObject<EntityType<RocketTier6>> TIER_6_ROCKET = ROCKETS.register("tier_6_rocket", () ->
            EntityType.Builder.<RocketTier6>of(RocketTier6::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.5f)
                    .build("tier_6_rocket"));

    public static final RegistryObject<EntityType<RocketTier7>> TIER_7_ROCKET = ROCKETS.register("tier_7_rocket", () ->
            EntityType.Builder.<RocketTier7>of(RocketTier7::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.5f)
                    .build("tier_7_rocket"));

    public static final RegistryObject<EntityType<RocketTier8>> TIER_8_ROCKET = ROCKETS.register("tier_8_rocket", () ->
            EntityType.Builder.<RocketTier8>of(RocketTier8::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 8.5f)
                    .build("tier_8_rocket"));

    public static final RegistryObject<EntityType<RocketTier9>> TIER_9_ROCKET = ROCKETS.register("tier_9_rocket", () ->
            EntityType.Builder.<RocketTier9>of(RocketTier9::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 8.5f)
                    .build("tier_9_rocket"));

    public static final RegistryObject<EntityType<RocketTier10>> TIER_10_ROCKET = ROCKETS.register("tier_10_rocket", () ->
            EntityType.Builder.<RocketTier10>of(RocketTier10::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 9.0f)
                    .build("tier_10_rocket"));

    public static final RegistryObject<EntityType<RocketTier11>> TIER_11_ROCKET = ROCKETS.register("tier_11_rocket", () ->
            EntityType.Builder.<RocketTier11>of(RocketTier11::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 9.0f)
                    .build("tier_11_rocket"));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
        ROCKETS.register(eventBus);
    }
}
