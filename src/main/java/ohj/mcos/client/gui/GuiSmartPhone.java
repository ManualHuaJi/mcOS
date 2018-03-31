package ohj.mcos.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ohj.mcos.MainmcOS;

/**
 * @author OldHuaJi
 */

@SideOnly(Side.CLIENT)
public class GuiSmartPhone extends GuiScreen {
    private ResourceLocation texture = new ResourceLocation(MainmcOS.MODID, "textures/gui/guismartphone.png");
    private Minecraft mc = Minecraft.getMinecraft();

    public GuiSmartPhone() {

    }

    @Override
    public void initGui() {

    }

    @Override
    public void drawScreen(int x, int y, float ticks) {
        mc.getTextureManager().bindTexture(texture);
        drawTexturedModalRect(0, 0, 0, 0, 256, 256);
        super.drawScreen(x, y, ticks);


    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }


}
