package com.tuwavypra.primary;

import com.tuwavypra.primary.block.ModBlocks;
import com.tuwavypra.primary.item.ModItems;
import com.tuwavypra.primary.ores.ModOreGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimaryMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "magicsword";
	public static final Logger LOGGER = LoggerFactory.getLogger("magicsword");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModOreGen.registerOreGen();
	}
}
