package io.github.effectimminent;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OmamTab extends CreativeTabs {
    public OmamTab(String label) {
        super("OMAM Items");
    }

    @Override
    public Item getTabIconItem() {
        return OmamItems.copper_ingot;
    }
}
