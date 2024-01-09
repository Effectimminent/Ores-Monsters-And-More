package io.github.effectimminent.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

//made to actually match the property's of irl copper aka irons stats divend by 2.45210728 the irl ratio of irons avg mechanical propertys (hardness tensil strength sheer strength) to coppers
public class BlockCopperBlock extends Block {
    public BlockCopperBlock(Material materialIn){
        super(materialIn);
        setHardness(2.043422733F);
        setHarvestLevel("pickaxe",2);
        this.setLightOpacity(16);
        this.setResistance(2.45210728F);
        setLightLevel(0);
        this.setStepSound(soundTypeMetal);
    }
}
