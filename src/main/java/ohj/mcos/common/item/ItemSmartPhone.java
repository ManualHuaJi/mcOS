package ohj.mcos.common.item;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import ohj.mcos.CreativeTabmcOS;
import ohj.mcos.client.gui.GuiSmartPhone;

import javax.annotation.Nonnull;


/**
 * @author OldHuaJi
 */

public class ItemSmartPhone extends Item {
    public ItemSmartPhone() {
        this.setUnlocalizedName(this.getClass().getSimpleName().replaceFirst("Item", "item")).setCreativeTab(CreativeTabmcOS.tabmcOS).setMaxStackSize(1)
                .setRegistryName(this.getUnlocalizedName());
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, @Nonnull EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);
        Minecraft mc = Minecraft.getMinecraft();
        mc.displayGuiScreen(new GuiSmartPhone());
        mc.setIngameNotInFocus();
        return ActionResult.newResult(EnumActionResult.PASS, stack);

    }
}
