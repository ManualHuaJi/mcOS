package ohj.mcos.client.gui;

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
    int xSize = 176;
    int ySize = 256;

    public GuiSmartPhone(GuiScreen screen) {
    }

    @Override
    public void initGui() {
    }

    @Override
    public void drawScreen(int x, int y, float ticks) {
        this.mc.getTextureManager().bindTexture(texture);
        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);
        super.drawScreen(x, y, ticks);
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }


}
