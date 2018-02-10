package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author OldHuaJi
 */

public class BlockLoader {

	public static Block serverChassis = new ServerChassis();
	public static Block secureTreminal = new SecureTerminal();
	public static Block loadBalancer = new LoadBalancer();
	public static Block informationterminal = new InformationTerminal();

	public BlockLoader(FMLPreInitializationEvent event) {
		registerBlock(serverChassis);
		registerBlock(secureTreminal);
		registerBlock(loadBalancer);
		registerBlock(informationterminal);

	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);

	}
}
