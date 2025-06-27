package org.waterpicker.chromablocks;

import net.minecraftforge.fml.common.Mod;

import static org.waterpicker.chromablocks.forge.UtilImpl.setup;

@Mod(ChromaBlocks.MOD_ID)
public class ChromaBlocksForge {
	public ChromaBlocksForge() {
		setup();
		ChromaBlocks.init();
	}
}
