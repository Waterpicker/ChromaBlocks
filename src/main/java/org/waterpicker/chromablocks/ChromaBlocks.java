package org.waterpicker.chromablocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import org.dimdev.rift.listener.BlockAdder;
import org.dimdev.rift.listener.ItemAdder;

import java.util.function.Supplier;


public class ChromaBlocks implements BlockAdder, ItemAdder {
    private static Supplier<Block> CHROMA_BLOCK = () -> new Block(Block.Builder.create(Material.IRON)) {
        @Override
        public int getLightValue(IBlockState p_getLightValue_1_) {
            return 15;
        }
    };

    private static Supplier<BlockSlab> CHROMA_SLAB = () -> new BlockSlab(Block.Builder.create(Material.IRON)) {
        @Override
        public int getLightValue(IBlockState p_getLightValue_1_) {
            return 15;
        }
    };

    public static Block CHROMA_BLACK = CHROMA_BLOCK.get();
    public static Block CHROMA_BLUE = CHROMA_BLOCK.get();
    public static Block CHROMA_BROWN = CHROMA_BLOCK.get();
    public static Block CHROMA_CYAN = CHROMA_BLOCK.get();
    public static Block CHROMA_GRAY = CHROMA_BLOCK.get();
    public static Block CHROMA_GREEN = CHROMA_BLOCK.get();
    public static Block CHROMA_LIGHT_BLUE = CHROMA_BLOCK.get();
    public static Block CHROMA_LIGHT_GRAY = CHROMA_BLOCK.get();
    public static Block CHROMA_LIME = CHROMA_BLOCK.get();
    public static Block CHROMA_MAGENTA = CHROMA_BLOCK.get();
    public static Block CHROMA_ORANGE = CHROMA_BLOCK.get();
    public static Block CHROMA_PINK = CHROMA_BLOCK.get();
    public static Block CHROMA_PURPLE = CHROMA_BLOCK.get();
    public static Block CHROMA_RED = CHROMA_BLOCK.get();
    public static Block CHROMA_WHITE = CHROMA_BLOCK.get();
    public static Block CHROMA_YELLOW = CHROMA_BLOCK.get();

    public static BlockSlab CHROMA_BLACK_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_BLUE_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_BROWN_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_CYAN_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_GRAY_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_GREEN_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_LIGHT_BLUE_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_LIGHT_GRAY_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_LIME_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_MAGENTA_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_ORANGE_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_PINK_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_PURPLE_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_RED_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_WHITE_SLAB = CHROMA_SLAB.get();
    public static BlockSlab CHROMA_YELLOW_SLAB = CHROMA_SLAB.get();

    @Override
    public void registerBlocks() {
        Block.registerBlock("chromablocks:chroma_black", CHROMA_BLACK);
        Block.registerBlock("chromablocks:chroma_blue", CHROMA_BLUE);
        Block.registerBlock("chromablocks:chroma_brown", CHROMA_BROWN);
        Block.registerBlock("chromablocks:chroma_cyan", CHROMA_CYAN);
        Block.registerBlock("chromablocks:chroma_gray", CHROMA_GRAY);
        Block.registerBlock("chromablocks:chroma_green", CHROMA_GREEN);
        Block.registerBlock("chromablocks:chroma_light_blue", CHROMA_LIGHT_BLUE);
        Block.registerBlock("chromablocks:chroma_light_gray", CHROMA_LIGHT_GRAY);
        Block.registerBlock("chromablocks:chroma_lime", CHROMA_LIME);
        Block.registerBlock("chromablocks:chroma_magenta", CHROMA_MAGENTA);
        Block.registerBlock("chromablocks:chroma_orange", CHROMA_ORANGE);
        Block.registerBlock("chromablocks:chroma_pink", CHROMA_PINK);
        Block.registerBlock("chromablocks:chroma_purple", CHROMA_PURPLE);
        Block.registerBlock("chromablocks:chroma_red", CHROMA_RED);
        Block.registerBlock("chromablocks:chroma_white", CHROMA_WHITE);
        Block.registerBlock("chromablocks:chroma_yellow", CHROMA_YELLOW);

        Block.registerBlock("chromablocks:chroma_black_slab", CHROMA_BLACK_SLAB);
        Block.registerBlock("chromablocks:chroma_blue_slab", CHROMA_BLUE_SLAB);
        Block.registerBlock("chromablocks:chroma_brown_slab", CHROMA_BROWN_SLAB);
        Block.registerBlock("chromablocks:chroma_cyan_slab", CHROMA_CYAN_SLAB);
        Block.registerBlock("chromablocks:chroma_gray_slab", CHROMA_GRAY_SLAB);
        Block.registerBlock("chromablocks:chroma_green_slab", CHROMA_GREEN_SLAB);
        Block.registerBlock("chromablocks:chroma_light_blue_slab", CHROMA_LIGHT_BLUE_SLAB);
        Block.registerBlock("chromablocks:chroma_light_gray_slab", CHROMA_LIGHT_GRAY_SLAB);
        Block.registerBlock("chromablocks:chroma_lime_slab", CHROMA_LIME_SLAB);
        Block.registerBlock("chromablocks:chroma_magenta_slab", CHROMA_MAGENTA_SLAB);
        Block.registerBlock("chromablocks:chroma_orange_slab", CHROMA_ORANGE_SLAB);
        Block.registerBlock("chromablocks:chroma_pink_slab", CHROMA_PINK_SLAB);
        Block.registerBlock("chromablocks:chroma_purple_slab", CHROMA_PURPLE_SLAB);
        Block.registerBlock("chromablocks:chroma_red_slab", CHROMA_RED_SLAB);
        Block.registerBlock("chromablocks:chroma_white_slab", CHROMA_WHITE_SLAB);
        Block.registerBlock("chromablocks:chroma_yellow_slab", CHROMA_YELLOW_SLAB);

    }

    @Override
    public void registerItems() {
        Item.registerItemBlock(CHROMA_BLACK, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_BLUE, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_BROWN, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_CYAN, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_GRAY, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_GREEN, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_LIGHT_BLUE, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_LIGHT_GRAY, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_LIME, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_MAGENTA, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_ORANGE, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_PINK, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_PURPLE, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_RED, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_WHITE, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_YELLOW, ItemGroup.BUILDING_BLOCKS);

        Item.registerItemBlock(CHROMA_BLACK_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_BLUE_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_BROWN_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_CYAN_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_GRAY_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_GREEN_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_LIGHT_BLUE_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_LIGHT_GRAY_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_LIME_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_MAGENTA_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_ORANGE_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_PINK_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_PURPLE_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_RED_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_WHITE_SLAB, ItemGroup.BUILDING_BLOCKS);
        Item.registerItemBlock(CHROMA_YELLOW_SLAB, ItemGroup.BUILDING_BLOCKS);
    }
}
