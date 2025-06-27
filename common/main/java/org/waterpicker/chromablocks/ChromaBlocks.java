package org.waterpicker.chromablocks;

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

	private static Function<MaterialColor, Supplier<Block>> CHROMA_BLOCK = color -> () -> new Block(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_SLAB = color -> () -> new SlabBlock(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_STAIRS = color -> () -> {
        Block block = CHROMA_BLOCK.apply(color).get();

        return new StairsBlock(block.getDefaultState(), AbstractBlock.Settings.copy(block)) {};
    };

    private static Function<MaterialColor, Supplier<Block>> CHROMA_WALL = color -> () -> new WallBlock(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_DOOR = color -> () -> new DoorBlock(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_TRAP_DOOR = color -> () -> new TrapDoorBlock(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_BUTTON = color -> () -> new StoneButtonBlock(Util.chromaProperties(color)) {
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

    public static net.minecraft.tag.Tag.Identified<Item> CHROMA_BLOCKS;


    public static void register(String name, MaterialColor color) {
        String main = "chroma_" + name;
        String stairs = main + "_stairs";
        String slab = main + "_slab";
        String door = main + "_door";
        String wall = main + "_wall";
        String trapDoor = main + "_trap_door";
        String button = main + "_button";

        Util.registerItem(main, itemFunction.apply(Util.registerBlock(main, CHROMA_BLOCK.apply(color))));
        Util.registerItem(slab, itemFunction.apply(Util.registerBlock(slab, CHROMA_SLAB.apply(color))));
        Util.registerItem(stairs, itemFunction.apply(Util.registerBlock(stairs, CHROMA_STAIRS.apply(color))));
        Util.registerItem(wall, itemFunction.apply(Util.registerBlock(wall, CHROMA_WALL.apply(color))));
        Util.registerItem(door, itemFunction.apply(Util.registerBlock(door, CHROMA_DOOR.apply(color))));
        Util.registerItem(trapDoor, itemFunction.apply(Util.registerBlock(trapDoor, CHROMA_TRAP_DOOR.apply(color))));
        Util.registerItem(button, itemFunction.apply(Util.registerBlock(button, CHROMA_BUTTON.apply(color))));

        Util.registerBlockColors(
                (blockState, blockRenderView, blockPos, i) -> color.color,
                Registry.BLOCK.get(new Identifier(MOD_ID, main)),
                Registry.BLOCK.get(new Identifier(MOD_ID, stairs)),
                Registry.BLOCK.get(new Identifier(MOD_ID, slab)),
                Registry.BLOCK.get(new Identifier(MOD_ID, wall)),
                Registry.BLOCK.get(new Identifier(MOD_ID, door)),
                Registry.BLOCK.get(new Identifier(MOD_ID, trapDoor)),
                Registry.BLOCK.get(new Identifier(MOD_ID, button)));

        Util.registerItemColors(
                (stack, i) -> color.color,
                Registry.ITEM.get(new Identifier(MOD_ID, main)),
                Registry.ITEM.get(new Identifier(MOD_ID, stairs)),
                Registry.ITEM.get(new Identifier(MOD_ID, slab)),
                Registry.ITEM.get(new Identifier(MOD_ID, wall)),
                Registry.ITEM.get(new Identifier(MOD_ID, door)),
                Registry.ITEM.get(new Identifier(MOD_ID, trapDoor)),
                Registry.ITEM.get(new Identifier(MOD_ID, button)));
    }

    public static void init() {
        register("black", MaterialColor.BLACK);
        register("blue", MaterialColor.BLUE);
        register("brown", MaterialColor.BROWN);
        register("cyan", MaterialColor.CYAN);
        register("gray", MaterialColor.GRAY);
        register("green", MaterialColor.GREEN);
        register("light_blue", MaterialColor.LIGHT_BLUE);
        register("light_gray", MaterialColor.LIGHT_GRAY);
        register("lime", MaterialColor.LIME);
        register("magenta", MaterialColor.MAGENTA);
        register("orange", MaterialColor.ORANGE);
        register("pink", MaterialColor.PINK);
        register("purple", MaterialColor.PURPLE);
        register("red", MaterialColor.RED);
        register("yellow", MaterialColor.YELLOW);
        register("white", MaterialColor.WHITE);

        CHROMA_BLOCKS = Util.createTag();
    }

}
