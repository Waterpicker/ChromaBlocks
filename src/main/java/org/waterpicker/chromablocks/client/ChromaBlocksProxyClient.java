package org.waterpicker.chromablocks.client;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.waterpicker.chromablocks.ChromaBlocksProxyCommon;

public class ChromaBlocksProxyClient extends ChromaBlocksProxyCommon {
    @Override
    public void onPreInitialization(FMLPreInitializationEvent event) {
        super.onPreInitialization(event);
    }

    @Override
    public void onInitialization(FMLInitializationEvent event) {
        super.onInitialization(event);
        //ModelManager.registerModels();
    }
}
