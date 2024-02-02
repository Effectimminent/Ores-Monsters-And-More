package io.github.effectimminent.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSilverBlock extends Block {
    public BlockSilverBlock(Material materialIn){
        super(materialIn);
        setHardness(0.83F);
        setHarvestLevel("pickaxe",2);
        this.setLightOpacity(16);
        this.setResistance(1.5F);
        setLightLevel(0);
        this.setStepSound(soundTypeMetal);
    }
}
