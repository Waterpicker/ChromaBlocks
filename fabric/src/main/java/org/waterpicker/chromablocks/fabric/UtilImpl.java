package org.waterpicker.chromablocks.fabric;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

public class UtilImpl {
	public static AbstractBlock.Settings chromaProperties() {
		return FabricBlockSettings.of(Material.METAL).lightLevel(value -> 15).breakByTool(FabricToolTags.PICKAXES, 1);
	}
}
