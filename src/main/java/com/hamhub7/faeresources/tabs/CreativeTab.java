package com.hamhub7.faeresources.tabs;

import com.hamhub7.faeresources.FaeResources;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs
{
    public CreativeTab()
    {
        super(FaeResources.MODID);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(Blocks.PUMPKIN);
    }
}
