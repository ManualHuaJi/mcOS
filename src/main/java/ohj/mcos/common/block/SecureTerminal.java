package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.CreativeTabmcOS;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */

public class SecureTerminal extends Block {
	public SecureTerminal() {
		super(Material.ROCK);
		this.setRegistryName(this.getUnlocalizedName()).setCreativeTab(CreativeTabmcOS.tabmcOS)
				.setUnlocalizedName(getClass().getSimpleName().toLowerCase());
	}
}
