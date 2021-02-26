package org.waterpicker.chromablocks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.Tag;
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


    public static void register(BlockRegister blockRegister, ItemRegister itemRegister, String name, Supplier<DyeItem> dye) {
        String main = "chroma_" + name;
        String stairs = main + "_stairs";
        String slab = main + "_slab";
        String door = main + "_door";
        String wall = main + "_wall";
        String trapDoor = main + "_trap_door";
        String button = main + "_button";

        itemRegister.register(main, itemFunction.apply(blockRegister.register(main, CHROMA_BLOCK)));
        itemRegister.register(slab, itemFunction.apply(blockRegister.register(slab, CHROMA_SLAB)));
        itemRegister.register(stairs, itemFunction.apply(blockRegister.register(stairs, CHROMA_STAIRS)));
        itemRegister.register(wall, itemFunction.apply(blockRegister.register(wall, CHROMA_WALL)));
        itemRegister.register(door, itemFunction.apply(blockRegister.register(door, CHROMA_DOOR)));
        itemRegister.register(trapDoor, itemFunction.apply(blockRegister.register(trapDoor, CHROMA_TRAP_DOOR)));
        itemRegister.register(button, itemFunction.apply(blockRegister.register(button, CHROMA_BUTTON)));

        groups.add(new Group(
                dye,
                Registry.BLOCK.get(new Identifier(MOD_ID, main)),
                Registry.BLOCK.get(new Identifier(MOD_ID, stairs)),
                Registry.BLOCK.get(new Identifier(MOD_ID, slab)),
                Registry.BLOCK.get(new Identifier(MOD_ID, wall)),
                Registry.BLOCK.get(new Identifier(MOD_ID, door)),
                Registry.BLOCK.get(new Identifier(MOD_ID, trapDoor)),
                Registry.BLOCK.get(new Identifier(MOD_ID, button))
        ));

    }

    public static void init(BlockRegister blockRegister, ItemRegister itemRegister, Supplier<Tag.Identified<Item>> namedSupplier) {
        register(blockRegister, itemRegister,"black", () -> (DyeItem) Items.BLACK_DYE);
        register(blockRegister, itemRegister,"blue", () -> (DyeItem) Items.BLUE_DYE);
        register(blockRegister, itemRegister,"brown", () -> (DyeItem) Items.BROWN_DYE);
        register(blockRegister, itemRegister,"cyan", () -> (DyeItem) Items.CYAN_DYE);
        register(blockRegister, itemRegister,"gray", () -> (DyeItem) Items.GRAY_DYE);
        register(blockRegister, itemRegister,"green", () -> (DyeItem) Items.GREEN_DYE);
        register(blockRegister, itemRegister,"light_blue", () -> (DyeItem) Items.LIGHT_BLUE_DYE);
        register(blockRegister, itemRegister,"light_gray", () -> (DyeItem) Items.LIGHT_GRAY_DYE);
        register(blockRegister, itemRegister,"lime", () -> (DyeItem) Items.LIME_DYE);
        register(blockRegister, itemRegister,"magenta", () -> (DyeItem) Items.MAGENTA_DYE);
        register(blockRegister, itemRegister,"orange", () -> (DyeItem) Items.ORANGE_DYE);
        register(blockRegister, itemRegister,"pink", () -> (DyeItem) Items.PINK_DYE);
        register(blockRegister, itemRegister,"purple", () -> (DyeItem) Items.PURPLE_DYE);
        register(blockRegister, itemRegister,"red", () -> (DyeItem) Items.RED_DYE);
        register(blockRegister, itemRegister, "yellow", () -> (DyeItem) Items.YELLOW_DYE);
        register(blockRegister, itemRegister,"white", () -> (DyeItem) Items.WHITE_DYE);

        CHROMA_BLOCKS = namedSupplier.get();
    }

}
