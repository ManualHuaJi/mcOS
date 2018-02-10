package ohj.mcos.common.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import ohj.mcos.mcOSMain;
import ohj.mcos.client.gui.mcOSGui;

/**
 * @author OldHuaJi
 */

public class ItemSmartPhone extends Item {
	public ItemSmartPhone() {
		super();

		this.setUnlocalizedName("smartPhone").setCreativeTab(mcOSMain.tabmcOS).setMaxStackSize(1)
				.setRegistryName(this.getUnlocalizedName());

	}

	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		stack = player.getHeldItem(hand);
		if (!world.isRemote) {
			player.openGui(mcOSMain.instance, mcOSGui.SMART_PHONE, world, MathHelper.floor_double(player.posX),
					MathHelper.floor_double(player.posY), MathHelper.floor_double(player.posZ));
		}
		return EnumActionResult.SUCCESS;
	}
}
