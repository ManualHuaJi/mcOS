package ohj.mcos.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * @author OldHuaJi
 */


public class GuimcOS implements IGuiHandler {
    public GuimcOS() {

    }

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        switch (id) {
            case 1:
                return new GuiSmartPhone();
            default:
                return null;
        }
    }


    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        switch (id) {
            case 1:
                return new GuiSmartPhone();
            default:
                return null;
        }
    }
}
