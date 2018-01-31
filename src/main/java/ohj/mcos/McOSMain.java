package ohj.mcos;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ohj.mcos.common.CommonProxy;
import ohj.mcos.common.item.ItemLoader;

/**
 * @author OldHuaJi
 */
@Mod(modid = McOSMain.MODID, name = McOSMain.MODNAME, version = McOSMain.MODVERSION)


public class McOSMain {
    @SidedProxy(clientSide = "ohj.mcos.client.ClientProxy", serverSide = "ohj.mcos.common.CommonProxy", modId = MODID)
    public static CommonProxy proxy;
    public static final String MODID = "mcos";
    public static final String MODNAME = "McOS";
    public static final String MODVERSION = "V0.1";

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

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }


    @EventHandler
    private void serverAboutToStart(final FMLServerAboutToStartEvent evt) {

    }

    public static CreativeTabs tabMCOS = new CreativeTabs("tabMCOS") {

        @Override
        public Item getTabIconItem() {
            return
                    ItemLoader.smartPhone;

        }

    };
}
