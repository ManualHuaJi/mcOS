package ohj.mcos.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ohj.mcos.MainmcOS;
import ohj.mcos.common.item.ItemLoader;

/**
 * @author OldHuaJi
 */

@SideOnly(Side.CLIENT)
public class GuiSmartPhone extends GuiContainer {
    private ResourceLocation texture1 = new ResourceLocation(MainmcOS.MODID, "textures/gui/guismartphone.png");
    public final int xSize = 176, ySize = 256, maxPoint = 8;
    int var1 = 0, buttonHome = 0, buttonBack = 1, buttonMananer = 2, buttonSeu = 3, buttonDanger = 4, buttonAbout = 5, buttonDriveMananer = 6, buttonAR = 7, buttonAnnex = 8;

    public GuiSmartPhone(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }


    @Override
    public void initGui() {
        super.initGui();


    }


    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        this.mc.getTextureManager().bindTexture(texture1);
        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);

    }

}
