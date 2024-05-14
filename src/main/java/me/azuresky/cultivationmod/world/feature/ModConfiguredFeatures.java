package me.azuresky.cultivationmod.world.feature;

import me.azuresky.cultivationmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
public class ModConfiguredFeatures {
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MEGA_OAK_TREE =
            FeatureUtils.register("mega_oak", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.MEGA_OAK_LOG.get()),
                    new DarkOakTrunkPlacer(5, 6, 5),
                    BlockStateProvider.simple(ModBlocks.MEGA_OAK_LEAVES.get()),
                    new FancyFoliagePlacer(ConstantInt.of(4), ConstantInt.of(1), 3),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final Holder<PlacedFeature> MEGA_OAK_CHECKED = PlacementUtils.register("mega_oak_checked", MEGA_OAK_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.MEGA_OAK_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MEGA_OAK_SPAWN =
            FeatureUtils.register("mega_oak_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MEGA_OAK_CHECKED,
                            0.5F)), MEGA_OAK_CHECKED));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BREATHSTONE_ORES = List.of(
        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BREATHSTONE_ORE.get().defaultBlockState()),
        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BREATHSTONE_ORE.get().defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BREATHSTONE_ORE = FeatureUtils.register("breathstone_ore",
             Feature.ORE, new OreConfiguration(OVERWORLD_BREATHSTONE_ORES, 9)
    );

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FLOWER_BREATH_GRASS =
            FeatureUtils.register("flower_breath_grass", Feature.FLOWER,
                    new RandomPatchConfiguration(50,3,2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BREATH_GRASS.get()))))
    );

}
