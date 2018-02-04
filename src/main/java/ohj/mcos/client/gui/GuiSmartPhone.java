package ohj.mcos.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import ohj.mcos.common.container.ContainerSmartPhone;

/**
 * @author OldHuaJi
 */

@SideOnly(Side.CLIENT)
public class GuiSmartPhone extends GuiContainer {


    public GuiSmartPhone(ContainerSmartPhone p_i1072_1_) {
        super(p_i1072_1_);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {

    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {

    }
}
