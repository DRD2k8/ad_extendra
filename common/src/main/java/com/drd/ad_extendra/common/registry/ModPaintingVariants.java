package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class ModPaintingVariants {
    public static final ResourcefulRegistry<PaintingVariant> PAINTING_VARIANTS = ResourcefulRegistries.create(BuiltInRegistries.PAINTING_VARIANT, AdExtendra.MOD_ID);

    public static final RegistryEntry<PaintingVariant> CERES = PAINTING_VARIANTS.register("ceres", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> ORCUS = PAINTING_VARIANTS.register("orcus", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> HAUMEA = PAINTING_VARIANTS.register("haumea", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> QUAOAR = PAINTING_VARIANTS.register("quaoar", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> MAKEMAKE = PAINTING_VARIANTS.register("makemake", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> GONGGONG = PAINTING_VARIANTS.register("gonggong", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> ERIS = PAINTING_VARIANTS.register("eris", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> SEDNA = PAINTING_VARIANTS.register("sedna", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> B = PAINTING_VARIANTS.register("b", () -> {
        return new PaintingVariant(32, 32);
    });
}
