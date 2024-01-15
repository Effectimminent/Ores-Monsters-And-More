package io.github.effectimminent.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**made to actually match the property's of irl copper aka irons stats divend by 2.446875 the irl ratio of irons avg mechanical propertys (hardness, tensil strength, sheer strength) to coppers*/
public class BlockCopperOre extends Block {
    public BlockCopperOre(Material materialIn){
        super(materialIn);
        setHardness(3.0F);
        setHarvestLevel("pickaxe",1);
        this.setLightOpacity(16);
        this.setResistance(6.0F);
        setLightLevel(0);
        this.setStepSound(soundTypeMetal);
    }
}
