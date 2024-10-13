package com.drd.ad_extendra.forge;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.client.forge.AdExtendraClientForge;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.drd.ad_extendra.common.registry.ModEntityTypes;
import com.drd.ad_extendra.common.registry.forge.ModLootModifiers;
import com.drd.ad_extendra.mixin.forge.AxeItemAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

import java.util.HashMap;
import java.util.Map;

@Mod(AdExtendra.MOD_ID)
public class AdExtendraForge {
    public AdExtendraForge() {
        AdExtendra.init();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(AdExtendraForge::onAttributes);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(AdExtendraForge::commonSetup);

        if (FMLEnvironment.dist.isClient()) AdExtendraClientForge.init();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLootModifiers.register(modEventBus);
    }

    public static void onAttributes(EntityAttributeCreationEvent event) {
        ModEntityTypes.registerAttributes((entityType, attribute) -> event.put(entityType.get(), attribute.get().build()));
    }

    public static void commonSetup(FMLCommonSetupEvent event) {
        registerStrippedLog(earth.terrarium.adastra.common.registry.ModBlocks.GLACIAN_LOG.get(), earth.terrarium.adastra.common.registry.ModBlocks.STRIPPED_GLACIAN_LOG.get());
        registerStrippedLog(ModBlocks.GLACIAN_WOOD.get(), ModBlocks.STRIPPED_GLACIAN_WOOD.get());
    }

    private static void registerStrippedLog(Block log, Block strippedLog) {
        initStrippedLog(log, strippedLog);
    }

    private static void initStrippedLog(Block log, Block strippedLog) {
        Map<Block, Block> strippedBlocks = new HashMap(AxeItemAccessor.ad_extendra$getStrippables());
        strippedBlocks.put(log, strippedLog);
        AxeItemAccessor.ad_extendra$setStrippables(strippedBlocks);
    }
}
