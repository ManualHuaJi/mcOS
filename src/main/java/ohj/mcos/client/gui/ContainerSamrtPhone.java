package ohj.mcos.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import ohj.mcos.common.item.ItemLoader;

public class ContainerSamrtPhone extends Container {
    public ContainerSamrtPhone() {
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return new ItemStack(ItemLoader.smartPhone).isItemEqual(player.getHeldItemMainhand());
    }

}
