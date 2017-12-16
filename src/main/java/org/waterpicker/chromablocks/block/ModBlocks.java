package org.waterpicker.chromablocks.block;

import jline.internal.Preconditions;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.waterpicker.chromablocks.ChromaBlocks;
import org.waterpicker.chromablocks.item.ChromaItem;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("WeakerAccess")
@GameRegistry.ObjectHolder(ChromaBlocks.MODID)
public class ModBlocks {
    public static ChromaBlock CHROMA = new ChromaBlock();

    @Mod.EventBusSubscriber(modid = ChromaBlocks.MODID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            event.getRegistry().register(CHROMA);
        }

        @SubscribeEvent
        public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
            ItemBlock item = new ChromaItem();
            event.getRegistry().register(item);
        }
    }
}
