package com.tuwavypra.primary.screen;

import com.tuwavypra.primary.PrimaryMod;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<AlchemyTableScreenHandler> ALCHEMY_TABLE_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(PrimaryMod.MOD_ID, "alchemy_table"),
                    AlchemyTableScreenHandler::new);
}
