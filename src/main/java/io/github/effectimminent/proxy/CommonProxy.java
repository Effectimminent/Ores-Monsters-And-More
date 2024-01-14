package io.github.effectimminent.proxy;

import io.github.effectimminent.worldgen.OreGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    public void registerRenders(){
    }
    public void registerWorldGenerators(){
        GameRegistry.registerWorldGenerator(new OreGen(),0);
    }

}
