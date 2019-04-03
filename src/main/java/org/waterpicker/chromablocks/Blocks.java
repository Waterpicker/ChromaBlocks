package org.waterpicker.chromablocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.waterpicker.chromablocks.ChromaBlocks.CHROMA_GROUP;
import static org.waterpicker.chromablocks.ChromaBlocks.MODID;

@ObjectHolder(MODID)
public class Blocks {
    private static Function<EnumDyeColor, Block> CHROMA_BLOCK = dye -> new Block(Block.Builder.create(Material.IRON).lightValue(15)).setRegistryName(MODID, "chroma_" + dye.getName());

    private static Function<EnumDyeColor, Block> CHROMA_SLAB = dye -> new BlockSlab(Block.Builder.create(Material.IRON).lightValue(15)).setRegistryName(MODID, "chroma_" + dye.getName() + "_slab");

    private static BiFunction<EnumDyeColor, Block, Block> CHROMA_STAIRS = (dye, block) -> new ChromaBlockStair(block.getDefaultState(), Block.Builder.create(Material.IRON).lightValue(15)).setRegistryName(MODID, "chroma_" + dye.getName() + "_stairs");

    private static Function<Block, Item> BLOCK_TO_ITEM = block -> new ItemBlock(block, new Item.Builder().group(CHROMA_GROUP)).setRegistryName(block.getRegistryName());

    @ObjectHolder("chroma_black") public static Block CHROMA_BLACK = CHROMA_BLOCK.apply(EnumDyeColor.BLACK);
    @ObjectHolder("chroma_blue") public static Block CHROMA_BLUE = CHROMA_BLOCK.apply(EnumDyeColor.BLUE);
    @ObjectHolder("chroma_brown") public static Block CHROMA_BROWN = CHROMA_BLOCK.apply(EnumDyeColor.BROWN);
    @ObjectHolder("chroma_cyan") public static Block CHROMA_CYAN = CHROMA_BLOCK.apply(EnumDyeColor.CYAN);
    @ObjectHolder("chroma_gray") public static Block CHROMA_GRAY = CHROMA_BLOCK.apply(EnumDyeColor.GRAY);
    @ObjectHolder("chroma_green") public static Block CHROMA_GREEN = CHROMA_BLOCK.apply(EnumDyeColor.GREEN);
    @ObjectHolder("chroma_light_blue") public static Block CHROMA_LIGHT_BLUE = CHROMA_BLOCK.apply(EnumDyeColor.LIGHT_BLUE);
    @ObjectHolder("chroma_light_gray") public static Block CHROMA_LIGHT_GRAY = CHROMA_BLOCK.apply(EnumDyeColor.LIGHT_GRAY);
    @ObjectHolder("chroma_lime") public static Block CHROMA_LIME = CHROMA_BLOCK.apply(EnumDyeColor.LIME);
    @ObjectHolder("chroma_magenta") public static Block CHROMA_MAGENTA = CHROMA_BLOCK.apply(EnumDyeColor.MAGENTA);
    @ObjectHolder("chroma_orange") public static Block CHROMA_ORANGE = CHROMA_BLOCK.apply(EnumDyeColor.ORANGE);
    @ObjectHolder("chroma_pink") public static Block CHROMA_PINK = CHROMA_BLOCK.apply(EnumDyeColor.PINK);
    @ObjectHolder("chroma_purple") public static Block CHROMA_PURPLE = CHROMA_BLOCK.apply(EnumDyeColor.PURPLE);
    @ObjectHolder("chroma_red") public static Block CHROMA_RED = CHROMA_BLOCK.apply(EnumDyeColor.RED);
    @ObjectHolder("chroma_white") public static Block CHROMA_WHITE = CHROMA_BLOCK.apply(EnumDyeColor.WHITE);
    @ObjectHolder("chroma_yellow") public static Block CHROMA_YELLOW = CHROMA_BLOCK.apply(EnumDyeColor.YELLOW);

