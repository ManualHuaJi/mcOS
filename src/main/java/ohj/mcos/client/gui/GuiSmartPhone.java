package ohj.mcos.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
