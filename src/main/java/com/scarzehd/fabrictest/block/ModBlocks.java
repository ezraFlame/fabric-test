package com.scarzehd.fabrictest.block;

import com.scarzehd.fabrictest.FabricTest;
import com.scarzehd.fabrictest.block.custom.MithrilLampBlock;
import com.scarzehd.fabrictest.block.custom.SpeedyBlock;
import com.scarzehd.fabrictest.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {

    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_block");

    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_ore");

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block", new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.speedy_block");

    public static final Block MITHRIL_BUTTON = registerBlock("mithril_button", new StoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool().noCollision()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_button");

    public static final Block MITHRIL_PRESSURE_PLATE = registerBlock("mithril_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_pressure_plate");

    public static final Block MITHRIL_FENCE = registerBlock("mithril_fence", new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_fence");

    public static final Block MITHRIL_FENCE_GATE = registerBlock("mithril_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_fence_gate");

    public static final Block MITHRIL_WALL = registerBlock("mithril_wall", new WallBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_wall");

    public static final Block MITHRIL_SLAB = registerBlock("mithril_slab", new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_slab");

    public static final Block MITHRIL_STAIRS = registerBlock("mithril_stairs", new StairsBlock(MITHRIL_BLOCK.getDefaultState(), FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_stairs");

    public static final Block MITHRIL_DOOR = registerBlock("mithril_door", new DoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().nonOpaque()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_door");

    public static final Block MITHRIL_TRAPDOOR = registerBlock("mithril_trapdoor", new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().nonOpaque()), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_trapdoor");

    public static final Block LILAC_FLOWER = registerBlock("lilac_flower", new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12, FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque()), ModItemGroup.MITHRIL, "tooltip.fabrictest.lilac_flower");

    public static final Block POTTED_LILAC_FLOWER = registerBlockWithoutItem("potted_lilac_flower", new FlowerPotBlock(LILAC_FLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()), ModItemGroup.MITHRIL, "tooltip.fabrictest.lilac_flower");

    public static final Block MITHRIL_LAMP = registerBlock("mithril_lamp", new MithrilLampBlock(FabricBlockSettings.of(Material.METAL).requiresTool().luminance((state) -> state.get(MithrilLampBlock.CLICKED) ? 15 : 0)), ModItemGroup.MITHRIL, "tooltip.fabrictest.mithril_lamp");

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);

        return Registry.register(Registry.BLOCK, new Identifier(FabricTest.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.BLOCK, new Identifier(FabricTest.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(FabricTest.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)) {
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                if (tooltipKey.equals("")) return;
                tooltip.add(new TranslatableText(tooltipKey));
            }
        });
    }

    public static void registerModBlocks() {
        FabricTest.LOGGER.info("Registering ModBlocks for " + FabricTest.MOD_ID);
    }

}
