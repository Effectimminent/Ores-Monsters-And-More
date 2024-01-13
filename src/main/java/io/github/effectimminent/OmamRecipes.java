package io.github.effectimminent;

import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OmamRecipes {
    public static void  register()
    {
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_axe),new Object[] {"cc ", "cs "," s ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_axe),new Object[] {" cc", " sc"," s ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_axe),new Object[] {" cc", " cs"," s ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_axe),new Object[] {"cc ", "sc ","s  ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_pickaxe),new Object[] {"ccc", " s "," s ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_hoe),new Object[] {"cc ", " s "," s ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_hoe),new Object[] {" cc", " s "," s ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_hoe),new Object[] {" cc", "  s","  s", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_hoe),new Object[] {"cc ", "s  ","s  ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_sword),new Object[] {"c  ", "c  ","s  ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_sword),new Object[] {" c ", " c "," s ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_sword),new Object[] {"  c", "  c","  s", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_shovel),new Object[] {"c  ", "s  ","s  ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_shovel),new Object[] {" c ", " s "," s ", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_shovel),new Object[] {"  c", "  s","  s", 'c' ,Items.dye,1 ,4, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_axe),new Object[] {"cc ", "cs "," s ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_axe),new Object[] {" cc", " sc"," s ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_axe),new Object[] {" cc", " cs"," s ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_axe),new Object[] {"cc ", "sc ","s  ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_pickaxe),new Object[] {"ccc", " s "," s ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_hoe),new Object[] {"cc ", " s "," s ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_hoe),new Object[] {" cc", " s "," s ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_hoe),new Object[] {" cc", "  s","  s", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_hoe),new Object[] {"cc ", "s  ","s  ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_sword),new Object[] {"c  ", "c  ","s  ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_sword),new Object[] {" c ", " c "," s ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_sword),new Object[] {"  c", "  c","  s", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_shovel),new Object[] {"c  ", "s  ","s  ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_shovel),new Object[] {" c ", " s "," s ", 'c' ,Items.emerald, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_shovel),new Object[] {"  c", "  s","  s", 'c' ,Items.emerald, 's', Items.stick });
        

    }
}
