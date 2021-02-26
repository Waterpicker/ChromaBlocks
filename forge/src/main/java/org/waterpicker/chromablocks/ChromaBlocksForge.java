package org.waterpicker.chromablocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.ItemTags;

import net.minecraftforge.registries.DeferredRegister;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ChromaBlocks.MOD_ID)
public class ChromaBlocksForge {
	public ChromaBlocksForge() {
		DeferredRegister<Block> blockDeferredRegister = DeferredRegister.create(Block.class, ChromaBlocks.MOD_ID);
		DeferredRegister<Item> itemDeferredRegister = DeferredRegister.create(Item.class, ChromaBlocks.MOD_ID);
		blockDeferredRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
		itemDeferredRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
		ChromaBlocks.init(blockDeferredRegister::register, itemDeferredRegister::register, () -> ItemTags.register(ChromaBlocks.MOD_ID + ":chroma_blocks"));
	}
}
