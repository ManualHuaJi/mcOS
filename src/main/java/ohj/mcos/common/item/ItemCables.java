package ohj.mcos.common.item;

import net.minecraft.item.Item;
import ohj.mcos.CreativeTabmcOS;

public class ItemCables extends Item {
	public ItemCables() {
		this.setCreativeTab(CreativeTabmcOS.TABMCOS).setUnlocalizedName(this.getClass().getSimpleName().replaceFirst("Item", "item"))
				.setRegistryName(getUnlocalizedName()).setHasSubtypes(true);
	}
}
