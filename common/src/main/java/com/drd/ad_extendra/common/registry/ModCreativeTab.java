package com.drd.ad_extendra.common.registry;

import com.drd.ad_extendra.common.AdExtendra;
import com.teamresourceful.resourcefullib.common.item.tabs.ResourcefulCreativeTab;
import earth.terrarium.adastra.common.registry.ModFluids;
import earth.terrarium.adastra.common.utils.FluidUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModCreativeTab {
    public static final Supplier<CreativeModeTab> TAB = new ResourcefulCreativeTab(new ResourceLocation(AdExtendra.MOD_ID, "main"))
            .setItemIcon(ModItems.TIER_5_ROCKET)
            .addContent(ModCreativeTab::addItems)
            .build();


    public static Stream<ItemStack> addItems() {
        List<ItemStack> list = new ArrayList<>();

        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_5_ROCKET, ModFluids.FUEL));
        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_6_ROCKET, ModFluids.FUEL));
        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_7_ROCKET, ModFluids.FUEL));
        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_8_ROCKET, ModFluids.FUEL));
        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_9_ROCKET, ModFluids.FUEL));
        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_10_ROCKET, ModFluids.FUEL));
        list.add(FluidUtils.fluidFilledItem(ModItems.TIER_11_ROCKET, ModFluids.FUEL));

        list.add(new ItemStack(ModItems.TIER_5_ROCKET.get()));
        list.add(new ItemStack(ModItems.TIER_6_ROCKET.get()));
        list.add(new ItemStack(ModItems.TIER_7_ROCKET.get()));
        list.add(new ItemStack(ModItems.TIER_8_ROCKET.get()));
        list.add(new ItemStack(ModItems.TIER_9_ROCKET.get()));
        list.add(new ItemStack(ModItems.TIER_10_ROCKET.get()));
        list.add(new ItemStack(ModItems.TIER_11_ROCKET.get()));

        // Jupiter
        list.add(new ItemStack(ModItems.JUPERIUM_INGOT.get()));
        list.add(new ItemStack(ModItems.JUPERIUM_NUGGET.get()));
        list.add(new ItemStack(ModItems.JUPERIUM_PLATE.get()));
        list.add(new ItemStack(ModItems.RAW_JUPERIUM.get()));
        list.add(new ItemStack(ModItems.JUPERIUM_ENGINE.get()));
        list.add(new ItemStack(ModItems.JUPERIUM_TANK.get()));

        list.add(new ItemStack(ModBlocks.JUPERIUM_BLOCK.get()));
        list.add(new ItemStack(ModBlocks.RAW_JUPERIUM_BLOCK.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_FACTORY_BLOCK.get()));
        list.add(new ItemStack(ModBlocks.ENCASED_JUPERIUM_BLOCK.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_PLATEBLOCK.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_PANEL.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_PLATING.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_PLATING_STAIRS.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_PLATING_SLAB.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_PILLAR.get()));
        list.add(new ItemStack(ModBlocks.GLOWING_JUPERIUM_PILLAR.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_PLATING_BUTTON.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_PLATING_PRESSURE_PLATE.get()));
        list.add(new ItemStack(ModBlocks.JUPERIUM_SLIDING_DOOR.get()));

        return list.stream();
    }

    public static void init() {
    }
}
