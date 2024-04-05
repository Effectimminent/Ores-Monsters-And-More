/*package io.github.effectimminent.event;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockEventManager {
    @SubscribeEvent
    public void onEvent(BlockEvent.HarvestDropsEvent event) {
        Item breaker = null;
        if (event.harvester != null && event.harvester.getCurrentEquippedItem() != null && event.harvester.getCurrentEquippedItem().getItem() != null) {
            breaker = event.harvester.getCurrentEquippedItem().getItem();
        }
        if (event.drops != null && event.drops.size() != 0) {
            for (int x = event.drops.size() - 1; x >= 0; x--) {
                if (FurnaceRecipes.smelting().getSmeltingResult(event.drops.get(x)) != null) {
                    ItemStack thisItem = FurnaceRecipes.smelting().getSmeltingResult(event.drops.get(x));
                    if ((breaker == ItemManager.fireAxe || breaker == ItemManager.firePickaxe || breaker == ItemManager.fireSpade) && breaker != null) {
                        event.drops.remove(x);
                        event.drops.add(thisItem);
                    }
                }
            }
        }
    }
}
*/