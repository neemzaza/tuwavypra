package com.tuwavypra.primary;

import com.tuwavypra.primary.block.ModBlocks;
import com.tuwavypra.primary.screen.AlchemyTableScreen;
import com.tuwavypra.primary.screen.ModScreenHandlers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;

public class PrimaryClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALCHEMY_TABLE, RenderLayer.getCutout());

        ScreenRegistry.register(ModScreenHandlers.ALCHEMY_TABLE_SCREEN_HANDLER, AlchemyTableScreen::new);
    }
}
