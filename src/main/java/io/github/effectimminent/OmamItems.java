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
    public static Item copper_helmet;
    public static Item copper_chestplate;
    public static Item copper_leggings;
    public static Item copper_boots;
    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("copperToolMaterial",1,102,2.45210728F,1,4);
    public static ItemArmor.ArmorMaterial copperArmorMaterial= EnumHelper.addArmorMaterial("copperArmorMaterial","Omam:copper_layer_1",6,new int[]{1,2,2,1},4);
    //sapphire items
    /** these items were made using the actual mechanical property's of sapphire converted to minecraft sapphire is only slightly softer than diamond so its damage value was set to 0.5 less and efficiency was set one lower harvest level was kept the same for the aforementioned reason and sapphire is about twice as durable as diamond so its durability was doubled*/
    public static Item sapphire;
    public static Item sapphire_pickaxe;
    public static Item sapphire_axe;
    public static Item sapphire_shovel;
    public static Item sapphire_hoe;
    public static Item sapphire_sword;
    public static final Item.ToolMaterial sapphireToolMaterial = EnumHelper.addToolMaterial("sapphireToolMaterial",3,3000,7.0F,2.5F,25);
    public static ItemArmor.ArmorMaterial sapphireArmorMaterial= EnumHelper.addArmorMaterial("sapphireArmorMaterial","Omam:sapphire_layer_1",66,new int[]{4,9,6,3},25);
    public static Item sapphire_helmet;
    public static Item sapphire_chestplate;
    public static Item sapphire_leggings;
    public static Item sapphire_boots;
    public static Item emerald_pickaxe;
    public static Item emerald_axe;
    public static Item emerald_shovel;
    public static Item emerald_hoe;
    public static Item emerald_sword;
    public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial",3,750,6.4F,2.4F,50);
    public static ItemArmor.ArmorMaterial emeraldArmorMaterial= EnumHelper.addArmorMaterial("emeraldArmorMaterial","Omam:emerald_layer_1",26,new int[]{3,7,6,3},50);
    public static Item emerald_helmet;
    public static Item emerald_chestplate;
    public static Item emerald_leggings;
    public static Item emerald_boots;
    public static Item lapis_pickaxe;
    public static Item lapis_axe;
    public static Item lapis_shovel;
    public static Item lapis_hoe;
    public static Item lapis_sword;
    public static final Item.ToolMaterial lapisToolMaterial = EnumHelper.addToolMaterial("lapisToolMaterial",1,375,4.0F,1.5F,100);
    public static ItemArmor.ArmorMaterial lapisArmorMaterial= EnumHelper.addArmorMaterial("lapisArmorMaterial","Omam:lapis_layer_1",16,new int[]{1,4,3,2},100);
    public static Item lapis_helmet;
    public static Item lapis_chestplate;
    public static Item lapis_leggings;
    public static Item lapis_boots;
    public static Item ruby_pickaxe;
    public static Item ruby_axe;
    public static Item ruby_shovel;
    public static Item ruby_hoe;
    public static Item ruby_sword;
    public static final Item.ToolMaterial rubyToolMaterial = EnumHelper.addToolMaterial("rubyToolMaterial",3,2950,7.5F,2.75F,25);
    public static ItemArmor.ArmorMaterial rubyArmorMaterial= EnumHelper.addArmorMaterial("rubyArmorMaterial","Omam:ruby_layer_1",61,new int[]{4,9,6,3},25);
    public static Item ruby_helmet;
    public static Item ruby_chestplate;
    public static Item ruby_leggings;
    public static Item ruby_boots;
    public static Item zircon_pickaxe;
    public static Item zircon_axe;
    public static Item zircon_shovel;
    public static Item zircon_hoe;
    public static Item zircon_sword;
    public static final Item.ToolMaterial zirconToolMaterial = EnumHelper.addToolMaterial("zirconToolMaterial",3,743,6.0F,2.25F,10);
    public static ItemArmor.ArmorMaterial zirconArmorMaterial= EnumHelper.addArmorMaterial("zirconArmorMaterial","Omam:zircon_layer_1",26,new int[]{3,7,6,3},10);
    public static Item zircon_helmet;
    public static Item zircon_chestplate;
    public static Item zircon_leggings;
    public static Item zircon_boots;
    public static Item topaz_pickaxe;
    public static Item topaz_axe;
    public static Item topaz_shovel;
    public static Item topaz_hoe;
    public static Item topaz_sword;
    public static final Item.ToolMaterial topazToolMaterial = EnumHelper.addToolMaterial("topazToolMaterial",3,750,6.4F,2.4F,10);
    public static ItemArmor.ArmorMaterial topazArmorMaterial= EnumHelper.addArmorMaterial("topazArmorMaterial","Omam:topaz_layer_1",61,new int[]{4,9,6,3},10);
    public static Item topaz_helmet;
    public static Item topaz_chestplate;
    public static Item topaz_leggings;
    public static Item topaz_boots;
    public static Item amethyst_pickaxe;
    public static Item amethyst_axe;
    public static Item amethyst_shovel;
    public static Item amethyst_hoe;
    public static Item amethyst_sword;
    public static ItemArmor.ArmorMaterial amethystArmorMaterial= EnumHelper.addArmorMaterial("amethystArmorMaterial","Omam:amethyst_layer_1",6,new int[]{1,1,1,1},50);
    public static final Item.ToolMaterial amethystToolMaterial = EnumHelper.addToolMaterial("amethystToolMaterial",3,300,6.4F,2.4F,50);
    public static Item amethyst_helmet;
    public static Item amethyst_chestplate;
    public static Item amethyst_leggings;
    public static Item amethyst_boots;
    public static Item ruby;
    public static Item topaz;
    public static Item zircon;
    public static Item amethyst;
    public static Item obsidian_pickaxe;
    public static Item obsidian_axe;
    public static Item obsidian_shovel;
    public static Item obsidian_hoe;
    public static Item obsidian_sword;
    public static ItemArmor.ArmorMaterial obsidianArmorMaterial= EnumHelper.addArmorMaterial("obsidianArmorMaterial","Omam:obsidian_layer_1",1,new int[]{1,1,1,1},10);
    public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial",4,100,16.0F,6.0F,10);
    public static Item obsidian_helmet;
    public static Item obsidian_chestplate;
    public static Item obsidian_leggings;
    public static Item obsidian_boots;
    public static void init(){
        //copper_ingot = new Item().setUnlocalizedName("copper_ingot").setCreativeTab(OresMonstersAndMore.resources);
        copper_pickaxe = new ItemCopperPickaxe(copperToolMaterial).setUnlocalizedName("copper_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        copper_axe = new ItemCopperAxe(copperToolMaterial).setUnlocalizedName("copper_axe").setCreativeTab(OresMonstersAndMore.gear);
        copper_shovel = new ItemCopperShovel(copperToolMaterial).setUnlocalizedName("copper_shovel").setCreativeTab(OresMonstersAndMore.gear);
        copper_hoe = new ItemCopperHoe(copperToolMaterial).setUnlocalizedName("copper_hoe").setCreativeTab(OresMonstersAndMore.gear);
        copper_sword = new ItemCopperSword(copperToolMaterial).setUnlocalizedName("copper_sword").setCreativeTab(OresMonstersAndMore.gear);
        copper_helmet = new ItemCopperArmor(copperArmorMaterial,0,0).setUnlocalizedName("copper_helmet").setCreativeTab(OresMonstersAndMore.gear);
        copper_chestplate = new ItemCopperArmor(copperArmorMaterial,0,1).setUnlocalizedName("copper_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        copper_leggings = new ItemCopperArmor(copperArmorMaterial,1,2).setUnlocalizedName("copper_leggings").setCreativeTab(OresMonstersAndMore.gear);
        copper_boots = new ItemCopperArmor(copperArmorMaterial,0,3).setUnlocalizedName("copper_boots").setCreativeTab(OresMonstersAndMore.gear);
        sapphire = new Item().setUnlocalizedName("sapphire").setCreativeTab(OresMonstersAndMore.resources);
        sapphire_pickaxe = new ItemSapphirePickaxe(sapphireToolMaterial).setUnlocalizedName("sapphire_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        sapphire_axe = new ItemSapphireAxe(sapphireToolMaterial).setUnlocalizedName("sapphire_axe").setCreativeTab(OresMonstersAndMore.gear);
        sapphire_shovel = new ItemSapphireShovel(sapphireToolMaterial).setUnlocalizedName("sapphire_shovel").setCreativeTab(OresMonstersAndMore.gear);
        sapphire_hoe = new ItemSapphireHoe(sapphireToolMaterial).setUnlocalizedName("sapphire_hoe").setCreativeTab(OresMonstersAndMore.gear);
        sapphire_sword = new ItemSapphireSword(sapphireToolMaterial).setUnlocalizedName("sapphire_sword").setCreativeTab(OresMonstersAndMore.gear);
        sapphire_helmet = new ItemSapphireArmor(sapphireArmorMaterial,0,0).setUnlocalizedName("sapphire_helmet").setCreativeTab(OresMonstersAndMore.gear);
        sapphire_chestplate = new ItemSapphireArmor(sapphireArmorMaterial,0,1).setUnlocalizedName("sapphire_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        sapphire_leggings = new ItemSapphireArmor(sapphireArmorMaterial,1,2).setUnlocalizedName("sapphire_leggings").setCreativeTab(OresMonstersAndMore.gear);
        sapphire_boots = new ItemSapphireArmor(sapphireArmorMaterial,0,3).setUnlocalizedName("sapphire_boots").setCreativeTab(OresMonstersAndMore.gear);
        emerald_pickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial).setUnlocalizedName("emerald_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        emerald_axe = new ItemEmeraldAxe(emeraldToolMaterial).setUnlocalizedName("emerald_axe").setCreativeTab(OresMonstersAndMore.gear);
        emerald_shovel = new ItemEmeraldShovel(emeraldToolMaterial).setUnlocalizedName("emerald_shovel").setCreativeTab(OresMonstersAndMore.gear);
        emerald_hoe = new ItemEmeraldHoe(emeraldToolMaterial).setUnlocalizedName("emerald_hoe").setCreativeTab(OresMonstersAndMore.gear);
        emerald_sword = new ItemEmeraldSword(emeraldToolMaterial).setUnlocalizedName("emerald_sword").setCreativeTab(OresMonstersAndMore.gear);
        emerald_helmet = new ItemEmeraldArmor(emeraldArmorMaterial,0,0).setUnlocalizedName("emerald_helmet").setCreativeTab(OresMonstersAndMore.gear);
        emerald_chestplate = new ItemEmeraldArmor(emeraldArmorMaterial,0,1).setUnlocalizedName("emerald_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        emerald_leggings = new ItemEmeraldArmor(emeraldArmorMaterial,1,2).setUnlocalizedName("emerald_leggings").setCreativeTab(OresMonstersAndMore.gear);
        emerald_boots = new ItemEmeraldArmor(emeraldArmorMaterial,0,3).setUnlocalizedName("emerald_boots").setCreativeTab(OresMonstersAndMore.gear);
        lapis_pickaxe = new ItemLapisPickaxe(lapisToolMaterial).setUnlocalizedName("lapis_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        lapis_axe = new ItemLapisAxe(lapisToolMaterial).setUnlocalizedName("lapis_axe").setCreativeTab(OresMonstersAndMore.gear);
        lapis_shovel = new ItemLapisShovel(lapisToolMaterial).setUnlocalizedName("lapis_shovel").setCreativeTab(OresMonstersAndMore.gear);
        lapis_hoe = new ItemLapisHoe(lapisToolMaterial).setUnlocalizedName("lapis_hoe").setCreativeTab(OresMonstersAndMore.gear);
        lapis_sword = new ItemLapisSword(lapisToolMaterial).setUnlocalizedName("lapis_sword").setCreativeTab(OresMonstersAndMore.gear);
        lapis_helmet = new ItemLapisArmor(lapisArmorMaterial,0,0).setUnlocalizedName("lapis_helmet").setCreativeTab(OresMonstersAndMore.gear);
        lapis_chestplate = new ItemLapisArmor(lapisArmorMaterial,0,1).setUnlocalizedName("lapis_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        lapis_leggings = new ItemLapisArmor(lapisArmorMaterial,1,2).setUnlocalizedName("lapis_leggings").setCreativeTab(OresMonstersAndMore.gear);
        lapis_boots = new ItemLapisArmor(lapisArmorMaterial,0,3).setUnlocalizedName("lapis_boots").setCreativeTab(OresMonstersAndMore.gear);
        ruby_pickaxe = new ItemRubyPickaxe(rubyToolMaterial).setUnlocalizedName("ruby_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        ruby_axe = new ItemRubyAxe(rubyToolMaterial).setUnlocalizedName("ruby_axe").setCreativeTab(OresMonstersAndMore.gear);
        ruby_shovel = new ItemRubyShovel(rubyToolMaterial).setUnlocalizedName("ruby_shovel").setCreativeTab(OresMonstersAndMore.gear);
        ruby_hoe = new ItemRubyHoe(rubyToolMaterial).setUnlocalizedName("ruby_hoe").setCreativeTab(OresMonstersAndMore.gear);
        ruby_sword = new ItemRubySword(rubyToolMaterial).setUnlocalizedName("ruby_sword").setCreativeTab(OresMonstersAndMore.gear);
        ruby_helmet = new ItemRubyArmor(rubyArmorMaterial,0,0).setUnlocalizedName("ruby_helmet").setCreativeTab(OresMonstersAndMore.gear);
        ruby_chestplate = new ItemRubyArmor(rubyArmorMaterial,0,1).setUnlocalizedName("ruby_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        ruby_leggings = new ItemRubyArmor(rubyArmorMaterial,1,2).setUnlocalizedName("ruby_leggings").setCreativeTab(OresMonstersAndMore.gear);
        ruby_boots = new ItemRubyArmor(rubyArmorMaterial,0,3).setUnlocalizedName("ruby_boots").setCreativeTab(OresMonstersAndMore.gear);
        zircon_pickaxe = new ItemZirconPickaxe(zirconToolMaterial).setUnlocalizedName("zircon_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        zircon_axe = new ItemZirconAxe(zirconToolMaterial).setUnlocalizedName("zircon_axe").setCreativeTab(OresMonstersAndMore.gear);
        zircon_shovel = new ItemZirconShovel(zirconToolMaterial).setUnlocalizedName("zircon_shovel").setCreativeTab(OresMonstersAndMore.gear);
        zircon_hoe = new ItemZirconHoe(zirconToolMaterial).setUnlocalizedName("zircon_hoe").setCreativeTab(OresMonstersAndMore.gear);
        zircon_sword = new ItemZirconSword(zirconToolMaterial).setUnlocalizedName("zircon_sword").setCreativeTab(OresMonstersAndMore.gear);
        zircon_helmet = new ItemZirconArmor(zirconArmorMaterial,0,0).setUnlocalizedName("zircon_helmet").setCreativeTab(OresMonstersAndMore.gear);
        zircon_chestplate = new ItemZirconArmor(zirconArmorMaterial,0,1).setUnlocalizedName("zircon_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        zircon_leggings = new ItemZirconArmor(zirconArmorMaterial,1,2).setUnlocalizedName("zircon_leggings").setCreativeTab(OresMonstersAndMore.gear);
        zircon_boots = new ItemZirconArmor(zirconArmorMaterial,0,3).setUnlocalizedName("zircon_boots").setCreativeTab(OresMonstersAndMore.gear);
        topaz_pickaxe = new ItemTopazPickaxe(topazToolMaterial).setUnlocalizedName("topaz_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        topaz_axe = new ItemTopazAxe(topazToolMaterial).setUnlocalizedName("topaz_axe").setCreativeTab(OresMonstersAndMore.gear);
        topaz_shovel = new ItemTopazShovel(topazToolMaterial).setUnlocalizedName("topaz_shovel").setCreativeTab(OresMonstersAndMore.gear);
        topaz_hoe = new ItemTopazHoe(topazToolMaterial).setUnlocalizedName("topaz_hoe").setCreativeTab(OresMonstersAndMore.gear);
        topaz_sword = new ItemTopazSword(topazToolMaterial).setUnlocalizedName("topaz_sword").setCreativeTab(OresMonstersAndMore.gear);
        topaz_helmet = new ItemTopazArmor(topazArmorMaterial,0,0).setUnlocalizedName("topaz_helmet").setCreativeTab(OresMonstersAndMore.gear);
        topaz_chestplate = new ItemTopazArmor(topazArmorMaterial,0,1).setUnlocalizedName("topaz_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        topaz_leggings = new ItemTopazArmor(topazArmorMaterial,1,2).setUnlocalizedName("topaz_leggings").setCreativeTab(OresMonstersAndMore.gear);
        topaz_boots = new ItemTopazArmor(topazArmorMaterial,0,3).setUnlocalizedName("topaz_boots").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_pickaxe = new ItemAmethystPickaxe(amethystToolMaterial).setUnlocalizedName("amethyst_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_axe = new ItemAmethystAxe(amethystToolMaterial).setUnlocalizedName("amethyst_axe").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_shovel = new ItemAmethystShovel(amethystToolMaterial).setUnlocalizedName("amethyst_shovel").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_hoe = new ItemAmethystHoe(amethystToolMaterial).setUnlocalizedName("amethyst_hoe").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_sword = new ItemAmethystSword(amethystToolMaterial).setUnlocalizedName("amethyst_sword").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_helmet = new ItemAmethystArmor(amethystArmorMaterial,0,0).setUnlocalizedName("amethyst_helmet").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_chestplate = new ItemAmethystArmor(amethystArmorMaterial,0,1).setUnlocalizedName("amethyst_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_leggings = new ItemAmethystArmor(amethystArmorMaterial,1,2).setUnlocalizedName("amethyst_leggings").setCreativeTab(OresMonstersAndMore.gear);
        amethyst_boots = new ItemAmethystArmor(amethystArmorMaterial,0,3).setUnlocalizedName("amethyst_boots").setCreativeTab(OresMonstersAndMore.gear);
        amethyst = new Item().setUnlocalizedName("amethyst").setCreativeTab(OresMonstersAndMore.resources);
        ruby = new Item().setUnlocalizedName("ruby").setCreativeTab(OresMonstersAndMore.resources);
        topaz = new Item().setUnlocalizedName("topaz").setCreativeTab(OresMonstersAndMore.resources);
        zircon = new Item().setUnlocalizedName("zircon").setCreativeTab(OresMonstersAndMore.resources);
        obsidian_pickaxe = new ItemObsidianPickaxe(obsidianToolMaterial).setUnlocalizedName("obsidian_pickaxe").setCreativeTab(OresMonstersAndMore.gear);
        obsidian_axe = new ItemObsidianAxe(obsidianToolMaterial).setUnlocalizedName("obsidian_axe").setCreativeTab(OresMonstersAndMore.gear);
        obsidian_shovel = new ItemObsidianShovel(obsidianToolMaterial).setUnlocalizedName("obsidian_shovel").setCreativeTab(OresMonstersAndMore.gear);
        obsidian_hoe = new ItemObsidianHoe(obsidianToolMaterial).setUnlocalizedName("obsidian_hoe").setCreativeTab(OresMonstersAndMore.gear);
        obsidian_sword = new ItemObsidianSword(obsidianToolMaterial).setUnlocalizedName("obsidian_sword").setCreativeTab(OresMonstersAndMore.gear);
        obsidian_helmet = new ItemObsidianArmor(obsidianArmorMaterial,0,0).setUnlocalizedName("obsidian_helmet").setCreativeTab(OresMonstersAndMore.gear);
        obsidian_chestplate = new ItemObsidianArmor(obsidianArmorMaterial,0,1).setUnlocalizedName("obsidian_chestplate").setCreativeTab(OresMonstersAndMore.gear);
        obsidian_leggings = new ItemObsidianArmor(obsidianArmorMaterial,1,2).setUnlocalizedName("obsidian_leggings").setCreativeTab(OresMonstersAndMore.gear);
        obsidian_boots = new ItemObsidianArmor(obsidianArmorMaterial,0,3).setUnlocalizedName("obsidian_boots").setCreativeTab(OresMonstersAndMore.gear);
    }
    public static void register(){
        GameRegistry.registerItem(copper_ingot,copper_ingot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_pickaxe,copper_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_axe,copper_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_shovel,copper_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_hoe,copper_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_sword,copper_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_helmet,copper_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_chestplate,copper_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_leggings,copper_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(copper_boots,copper_boots.getUnlocalizedName().substring(5));
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
        GameRegistry.registerItem(zircon_pickaxe,zircon_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon_axe,zircon_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon_shovel,zircon_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon_hoe,zircon_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon_sword,zircon_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon_helmet,zircon_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon_chestplate,zircon_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon_leggings,zircon_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon_boots,zircon_boots.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_pickaxe,topaz_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_axe,topaz_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_shovel,topaz_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_hoe,topaz_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_sword,topaz_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_helmet,topaz_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_chestplate,topaz_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_leggings,topaz_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz_boots,topaz_boots.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_pickaxe,amethyst_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_axe,amethyst_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_shovel,amethyst_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_hoe,amethyst_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_sword,amethyst_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_helmet,amethyst_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_chestplate,amethyst_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_leggings,amethyst_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst_boots,amethyst_boots.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(ruby,ruby.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(topaz,topaz.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(zircon,zircon.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(amethyst,amethyst.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_pickaxe,obsidian_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_axe,obsidian_axe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_shovel,obsidian_shovel.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_hoe,obsidian_hoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_sword,obsidian_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_helmet,obsidian_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_chestplate,obsidian_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_leggings,obsidian_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(obsidian_boots,obsidian_boots.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){

        registerRender(copper_ingot);
        registerRender(copper_pickaxe);
        registerRender(copper_axe);
        registerRender(copper_shovel);
        registerRender(copper_hoe);
        registerRender(copper_sword);
        registerRender(copper_helmet);
        registerRender(copper_chestplate);
        registerRender(copper_leggings);
        registerRender(copper_boots);
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
        registerRender(zircon_pickaxe);
        registerRender(zircon_axe);
        registerRender(zircon_shovel);
        registerRender(zircon_hoe);
        registerRender(zircon_sword);
        registerRender(zircon_helmet);
        registerRender(zircon_chestplate);
        registerRender(zircon_leggings);
        registerRender(zircon_boots);
        registerRender(topaz_pickaxe);
        registerRender(topaz_axe);
        registerRender(topaz_shovel);
        registerRender(topaz_hoe);
        registerRender(topaz_sword);
        registerRender(topaz_helmet);
        registerRender(topaz_chestplate);
        registerRender(topaz_leggings);
        registerRender(topaz_boots);
        registerRender(amethyst_pickaxe);
        registerRender(amethyst_axe);
        registerRender(amethyst_shovel);
        registerRender(amethyst_hoe);
        registerRender(amethyst_sword);
        registerRender(amethyst_helmet);
        registerRender(amethyst_chestplate);
        registerRender(amethyst_leggings);
        registerRender(amethyst_boots);
        registerRender(ruby);
        registerRender(topaz);
        registerRender(zircon);
        registerRender(amethyst);
        registerRender(obsidian_pickaxe);
        registerRender(obsidian_axe);
        registerRender(obsidian_shovel);
        registerRender(obsidian_hoe);
        registerRender(obsidian_sword);
        registerRender(obsidian_helmet);
        registerRender(obsidian_chestplate);
        registerRender(obsidian_leggings);
        registerRender(obsidian_boots);

    }
    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    public static void registerRender(Item item, int meta, String fileName) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + fileName, "inventory"));
    }
}
