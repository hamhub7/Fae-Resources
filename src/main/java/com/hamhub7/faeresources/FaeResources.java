package com.hamhub7.faeresources;

import com.hamhub7.faeresources.block.ModBlocks;
import com.hamhub7.faeresources.item.ModItems;
import com.hamhub7.faeresources.proxy.CommonProxy;
import com.hamhub7.faeresources.tabs.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FaeResources.MODID, name = FaeResources.NAME, version = FaeResources.VERSION)
public class FaeResources
{
    public static final String MODID = "faeresources";
    public static final String NAME = "Fae Resources";
    public static final String VERSION = "1.0";
    private static Logger logger;

    @Mod.Instance(MODID)
    public static FaeResources instance;

    @SidedProxy(serverSide = "com.hamhub7.faeresources.proxy.CommonProxy", clientSide = "com.hamhub7.faeresources.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final CreativeTab creativeTab = new CreativeTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("{} is preinitializing", NAME);

        proxy.registerRenderers();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("{} is initializing", NAME);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        logger.info("{} is postnitializing", NAME);
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {
            ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }
    }
}
