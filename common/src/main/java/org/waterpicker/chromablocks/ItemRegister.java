package org.waterpicker.chromablocks;

import java.util.function.Consumer;
import java.util.function.Supplier;

import net.minecraft.item.Item;

public interface ItemRegister {
	void register(String id, Supplier<Item> item);
}
