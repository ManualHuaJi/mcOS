package ohj.mcos.common.item;

import net.minecraft.item.Item;
import ohj.mcos.CreativeTabmcOS;

public class ItemCables extends Item {
	public ItemCables() {
		this.setCreativeTab(CreativeTabmcOS.tabmcOS).setUnlocalizedName(getClass().getSimpleName().toLowerCase())
				.setRegistryName(getUnlocalizedName()).setHasSubtypes(true);
	}
}
