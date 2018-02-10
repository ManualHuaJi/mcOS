package ohj.mcos.client.gui;

import net.minecraft.client.gui.GuiButton;

/**
 * @author OldHuaJi
 */


public class GuiButtonSmartPhone extends GuiButton {
    public GuiSmartPhone gui;

    public GuiButtonSmartPhone(GuiSmartPhone gui, int id, int x, int y, int w, int h, String text_) {
        super(id, x, y, w, h, text_);
    }
}
