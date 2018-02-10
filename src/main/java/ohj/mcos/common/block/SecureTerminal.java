package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */

public class SecureTerminal extends Block {
	public SecureTerminal() {
		super(Material.ROCK);
		this.setRegistryName(this.getUnlocalizedName()).setCreativeTab(mcOSMain.tabmcOS)
				.setUnlocalizedName(getClass().getName().toLowerCase());
	}
}
