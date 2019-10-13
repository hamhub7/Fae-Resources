package com.hamhub7.faeresources.item;

import com.hamhub7.faeresources.FaeResources;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemSubtypes extends ItemBase
{
    //Number of subitems
    protected int subItems;

    public ItemSubtypes(String name, int subItems)
    {
        super(name);
        this.subItems = subItems;
        setHasSubtypes(true);
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if(this.isInCreativeTab(tab))
        {
            for(int i = 0; i < subItems; i++)
            {
                items.add(new ItemStack(this, 1, i));
            }
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        int meta = stack.getMetadata();
        if(meta < subItems)
        {
            return super.getUnlocalizedName() + "." + meta;
        }

        return super.getUnlocalizedName();
    }

    @Override
    public void registerItemModel()
    {
        for(int meta = 0; meta < subItems; meta++)
        {
            FaeResources.proxy.registerVariantRenderer(this, meta, name + "_" + meta, "inventory");
        }
    }
}
