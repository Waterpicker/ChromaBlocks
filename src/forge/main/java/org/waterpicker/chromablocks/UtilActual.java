package org.waterpicker.chromablocks;

import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.msrandom.multiplatform.annotations.Actual;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UtilActual {
    private static DeferredRegister<Block> blockDeferredRegister;
    private static DeferredRegister<Item> itemDeferredRegister;
    private static Map<BlockColor, List<Supplier<Block>>> blockColors = new HashMap<>();
    private static Map<ItemColor, List<Supplier<Item>>> itemColors = new HashMap<>();

    public static void setup() {
        blockDeferredRegister = DeferredRegister.create(Block.class, ChromaBlocks.MOD_ID);
        itemDeferredRegister = DeferredRegister.create(Item.class, ChromaBlocks.MOD_ID);
        blockDeferredRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
        itemDeferredRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener((Consumer<ColorHandlerEvent.Item>) item -> {
            itemColors.forEach((itemColor, suppliers) -> item.getItemColors().register(itemColor, suppliers.stream().map(Supplier::get).map(Item::asItem).toArray(ItemLike[]::new)));
            blockColors.forEach((blockColor, suppliers) -> item.getBlockColors().register(blockColor, suppliers.stream().map(Supplier::get).toArray(Block[]::new)));
        });

        FMLJavaModLoadingContext.get().getModEventBus().addListener((Consumer<ColorHandlerEvent.Block>) item -> {
            blockColors.forEach((blockColor, suppliers) -> item.getBlockColors().register(blockColor, suppliers.stream().map(Supplier::get).toArray(Block[]::new)));
        });
    }

    @Actual
    public static BlockBehaviour.Properties chromaProperties(MaterialColor color) {
        return BlockBehaviour.Properties.of(Material.METAL, color).strength(5.0F, 6.0F).lightLevel(value -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(1);
    }

    @Actual
    public static Tag<Item> createTag() {
        return ItemTags.bind(ChromaBlocks.MOD_ID + ":chroma_blocks");
    }

    @Actual
    public static Supplier<Block> registerBlock(String id, Supplier<Block> block) {
        return blockDeferredRegister.register(id, block);
    }

    @Actual
    public static void registerItem(String id, Supplier<Item> item) {
        itemDeferredRegister.register(id, item);
    }

    @Actual
    public static void registerItemColors(ItemColor provider, Supplier<Item>... items) {
        List<Supplier<Item>> list = itemColors.putIfAbsent(provider, new ArrayList<>());
        Objects.requireNonNull(list).addAll(Arrays.asList(items));
    }

    @Actual
    public static void registerBlockColors(BlockColor provider, Supplier<Block>... blocks) {
        List<Supplier<Block>> list = blockColors.putIfAbsent(provider, new ArrayList<>());
        Objects.requireNonNull(list).addAll(Arrays.asList(blocks));
    }
}
