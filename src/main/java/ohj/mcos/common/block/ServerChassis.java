package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.CreativeTabmcOS;

/**
 * @author OldHuaJi
 */

public class ServerChassis extends Block {
	public ServerChassis() {
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabmcOS.tabmcOS).setUnlocalizedName("block"+getClass().getSimpleName().toLowerCase())
				.setRegistryName(getUnlocalizedName());

	}
}
