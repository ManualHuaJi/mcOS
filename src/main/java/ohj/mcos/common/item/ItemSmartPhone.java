package ohj.mcos.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import ohj.mcos.CreativeTabmcOS;
import ohj.mcos.client.gui.mcOSGui;
import ohj.mcos.mcOSMain;

import javax.annotation.Nonnull;

/**
 * @author OldHuaJi
 */

public class ItemSmartPhone extends Item {
    public ItemSmartPhone() {


        this.setUnlocalizedName(this.getClass().getSimpleName().toLowerCase()).setCreativeTab(CreativeTabmcOS.tabmcOS).setMaxStackSize(1)
                .setRegistryName(this.getUnlocalizedName());

    }

    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, @Nonnull EnumHand enumHand) {
        if (!world.isRemote) {
            player.openGui(mcOSMain.instance, mcOSGui.SMART_PHONE, world, (int) player.posX, (int) player.posY,
                    (int) player.posZ);
        }
        return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(enumHand));
    }
}
