package io.github.effectimminent;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.reflect.Field;

public class AutoArmorToolRecipe {

    public static void addGear(String materialIn,Boolean addBlock) {
        try {
            String ingotgemName =materialIn;

            String swordName =materialIn + "_sword";
            String pickaxeName =materialIn + "_pickaxe";
            String axeName =materialIn + "_axe";
            String shovelName =materialIn + "_shovel";
            String hoeName =materialIn + "_hoe";
            String helmetName =materialIn + "_helmet";
            String chestplateName =materialIn + "_chestplate";
            String leggingsName =materialIn + "_leggings";
            String bootsName =materialIn + "_boots";

            Item ingotgem = (Item) OmamItems.class.getField(ingotgemName).get(null);
            Item sword = (Item) OmamItems.class.getField(swordName).get(null);
            Item pickaxe = (Item) OmamItems.class.getField(pickaxeName).get(null);
            Item axe = (Item) OmamItems.class.getField(axeName).get(null);
            Item shovel = (Item) OmamItems.class.getField(shovelName).get(null);
            Item hoe = (Item) OmamItems.class.getField(hoeName).get(null);
            Item helmet = (Item) OmamItems.class.getField(helmetName).get(null);
            Item chestplate = (Item) OmamItems.class.getField(chestplateName).get(null);
            Item leggings = (Item) OmamItems.class.getField(leggingsName).get(null);
            Item boots = (Item) OmamItems.class.getField(bootsName).get(null);
            //System.out.println("RRRRRRRRRRRRRRRRRRRRR"+ingotgem);


            GameRegistry.addRecipe(new ItemStack(axe),new Object[] {"cc ", "cs "," s ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(axe),new Object[] {" cc", " sc"," s ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(axe),new Object[] {" cc", " cs"," s ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(axe),new Object[] {"cc ", "sc ","s  ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(pickaxe),new Object[] {"ccc", " s "," s ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(hoe),new Object[] {"cc ", " s "," s ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(hoe),new Object[] {" cc", " s "," s ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(hoe),new Object[] {" cc", "  s","  s", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(hoe),new Object[] {"cc ", "s  ","s  ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(sword),new Object[] {"c  ", "c  ","s  ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(sword),new Object[] {" c ", " c "," s ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(sword),new Object[] {"  c", "  c","  s", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(shovel),new Object[] {"c  ", "s  ","s  ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(shovel),new Object[] {" c ", " s "," s ", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(shovel),new Object[] {"  c", "  s","  s", 'c' ,ingotgem, 's', Items.stick });
            GameRegistry.addRecipe(new ItemStack(helmet),new Object[] {"ccc", "c c","   ", 'c' ,ingotgem});
            GameRegistry.addRecipe(new ItemStack(helmet),new Object[] {"   ", "ccc","c c", 'c' ,ingotgem});
            GameRegistry.addRecipe(new ItemStack(chestplate),new Object[] {"c c", "ccc","ccc", 'c' ,ingotgem});
            GameRegistry.addRecipe(new ItemStack(leggings),new Object[] {"ccc", "c c","c c", 'c' ,ingotgem});
            GameRegistry.addRecipe(new ItemStack(boots),new Object[] {"c c", "c c","   ", 'c' ,ingotgem});
            GameRegistry.addRecipe(new ItemStack(boots),new Object[] {"   ", "c c","c c", 'c' ,ingotgem});
            if (addBlock == true) {
                String blockName = materialIn + "_block";
                Block block = (Block) OmamBlocks.class.getField(blockName).get(null);
                GameRegistry.addRecipe(new ItemStack(block), new Object[]{"ccc", "ccc", "ccc", 'c', ingotgem});
            }
        } catch (NoSuchFieldException e) {
            System.out.println("ERROR MISSING ITEM FOR CRAFTING RECIPE INPUT OR OUTPUT");
            e.printStackTrace();
        } catch (IllegalAccessException e){
            System.out.println("ERROR MISSING ITEM FOR CRAFTING RECIPE INPUT OR OUTPUT(ITEM IS NOT PUBLIC)");
            e.printStackTrace();
        }
    }
}
