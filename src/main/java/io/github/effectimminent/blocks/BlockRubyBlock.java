package io.github.effectimminent.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRubyBlock extends Block {
    public BlockRubyBlock(Material materialIn){
        super(materialIn);
        setHardness(4.75F);
        setHarvestLevel("pickaxe",3);
        this.setLightOpacity(16);
        this.setResistance(19.5F);
        setLightLevel(0);
        this.setStepSound(soundTypeStone);
    }
}
