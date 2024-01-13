package io.github.effectimminent;

import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OmamRecipes {
    public static void  register()
    {
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_axe),new Object[] {"cc ", "cs "," s ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_axe),new Object[] {" cc", " sc"," s ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_axe),new Object[] {" cc", " cs"," s ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_axe),new Object[] {"cc ", "sc ","s  ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_pickaxe),new Object[] {"ccc", " s "," s ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_hoe),new Object[] {"cc ", " s "," s ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_hoe),new Object[] {" cc", " s "," s ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_hoe),new Object[] {" cc", "  s","  s", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_hoe),new Object[] {"cc ", "s  ","s  ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_sword),new Object[] {"c  ", "c  ","s  ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_sword),new Object[] {" c ", " c "," s ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_sword),new Object[] {"  c", "  c","  s", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_shovel),new Object[] {"c  ", "s  ","s  ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_shovel),new Object[] {" c ", " s "," s ", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_shovel),new Object[] {"  c", "  s","  s", 'c' ,new ItemStack(Items.dye, 1, 4), 's', Items.stick });
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
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_helmet),new Object[]{"ccc","c c","   ",'c',new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_helmet),new Object[]{"   ","ccc","c c",'c',new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_chestplate),new Object[]{"c c","ccc","ccc",'c',new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_leggings),new Object[]{"ccc","c c","c c",'c',new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_boots),new Object[]{"   ","c c","c c",'c',new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(OmamItems.lapis_boots),new Object[]{"c c","c c","   ",'c',new ItemStack(Items.dye, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_helmet),new Object[]{"ccc","c c","   ",'c',Items.emerald});
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_helmet),new Object[]{"   ","ccc","c c",'c',Items.emerald});
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_chestplate),new Object[]{"c c","ccc","ccc",'c',Items.emerald});
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_leggings),new Object[]{"ccc","c c","c c",'c',Items.emerald});
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_boots),new Object[]{"   ","c c","c c",'c',Items.emerald});
        GameRegistry.addRecipe(new ItemStack(OmamItems.emerald_boots),new Object[]{"c c","c c","   ",'c',Items.emerald});

    }
}
