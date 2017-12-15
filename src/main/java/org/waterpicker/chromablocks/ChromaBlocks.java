package org.waterpicker.chromablocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static org.waterpicker.chromablocks.ChromaBlocks.MODID;

@Mod(modid = MODID, name = "ChromaBlocks", version = "1.0-SNAPSHOT")
public class ChromaBlocks {
    public static final String MODID = "chromablocks";

    @SidedProxy(clientSide = "org.waterpicker.chromablocks.client.ChromaBlocksProxyClient",
            serverSide = "org.waterpicker.chromablocks.server.ChromaBlocksProxyServer")
    public static ChromaBlocksProxyCommon proxy;

    @Mod.EventHandler
    public void onPreInitialization(FMLPreInitializationEvent event) {
        proxy.onPreInitialization(event);
    }

    @Mod.EventHandler
    public void onInitialization(FMLInitializationEvent event) {
        proxy.onInitialization(event);
    }

}