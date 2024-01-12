package io.github.effectimminent.Items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemRubyArmor extends ItemArmor {
    public ItemRubyArmor(ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.armorType == 2){
            return "Omam:textures/armor/lapis_armor_layer_2.png";
        }
        return "Omam:textures/armor/lapis_armor_layer_1.png";
    }
}
