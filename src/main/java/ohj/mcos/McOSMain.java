package ohj.mcos;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ohj.mcos.common.CommonProxy;

import static ohj.mcos.mcOSMain.MODID;

@Mod(modid = MODID, name = "mcOS", version = "1.0", dependencies = "required-after:FML")
public class mcOSMain {
    public static final String MODID = "mcos";

    @SidedProxy(clientSide = "ohj.mcos.client.ClientProxy", serverSide = "ohj.mcos.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance("mcOS")
    public static mcOSMain instance;

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