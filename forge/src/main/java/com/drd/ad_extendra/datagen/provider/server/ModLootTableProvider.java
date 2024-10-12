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

    private static final Set<Supplier<Block>> DOESNT_DROP_SELF = Set.of(
            ModBlocks.CERES_STONE,
            ModBlocks.JUPITER_STONE,
            ModBlocks.SATURN_STONE,
            ModBlocks.URANUS_STONE,
            ModBlocks.NEPTUNE_STONE,
            ModBlocks.ORCUS_STONE,
            ModBlocks.PLUTO_STONE,
            ModBlocks.HAUMEA_STONE,
            ModBlocks.QUAOAR_STONE,
            ModBlocks.MAKEMAKE_STONE,
            ModBlocks.GONGGONG_STONE,
            ModBlocks.ERIS_STONE,
            ModBlocks.SEDNA_STONE,
            ModBlocks.B_STONE
    );

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

            addStoneDrop(ModBlocks.CERES_STONE.get(), ModBlocks.CERES_COBBLESTONE.get());
            addStoneDrop(ModBlocks.JUPITER_STONE.get(), ModBlocks.JUPITER_COBBLESTONE.get());
            addStoneDrop(ModBlocks.SATURN_STONE.get(), ModBlocks.SATURN_COBBLESTONE.get());
            addStoneDrop(ModBlocks.URANUS_STONE.get(), ModBlocks.URANUS_COBBLESTONE.get());
            addStoneDrop(ModBlocks.NEPTUNE_STONE.get(), ModBlocks.NEPTUNE_COBBLESTONE.get());
            addStoneDrop(ModBlocks.ORCUS_STONE.get(), ModBlocks.ORCUS_COBBLESTONE.get());
            addStoneDrop(ModBlocks.PLUTO_STONE.get(), ModBlocks.PLUTO_COBBLESTONE.get());
            addStoneDrop(ModBlocks.HAUMEA_STONE.get(), ModBlocks.HAUMEA_COBBLESTONE.get());
            addStoneDrop(ModBlocks.QUAOAR_STONE.get(), ModBlocks.QUAOAR_COBBLESTONE.get());
            addStoneDrop(ModBlocks.MAKEMAKE_STONE.get(), ModBlocks.MAKEMAKE_COBBLESTONE.get());
            addStoneDrop(ModBlocks.GONGGONG_STONE.get(), ModBlocks.GONGGONG_COBBLESTONE.get());
            addStoneDrop(ModBlocks.ERIS_STONE.get(), ModBlocks.ERIS_COBBLESTONE.get());
            addStoneDrop(ModBlocks.SEDNA_STONE.get(), ModBlocks.SEDNA_COBBLESTONE.get());
            addStoneDrop(ModBlocks.B_STONE.get(), ModBlocks.B_COBBLESTONE.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryEntry::get)::iterator;
        }

        private void addStoneDrop(Block silkBlock, Block nonSilkBlock) {
            add(silkBlock, b -> createSingleItemTableWithSilkTouch(b, nonSilkBlock));
        }
    }
}
