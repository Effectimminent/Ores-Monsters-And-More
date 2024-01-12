package io.github.effectimminent;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OmamResourcesTab extends CreativeTabs {
    public OmamResourcesTab(String label) {
        super("OMAM Resources");
    }

    @Override
    public Item getTabIconItem() {
        return OmamItems.sapphire;
    }
}
