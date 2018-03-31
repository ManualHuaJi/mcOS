package ohj.mcos.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import ohj.mcos.MainmcOS;

/**
 * @author OldHuaJi
 */
@Mod.EventBusSubscriber(modid = MainmcOS.MODID)
public class ItemLoader {
    public static Item smartPhone = new ItemSmartPhone();
    public static Item cables = new ItemCables();



    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> itemRegister) {
        IForgeRegistry<Item> ir = itemRegister.getRegistry();
        ir.register(smartPhone);
        ir.register(cables);
    }
}
