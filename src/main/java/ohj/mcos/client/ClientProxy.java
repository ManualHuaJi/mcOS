package ohj.mcos.client;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ohj.mcos.client.gui.GuiSmartPhone;
import ohj.mcos.common.CommonProxy;

import javax.annotation.Nonnull;

/**
 * @author OldHuaJi
 */


public class ClientProxy extends CommonProxy {
    @Override
    public void preEvent(FMLPreInitializationEvent event) {
        super.preEvent(event);
    }

    @Override
    public void initEvent(FMLInitializationEvent event) {
        super.initEvent(event);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Override
    public void postEvent(FMLPostInitializationEvent event) {
        super.postEvent(event);
    }

}

