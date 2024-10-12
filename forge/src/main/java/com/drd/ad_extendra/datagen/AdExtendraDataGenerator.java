package com.drd.ad_extendra.datagen;

import com.drd.ad_extendra.common.AdExtendra;
import com.drd.ad_extendra.datagen.provider.client.ModBlockStateProvider;
import com.drd.ad_extendra.datagen.provider.client.ModItemModelProvider;
import com.drd.ad_extendra.datagen.provider.server.ModLootTableProvider;
import com.drd.ad_extendra.datagen.provider.server.ModRecipeProvider;
import com.drd.ad_extendra.datagen.provider.server.tags.ModBlockTagProvider;
import com.drd.ad_extendra.datagen.provider.server.tags.ModItemTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AdExtendra.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdExtendraDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));

        generator.addProvider(event.includeServer(), new ModLootTableProvider(packOutput));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
        ModBlockTagProvider blockTagProvider = generator.addProvider(event.includeServer(),
                new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTagProvider.contentsGetter(), existingFileHelper));
    }
}
