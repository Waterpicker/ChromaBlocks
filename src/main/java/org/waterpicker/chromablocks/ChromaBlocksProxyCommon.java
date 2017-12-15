package org.waterpicker.chromablocks;

import org.waterpicker.chromablocks.block.ModBlocks;
import org.waterpicker.chromablocks.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ChromaBlocksProxyCommon {
    public void onPreInitialization(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(ModBlocks.class);
        MinecraftForge.EVENT_BUS.register(ModItems.class);
    }

    public void onInitialization(FMLInitializationEvent event) {
    }
}
