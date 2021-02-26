package org.waterpicker.chromablocks.forge;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;

import net.minecraftforge.common.ToolType;

public class UtilImpl {
	public static AbstractBlock.Settings chromaProperties() {
		return AbstractBlock.Settings.of(Material.METAL).luminance(value -> 15).harvestTool(ToolType.PICKAXE).harvestLevel(1);
	}
}
