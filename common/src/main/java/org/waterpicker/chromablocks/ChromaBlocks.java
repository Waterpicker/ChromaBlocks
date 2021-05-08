package org.waterpicker.chromablocks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ChromaBlocks {
    public static final String MOD_ID = "chromablocks";

	private static Supplier<Block> CHROMA_BLOCK = () -> new Block(Util.chromaProperties());

    private static Supplier<Block> CHROMA_SLAB = () -> new SlabBlock(Util.chromaProperties());

    private static Supplier<Block> CHROMA_STAIRS = () -> {
        Block block = CHROMA_BLOCK.get();

        return new StairsBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block)) {};
    };

    private static Supplier<Block> CHROMA_WALL = () -> new WallBlock(Util.chromaProperties());

    private static Supplier<Block> CHROMA_DOOR = () -> new DoorBlock(Util.chromaProperties());

    private static Supplier<Block> CHROMA_TRAP_DOOR = () -> new TrapDoorBlock(Util.chromaProperties());

    private static Supplier<Block> CHROMA_BUTTON = () -> new StoneButtonBlock(Util.chromaProperties()) {
        @Override
        protected SoundEvent getClickSound(boolean bl) {
            return bl ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON;
        }
    };


    public static class DoorBlock extends net.minecraft.block.DoorBlock {
        protected DoorBlock(AbstractBlock.Settings properties) {
            super(properties);
        }
    }

    public static class TrapDoorBlock extends net.minecraft.block.TrapdoorBlock {
        protected TrapDoorBlock(AbstractBlock.Settings properties) {
            super(properties);
        }
    }


    static Function<Supplier<Block>, Supplier<Item>> itemFunction = b -> () -> {
        BlockItem item = new BlockItem(b.get(), new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
        item.appendBlocks(Item.BLOCK_ITEMS, item);
        return item;
    };

    public static List<Group> groups = new ArrayList<>();

    public static net.minecraft.tag.Tag.Identified<Item> CHROMA_BLOCKS;


    public static void register(String name, int color) {
        String main = "chroma_" + name;
        String stairs = main + "_stairs";
        String slab = main + "_slab";
        String door = main + "_door";
        String wall = main + "_wall";
        String trapDoor = main + "_trap_door";
        String button = main + "_button";

        Util.registerItem(main, itemFunction.apply(Util.registerBlock(main, CHROMA_BLOCK)));
        Util.registerItem(slab, itemFunction.apply(Util.registerBlock(slab, CHROMA_SLAB)));
        Util.registerItem(stairs, itemFunction.apply(Util.registerBlock(stairs, CHROMA_STAIRS)));
        Util.registerItem(wall, itemFunction.apply(Util.registerBlock(wall, CHROMA_WALL)));
        Util.registerItem(door, itemFunction.apply(Util.registerBlock(door, CHROMA_DOOR)));
        Util.registerItem(trapDoor, itemFunction.apply(Util.registerBlock(trapDoor, CHROMA_TRAP_DOOR)));
        Util.registerItem(button, itemFunction.apply(Util.registerBlock(button, CHROMA_BUTTON)));

        Util.registerBlockColors(
                (blockState, blockRenderView, blockPos, i) -> color,
                Registry.BLOCK.get(new Identifier(MOD_ID, main)),
                Registry.BLOCK.get(new Identifier(MOD_ID, stairs)),
                Registry.BLOCK.get(new Identifier(MOD_ID, slab)),
                Registry.BLOCK.get(new Identifier(MOD_ID, wall)),
                Registry.BLOCK.get(new Identifier(MOD_ID, door)),
                Registry.BLOCK.get(new Identifier(MOD_ID, trapDoor)),
                Registry.BLOCK.get(new Identifier(MOD_ID, button)));

        Util.registerItemColors(
                (stack, i) -> color,
                Registry.ITEM.get(new Identifier(MOD_ID, main)),
                Registry.ITEM.get(new Identifier(MOD_ID, stairs)),
                Registry.ITEM.get(new Identifier(MOD_ID, slab)),
                Registry.ITEM.get(new Identifier(MOD_ID, wall)),
                Registry.ITEM.get(new Identifier(MOD_ID, door)),
                Registry.ITEM.get(new Identifier(MOD_ID, trapDoor)),
                Registry.ITEM.get(new Identifier(MOD_ID, button)));
    }

    public static void init() {
        register("black", MaterialColor.BLACK.color);
        register("blue", MaterialColor.BLUE.color);
        register("brown", MaterialColor.BROWN.color);
        register("cyan", MaterialColor.CYAN.color);
        register("gray", MaterialColor.GRAY.color);
        register("green", MaterialColor.GREEN.color);
        register("light_blue", MaterialColor.LIGHT_BLUE.color);
        register("light_gray", MaterialColor.LIGHT_GRAY.color);
        register("lime", MaterialColor.LIME.color);
        register("magenta", MaterialColor.MAGENTA.color);
        register("orange", MaterialColor.ORANGE.color);
        register("pink", MaterialColor.PINK.color);
        register("purple", MaterialColor.PURPLE.color);
        register("red", MaterialColor.RED.color);
        register("yellow", MaterialColor.YELLOW.color);
        register("white", MaterialColor.WHITE.color);

        CHROMA_BLOCKS = Util.createTag();
    }

}
