package chromablocks.item;

import chromablocks.block.ChromaBlock;
import chromablocks.block.ModBlocks;
import net.minecraft.item.ItemBlock;

import static chromablocks.ChromaBlocks.MODID;

public class ChromaItem extends ItemBlock {

    public ChromaItem(ChromaBlock block) {
        super(block);
        this.setRegistryName(MODID, block.getID());
        this.setUnlocalizedName(block.getID());
    }
}
