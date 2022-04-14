package com.tuwavypra.primary.ores;

import com.tuwavypra.primary.PrimaryMod;
import com.tuwavypra.primary.block.ModBlocks;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class ModOreGen {
    private static ConfiguredFeature<?,?> OVERWORLD_MAGISCHES_ORE_CONFIGURED_FEATURE = new ConfiguredFeature(
            Feature.ORE, new OreFeatureConfig(
            OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
            ModBlocks.DEEPSLATE_MAGISCHES_ORE_BLOCK.getDefaultState(),
            3 // Vein size
            )
    );

    public static PlacedFeature OVERWORLD_MAGISCHES_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_MAGISCHES_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(20), // Number of Veins per chunk
                    SquarePlacementModifier.of(), // Spreading horizontally
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(-32))
            )
    );

    public static void registerOreGen() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(PrimaryMod.MOD_ID, "overworld_magisches_ore"), OVERWORLD_MAGISCHES_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(PrimaryMod.MOD_ID, "overworld_magisches_ore"), OVERWORLD_MAGISCHES_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(PrimaryMod.MOD_ID, "overworld_magisches_ore")));
    }
}
