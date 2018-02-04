package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */


public class SecureTerminal extends Block {
    public SecureTerminal() {
        super(Material.rock);
        this.setBlockName("secureTerminal")
                .setCreativeTab(mcOSMain.tabmcOS);
    }
}
