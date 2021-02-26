package org.waterpicker.chromablocks;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.item.DyeItem;

public class Group {
	private final Supplier<DyeItem> item;
	private final Block block;
	private final Block stairs;
	private final Block slab;
	private final Block wall;
	private final Block door;
	private final Block trapDoor;
	private final Block button;

	Group(Supplier<DyeItem> item, Block block, Block stairs, Block slab, Block wall, Block door, Block trapDoor, Block button) {
		this.item = item;
		this.block = block;
		this.stairs = stairs;
		this.slab = slab;
		this.wall = wall;
		this.door = door;
		this.trapDoor = trapDoor;
		this.button = button;
	}

	public Block getBlock() {
		return block;
	}

	public Block getStairs() {
		return stairs;
	}

	public Block getSlab() {
		return slab;
	}

	public Block getWall() {
		return wall;
	}

	public Block getDoor() {
		return door;
	}

	public Block getTrapDoor() {
		return trapDoor;
	}

	public Block getButton() {
		return button;
	}

	public DyeItem getItem() {
		return item.get();
	}
}
