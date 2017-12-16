package org.waterpicker.chromablocks.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import static org.waterpicker.chromablocks.block.ModBlocks.CHROMA;

public class ChromaItem extends ItemBlock {
    public ChromaItem() {
        super(CHROMA);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHasSubtypes(true);
        setRegistryName(CHROMA.ID);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "_" + EnumDyeColor.byMetadata(getDamage(stack));
    }

}
