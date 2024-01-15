package io.github.effectimminent.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockZirconOre extends Block {
    public BlockZirconOre(Material materialIn){
        super(materialIn);
        setHardness(3.0F);
        setHarvestLevel("pickaxe",2);
        this.setLightOpacity(16);
        this.setResistance(6.0F);
        setLightLevel(0);
        this.setStepSound(soundTypeStone);
    }
}
