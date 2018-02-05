package ohj.mcos.common;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ohj.mcos.client.gui.mcOSGui;
import ohj.mcos.common.block.BlockLoader;
import ohj.mcos.common.item.ItemLoader;

/**
 * @author OldHuaJi
 */


public class CommonProxy {

    public void preEvent(FMLPreInitializationEvent event) {
        new ItemLoader(event);
        new BlockLoader(event);

    }


    public void initEvent(FMLInitializationEvent event) {
        new mcOSGui();
    }


    public void postEvent(FMLPostInitializationEvent event) {
    }
}
