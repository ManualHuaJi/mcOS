package ohj.mcos.common.item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * @author OldHuaJi
 */


public class ItemLoader {
    public static Item smartPhone = new ItemSmartPhone();

    public ItemLoader(FMLPreInitializationEvent event) {
        registerItem(smartPhone);
    }

    private static void registerItem(Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName());
    }
}