    @ObjectHolder("chroma_black_slab") public static Block CHROMA_BLACK_SLAB = CHROMA_SLAB.apply(EnumDyeColor.BLACK);
    @ObjectHolder("chroma_blue_slab") public static Block CHROMA_BLUE_SLAB = CHROMA_SLAB.apply(EnumDyeColor.BLUE);
    @ObjectHolder("chroma_brown_slab") public static Block CHROMA_BROWN_SLAB = CHROMA_SLAB.apply(EnumDyeColor.BROWN);
    @ObjectHolder("chroma_cyan_slab") public static Block CHROMA_CYAN_SLAB = CHROMA_SLAB.apply(EnumDyeColor.CYAN);
    @ObjectHolder("chroma_gray_slab") public static Block CHROMA_GRAY_SLAB = CHROMA_SLAB.apply(EnumDyeColor.GRAY);
    @ObjectHolder("chroma_green_slab") public static Block CHROMA_GREEN_SLAB = CHROMA_SLAB.apply(EnumDyeColor.GREEN);
    @ObjectHolder("chroma_light_blue_slab") public static Block CHROMA_LIGHT_BLUE_SLAB = CHROMA_SLAB.apply(EnumDyeColor.LIGHT_BLUE);
    @ObjectHolder("chroma_light_gray_slab") public static Block CHROMA_LIGHT_GRAY_SLAB = CHROMA_SLAB.apply(EnumDyeColor.LIGHT_GRAY);
    @ObjectHolder("chroma_lime_slab") public static Block CHROMA_LIME_SLAB = CHROMA_SLAB.apply(EnumDyeColor.LIME);
    @ObjectHolder("chroma_magenta_slab") public static Block CHROMA_MAGENTA_SLAB = CHROMA_SLAB.apply(EnumDyeColor.MAGENTA);
    @ObjectHolder("chroma_orange_slab") public static Block CHROMA_ORANGE_SLAB = CHROMA_SLAB.apply(EnumDyeColor.ORANGE);
    @ObjectHolder("chroma_pink_slab") public static Block CHROMA_PINK_SLAB = CHROMA_SLAB.apply(EnumDyeColor.PINK);
    @ObjectHolder("chroma_purple_slab") public static Block CHROMA_PURPLE_SLAB = CHROMA_SLAB.apply(EnumDyeColor.PURPLE);
    @ObjectHolder("chroma_red_slab") public static Block CHROMA_RED_SLAB = CHROMA_SLAB.apply(EnumDyeColor.RED);
    @ObjectHolder("chroma_white_slab") public static Block CHROMA_WHITE_SLAB = CHROMA_SLAB.apply(EnumDyeColor.WHITE);
    @ObjectHolder("chroma_yellow_slab") public static Block CHROMA_YELLOW_SLAB = CHROMA_SLAB.apply(EnumDyeColor.YELLOW);

