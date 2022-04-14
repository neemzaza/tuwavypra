package com.tuwavypra.primary.item;

import com.tuwavypra.primary.PrimaryMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {

    public static final Item RAW_MAGISCHES = registerItem("raw_magisches",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MAGICSWORD)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(new TranslatableText("item.magicsword.raw_magisches.tooltip"));
                        tooltip.add(new TranslatableText("item.magicsword.raw_magisches.tooltip.line_2"));
                    } else {
                        tooltip.add(new TranslatableText("item.magicsword.raw_magisches.tooltip.non_shift"));
                    }
                }
            }
            );

    public static final Item MAGISCHES_NUGGET = registerItem("magisches_nugget",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).group(ModItemGroup.MAGICSWORD))
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PrimaryMod.MOD_ID, name), item);
    }

    // register mods items method
    public static void registerModItems() {
        PrimaryMod.LOGGER.info("Registering Mod Items for " + PrimaryMod.MOD_ID);
    }
}
