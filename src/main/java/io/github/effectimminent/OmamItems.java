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
    public static final Item.ToolMaterial sapphireToolMaterial = EnumHelper.addToolMaterial("sapphireToolMaterial",3,3000,7.0F,2.5F,50);
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
    public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial",3,750,6.4F,2.4F,100);
    public static ItemArmor.ArmorMaterial emeraldArmorMaterial= EnumHelper.addArmorMaterial("emeraldArmorMaterial","Omam:emerald_layer_1",26,new int[]{3,7,6,3},100);
    public static Item emerald_helmet;
    public static Item emerald_chestplate;
    public static Item emerald_leggings;
    public static Item emerald_boots;
    public static Item lapis_pickaxe;
    public static Item lapis_axe;
    public static Item lapis_shovel;
    public static Item lapis_hoe;
    public static Item lapis_sword;
    public static final Item.ToolMaterial lapisToolMaterial = EnumHelper.addToolMaterial("lapisToolMaterial",1,375,6.4F,1.5F,1000);
    public static ItemArmor.ArmorMaterial lapisArmorMaterial= EnumHelper.addArmorMaterial("lapisArmorMaterial","Omam:lapis_layer_1",16,new int[]{1,4,3,2},1000);
    public static Item lapis_helmet;
    public static Item lapis_chestplate;
    public static Item lapis_leggings;
    public static Item lapis_boots;
    public static Item ruby_pickaxe;
    public static Item ruby_axe;
    public static Item ruby_shovel;
    public static Item ruby_hoe;
    public static Item ruby_sword;
    public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial",3,2950,7.5F,2.75F,50);
    public static ItemArmor.ArmorMaterial rubyArmorMaterial= EnumHelper.addArmorMaterial("rubyArmorMaterial","Omam:ruby_layer_1",16,new int[]{4,9,6,3},50);
    public static Item ruby_helmet;
    public static Item ruby_chestplate;
    public static Item ruby_leggings;
    public static Item ruby_boots;

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
        sapphire_boots = new ItemSapphireArmor(sapphireArmorMaterial,0,3).setUnlocalizedName("sapphire_boots").setCreativeTab(OresMonstersAndMore.items);
        emerald_pickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial).setUnlocalizedName("emerald_pickaxe").setCreativeTab(OresMonstersAndMore.items);
        emerald_axe = new ItemEmeraldAxe(emeraldToolMaterial).setUnlocalizedName("emerald_axe").setCreativeTab(OresMonstersAndMore.items);
        emerald_shovel = new ItemEmeraldShovel(emeraldToolMaterial).setUnlocalizedName("emerald_shovel").setCreativeTab(OresMonstersAndMore.items);
        emerald_hoe = new ItemEmeraldHoe(emeraldToolMaterial).setUnlocalizedName("emerald_hoe").setCreativeTab(OresMonstersAndMore.items);
        emerald_sword = new ItemEmeraldSword(emeraldToolMaterial).setUnlocalizedName("emerald_sword").setCreativeTab(OresMonstersAndMore.items);
        emerald_helmet = new ItemEmeraldArmor(emeraldArmorMaterial,0,0).setUnlocalizedName("emerald_helmet").setCreativeTab(OresMonstersAndMore.items);
        emerald_chestplate = new ItemEmeraldArmor(emeraldArmorMaterial,0,1).setUnlocalizedName("emerald_chestplate").setCreativeTab(OresMonstersAndMore.items);
        emerald_leggings = new ItemEmeraldArmor(emeraldArmorMaterial,1,2).setUnlocalizedName("emerald_leggings").setCreativeTab(OresMonstersAndMore.items);
        emerald_boots = new ItemEmeraldArmor(emeraldArmorMaterial,0,3).setUnlocalizedName("emerald_boots").setCreativeTab(OresMonstersAndMore.items);
        lapis_pickaxe = new ItemLapisPickaxe(lapisToolMaterial).setUnlocalizedName("lapis_pickaxe").setCreativeTab(OresMonstersAndMore.items);
        lapis_axe = new ItemLapisAxe(lapisToolMaterial).setUnlocalizedName("lapis_axe").setCreativeTab(OresMonstersAndMore.items);
        lapis_shovel = new ItemLapisShovel(lapisToolMaterial).setUnlocalizedName("lapis_shovel").setCreativeTab(OresMonstersAndMore.items);
        lapis_hoe = new ItemLapisHoe(lapisToolMaterial).setUnlocalizedName("lapis_hoe").setCreativeTab(OresMonstersAndMore.items);
        lapis_sword = new ItemLapisSword(lapisToolMaterial).setUnlocalizedName("lapis_sword").setCreativeTab(OresMonstersAndMore.items);
        lapis_helmet = new ItemLapisArmor(lapisArmorMaterial,0,0).setUnlocalizedName("lapis_helmet").setCreativeTab(OresMonstersAndMore.items);
        lapis_chestplate = new ItemLapisArmor(lapisArmorMaterial,0,1).setUnlocalizedName("lapis_chestplate").setCreativeTab(OresMonstersAndMore.items);
        lapis_leggings = new ItemLapisArmor(lapisArmorMaterial,1,2).setUnlocalizedName("lapis_leggings").setCreativeTab(OresMonstersAndMore.items);
        lapis_boots = new ItemLapisArmor(lapisArmorMaterial,0,3).setUnlocalizedName("lapis_boots").setCreativeTab(OresMonstersAndMore.items);
        ruby_pickaxe = new ItemRubyPickaxe(rubyToolMaterial).setUnlocalizedName("ruby_pickaxe").setCreativeTab(OresMonstersAndMore.items);
        ruby_axe = new ItemRubyAxe(rubyToolMaterial).setUnlocalizedName("ruby_axe").setCreativeTab(OresMonstersAndMore.items);
        ruby_shovel = new ItemRubyShovel(rubyToolMaterial).setUnlocalizedName("ruby_shovel").setCreativeTab(OresMonstersAndMore.items);
        ruby_hoe = new ItemRubyHoe(rubyToolMaterial).setUnlocalizedName("ruby_hoe").setCreativeTab(OresMonstersAndMore.items);
        ruby_sword = new ItemRubySword(rubyToolMaterial).setUnlocalizedName("ruby_sword").setCreativeTab(OresMonstersAndMore.items);
        ruby_helmet = new ItemRubyArmor(rubyArmorMaterial,0,0).setUnlocalizedName("ruby_helmet").setCreativeTab(OresMonstersAndMore.items);
        ruby_chestplate = new ItemRubyArmor(rubyArmorMaterial,0,1).setUnlocalizedName("ruby_chestplate").setCreativeTab(OresMonstersAndMore.items);
        ruby_leggings = new ItemRubyArmor(rubyArmorMaterial,1,2).setUnlocalizedName("ruby_leggings").setCreativeTab(OresMonstersAndMore.items);
        ruby_boots = new ItemRubyArmor(rubyArmorMaterial,0,3).setUnlocalizedName("ruby_boots").setCreativeTab(OresMonstersAndMore.items);


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
        GameRegistry.registerItem(lapis_pickaxe,lapis_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_axe,lapis_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_shovel,lapis_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_hoe,lapis_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_sword,lapis_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_helmet,lapis_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_chestplate,lapis_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_leggings,lapis_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(lapis_boots,lapis_boots.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_pickaxe,ruby_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_axe,ruby_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_shovel,ruby_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_hoe,ruby_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_sword,ruby_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_helmet,ruby_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_chestplate,ruby_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_leggings,ruby_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby_boots,ruby_boots.getUnlocalizedName().substring(5));
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
        registerRender(lapis_pickaxe);
        registerRender(lapis_axe);
        registerRender(lapis_shovel);
        registerRender(lapis_hoe);
        registerRender(lapis_sword);
        registerRender(lapis_helmet);
        registerRender(lapis_chestplate);
        registerRender(lapis_leggings);
        registerRender(lapis_boots);
        registerRender(ruby_pickaxe);
        registerRender(ruby_axe);
        registerRender(ruby_shovel);
        registerRender(ruby_hoe);
        registerRender(ruby_sword);
        registerRender(ruby_helmet);
        registerRender(ruby_chestplate);
        registerRender(ruby_leggings);
        registerRender(ruby_boots);

    }
    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    public static void registerRender(Item item, int meta, String fileName) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + fileName, "inventory"));
    }
}
