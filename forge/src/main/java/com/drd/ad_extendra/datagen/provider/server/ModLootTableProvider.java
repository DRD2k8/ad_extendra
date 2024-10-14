package com.drd.ad_extendra.datagen.provider.server;

import com.drd.ad_extendra.common.blocks.CustomSlidingDoorBlock;
import com.drd.ad_extendra.common.registry.ModBlocks;
import com.drd.ad_extendra.common.registry.ModEntityTypes;
import com.drd.ad_extendra.common.registry.ModItems;
import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import earth.terrarium.adastra.common.blocks.properties.SlidingDoorPartProperty;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(PackOutput output) {
        super(output, Set.of(), List.of(
                new SubProviderEntry(BlockLootTables::new, LootContextParamSets.BLOCK),
                new SubProviderEntry(EntityLootTables::new, LootContextParamSets.ENTITY)
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
            ModBlocks.B_STONE,
            ModBlocks.CERES_COPPER_ORE,
            ModBlocks.CERES_IRON_ORE,
            ModBlocks.JUPITER_JUPERIUM_ORE,
            ModBlocks.JUPITER_COAL_ORE,
            ModBlocks.JUPITER_DIAMOND_ORE,
            ModBlocks.JUPITER_GOLD_ORE,
            ModBlocks.SATURN_SATURLYTE_ORE,
            ModBlocks.SATURN_COAL_ORE,
            ModBlocks.SATURN_DIAMOND_ORE,
            ModBlocks.SATURN_GOLD_ORE,
            ModBlocks.URANUS_URANIUM_ORE,
            ModBlocks.URANUS_DIAMOND_ORE,
            ModBlocks.URANUS_IRON_ORE,
            ModBlocks.URANUS_LAPIS_ORE,
            ModBlocks.URANUS_ICE_SHARD_ORE,
            ModBlocks.NEPTUNE_NEPTUNIUM_ORE,
            ModBlocks.NEPTUNE_COAL_ORE,
            ModBlocks.NEPTUNE_COPPER_ORE,
            ModBlocks.NEPTUNE_IRON_ORE,
            ModBlocks.NEPTUNE_ICE_SHARD_ORE,
            ModBlocks.ORCUS_RADIUM_ORE,
            ModBlocks.ORCUS_COPPER_ORE,
            ModBlocks.ORCUS_IRON_ORE,
            ModBlocks.PLUTO_PLUTONIUM_ORE,
            ModBlocks.PLUTO_DIAMOND_ORE,
            ModBlocks.PLUTO_GOLD_ORE,
            ModBlocks.PLUTO_ICE_SHARD_ORE,
            ModBlocks.HAUMEA_COPPER_ORE,
            ModBlocks.HAUMEA_IRON_ORE,
            ModBlocks.QUAOAR_COPPER_ORE,
            ModBlocks.QUAOAR_IRON_ORE,
            ModBlocks.MAKEMAKE_COPPER_ORE,
            ModBlocks.MAKEMAKE_IRON_ORE,
            ModBlocks.GONGGONG_COPPER_ORE,
            ModBlocks.GONGGONG_IRON_ORE,
            ModBlocks.ERIS_COPPER_ORE,
            ModBlocks.ERIS_IRON_ORE,
            ModBlocks.SEDNA_ELECTROLYTE_ORE,
            ModBlocks.SEDNA_COPPER_ORE,
            ModBlocks.SEDNA_IRON_ORE,
            ModBlocks.B_DIAMOND_ORE,
            ModBlocks.B_EMERALD_ORE,
            ModBlocks.B_IRON_ORE,
            ModBlocks.B_REDSTONE_ORE,
            ModBlocks.AERONOS_SIGN,
            ModBlocks.AERONOS_WALL_SIGN,
            ModBlocks.AERONOS_HANGING_SIGN,
            ModBlocks.AERONOS_WALL_HANGING_SIGN,
            ModBlocks.STROPHAR_SIGN,
            ModBlocks.STROPHAR_WALL_SIGN,
            ModBlocks.STROPHAR_HANGING_SIGN,
            ModBlocks.STROPHAR_WALL_HANGING_SIGN,
            ModBlocks.GLACIAN_SIGN,
            ModBlocks.GLACIAN_WALL_SIGN,
            ModBlocks.GLACIAN_HANGING_SIGN,
            ModBlocks.GLACIAN_WALL_HANGING_SIGN
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

            addOreDrop(ModBlocks.CERES_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.CERES_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.JUPITER_JUPERIUM_ORE.get(), ModItems.RAW_JUPERIUM.get());
            addOreDrop(ModBlocks.JUPITER_COAL_ORE.get(), Items.COAL);
            addOreDrop(ModBlocks.JUPITER_DIAMOND_ORE.get(), Items.DIAMOND);
            addOreDrop(ModBlocks.JUPITER_GOLD_ORE.get(), Items.RAW_GOLD);
            addOreDrop(ModBlocks.SATURN_SATURLYTE_ORE.get(), ModItems.RAW_SATURLYTE.get());
            addOreDrop(ModBlocks.SATURN_COAL_ORE.get(), Items.COAL);
            addOreDrop(ModBlocks.SATURN_DIAMOND_ORE.get(), Items.DIAMOND);
            addOreDrop(ModBlocks.SATURN_GOLD_ORE.get(), Items.RAW_GOLD);
            addOreDrop(ModBlocks.URANUS_URANIUM_ORE.get(), ModItems.RAW_URANIUM.get());
            addOreDrop(ModBlocks.URANUS_DIAMOND_ORE.get(), Items.DIAMOND);
            addOreDrop(ModBlocks.URANUS_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.URANUS_LAPIS_ORE.get(), Items.LAPIS_LAZULI);
            addOreDrop(ModBlocks.URANUS_ICE_SHARD_ORE.get(), earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get());
            addOreDrop(ModBlocks.NEPTUNE_NEPTUNIUM_ORE.get(), ModItems.RAW_NEPTUNIUM.get());
            addOreDrop(ModBlocks.NEPTUNE_COAL_ORE.get(), Items.COAL);
            addOreDrop(ModBlocks.NEPTUNE_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.NEPTUNE_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.NEPTUNE_ICE_SHARD_ORE.get(), earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get());
            addOreDrop(ModBlocks.ORCUS_RADIUM_ORE.get(), ModItems.RAW_RADIUM.get());
            addOreDrop(ModBlocks.ORCUS_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.ORCUS_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.PLUTO_PLUTONIUM_ORE.get(), ModItems.RAW_PLUTONIUM.get());
            addOreDrop(ModBlocks.PLUTO_DIAMOND_ORE.get(), Items.DIAMOND);
            addOreDrop(ModBlocks.PLUTO_GOLD_ORE.get(), Items.RAW_GOLD);
            addOreDrop(ModBlocks.PLUTO_ICE_SHARD_ORE.get(), earth.terrarium.adastra.common.registry.ModItems.ICE_SHARD.get());
            addOreDrop(ModBlocks.HAUMEA_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.HAUMEA_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.QUAOAR_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.QUAOAR_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.MAKEMAKE_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.MAKEMAKE_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.GONGGONG_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.GONGGONG_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.ERIS_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.ERIS_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.SEDNA_ELECTROLYTE_ORE.get(), ModItems.RAW_ELECTROLYTE.get());
            addOreDrop(ModBlocks.SEDNA_COPPER_ORE.get(), Items.RAW_COPPER);
            addOreDrop(ModBlocks.SEDNA_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.B_DIAMOND_ORE.get(), Items.DIAMOND);
            addOreDrop(ModBlocks.B_EMERALD_ORE.get(), Items.EMERALD);
            addOreDrop(ModBlocks.B_IRON_ORE.get(), Items.RAW_IRON);
            addOreDrop(ModBlocks.B_REDSTONE_ORE.get(), Items.REDSTONE);

            add(ModBlocks.AERONOS_SIGN.get(), createSingleItemTable(ModItems.AERONOS_SIGN.get()));
            add(ModBlocks.AERONOS_HANGING_SIGN.get(), createSingleItemTable(ModItems.AERONOS_HANGING_SIGN.get()));
            add(ModBlocks.STROPHAR_SIGN.get(), createSingleItemTable(ModItems.STROPHAR_SIGN.get()));
            add(ModBlocks.STROPHAR_HANGING_SIGN.get(), createSingleItemTable(ModItems.STROPHAR_HANGING_SIGN.get()));
            add(ModBlocks.GLACIAN_SIGN.get(), createSingleItemTable(ModItems.GLACIAN_SIGN.get()));
            add(ModBlocks.GLACIAN_HANGING_SIGN.get(), createSingleItemTable(ModItems.GLACIAN_HANGING_SIGN.get()));
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(RegistryEntry::get)::iterator;
        }

        private void addStoneDrop(Block silkBlock, Block nonSilkBlock) {
            add(silkBlock, b -> createSingleItemTableWithSilkTouch(b, nonSilkBlock));
        }

        private void addOreDrop(Block ore, Item rawOre) {
            add(ore, createOreDrop(ore, rawOre));
        }
    }

    public static class EntityLootTables extends EntityLootSubProvider {
        public EntityLootTables() {
            super(FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        public void generate() {
            this.add(ModEntityTypes.FREEZE.get(), LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(ModItems.FREEZE_SHARD.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))).when(LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(1.0F, 1.0F))));
        }

        @Override
        public Stream<EntityType<?>> getKnownEntityTypes() {
            return ModEntityTypes.ENTITY_TYPES.getEntries().stream().map(RegistryEntry::get);
        }
    }
}
