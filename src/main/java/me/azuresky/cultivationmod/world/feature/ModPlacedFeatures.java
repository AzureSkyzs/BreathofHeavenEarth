package me.azuresky.cultivationmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.worldSurfaceSquaredWithCount;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> MEGA_OAK_PLACED = PlacementUtils.register("mega_oak_placed",
            ModConfiguredFeatures.MEGA_OAK_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 1)));

    public static final Holder<PlacedFeature> BREATHSTONE_ORE_PLACED = PlacementUtils.register("breathstone_ore_placed",
            ModConfiguredFeatures.BREATHSTONE_ORE, ModOrePlacement.commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> FLOWER_BREATH_GRASS_PLACED = PlacementUtils.register("flower_breath_grass_placed",
            ModConfiguredFeatures.FLOWER_BREATH_GRASS, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()
    );
}