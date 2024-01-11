package io.github.effectimminent;

import io.github.effectimminent.Items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
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
    //sapphire items
    /** these items were made using the actual mechanical property's of sapphire converted to minecraft sapphire is only slightly softer than diamond so its damage value was set to 0.5 less and efficiency was set one lower harvest level was kept the same for the aforementioned reason and sapphire is about twice as durable as diamond so its durability was doubled*/
    public static Item sapphire;
    public static Item sapphire_pickaxe;
    public static Item sapphire_axe;
    public static Item sapphire_shovel;
    public static Item sapphire_hoe;
    public static Item sapphire_sword;
    public static final Item.ToolMaterial sapphireToolMaterial = EnumHelper.addToolMaterial("sapphireToolMaterial",3,3000,7.0F,2.5F,10);
    public static ItemArmor.ArmorMaterial sapphireArmorMaterial= EnumHelper.addArmorMaterial("sapphireArmorMaterial","Omam:sapphire_layer_1",66,new int[]{4,9,6,3},50);
    public static Item sapphire_helmet;
    public static Item sapphire_chestplate;
    public static Item sapphire_leggings;
    public static Item sapphire_boots;
    public static Item emerald_pickaxe;
    public static Item emerald_axe;
    public static Item emerald_shovel;
    public static Item emerald_hoe;
    public static Item emerald_sword;
    public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial",3,750,6.4F,1.6F,100);
    public static ItemArmor.ArmorMaterial emeraldArmorMaterial= EnumHelper.addArmorMaterial("emeraldArmorMaterial","Omam:emerald_layer_1",16,new int[]{3,7,6,3},100);
    public static Item emerald_helmet;
    public static Item emerald_chestplate;
    public static Item emerald_leggings;
    public static Item emerald_boots;

    public static void init(){
        copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(OresMonstersAndMore.items);
        copper_pickaxe = new ItemCopperPickaxe(copperToolMaterial).setUnlocalizedName("copper_pickaxe").setCreativeTab(OresMonstersAndMore.items);
        copper_axe = new ItemCopperAxe(copperToolMaterial).setUnlocalizedName("copper_axe").setCreativeTab(OresMonstersAndMore.items);
        copper_shovel = new ItemCopperShovel(copperToolMaterial).setUnlocalizedName("copper_shovel").setCreativeTab(OresMonstersAndMore.items);
        copper_hoe = new ItemCopperHoe(copperToolMaterial).setUnlocalizedName("copper_hoe").setCreativeTab(OresMonstersAndMore.items);
        copper_sword = new ItemCopperSword(copperToolMaterial).setUnlocalizedName("copper_sword").setCreativeTab(OresMonstersAndMore.items);
        sapphire = new Item().setUnlocalizedName("sapphire").setCreativeTab(OresMonstersAndMore.items);
        sapphire_pickaxe = new ItemSapphirePickaxe(sapphireToolMaterial).setUnlocalizedName("sapphire_pickaxe").setCreativeTab(OresMonstersAndMore.items);
        sapphire_axe = new ItemSapphireAxe(sapphireToolMaterial).setUnlocalizedName("sapphire_axe").setCreativeTab(OresMonstersAndMore.items);
        sapphire_shovel = new ItemSapphireShovel(sapphireToolMaterial).setUnlocalizedName("sapphire_shovel").setCreativeTab(OresMonstersAndMore.items);
        sapphire_hoe = new ItemSapphireHoe(sapphireToolMaterial).setUnlocalizedName("sapphire_hoe").setCreativeTab(OresMonstersAndMore.items);
        sapphire_sword = new ItemSapphireSword(sapphireToolMaterial).setUnlocalizedName("sapphire_sword").setCreativeTab(OresMonstersAndMore.items);
        sapphire_helmet = new ItemSapphireArmor(sapphireArmorMaterial,0,0).setUnlocalizedName("sapphire_helmet").setCreativeTab(OresMonstersAndMore.items);
        sapphire_chestplate = new ItemSapphireArmor(sapphireArmorMaterial,0,1).setUnlocalizedName("sapphire_chestplate").setCreativeTab(OresMonstersAndMore.items);
        sapphire_leggings = new ItemSapphireArmor(sapphireArmorMaterial,1,2).setUnlocalizedName("sapphire_leggings").setCreativeTab(OresMonstersAndMore.items);
        emerald_boots = new ItemEmeraldArmor(emeraldArmorMaterial,0,3).setUnlocalizedName("emerald_boots").setCreativeTab(OresMonstersAndMore.items);
        emerald_pickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial).setUnlocalizedName("emerald_pickaxe").setCreativeTab(OresMonstersAndMore.items);
        emerald_axe = new ItemEmeraldAxe(emeraldToolMaterial).setUnlocalizedName("emerald_axe").setCreativeTab(OresMonstersAndMore.items);
        emerald_shovel = new ItemEmeraldShovel(emeraldToolMaterial).setUnlocalizedName("emerald_shovel").setCreativeTab(OresMonstersAndMore.items);
        emerald_hoe = new ItemEmeraldHoe(emeraldToolMaterial).setUnlocalizedName("emerald_hoe").setCreativeTab(OresMonstersAndMore.items);
        emerald_sword = new ItemEmeraldSword(emeraldToolMaterial).setUnlocalizedName("emerald_sword").setCreativeTab(OresMonstersAndMore.items);
        emerald_helmet = new ItemEmeraldArmor(emeraldArmorMaterial,0,0).setUnlocalizedName("emerald_helmet").setCreativeTab(OresMonstersAndMore.items);
        emerald_chestplate = new ItemEmeraldArmor(emeraldArmorMaterial,0,1).setUnlocalizedName("emerald_chestplate").setCreativeTab(OresMonstersAndMore.items);
        emerald_leggings = new ItemEmeraldArmor(emeraldArmorMaterial,1,2).setUnlocalizedName("emerald_leggings").setCreativeTab(OresMonstersAndMore.items);
        emerald_boots = new ItemEmeraldArmor(emeraldArmorMaterial,0,3).setUnlocalizedName("emerald_boots").setCreativeTab(OresMonstersAndMore.items);

    }
    public static void register(){
        GameRegistry.registerItem(copper_ingot,copper_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_pickaxe,copper_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_axe,copper_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_shovel,copper_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_hoe,copper_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_sword,copper_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire,sapphire.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_pickaxe,sapphire_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_axe,sapphire_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_shovel,sapphire_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_hoe,sapphire_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_sword,sapphire_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_helmet,sapphire_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_chestplate,sapphire_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_leggings,sapphire_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(sapphire_boots,sapphire_boots.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_pickaxe,emerald_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_axe,emerald_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_shovel,emerald_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_hoe,emerald_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_sword,emerald_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_helmet,emerald_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_chestplate,emerald_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_leggings,emerald_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(emerald_boots,emerald_boots.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){

        registerRender(copper_ingot);
        registerRender(copper_pickaxe);
        registerRender(copper_axe);
        registerRender(copper_shovel);
        registerRender(copper_hoe);
        registerRender(copper_sword);
        registerRender(sapphire);
        registerRender(sapphire_pickaxe);
        registerRender(sapphire_axe);
        registerRender(sapphire_shovel);
        registerRender(sapphire_hoe);
        registerRender(sapphire_sword);
        registerRender(sapphire_helmet);
        registerRender(sapphire_chestplate);
        registerRender(sapphire_leggings);
        registerRender(sapphire_boots);
        registerRender(emerald_pickaxe);
        registerRender(emerald_axe);
        registerRender(emerald_shovel);
        registerRender(emerald_hoe);
        registerRender(emerald_sword);
        registerRender(emerald_helmet);
        registerRender(emerald_chestplate);
        registerRender(emerald_leggings);
        registerRender(emerald_boots);

    }
    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    public static void registerRender(Item item, int meta, String fileName) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + fileName, "inventory"));
    }
}
