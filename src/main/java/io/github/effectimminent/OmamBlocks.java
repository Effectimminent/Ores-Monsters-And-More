package io.github.effectimminent;

import io.github.effectimminent.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OmamBlocks {
    public static Block copper_block;
    public static Block sapphire_block;
    public static Block ruby_block;
    public static Block topaz_block;
    public static Block zircon_block;
    public static Block amethyst_block;

    public static void init() {
        copper_block = new BlockCopperBlock(Material.iron).setUnlocalizedName("copper_block").setCreativeTab(OresMonstersAndMore.items);
        sapphire_block = new BlockCopperBlock(Material.rock).setUnlocalizedName("sapphire_block").setCreativeTab(OresMonstersAndMore.items);
        ruby_block = new BlockRubyBlock(Material.rock).setUnlocalizedName("ruby_block").setCreativeTab(OresMonstersAndMore.items);
        topaz_block = new BlockTopazBlock(Material.rock).setUnlocalizedName("topaz_block").setCreativeTab(OresMonstersAndMore.items);
        zircon_block = new BlockZirconBlock(Material.rock).setUnlocalizedName("zircon_block").setCreativeTab(OresMonstersAndMore.items);
        amethyst_block = new BlockAmethystBlock(Material.rock).setUnlocalizedName("amethyst_block").setCreativeTab(OresMonstersAndMore.items);
    }
    public static void register(){
        GameRegistry.registerBlock(copper_block, copper_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(sapphire_block, sapphire_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(ruby_block, ruby_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(topaz_block, topaz_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(zircon_block,zircon_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(amethyst_block,amethyst_block.getUnlocalizedName().substring(5));
    }
    public static void registerRenders(){
        registerRender(copper_block,0,"copper_block");
        registerRender(sapphire_block,0,"sapphire_block");
        registerRender(ruby_block,0,"copper_block");
        registerRender(topaz_block,0,"sapphire_block");
        registerRender(zircon_block,0,"copper_block");
        registerRender(amethyst_block,0,"sapphire_block");
    }
    public static void registerRender(Block block,int meta,String filename)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + filename, "inventory"));
    }
}
