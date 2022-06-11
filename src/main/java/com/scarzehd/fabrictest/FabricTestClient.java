package com.scarzehd.fabrictest;

import com.scarzehd.fabrictest.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FabricTestClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        initializeRenderLayers();
    }

    private void initializeRenderLayers() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MITHRIL_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MITHRIL_TRAPDOOR, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LILAC_FLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_LILAC_FLOWER, RenderLayer.getCutout());
    }
}
