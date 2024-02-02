package io.github.effectimminent.Items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemSilverSword extends ItemSword {
    public ItemSilverSword(ToolMaterial material) {
        super(material);
    }
    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
        super.onUpdate(stack, world, entity, i, bool);

        if (!stack.isItemEnchanted()) {
            stack.addEnchantment(Enchantment.smite, 5);
            // Replace 'yourEnchantment' with the actual enchantment you want to apply
        }
    }

}
