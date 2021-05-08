package org.waterpicker.chromablocks;

import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.Tag;

import me.shedaniel.architectury.annotations.ExpectPlatform;

public class Util {
	@ExpectPlatform
	public static AbstractBlock.Settings chromaProperties() {
		throw new AssertionError();
	}

	@ExpectPlatform
	public static Tag.Identified<Item> createTag() {
		throw new AssertionError();
	}

	@ExpectPlatform
	public static Supplier<Block> registerBlock(String id, Supplier<Block> block) {
		throw new AssertionError();
	}

	@ExpectPlatform
	public static void registerItem(String id, Supplier<Item> item) {
		throw new AssertionError();
	}

	@ExpectPlatform
	public static void registerItemColors(ItemColorProvider provider, ItemConvertible... items) {
		throw new AssertionError();
	}

	@ExpectPlatform
	public static void registerBlockColors(BlockColorProvider provider, Block... blocks) {
		throw new AssertionError();
	}
}
