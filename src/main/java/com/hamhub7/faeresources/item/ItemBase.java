package com.hamhub7.faeresources.item;

import com.hamhub7.faeresources.FaeResources;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    protected String name;

    public ItemBase(String name)
    {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(FaeResources.creativeTab);
    }

    public void registerItemModel()
    {
        FaeResources.proxy.registerItemRenderer(this, 0, name);
    }
}
