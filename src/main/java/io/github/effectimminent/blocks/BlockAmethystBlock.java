package io.github.effectimminent.blocks;

import io.github.effectimminent.OmamBlocks;
import io.github.effectimminent.OmamItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockAmethystBlock extends Block {
    public BlockAmethystBlock(Material materialIn){
        super(materialIn);
        setHardness(4.5F);
        setHarvestLevel("pickaxe",3);
        this.setLightOpacity(16);
        this.setResistance(20.0F);
        setLightLevel(0);
        this.setStepSound(soundTypeStone);
    }
}
