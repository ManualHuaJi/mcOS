package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.CreativeTabmcOS;

/**
 * @author OldHuaJi
 */

public class SecureTerminal extends Block {
	public SecureTerminal() {
		super(Material.ROCK);
		this.setRegistryName("block"+this.getUnlocalizedName()).setCreativeTab(CreativeTabmcOS.TABMCOS)
				.setUnlocalizedName(getClass().getSimpleName().toLowerCase());
	}
}
