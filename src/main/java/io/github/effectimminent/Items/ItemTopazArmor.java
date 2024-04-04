package io.github.effectimminent.Items;

import io.github.effectimminent.OmamItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTopazArmor extends ItemArmor {
    public ItemTopazArmor(ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.armorType == 2){
            return "Omam:textures/model/armor/topaz_armor_layer_2.png";
        }
        return "Omam:textures/model/armor/topaz_armor_layer_1.png";
    }
}
