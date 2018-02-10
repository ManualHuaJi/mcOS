package ohj.mcos.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author OldHuaJi
 */

public class ItemLoader {
	public static Item smartPhone = new ItemSmartPhone();
	public static Item cables =new ItemCables();

	public ItemLoader(
	FMLPreInitializationEvent event)
	{
		registerItem(smartPhone);
		registerItem(cables);
	}

	private static void registerItem(Item item) {
		GameRegistry.register(item);

	}
}
