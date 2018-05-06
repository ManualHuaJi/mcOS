package ohj.mcos;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import ohj.mcos.common.CommonProxy;

import static ohj.mcos.MainmcOS.MODID;


@Mod(modid = MODID, name = "mcOS", version = "1.0", dependencies = "required-after:FML")
public class MainmcOS {
    public static final String MODID = "mcos";

    @SidedProxy(clientSide = "ohj.mcos.client.ClientProxy", serverSide = "ohj.mcos.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance("mcos")
    public static MainmcOS instance;

    @EventHandler
    public void preEvent(FMLPreInitializationEvent event) {
        proxy.preEvent(event);
    }

    @EventHandler
    public void initEvent(FMLInitializationEvent event) {
        proxy.initEvent(event);

    }

    @EventHandler
    public void postEvent(FMLPostInitializationEvent event) {
        proxy.postEvent(event);
    }
}