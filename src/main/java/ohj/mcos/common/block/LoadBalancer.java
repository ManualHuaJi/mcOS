package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.CreativeTabmcOS;

/**
 * @author OldHuaJi
 */

public class LoadBalancer extends Block {

	public LoadBalancer() {
		super(Material.ROCK);
		this.setUnlocalizedName("block"+getClass().getSimpleName().toLowerCase()).setRegistryName(getUnlocalizedName())
				.setCreativeTab(CreativeTabmcOS.tabmcOS);
	}

}
