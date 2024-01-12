package io.github.effectimminent;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OmamGearTab extends CreativeTabs {
    public OmamGearTab(String label) {
        super("OMAM Gear");
    }

    @Override
    public Item getTabIconItem() {
        return OmamItems.ruby_chestplate;
    }
}
