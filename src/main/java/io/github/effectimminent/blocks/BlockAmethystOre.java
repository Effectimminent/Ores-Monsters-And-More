package io.github.effectimminent.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAmethystOre extends Block {
    public BlockAmethystOre(Material materialIn){
        super(materialIn);
        setHardness(3.0F);
        setHarvestLevel("pickaxe",1);
        this.setLightOpacity(16);
        this.setResistance(6.0F);
        setLightLevel(0);
        this.setStepSound(soundTypeStone);
    }
}
