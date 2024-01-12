package io.github.effectimminent.Items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCopperArmor extends ItemArmor {
    public ItemCopperArmor(ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.armorType == 2){
            return "Omam:textures/armor/sapphire_armor_layer_2.png";
        }
        return "Omam:textures/armor/sapphire_armor_layer_1.png";
    }
}
