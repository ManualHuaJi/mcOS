package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */

public class LoadBalancer extends Block {

	public LoadBalancer() {
		super(Material.ROCK);
		this.setUnlocalizedName(getClass().getName().toLowerCase()).setRegistryName(getUnlocalizedName())
				.setCreativeTab(mcOSMain.tabmcOS);
	}

}
