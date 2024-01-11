package io.github.effectimminent.Items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemCopperSword extends ItemSword {
    public ItemCopperSword(ToolMaterial material) {
        super(material);
    }
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        if (attacker instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) attacker;
            World world = player.getEntityWorld();

            // Apply a potion effect to the target
            target.addPotionEffect(new PotionEffect(19, 100, 1));
            // Replace 'PotionTypes.POISON' with the desired potion effect
        }
        return super.hitEntity(stack, target, attacker);
    }
}
