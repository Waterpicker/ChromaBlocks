package org.waterpicker.chromablocks;

import java.util.function.Consumer;
import java.util.function.Supplier;

import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import me.shedaniel.architectury.registry.BlockProperties;
import me.shedaniel.architectury.registry.DeferredRegister;
import me.shedaniel.architectury.registry.RegistrySupplier;

public class ChromaBlocks {
    public static final String MOD_ID = "chromablocks";

    private static Supplier<Block> CHROMA_BLOCK = () -> new Block(BlockBehaviour.Properties.of(Material.METAL).lightLevel(value -> 15));

    private static Supplier<Block> CHROMA_SLAB = () -> new SlabBlock(Block.Properties.of(Material.METAL).lightLevel(value -> 15));

    private static Supplier<Block> CHROMA_STAIRS = () -> {
        Block block = CHROMA_BLOCK.get();

        return new StairBlock(block.defaultBlockState(), Block.Properties.copy(block)) {};
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY);

    static Consumer<RegistrySupplier<Block>> consumer = b -> {
        ITEMS.register(b.getRegistryId().getPath(), () -> new BlockItem(b.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    };

    public static void register(String name) {
        consumer.accept(BLOCKS.register("chroma_" + name, CHROMA_BLOCK));
        consumer.accept(BLOCKS.register("chroma_" + name + "_slab", CHROMA_SLAB));
        consumer.accept(BLOCKS.register("chroma_" + name + "_stairs", CHROMA_STAIRS));

    }

    public static void init() {
        register("black");
        register("blue");
        register("brown");
        register("cyan");
        register("gray");
        register("green");
        register("light_blue");
        register("light_gray");
        register("lime");
        register("magenta");
        register("orange");
        register("pink");
        register("purple");
        register("red");

        register("yellow");
        register("white");

        BLOCKS.register();
        ITEMS.register();
    }
}
