package ohj.mcos.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ohj.mcos.client.gui.mcOSGui;
import ohj.mcos.common.item.ItemLoader;

/**
 * @author OldHuaJi
 */


public class CommonProxy {

    public void preEvent(FMLPreInitializationEvent event) {

    }

    public void initEvent(FMLInitializationEvent event) {
        new mcOSGui();
    }


    public void postEvent(FMLPostInitializationEvent event) {
    }
}
