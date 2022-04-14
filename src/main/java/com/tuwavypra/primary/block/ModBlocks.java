package com.tuwavypra.primary.block;

import com.tuwavypra.primary.PrimaryMod;
import com.tuwavypra.primary.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MAGISCHES_ORE_BLOCK = registerBlock("magisches_ore_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroup.MAGICSWORD);

    public static final Block DEEPSLATE_MAGISCHES_ORE_BLOCK = registerBlock("deepslate_magisches_ore_block",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(7f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroup.MAGICSWORD);

    public static final Block ALCHEMY_TABLE = registerBlock("alchemy_table",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool(),
                    UniformIntProvider.create(2, 6)), ModItemGroup.MAGICSWORD);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(PrimaryMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(PrimaryMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        PrimaryMod.LOGGER.info("Registering Modblocks for " + PrimaryMod.MOD_ID);
    }
}
