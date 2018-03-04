package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.CreativeTabmcOS;

/**
 * @author OldHuaJi
 */

public class InformationTerminal extends Block {

	public InformationTerminal() {
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabmcOS.tabmcOS).setUnlocalizedName(this.getClass().getSimpleName().toLowerCase())
				.setRegistryName(getUnlocalizedName());
	}

}
