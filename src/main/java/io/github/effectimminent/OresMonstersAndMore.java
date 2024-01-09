package io.github.effectimminent;

import io.github.effectimminent.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class OresMonstersAndMore {
    @Mod.Instance("OMAM")
    public static OresMonstersAndMore instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs items = new OmamTab("OmamTab");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        OmamItems.init();
        OmamItems.registerRenders();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
