package org.waterpicker.chromablocks.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModBlocks {
    public static ChromaBlock CHROMA_RED = new ChromaBlock("chroma_red");
    public static ChromaBlock CHROMA_YELLOW = new ChromaBlock("chroma_yellow");
    public static ChromaBlock CHROMA_GREEN = new ChromaBlock("chroma_green");
    public static ChromaBlock CHROMA_BLUE = new ChromaBlock("chroma_blue");
    public static ChromaBlock CHROMA_WHITE = new ChromaBlock("chroma_white");
    public static ChromaBlock CHROMA_BLACK = new ChromaBlock("chroma_black");
    public static ChromaBlock CHROMA_BROWN = new ChromaBlock("chroma_brown");
    public static ChromaBlock CHROMA_ORANGE = new ChromaBlock("chroma_orange");
    public static ChromaBlock CHROMA_LIGHT_BLUE = new ChromaBlock("chroma_light_blue");
    public static ChromaBlock CHROMA_MAGENTA = new ChromaBlock("chroma_magenta");
    public static ChromaBlock CHROMA_PINK = new ChromaBlock("chroma_pink");
    public static ChromaBlock CHROMA_LIGHT_GRAY = new ChromaBlock("chroma_light_gray");
    public static ChromaBlock CHROMA_CYAN = new ChromaBlock("chroma_cyan");
    public static ChromaBlock CHROMA_PURPLE = new ChromaBlock("chroma_purple");
    public static ChromaBlock CHROMA_GRAY = new ChromaBlock("chroma_gray");
    public static ChromaBlock CHROMA_LIME = new ChromaBlock("chroma_lime");

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
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
