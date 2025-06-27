package org.waterpicker.chromablocks.forge;

import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.item.ItemColorProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.Tag;

import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.waterpicker.chromablocks.ChromaBlocks;

public class UtilImpl {
	private static DeferredRegister<Block> blockDeferredRegister;
	private static DeferredRegister<Item> itemDeferredRegister;

	public static void setup() {
		blockDeferredRegister = DeferredRegister.create(Block.class, ChromaBlocks.MOD_ID);
		itemDeferredRegister = DeferredRegister.create(Item.class, ChromaBlocks.MOD_ID);
		blockDeferredRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
		itemDeferredRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	public static AbstractBlock.Settings chromaProperties(MaterialColor color) {
		return AbstractBlock.Settings.of(Material.METAL, color).strength(5.0F, 6.0F).luminance(value -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(1);
	}

	public static Tag.Identified<Item> createTag() {
		return ItemTags.register(ChromaBlocks.MOD_ID + ":chroma_blocks");
	}

	public static Supplier<Block> registerBlock(String id, Supplier<Block> block) {
		return blockDeferredRegister.register(id, block);
	}

	public static void registerItem(String id, Supplier<Item> item) {
		itemDeferredRegister.register(id, item);
	}

	public static void registerItemColors(ItemColorProvider provider, ItemConvertible... items) {
		MinecraftClient.getInstance().getItemColors().register(provider, items);
	}

	public static void registerBlockColors(BlockColorProvider provider, Block... blocks) {
		MinecraftClient.getInstance().getBlockColors().registerColorProvider(provider, blocks);
	}
}
