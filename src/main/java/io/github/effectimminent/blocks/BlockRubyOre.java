package io.github.effectimminent.blocks;

import io.github.effectimminent.OmamBlocks;
import io.github.effectimminent.OmamItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockRubyOre extends Block {
    public BlockRubyOre(Material materialIn){
        super(materialIn);
        setHardness(3.0F);
        setHarvestLevel("pickaxe",3);
        this.setLightOpacity(16);
        this.setResistance(6.0F);
        setLightLevel(0);
        this.setStepSound(soundTypeStone);
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == OmamBlocks.ruby_ore ? OmamItems.ruby : Item.getItemFromBlock(this);
    }
}
