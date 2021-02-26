package org.waterpicker.chromablocks;

import java.util.function.Consumer;
import java.util.function.Supplier;

import net.minecraft.block.Block;

@FunctionalInterface
public interface BlockRegister {
	Supplier<Block> register(String id, Supplier<Block> block);
}
