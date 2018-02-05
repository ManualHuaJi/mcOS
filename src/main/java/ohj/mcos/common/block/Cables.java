package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */

public class Cables extends Block {
    public Cables() {
        super(Material.rock);
        this.setBlockName("cables")
                .setBlockTextureName(mcOSMain.MODID + ":" + this.getUnlocalizedName())
                .setCreativeTab(mcOSMain.tabmcOS);

    }
}
