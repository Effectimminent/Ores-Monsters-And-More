package io.github.effectimminent;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OmamItems {
    public static Item copper_ingot;

    public static void init(){
        copper_ingot = new Item().setUnlocalizedName("copper_ingot");
    }
    public static void register(){
        GameRegistry.registerItem(copper_ingot,copper_ingot.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){
        registerRender(copper_ingot);
    }
    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    public static void registerRender(Item item, int meta, String fileName) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + fileName, "inventory"));
    }
}
