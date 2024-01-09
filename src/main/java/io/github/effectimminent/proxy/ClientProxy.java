package io.github.effectimminent.proxy;

import io.github.effectimminent.OmamBlocks;
import io.github.effectimminent.OmamItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenders(){
        OmamItems.registerRenders();
        OmamBlocks.registerRenders();
    }
}
