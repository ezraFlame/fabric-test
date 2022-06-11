package com.scarzehd.fabrictest.util;

import com.scarzehd.fabrictest.FabricTest;
import com.scarzehd.fabrictest.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuff() {
        registerFuels();
    }

    private static void registerFuels() {
        FabricTest.LOGGER.info("Registering Fuel for " + FabricTest.MOD_ID);

        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }

}
