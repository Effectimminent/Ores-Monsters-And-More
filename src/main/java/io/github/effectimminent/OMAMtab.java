package io.github.effectimminent;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class OMAMtab extends CreativeTabs {
    public OMAMtab(String label) {
        super("OMAM Items");
    }

    @Override
    public Item getTabIconItem() {
        return Items.nether_star;
    }
}
