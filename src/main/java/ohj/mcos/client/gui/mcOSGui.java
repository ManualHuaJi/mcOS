package ohj.mcos.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */


public class mcOSGui implements IGuiHandler {
    public static final int SMART_PHONE = 1;

    public mcOSGui() {
        NetworkRegistry.INSTANCE.registerGuiHandler(mcOSMain.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
            case SMART_PHONE:

            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        switch (ID) {
            case SMART_PHONE:
                return new GuiSmartPhone();
            default:
                return null;
        }
    }
}
