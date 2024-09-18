package com.drd.ad_extendra.util;

import com.drd.ad_extendra.block.ModBlocks;
import earth.terrarium.ad_astra.common.registry.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;

public class ModLootModifiers {
    private static final ResourceLocation GLACIAN_LEAVES_ID =
            new ResourceLocation("ad_astra", "blocks/glacian_leaves");

    private static final ResourceLocation AERONOS_CAP_ID =
            new ResourceLocation("ad_astra", "blocks/aeronos_cap");

    private static final ResourceLocation STROPHAR_CAP_ID =
            new ResourceLocation("ad_astra", "blocks/strophar_cap");

    private static final ResourceLocation MOON_VILLAGE_HOUSE_ID =
            new ResourceLocation("ad_astra", "chests/village/moon/house");

    private static final ResourceLocation MOON_VILLAGE_BLACKSMITH_ID =
            new ResourceLocation("ad_astra", "chests/village/moon/blacksmith");

    private static final ResourceLocation MARS_TEMPLE_ID =
            new ResourceLocation("ad_astra", "chests/temple/mars/temple");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(GLACIAN_LEAVES_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.35f).build())
                        .add(LootItem.lootTableItem(ModBlocks.GLACIAN_SAPLING.get()));

                tableBuilder.pool(poolBuilder.build());
            }
            if(AERONOS_CAP_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.35f).build())
                        .add(LootItem.lootTableItem(ModBlocks.AERONOS_MUSHROOM.get()));

                tableBuilder.pool(poolBuilder.build());
            }
            if(STROPHAR_CAP_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.35f).build())
                        .add(LootItem.lootTableItem(ModBlocks.STROPHAR_MUSHROOM.get()));

                tableBuilder.pool(poolBuilder.build());
            }
            if(MOON_VILLAGE_HOUSE_ID.equals(id)) {
                LootPool.Builder aeronosPoolBuilder = LootPool.lootPool()
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.75f).build())
                        .add(LootItem.lootTableItem(ModBlocks.AERONOS_MUSHROOM.get()));

                LootPool.Builder stropharPoolBuilder = LootPool.lootPool()
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.625f).build())
                        .add(LootItem.lootTableItem(ModBlocks.STROPHAR_MUSHROOM.get()));

                tableBuilder.pool(aeronosPoolBuilder.build());
                tableBuilder.pool(stropharPoolBuilder.build());
            }
            if(MOON_VILLAGE_BLACKSMITH_ID.equals(id)) {
                LootPool.Builder aeronosPoolBuilder = LootPool.lootPool()
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.75f).build())
                        .add(LootItem.lootTableItem(ModBlocks.AERONOS_MUSHROOM.get()));

                LootPool.Builder stropharPoolBuilder = LootPool.lootPool()
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.625f).build())
                        .add(LootItem.lootTableItem(ModBlocks.STROPHAR_MUSHROOM.get()));

                tableBuilder.pool(aeronosPoolBuilder.build());
                tableBuilder.pool(stropharPoolBuilder.build());
            }
            if(MARS_TEMPLE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .conditionally(LootItemRandomChanceCondition.randomChance(0.1f).build())
                        .add(LootItem.lootTableItem(ModItems.MARS_GLOBE.get()));

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
