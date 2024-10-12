package com.drd.ad_extendra.datagen.provider.server;

import com.drd.ad_extendra.common.blocks.CustomSlidingDoorBlock;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import earth.terrarium.adastra.common.blocks.properties.SlidingDoorPartProperty;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput output) {
        super(output, Set.of(), List.of(
                new SubProviderEntry(BlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }

    private static final Set<Supplier<Block>> DOESNT_DROP_SELF = Set.of();

    public static class BlockLootTables extends BlockLootSubProvider {
        public BlockLootTables() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            ModBlocks.BLOCKS.stream()
                    .filter(b -> !DOESNT_DROP_SELF.contains(b)
                            && !(b.get() instanceof CustomSlidingDoorBlock))
                    .map(RegistryEntry::get)
                    .forEach(this::dropSelf);

            ModBlocks.SLIDING_DOORS.stream().forEach(b -> add(b.get(), b2 ->
                    createSinglePropConditionTable(b2, CustomSlidingDoorBlock.PART, SlidingDoorPartProperty.BOTTOM)));
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryEntry::get)::iterator;
        }

        protected LootTable.Builder createStoneLikeDrop(Block pSilkBlock, Block pNonSilkBlock) {
            return createSilkTouchDispatchTable(pSilkBlock, (LootPoolEntryContainer.Builder)this.applyExplosionDecay(pSilkBlock, LootItem.lootTableItem(pNonSilkBlock)));
        }
    }
}
