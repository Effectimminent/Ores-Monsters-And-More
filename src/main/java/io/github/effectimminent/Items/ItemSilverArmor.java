package io.github.effectimminent.Items;

import io.github.effectimminent.OmamItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSilverArmor extends ItemArmor {
    public ItemSilverArmor(ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.armorType == 2){
            return "Omam:textures/model/armor/silver_armor_layer_2.png";
        }
        return "Omam:textures/model/armor/silver_armor_layer_1.png";
    }
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack) {
        if(itemstack.getItem() == OmamItems.silver_chestplate || itemstack.getItem() == OmamItems.silver_leggings || itemstack.getItem() == OmamItems.silver_helmet || itemstack.getItem() == OmamItems.silver_boots) {
            player.removePotionEffect(19);
        }
        super.onArmorTick(world, player, itemstack);
    }
}
