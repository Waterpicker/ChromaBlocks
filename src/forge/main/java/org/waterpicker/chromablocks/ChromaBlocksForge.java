package org.waterpicker.chromablocks;

import net.minecraftforge.fml.common.Mod;

@Mod(ChromaBlocks.MOD_ID)
public class ChromaBlocksForge {
	public ChromaBlocksForge() {
		UtilActual.setup();
		ChromaBlocks.init();
	}
}
