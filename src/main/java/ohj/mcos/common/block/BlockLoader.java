package ohj.mcos.common.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import ohj.mcos.MainmcOS;

/**
 * @author OldHuaJi
 */
@Mod.EventBusSubscriber(modid = MainmcOS.MODID)
public class BlockLoader {

    public static Block serverChassis = new ServerChassis();
    public static Block secureTreminal = new SecureTerminal();
    public static Block loadBalancer = new LoadBalancer();
    public static Block informationterminal = new InformationTerminal();


    @SubscribeEvent
    public static void registerBlcok(RegistryEvent.Register<Block> blockRegister) {
        IForgeRegistry<Block> br = blockRegister.getRegistry();
        br.register(serverChassis);
        br.register(secureTreminal);
        br.register(loadBalancer);
        br.register(informationterminal);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> itemRegister) {
        final IForgeRegistry<Item> registry = itemRegister.getRegistry();
        final ItemBlock[] items = {
                new ItemBlock(serverChassis),
                new ItemBlock(secureTreminal),
                new ItemBlock(loadBalancer),
                new ItemBlock(informationterminal)
        };
        for (final ItemBlock item : items) {
            final Block block = item.getBlock();
            registry.register(item.setRegistryName(item.getUnlocalizedName()));
        }


    }
}
