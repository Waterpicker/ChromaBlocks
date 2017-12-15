package chromablocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import static chromablocks.ChromaBlocks.MODID;

public class ChromaBlock extends Block {
    private String id;

    public ChromaBlock(String id) {
        super(Material.IRON);
        this.id = id;
        this.setRegistryName(MODID, id);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }

    public String getID() { return id; }
}