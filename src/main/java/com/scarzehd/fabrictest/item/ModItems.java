package com.scarzehd.fabrictest.item;

import com.scarzehd.fabrictest.FabricTest;
import com.scarzehd.fabrictest.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_NUGGET = registerItem("mithril_nugget", new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod", new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.MITHRIL).maxDamage(16)));

    public static final Item LILAC_FLOWER_BULB = registerItem("lilac_flower_bulb", new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item GRAPE = registerItem("grape", new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL).food(ModFoodComponents.GRAPE)));

    public static final Item MITHRIL_SWORD = registerItem("mithril_sword", new SlownessSwordItem(ModToolMaterials.MITHRIL, 1, 2f, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_AXE = registerItem("mithril_axe", new ModAxeItem(ModToolMaterials.MITHRIL, 3, 1f, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel", new ShovelItem(ModToolMaterials.MITHRIL, 0, 0f, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_HOE = registerItem("mithril_hoe", new ModHoeItem(ModToolMaterials.MITHRIL, 0, 1f, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new ModPickaxeItem(ModToolMaterials.MITHRIL, 1, 2f, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet", new ModArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate", new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings", new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots", new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    public static final Item MITHRIL_DUST = registerItem("mithril_dust", new Item(new FabricItemSettings().group(ModItemGroup.MITHRIL)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FabricTest.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FabricTest.LOGGER.info("Registering Mod Items for " + FabricTest.MOD_ID);
    }
}
