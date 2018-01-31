package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.McOSMain;

/**
 * @author OldHuaJi
 */


public class ServerChassis extends Block {
    public ServerChassis() {
        super(Material.rock);
        this.setBlockName("")
                .setCreativeTab(McOSMain.tabMCOS)
                .setBlockTextureName(McOSMain.MODID + ":" + this.getUnlocalizedName())
                .setHardness(1);
    }
}
