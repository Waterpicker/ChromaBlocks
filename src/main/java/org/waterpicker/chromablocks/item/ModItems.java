package org.waterpicker.chromablocks.item;

import org.waterpicker.chromablocks.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModItems {
    public static Item CHROMA_RED = new ChromaItem(ModBlocks.CHROMA_RED);
    public static Item CHROMA_YELLOW = new ChromaItem(ModBlocks.CHROMA_YELLOW);
    public static Item CHROMA_GREEN = new ChromaItem(ModBlocks.CHROMA_GREEN);
    public static Item CHROMA_BLUE = new ChromaItem(ModBlocks.CHROMA_BLUE);
    public static Item CHROMA_WHITE = new ChromaItem(ModBlocks.CHROMA_WHITE);
    public static Item CHROMA_BLACK = new ChromaItem(ModBlocks.CHROMA_BLACK);
    public static Item CHROMA_BROWN = new ChromaItem(ModBlocks.CHROMA_BROWN);
    public static Item CHROMA_ORANGE = new ChromaItem(ModBlocks.CHROMA_ORANGE);
    public static Item CHROMA_LIGHT_BLUE = new ChromaItem(ModBlocks.CHROMA_LIGHT_BLUE);
    public static Item CHROMA_MAGENTA = new ChromaItem(ModBlocks.CHROMA_MAGENTA);
    public static Item CHROMA_PINK = new ChromaItem(ModBlocks.CHROMA_PINK);
    public static Item CHROMA_LIGHT_GRAY = new ChromaItem(ModBlocks.CHROMA_LIGHT_GRAY);
    public static Item CHROMA_CYAN = new ChromaItem(ModBlocks.CHROMA_CYAN);
    public static Item CHROMA_PURPLE = new ChromaItem(ModBlocks.CHROMA_PURPLE);
    public static Item CHROMA_GRAY = new ChromaItem(ModBlocks.CHROMA_GRAY);
    public static Item CHROMA_LIME = new ChromaItem(ModBlocks.CHROMA_LIME);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                CHROMA_BLACK,
                CHROMA_RED,
                CHROMA_YELLOW,
                CHROMA_GREEN,
                CHROMA_BLUE,
                CHROMA_WHITE,
                CHROMA_BROWN,
                CHROMA_ORANGE,
                CHROMA_LIGHT_BLUE,
                CHROMA_MAGENTA,
                CHROMA_PINK,
                CHROMA_LIGHT_GRAY,
                CHROMA_CYAN,
                CHROMA_PURPLE,
                CHROMA_GRAY,
                CHROMA_LIME);
    }
}
