package ohj.mcos.common.block;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * @author OldHuaJi
 */


public class BlockLoader {
    public static Block serverChassis = new ServerChassis();
    public static Block secureTreminal = new SecureTerminal();

    public BlockLoader(FMLPreInitializationEvent event) {
        registerBlock(serverChassis);
        registerBlock(secureTreminal);
    }

    private static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, block.getUnlocalizedName());
    }
}
