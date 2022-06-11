package com.scarzehd.fabrictest.item;

import com.scarzehd.fabrictest.FabricTest;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup MITHRIL = FabricItemGroupBuilder.build(new Identifier(FabricTest.MOD_ID, "mithril"), () -> new ItemStack(ModItems.MITHRIL_INGOT));

}
