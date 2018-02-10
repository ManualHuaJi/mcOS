package ohj.mcos.common.item;

import net.minecraft.item.Item;
import ohj.mcos.mcOSMain;

public class ItemCables extends Item {
	public ItemCables() {
		this.setCreativeTab(mcOSMain.tabmcOS).setUnlocalizedName(getClass().getName().toLowerCase())
				.setRegistryName(getUnlocalizedName()).setHasSubtypes(true);
	}
}
