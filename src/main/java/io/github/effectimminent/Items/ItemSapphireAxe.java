package io.github.effectimminent.Items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSapphireAxe extends ItemAxe {
    public ItemSapphireAxe(ToolMaterial material) {
        super(material);
    }
    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int i, boolean bool) {
        super.onUpdate(stack, world, entity, i, bool);

        if (!stack.isItemEnchanted()) {
            stack.addEnchantment(Enchantment.fireAspect, 2);
            // Replace 'yourEnchantment' with the actual enchantment you want to apply
        }
    }
}
