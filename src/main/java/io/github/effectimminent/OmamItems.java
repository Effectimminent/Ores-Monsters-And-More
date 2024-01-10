package io.github.effectimminent;

import io.github.effectimminent.Items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OmamItems {
    //copper items
    public static Item copper_ingot;
    public static Item copper_pickaxe;
    public static Item copper_axe;
    public static Item copper_shovel;
    public static Item copper_hoe;
    public static Item copper_sword;
    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("copperToolMaterial",1,102,2.45210728F,1,4);

    public static void init(){
        copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(OresMonstersAndMore.items);
        copper_pickaxe = new ItemCopperPickaxe(copperToolMaterial).setUnlocalizedName("copper_pickaxe").setCreativeTab(OresMonstersAndMore.items);
        copper_axe = new ItemCopperAxe(copperToolMaterial).setUnlocalizedName("copper_axe").setCreativeTab(OresMonstersAndMore.items);
        copper_shovel = new ItemCopperShovel(copperToolMaterial).setUnlocalizedName("copper_shovel").setCreativeTab(OresMonstersAndMore.items);
        copper_hoe = new ItemCopperHoe(copperToolMaterial).setUnlocalizedName("copper_hoe").setCreativeTab(OresMonstersAndMore.items);
        copper_sword = new ItemCopperSword(copperToolMaterial).setUnlocalizedName("copper_sword").setCreativeTab(OresMonstersAndMore.items);


    }
    public static void register(){
        GameRegistry.registerItem(copper_ingot,copper_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_pickaxe,copper_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_axe,copper_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_shovel,copper_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_hoe,copper_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_sword,copper_sword.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){

        registerRender(copper_ingot);
        registerRender(copper_pickaxe);
        registerRender(copper_axe);
        registerRender(copper_shovel);
        registerRender(copper_hoe);
        registerRender(copper_sword);
    }
    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    public static void registerRender(Item item, int meta, String fileName) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + fileName, "inventory"));
    }
}
