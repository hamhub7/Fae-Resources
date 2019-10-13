package com.hamhub7.faeresources.block;

import com.hamhub7.faeresources.FaeResources;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{
    protected String name;

    public BlockBase(Material material, String name)
    {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(FaeResources.creativeTab);
    }

    public void registerItemModel(Item itemBlock)
    {
        FaeResources.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock()
    {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
}
