package io.github.effectimminent;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AutoArmorToolRecipe {

    public static void addGear() {
        String material = "ruby";
        String str1 = material+"_block";
        String str2 = material+"_sword";
        String str3 = material+"_pickaxe";
        String str4 = material+"_axe";
        String str5 = material+"_shovel";
        String str6 = material+"_hoe";
        String str7 = material+"_helmet";
        String str8 = material+"_chestplate";
        String str9 = material+"_leggings";
        String str10 = material+"_boots";
        GameRegistry.addRecipe(new ItemStack(OmamItems.str4), new Object[]{"cc ", "cs ", " s ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str4), new Object[]{" cc", " sc", " s ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str4), new Object[]{" cc", " cs", " s ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str4), new Object[]{"cc ", "sc ", "s  ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamBlocks.str1), new Object[]{"ccc", "ccc", "ccc", 'c', OmamItems.sapphire});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str3), new Object[]{"ccc", " s ", " s ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str6), new Object[]{"cc ", " s ", " s ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str6), new Object[]{" cc", " s ", " s ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str6), new Object[]{" cc", "  s", "  s", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str6), new Object[]{"cc ", "s  ", "s  ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str2), new Object[]{"c  ", "c  ", "s  ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str2), new Object[]{" c ", " c ", " s ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str2), new Object[]{"  c", "  c", "  s", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str5), new Object[]{"c  ", "s  ", "s  ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str5), new Object[]{" c ", " s ", " s ", 'c', OmamItems.sapphire, 's', Items.stick});
        GameRegistry.addRecipe(new ItemStack(OmamItems.str5), new Object[]{"  c", "  s", "  s", 'c', OmamItems.sapphire, 's', Items.stick});
    }
}
