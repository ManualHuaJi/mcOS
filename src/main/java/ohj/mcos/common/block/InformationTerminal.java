package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */

public class InformationTerminal extends Block {

	public InformationTerminal() {
		super(Material.ROCK);
		this.setCreativeTab(mcOSMain.tabmcOS).setUnlocalizedName(this.getClass().getName().toLowerCase())
				.setRegistryName(getUnlocalizedName());
	}

}
