package org.waterpicker.chromablocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

import static org.waterpicker.chromablocks.ChromaBlocks.MODID;

@Mod(MODID)
public class ChromaBlocks {
    public static final String MODID = "chromablocks";

    public static ItemGroup CHROMA_GROUP = new ItemGroup("chromaBlocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.CHROMA_WHITE);
        }
    };


    public ChromaBlocks() {
        FMLModLoadingContext.get().getModEventBus().register(new Blocks.Registration());
    }
}