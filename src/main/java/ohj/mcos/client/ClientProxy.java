package ohj.mcos.client;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ohj.mcos.common.CommonProxy;

/**
 * @author OldHuaJi
 */


public class ClientProxy extends CommonProxy{
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

