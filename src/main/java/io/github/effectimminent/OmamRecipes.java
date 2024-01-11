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
        GameRegistry.addRecipe(new ItemStack(OmamBlocks.copper_block),new Object[] {"ccc", "ccc","ccc", 'c' ,OmamItems.copper_ingot});
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_pickaxe),new Object[] {"ccc", " s "," s ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_hoe),new Object[] {"cc ", " s "," s ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_hoe),new Object[] {" cc", " s "," s ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_hoe),new Object[] {" cc", "  s","  s", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_hoe),new Object[] {"cc ", "s  ","s  ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_sword),new Object[] {"c  ", "c  ","s  ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_sword),new Object[] {" c ", " c "," s ", 'c' ,OmamItems.copper_ingot, 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.copper_sword),new Object[] {"  c", "  c","  s", 'c' ,OmamItems.copper_ingot, 's', Items.stick });

    }
}