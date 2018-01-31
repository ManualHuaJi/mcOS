package ohj.mcos.clinet;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ohj.mcos.common.CommonProxy;

/**
 * @author OldHuaJi
 */


public class ClinetProxy extends CommonProxy{
    @Override
    public void preEvent(FMLPreInitializationEvent event) {
        super.preEvent(event);
    }

    @Override
    public void initEvent(FMLInitializationEvent event) {
        super.initEvent(event);
    }

    @Override
    public void postEvent(FMLPostInitializationEvent event) {
        super.postEvent(event);
    }
}

