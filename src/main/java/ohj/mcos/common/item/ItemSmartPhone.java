package ohj.mcos.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import ohj.mcos.client.gui.GuiSmartPhone;
import ohj.mcos.client.gui.mcOSGui;
import ohj.mcos.mcOSMain;

/**
 * @author OldHuaJi
 */


public class ItemSmartPhone extends Item {
    public ItemSmartPhone() {
        super();

        this.setUnlocalizedName("smartPhone").setTextureName(mcOSMain.MODID + ":" + this.getUnlocalizedName()).setCreativeTab(mcOSMain.tabmcOS).setMaxStackSize(1);

    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!world.isRemote) {
            entityPlayer.openGui(mcOSMain.instance, mcOSGui.SMART_PHONE, world, MathHelper.floor_double(entityPlayer.posX), MathHelper.floor_double(entityPlayer.posY), MathHelper.floor_double(entityPlayer.posZ));
        }
        return itemStack;
    }
}
