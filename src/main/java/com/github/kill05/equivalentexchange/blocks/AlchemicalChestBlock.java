package com.github.kill05.equivalentexchange.blocks;

import com.github.kill05.equivalentexchange.inventory.gui.EEGuis;
import com.github.kill05.equivalentexchange.tile.AlchemicalChestTile;
import net.minecraft.core.block.BlockTileEntityRotatable;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.world.World;

public class AlchemicalChestBlock extends BlockTileEntityRotatable {

	public AlchemicalChestBlock(int id) {
		super("alchemical_chest", id, Material.stone);
	}

	@Override
	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		if(player.isSneaking()) return false;
		EEGuis.ALCHEMICAL_CHEST.open(player, x, y, z);
		return true;
	}

	@Override
	protected TileEntity getNewBlockEntity() {
		return new AlchemicalChestTile();
	}
}