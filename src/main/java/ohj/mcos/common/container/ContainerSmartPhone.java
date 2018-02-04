package ohj.mcos.common.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

/**
 * @author OldHuaJi
 */


public class ContainerSmartPhone extends Container {
    public ContainerSmartPhone() {
        super();
    }

    @Override
    public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
        return true;
    }
}
