package ohj.mcos.common;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ohj.mcos.McOSMain;
import ohj.mcos.common.block.BlockLoader;
import ohj.mcos.common.item.ItemLoader;

/**
 * @author OldHuaJi
 */


public class CommonProxy extends McOSMain {
    @Override
    public void preEvent(FMLPreInitializationEvent event) {
        new ItemLoader(event);
        new BlockLoader(event);
    }

    @Override
    public void initEvent(FMLInitializationEvent event) {
    }

    @Override
    public void postEvent(FMLPostInitializationEvent event) {
    }
}
