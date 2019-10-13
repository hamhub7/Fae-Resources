package com.hamhub7.faeresources.block;

import net.minecraft.block.material.Material;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOreDict extends BlockBase
{
    private String oreName;

    public BlockOreDict(Material material, String name, String oreName)
    {
        super(material, name);
        this.oreName = oreName;
    }

    public void initOreDict()
    {
        OreDictionary.registerOre(oreName, this);
    }
}
