package io.github.effectimminent;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.lang.reflect.Field;

public class AutoArmorToolRecipe {

    public static void addGear(String materialIn) {
        try {
            Field field = OmamItems.class.getField(materialIn);
            Field field0 = OmamItems.class.getField(materialIn + "_block");
            Field field1 = OmamItems.class.getField(materialIn + "_sword");
            Field field2 = OmamItems.class.getField(materialIn + "_pickaxe");
            Field field3 = OmamItems.class.getField(materialIn + "_axe");
            Field field4 = OmamItems.class.getField(materialIn + "_shovel");
            Field field5 = OmamItems.class.getField(materialIn + "_hoe");
            Field field6 = OmamItems.class.getField(materialIn + "_helmet");
            Field field7 = OmamItems.class.getField(materialIn + "_chestplate");
            Field field8 = OmamItems.class.getField(materialIn + "_leggings");
            Field field9 = OmamItems.class.getField(materialIn + "_boots");

            Item ingotgem = (Item) field.get(null);
            Item block = (Item) field0.get(null);
            Item sword = (Item) field1.get(null);
            Item pickaxe = (Item) field2.get(null);
            Item axe = (Item) field3.get(null);
            Item shovel = (Item) field4.get(null);
            Item hoe = (Item) field5.get(null);
            Item helmet = (Item) field6.get(null);
            Item chestplate = (Item) field7.get(null);
            Item leggings = (Item) field8.get(null);
            Item boots = (Item) field9.get(null);

            // Use 'sword' as needed...
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

        } catch (NoSuchFieldException e) {
            e.printStackTrace();  // Handle the exception appropriately
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
