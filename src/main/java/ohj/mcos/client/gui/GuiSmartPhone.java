package ohj.mcos.client.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ohj.mcos.MainmcOS;

/**
 * @author OldHuaJi
 */

@SideOnly(Side.CLIENT)
public class GuiSmartPhone extends GuiScreen {
    private ResourceLocation texture1 = new ResourceLocation(MainmcOS.MODID, "textures/gui/guismartphone.png");
    public final int xSize = 176, ySize = 256, bottonHome = 0, buttonBack = 1, buttonMananer = 2, buttonSeu = 3, buttonDangerous = 4, buttonAbout = 5, buttonDriveMananer = 6, buttonAR = 7, buttonAnnex = 8;

    public GuiSmartPhone() {
    }

    @Override
    public void initGui() {
        super.initGui();
        int offsetX = (this.width - this.xSize) / 2,
                offsetY = (this.height - this.ySize) / 2;
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(bottonHome, offsetX + 153, offsetY + 17, 15, 10, I18n.format("gui.smartphone.button.0")));
        this.buttonList.add(new GuiButton(buttonBack, offsetX + 153, offsetY + 16, 15, 10, I18n.format("gui.smartphone.button.1")));
        this.buttonList.add(new GuiButton(buttonMananer, offsetX + 153, offsetY + 15, 15, 10, I18n.format("gui.smartphone.button.2")));
        this.buttonList.add(new GuiButton(buttonSeu, offsetX + 153, offsetY + 14, 15, 10, I18n.format("gui.smartphone.button.3")));
        this.buttonList.add(new GuiButton(buttonDangerous, offsetX + 153, offsetY + 13, 15, 10, I18n.format("gui.smartphone.button.4")));
        this.buttonList.add(new GuiButton(buttonAbout, offsetX + 153, offsetY + 12, 15, 10, I18n.format("gui.smartphone.button.5")));
        this.buttonList.add(new GuiButton(buttonDriveMananer, offsetX + 153, offsetY + 11, 15, 10, I18n.format("gui.smartphone.button.6")));
        this.buttonList.add(new GuiButton(buttonAR, offsetX + 153, offsetY + 10, 15, 10, I18n.format("gui.smartphone.button.7")));
        this.buttonList.add(new GuiButton(buttonAnnex, offsetX + 153, offsetY + 9, 15, 10, I18n.format("gui.smartphone.button.8")));

    }

    @Override
    public void drawScreen(int x, int y, float ticks) {
        int var1 = 0;
        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);
        super.drawScreen(x, y, ticks);
        while (var1 <= 8) {

            if (buttonList.get(var1).visible) {
                this.mc.getTextureManager().bindTexture(texture1);
                var1++;
            }
        }
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
