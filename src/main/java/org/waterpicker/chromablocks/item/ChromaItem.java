package org.waterpicker.chromablocks.item;

import org.waterpicker.chromablocks.block.ChromaBlock;
import net.minecraft.item.ItemBlock;

import static org.waterpicker.chromablocks.ChromaBlocks.MODID;

public class ChromaItem extends ItemBlock {

    public ChromaItem(ChromaBlock block) {
        super(block);
        this.setRegistryName(MODID, block.getID());
        this.setUnlocalizedName(block.getID());
    }
}
