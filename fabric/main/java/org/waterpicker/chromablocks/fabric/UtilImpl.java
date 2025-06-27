package org.waterpicker.chromablocks.fabric;

import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

import com.mojang.serialization.Lifecycle;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import org.waterpicker.chromablocks.ChromaBlocks;

public class UtilImpl {
	public static AbstractBlock.Settings chromaProperties(MaterialColor color) {
		return FabricBlockSettings.of(Material.METAL, color).strength(5.0F, 6.0F).lightLevel(value -> 15).breakByTool(FabricToolTags.PICKAXES, 1);
	}

	public static Tag.Identified<Item> createTag() {
		return (Tag.Identified<Item>) TagRegistry.item(new Identifier(ChromaBlocks.MOD_ID, "chroma_blocks"));
	}

	public static Supplier<Block> registerBlock(String id, Supplier<Block> block) {
		return () -> Registry.BLOCK.add(RegistryKey.of(Registry.BLOCK_KEY, new Identifier(ChromaBlocks.MOD_ID, id)), block.get(), Lifecycle.stable());
	}

	public static void registerItem(String id, Supplier<Item> item) {
		Registry.ITEM.add(RegistryKey.of(Registry.ITEM_KEY, new Identifier(ChromaBlocks.MOD_ID, id)), item.get(), Lifecycle.stable());
	}

	public static void registerItemColors(ItemColorProvider provider, ItemConvertible... items) {
		ColorProviderRegistry.ITEM.register(provider, items);
	}

	public static void registerBlockColors(BlockColorProvider provider, Block... blocks) {
		ColorProviderRegistry.BLOCK.register(provider, blocks);
	}
}
