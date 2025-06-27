package org.waterpicker.chromablocks;

import com.mojang.datafixers.util.Pair;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Function;
import java.util.function.Supplier;


public class ChromaBlocks {
    public static final String MOD_ID = "chromablocks";

	private static Function<MaterialColor, Supplier<Block>> CHROMA_BLOCK = color -> () -> new Block(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_SLAB = color -> () -> new SlabBlock(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_STAIRS = color -> () -> {
        Block block = CHROMA_BLOCK.apply(color).get();

        return new StairBlock(block.defaultBlockState(), BlockBehaviour.Properties.copy(block)) {};
    };

    private static Function<MaterialColor, Supplier<Block>> CHROMA_WALL = color -> () -> new WallBlock(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_DOOR = color -> () -> new DoorBlock(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_TRAP_DOOR = color -> () -> new TrapDoorBlock(Util.chromaProperties(color));

    private static Function<MaterialColor, Supplier<Block>> CHROMA_BUTTON = color -> () -> new StoneButtonBlock(Util.chromaProperties(color)) {
        @Override
        protected SoundEvent getSound(boolean b) {
            return b ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
        }
    };


    public static class DoorBlock extends net.minecraft.world.level.block.DoorBlock {
        protected DoorBlock(BlockBehaviour.Properties properties) {
            super(properties);
        }
    }

    public static class TrapDoorBlock extends net.minecraft.world.level.block.TrapDoorBlock {
        protected TrapDoorBlock(BlockBehaviour.Properties properties) {
            super(properties);
        }
    }


    static Function<Supplier<Block>, Supplier<Item>> itemFunction = b -> () -> {
        BlockItem item = new BlockItem(b.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
        item.registerBlocks(Item.BY_BLOCK, item);
        return item;
    };

    public static Tag<Item> CHROMA_BLOCKS;


    public static void register(String name, MaterialColor color) {
        String main = "chroma_" + name;
        Pair<Supplier<Block>, Supplier<Item>> mainPair = register(main, CHROMA_BLOCK.apply(color));
        Supplier<Block> mainBlock = mainPair.getFirst();
        Supplier<Item> mainItem = mainPair.getSecond();
        Pair<Supplier<Block>, Supplier<Item>> stairsPair = register(main + "_stairs", CHROMA_SLAB.apply(color));
        Supplier<Block> stairsBlock = stairsPair.getFirst();
        Supplier<Item> stairsItem = stairsPair.getSecond();
        Pair<Supplier<Block>, Supplier<Item>> slabPair = register(main + "_slab", CHROMA_STAIRS.apply(color));
        Supplier<Block> slabBlock = slabPair.getFirst();
        Supplier<Item> slabItem = slabPair.getSecond();
        Pair<Supplier<Block>, Supplier<Item>> doorPair = register(main + "_door", CHROMA_WALL.apply(color));
        Supplier<Block> doorBlock = doorPair.getFirst();
        Supplier<Item> doorItem = doorPair.getSecond();
        Pair<Supplier<Block>, Supplier<Item>> wallPair = register(main + "_wall", CHROMA_DOOR.apply(color));
        Supplier<Block> wallBlock = wallPair.getFirst();
        Supplier<Item> wallItem = wallPair.getSecond();
        Pair<Supplier<Block>, Supplier<Item>> trapDoorPair = register(main + "_trap_door", CHROMA_TRAP_DOOR.apply(color));
        Supplier<Block> trapDoorBlock = trapDoorPair.getFirst();
        Supplier<Item> trapDoorItem = trapDoorPair.getSecond();
        Pair<Supplier<Block>, Supplier<Item>> buttonPair = register(main + "_button", CHROMA_BUTTON.apply(color));
        Supplier<Block> buttonBlock = buttonPair.getFirst();
        Supplier<Item> buttonItem = buttonPair.getSecond();

        Util.registerBlockColors(
                (blockState, blockRenderView, blockPos, i) -> color.col,
                mainBlock,
                stairsBlock,
                slabBlock,
                doorBlock,
                wallBlock,
                trapDoorBlock,
                buttonBlock);

        Util.registerItemColors(
                (stack, i) -> color.col,
                mainItem,
                stairsItem,
                slabItem,
                wallItem,
                doorItem,
                trapDoorItem,
                buttonItem);
    }

    private static Pair<Supplier<Block>, Supplier<Item>> register(String name, Supplier<Block> apply) {
        return Pair.of(Util.registerBlock(name, apply), Util.registerItem(name, itemFunction.apply(apply)));
    }

    public static void init() {
        register("black", DyeColor.BLACK.getMaterialColor());
        register("blue", DyeColor.BLUE.getMaterialColor());
        register("brown", DyeColor.BROWN.getMaterialColor());
        register("cyan", DyeColor.CYAN.getMaterialColor());
        register("gray", DyeColor.GRAY.getMaterialColor());
        register("green", DyeColor.GREEN.getMaterialColor());
        register("light_blue", DyeColor.LIGHT_BLUE.getMaterialColor());
        register("light_gray", DyeColor.LIGHT_GRAY.getMaterialColor());
        register("lime", DyeColor.LIME.getMaterialColor());
        register("magenta", DyeColor.MAGENTA.getMaterialColor());
        register("orange", DyeColor.ORANGE.getMaterialColor());
        register("pink", DyeColor.PINK.getMaterialColor());
        register("purple", DyeColor.PURPLE.getMaterialColor());
        register("red", DyeColor.RED.getMaterialColor());
        register("yellow", DyeColor.YELLOW.getMaterialColor());
        register("white", DyeColor.WHITE.getMaterialColor());

        CHROMA_BLOCKS = Util.createTag();
    }

}
