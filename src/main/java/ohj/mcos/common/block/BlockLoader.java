package ohj.mcos.common.block;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * @author OldHuaJi
 */


public class BlockLoader {
    public static Block serverchassis = new ServerChassis();

    public BlockLoader(FMLPreInitializationEvent event) {
        registerBlock(serverchassis);
    }

    private static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, block.getUnlocalizedName());
    }
}
