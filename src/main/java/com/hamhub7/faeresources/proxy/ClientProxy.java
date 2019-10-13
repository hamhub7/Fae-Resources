package com.hamhub7.faeresources.proxy;

import com.hamhub7.faeresources.FaeResources;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
    public void registerItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(FaeResources.MODID + ":" + id, "inventory"));
    }

    public void registerVariantRenderer(Item item, int meta, String filename, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(FaeResources.MODID, filename), id));
    }

    public void registerRenderers()
    {

    }

    @Override
    public String localize(String unlocalized, Object... args)
    {
        return I18n.format(unlocalized, args);
    }
}
