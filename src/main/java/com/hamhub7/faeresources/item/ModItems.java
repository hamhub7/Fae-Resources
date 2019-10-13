package com.hamhub7.faeresources.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    // 0:fairy dust 1:diamond dust
    public static ItemSubtypes dusts = new ItemSubtypes("dust", 2);

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
            dusts
        );
    }

    public static void registerModels()
    {
        dusts.registerItemModel();
    }
}
