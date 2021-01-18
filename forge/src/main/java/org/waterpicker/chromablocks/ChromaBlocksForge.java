package org.waterpicker.chromablocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import me.shedaniel.architectury.platform.forge.EventBuses;

@Mod(ChromaBlocks.MOD_ID)
public class ChromaBlocksForge {
	public ChromaBlocksForge() {
		EventBuses.registerModEventBus(ChromaBlocks.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
		ChromaBlocks.init();
	}
}
