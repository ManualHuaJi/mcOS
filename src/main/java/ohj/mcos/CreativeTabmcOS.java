package ohj.mcos;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import ohj.mcos.common.item.ItemLoader;

import javax.annotation.Nonnull;

public final class CreativeTabmcOS
        extends CreativeTabs {
    public static final CreativeTabmcOS TABMCOS = new CreativeTabmcOS();
    NonNullList<ItemStack> list;

    public CreativeTabmcOS() {
        super("TABMCOS");
    }

    @Override
    @Nonnull
    public ItemStack getIconItemStack() {
        return new ItemStack(ItemLoader.smartPhone);
    }

    @Override
    public ItemStack getTabIconItem() {
        return this.getIconItemStack();
    }


}
