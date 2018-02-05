package ohj.mcos.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

/**
 * @author OldHuaJi
 */

@SideOnly(Side.CLIENT)
public class GuiSmartPhone extends GuiScreen {
    private Minecraft mc = Minecraft.getMinecraft();

    @Override
    public void drawScreen(int x, int y, float ticks) {
        this.drawDefaultBackground();
        super.drawScreen(x, y, ticks);
    }


    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    public void initGui() {
    }

}
