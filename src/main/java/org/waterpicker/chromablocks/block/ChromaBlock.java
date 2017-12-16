package org.waterpicker.chromablocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyHelper;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nullable;
import java.awt.*;

import static org.waterpicker.chromablocks.ChromaBlocks.MODID;

public class ChromaBlock extends BlockColored {
    public final String ID = "chroma";
    public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);

    public ChromaBlock() {
        super(Material.IRON);
        this.setRegistryName(MODID, ID);
        this.setUnlocalizedName(this.getRegistryName().toString());
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setLightLevel(1.0F);
    }
}
