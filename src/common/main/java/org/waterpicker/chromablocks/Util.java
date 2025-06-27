package org.waterpicker.chromablocks;

import java.util.function.Supplier;


import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;
import net.msrandom.multiplatform.annotations.Expect;

public class Util {
	@Expect
	public static BlockBehaviour.Properties chromaProperties(MaterialColor color);

	@Expect
	public static Tag<Item> createTag();

	@Expect
	public static Supplier<Block> registerBlock(String id, Supplier<Block> block);

	@Expect
	public static Supplier<Item> registerItem(String id, Supplier<Item> item);

	@SafeVarargs
    @Expect
	public static void registerItemColors(ItemColor provider, Supplier<Item>... items);

	@SafeVarargs
    @Expect
	public static void registerBlockColors(BlockColor provider, Supplier<Block>... blocks);
}
