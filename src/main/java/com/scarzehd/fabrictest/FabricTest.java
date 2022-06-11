package com.scarzehd.fabrictest;

import com.scarzehd.fabrictest.block.ModBlocks;
import com.scarzehd.fabrictest.item.ModItems;
import com.scarzehd.fabrictest.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FabricTest implements ModInitializer {
	public static final String MOD_ID = "fabrictest";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuff();
	}
}
