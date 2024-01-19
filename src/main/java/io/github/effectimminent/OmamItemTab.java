package io.github.effectimminent;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OmamItemTab extends CreativeTabs {
    public OmamItemTab(String label) {
        super("OMAM Items");
    }

    @Override
    public Item getTabIconItem() {
        return Items.apple;
    }
}
