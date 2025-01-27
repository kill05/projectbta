package com.github.kill05.equivalentexchange.blocks;

import com.github.kill05.equivalentexchange.EEGuis;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;

public class TransmutationTableBlock extends Block {

	public TransmutationTableBlock(int id) {
		super("transmutation_table", id, Material.stone);
		setBlockBounds(0, 0, 0, 1, 0.25, 1);
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isSolidRender() {
		return false;
	}

	@Override
	public boolean onBlockRightClicked(World world, int x, int y, int z, EntityPlayer player, Side side, double xHit, double yHit) {
		if(player.isSneaking()) return false;
		EEGuis.TRANSMUTATION_TABLE.open(player);
		return true;
	}
}
