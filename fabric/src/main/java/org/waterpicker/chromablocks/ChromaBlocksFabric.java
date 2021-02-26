package org.waterpicker.chromablocks;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

import com.mojang.serialization.Lifecycle;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagRegistry;

public class ChromaBlocksFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		ChromaBlocks.init(
				(id, block) -> () -> Registry.BLOCK.add(RegistryKey.of(Registry.BLOCK_KEY, new Identifier(ChromaBlocks.MOD_ID, id)), block.get(), Lifecycle.stable()),
				(id, item) -> Registry.ITEM.add(RegistryKey.of(Registry.ITEM_KEY, new Identifier(ChromaBlocks.MOD_ID, id)), item.get(), Lifecycle.stable()),
				() -> (Tag.Identified<Item>) TagRegistry.item(new Identifier(ChromaBlocks.MOD_ID, "chroma_blocks"))
		);
	}
}
