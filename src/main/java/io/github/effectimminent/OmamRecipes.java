package io.github.effectimminent;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OmamRecipes {
    public static void  register()
    {
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_axe),new Object[] {"cc ", "cs "," s ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_axe),new Object[] {" cc", " sc"," s ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_axe),new Object[] {" cc", " cs"," s ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_axe),new Object[] {"cc ", "sc ","s  ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
    }
}
