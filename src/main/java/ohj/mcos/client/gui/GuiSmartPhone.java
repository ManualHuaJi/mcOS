package ohj.mcos.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
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
    public final int xSize = 176, ySize = 256, maxPoint = 8;
    int var1 = 0;

    //    bottonHome = 0, buttonBack = 1, buttonMananer = 2, buttonSeu = 3, buttonDanger = 4, buttonAbout = 5, buttonDriveMananer = 6, buttonAR = 7, buttonAnnex = 8,

    public GuiSmartPhone() {
    }

    @Override
    public void initGui() {
        super.initGui();
        int offsetX = (this.width - this.xSize) / 2,
                offsetY = (this.height - this.ySize) / 2;
        this.buttonList.clear();
        while (var1 <= maxPoint) {
            this.buttonList.add(new GuiButton(var1, offsetX + 153, offsetY + 17 - var1, 15, 10, I18n.format("gui.smartphone.button." + var1)) {
                @Override
                public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
                    if (this.visible) {
                        GlStateManager.color(1.0F, 1.0F, 1.0F);

                        mc.getTextureManager().bindTexture(TEXTURE);
                        int x = mouseX - this.xPosition, y = mouseY - this.yPosition;

                        if (x >= 0 && y >= 0 && x < this.width && y < this.height) {
                            this.drawTexturedModalRect(this.xPosition, this.yPosition, 1, 146, this.width, this.height);
                        } else {
                            this.drawTexturedModalRect(this.xPosition, this.yPosition, 1, 134, this.width, this.height);
                        }
                    }
                }
            }
        }
        );
        var1++;
        if (var1 >= maxPoint + 1) {
            var1 = 0;
        }


    }

    @Override
    public void drawScreen(int x, int y, float ticks) {
        this.mc.getTextureManager().bindTexture(texture1);

        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);
        super.drawScreen(x, y, ticks);
        /*while (var1 <= 8) {

            if (buttonList.get(var1).visible && var1<=8) {
                var1++;
            }else{
            var1=0}
        }*/
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
