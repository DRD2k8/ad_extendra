package com.drd.ad_extendra.painting;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.decoration.PaintingVariant;

public class ModPaintings {
    public static final ResourcefulRegistry<PaintingVariant> PAINTINGS = ResourcefulRegistries.create(BuiltInRegistries.PAINTING_VARIANT, "ad_astra");
    public static final RegistryEntry<PaintingVariant> CERES = PAINTINGS.register("ceres", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> ORCUS = PAINTINGS.register("orcus", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> HAUMEA = PAINTINGS.register("haumea", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> QUAOAR = PAINTINGS.register("quaoar", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> MAKEMAKE = PAINTINGS.register("makemake", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> GONGGONG = PAINTINGS.register("gonggong", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> ERIS = PAINTINGS.register("eris", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> SEDNA = PAINTINGS.register("sedna", () -> {
        return new PaintingVariant(16, 16);
    });
    public static final RegistryEntry<PaintingVariant> B = PAINTINGS.register("b", () -> {
        return new PaintingVariant(32, 32);
    });

    public ModPaintings() {
    }
}
