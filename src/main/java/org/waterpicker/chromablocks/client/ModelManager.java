package org.waterpicker.chromablocks.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import org.waterpicker.chromablocks.block.ModBlocks;
import org.waterpicker.chromablocks.item.ChromaItem;
import org.waterpicker.chromablocks.item.ModItems;

public class ModelManager {
    private static void register(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

        public static void registerModels() { 
            register(ModItems.CHROMA_RED);
            register(ModItems.CHROMA_YELLOW);
            register(ModItems.CHROMA_GREEN);
            register(ModItems.CHROMA_BLUE);
            register(ModItems.CHROMA_WHITE);
            register(ModItems.CHROMA_BLACK);
            register(ModItems.CHROMA_BROWN);
            register(ModItems.CHROMA_ORANGE);
            register(ModItems.CHROMA_LIGHT_BLUE);
            register(ModItems.CHROMA_MAGENTA);
            register(ModItems.CHROMA_PINK);
            register(ModItems.CHROMA_LIGHT_GRAY);
            register(ModItems.CHROMA_CYAN);
            register(ModItems.CHROMA_PURPLE);
            register(ModItems.CHROMA_GRAY);
            register(ModItems.CHROMA_LIME);
    }
}
