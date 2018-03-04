package ohj.mcos.common.block.energy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.energy.IEnergyStorage;
import ohj.mcos.CreativeTabmcOS;

/**
 * @author OldHuaJi
 */

public class Cables extends Block implements IEnergyStorage {
    public Cables() {
        super(Material.ROCK);
        this.setRegistryName(getClass().getName().toLowerCase()).setRegistryName(getUnlocalizedName())
                .setCreativeTab(CreativeTabmcOS.tabmcOS);
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        return 0;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        return 0;
    }

    @Override
    public int getEnergyStored() {
        return 0;
    }

    @Override
    public int getMaxEnergyStored() {
        return 0;
    }

    @Override
    public boolean canExtract() {
        return false;
    }

    @Override
    public boolean canReceive() {
        return false;
    }
}