    @ObjectHolder("chroma_black_stairs") public static Block CHROMA_BLACK_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.BLACK, CHROMA_BLACK);
    @ObjectHolder("chroma_blue_stairs") public static Block CHROMA_BLUE_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.BLUE, CHROMA_BLUE);
    @ObjectHolder("chroma_brown_stairs") public static Block CHROMA_BROWN_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.BROWN, CHROMA_BROWN);
    @ObjectHolder("chroma_cyan_stairs") public static Block CHROMA_CYAN_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.CYAN, CHROMA_CYAN);
    @ObjectHolder("chroma_gray_stairs") public static Block CHROMA_GRAY_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.GRAY, CHROMA_GRAY);
    @ObjectHolder("chroma_green_stairs") public static Block CHROMA_GREEN_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.GREEN, CHROMA_GREEN);
    @ObjectHolder("chroma_light_blue_stairs") public static Block CHROMA_LIGHT_BLUE_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.LIGHT_BLUE, CHROMA_LIGHT_BLUE);
    @ObjectHolder("chroma_light_gray_stairs") public static Block CHROMA_LIGHT_GRAY_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.LIGHT_GRAY, CHROMA_LIGHT_GRAY);
    @ObjectHolder("chroma_lime_stairs") public static Block CHROMA_LIME_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.LIME, CHROMA_LIME);
    @ObjectHolder("chroma_magenta_stairs") public static Block CHROMA_MAGENTA_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.MAGENTA, CHROMA_MAGENTA);
    @ObjectHolder("chroma_orange_stairs") public static Block CHROMA_ORANGE_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.ORANGE, CHROMA_ORANGE);
    @ObjectHolder("chroma_pink_stairs") public static Block CHROMA_PINK_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.PINK, CHROMA_PINK);
    @ObjectHolder("chroma_purple_stairs") public static Block CHROMA_PURPLE_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.PURPLE, CHROMA_PURPLE);
    @ObjectHolder("chroma_red_stairs") public static Block CHROMA_RED_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.RED, CHROMA_RED);
    @ObjectHolder("chroma_white_stairs") public static Block CHROMA_WHITE_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.WHITE, CHROMA_WHITE);
    @ObjectHolder("chroma_yellow_stairs") public static Block CHROMA_YELLOW_STAIRS = CHROMA_STAIRS.apply(EnumDyeColor.YELLOW, CHROMA_YELLOW);

    @Mod.EventBusSubscriber(modid = MODID)
    public static class Registration {
        @SubscribeEvent()
        public void registerBlocks(RegistryEvent.Register<Block> event) {
            IForgeRegistry<Block> registry = event.getRegistry();
            registry.register(Blocks.CHROMA_BLACK);
            registry.register(Blocks.CHROMA_BLACK_SLAB);
            registry.register(Blocks.CHROMA_BLACK_STAIRS);
            registry.register(Blocks.CHROMA_BLUE);
            registry.register(Blocks.CHROMA_BLUE_SLAB);
            registry.register(Blocks.CHROMA_BLUE_STAIRS);
            registry.register(Blocks.CHROMA_BROWN);
            registry.register(Blocks.CHROMA_BROWN_SLAB);
            registry.register(Blocks.CHROMA_BROWN_STAIRS);
            registry.register(Blocks.CHROMA_CYAN);
            registry.register(Blocks.CHROMA_CYAN_SLAB);
            registry.register(Blocks.CHROMA_CYAN_STAIRS);
            registry.register(Blocks.CHROMA_GRAY);
            registry.register(Blocks.CHROMA_GRAY_SLAB);
            registry.register(Blocks.CHROMA_GRAY_STAIRS);
            registry.register(Blocks.CHROMA_GREEN);
            registry.register(Blocks.CHROMA_GREEN_SLAB);
            registry.register(Blocks.CHROMA_GREEN_STAIRS);
            registry.register(Blocks.CHROMA_LIGHT_BLUE);
            registry.register(Blocks.CHROMA_LIGHT_BLUE_SLAB);
            registry.register(Blocks.CHROMA_LIGHT_BLUE_STAIRS);
            registry.register(Blocks.CHROMA_LIGHT_GRAY);
            registry.register(Blocks.CHROMA_LIGHT_GRAY_SLAB);
            registry.register(Blocks.CHROMA_LIME);
            registry.register(Blocks.CHROMA_LIME_SLAB);
            registry.register(Blocks.CHROMA_LIME_STAIRS);
            registry.register(Blocks.CHROMA_MAGENTA);
            registry.register(Blocks.CHROMA_MAGENTA_SLAB);
            registry.register(Blocks.CHROMA_MAGENTA_STAIRS);
            registry.register(Blocks.CHROMA_ORANGE);
            registry.register(Blocks.CHROMA_ORANGE_SLAB);
            registry.register(Blocks.CHROMA_ORANGE_STAIRS);
            registry.register(Blocks.CHROMA_PINK);
            registry.register(Blocks.CHROMA_PINK_SLAB);
            registry.register(Blocks.CHROMA_PINK_STAIRS);
            registry.register(Blocks.CHROMA_PURPLE);
            registry.register(Blocks.CHROMA_PURPLE_SLAB);
            registry.register(Blocks.CHROMA_PURPLE_STAIRS);
            registry.register(Blocks.CHROMA_RED);
            registry.register(Blocks.CHROMA_RED_SLAB);
            registry.register(Blocks.CHROMA_RED_STAIRS);
            registry.register(Blocks.CHROMA_WHITE);
            registry.register(Blocks.CHROMA_WHITE_SLAB);
            registry.register(Blocks.CHROMA_WHITE_STAIRS);
            registry.register(Blocks.CHROMA_YELLOW);
            registry.register(Blocks.CHROMA_YELLOW_SLAB);
            registry.register(Blocks.CHROMA_YELLOW_STAIRS);
        }

        @SubscribeEvent
        public void registerItems(RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BLACK),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BLACK_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BLACK_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BLUE),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BLUE_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BLUE_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BROWN),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BROWN_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_BROWN_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_CYAN),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_CYAN_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_CYAN_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_GRAY),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_GRAY_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_GRAY_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_GREEN),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_GREEN_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_GREEN_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIGHT_BLUE),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIGHT_BLUE_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIGHT_BLUE_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIGHT_GRAY),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIGHT_GRAY_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIGHT_GRAY_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIME),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIME_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_LIME_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_MAGENTA),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_MAGENTA_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_MAGENTA_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_ORANGE),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_ORANGE_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_ORANGE_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_PINK),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_PINK_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_PINK_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_PURPLE),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_PURPLE_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_PURPLE_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_RED),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_RED_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_RED_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_WHITE),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_WHITE_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_WHITE_STAIRS),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_YELLOW),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_YELLOW_SLAB),
                    BLOCK_TO_ITEM.apply(Blocks.CHROMA_YELLOW_STAIRS)
            );
        }
    }
}
