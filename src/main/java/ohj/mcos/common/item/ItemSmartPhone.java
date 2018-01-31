package ohj.mcos.common.item;

import net.minecraft.item.Item;
import ohj.mcos.McOSMain;

/**
 * @author OldHuaJi
 */


public class ItemSmartPhone extends Item {
    public ItemSmartPhone() {
        super();
        this.setUnlocalizedName("").setTextureName(McOSMain.MODID+":"+this.getUnlocalizedName()).setCreativeTab(McOSMain.tabMCOS).setMaxStackSize(1);

    }
}
