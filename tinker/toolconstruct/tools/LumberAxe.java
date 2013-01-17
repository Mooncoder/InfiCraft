package tinker.toolconstruct.tools;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import tinker.toolconstruct.AbilityHelper;

public class LumberAxe extends HarvestTool
{
	public LumberAxe(int itemID, String tex)
	{
		super(itemID, 3, tex);
		this.setItemName("InfiTool.LumberAxe");
	}

	@Override
	public int getHeadType ()
	{
		return 1;
	}

	@Override
	protected Material[] getEffectiveMaterials ()
	{
		return materials;
	}

	@Override
	protected String getHarvestType ()
	{
		return "axe";
	}

	public float getDurabilityModifier ()
	{
		return 2.0f;
	}

	public String getToolName ()
	{
		return "Lumber Axe";
	}

	@Override
	public boolean onBlockDestroyed (ItemStack itemstack, World world, int bID, int x, int y, int z, EntityLiving player)
	{
		Block block = Block.blocksList[bID];
		if (block != null && block.blockMaterial == Material.leaves)
			return false;

		return AbilityHelper.onBlockChanged(itemstack, world, bID, x, y, z, player, random);
	}

	static Material[] materials = { Material.wood, Material.circuits, Material.cactus, Material.pumpkin, Material.leaves };

	/* Lumber axes specific */

	@Override
	public boolean onBlockStartBreak (ItemStack stack, int x, int y, int z, EntityPlayer player)
	{
		World world = player.worldObj;
		int woodID = world.getBlockId(x, y, z);
		Block wood = Block.blocksList[woodID];
		if (wood.isWood(world, x, y, z))
		{
			int height = y;
			boolean foundTop = false;
			do
			{
				height++;
				int blockID = world.getBlockId(x, height, z);
				if (blockID != woodID)
				{
					height--;
					foundTop = true;
				}
			} while (!foundTop);

			int numLeaves = 0;
			for (int xPos = x - 1; xPos <= x + 1; xPos++)
			{
				for (int yPos = height - 1; yPos <= height + 1; yPos++)
				{
					for (int zPos = z - 1; zPos <= z + 1; zPos++)
					{
						Block leaves = Block.blocksList[world.getBlockId(xPos, yPos, zPos)];
						if (leaves != null && leaves.isLeaves(world, xPos, yPos, zPos))
							numLeaves++;
					}
				}
			}

			System.out.println("Tree'd " + numLeaves);
			NBTTagCompound tags = stack.getTagCompound().getCompoundTag("InfiTool");
			int meta = world.getBlockMetadata(x, y, z);
			if (numLeaves > 3)
				breakTree(world, x, y, z, stack, tags, woodID, meta, player);
			else
				destroyWood(world, x, y, z, stack, tags, player);
			
			if (!world.isRemote)
				world.playAuxSFX(2001, x, y, z, woodID + (meta << 12));
		}
		return super.onBlockStartBreak(stack, x, y, z, player);
	}

	void breakTree (World world, int x, int y, int z, ItemStack stack, NBTTagCompound tags, int bID, int meta, EntityPlayer player)
	{
		for (int xPos = x-1; xPos <= x+1; xPos++)
		{
			for (int yPos = y-1; yPos <= y+1; yPos++)
			{
				for (int zPos = z-1; zPos <= z+1; zPos++)
				{
					if (!(tags.getBoolean("Broken")))
					if (world.getBlockId(xPos, yPos, zPos) == bID && world.getBlockMetadata(xPos, yPos, zPos) == meta)
					{
						Block.blocksList[bID].harvestBlock(world, player, xPos, yPos, zPos, meta);
						world.setBlockWithNotify(xPos, yPos, zPos, 0);
						if (!player.capabilities.isCreativeMode)
							onBlockDestroyed(stack, world, bID, xPos, yPos, zPos, player);
						breakTree(world, xPos, yPos, zPos, stack, tags, bID, meta, player);
					}
				}
			}
		}
	}
	
	void destroyWood(World world, int x, int y, int z, ItemStack stack, NBTTagCompound tags, EntityPlayer player)
	{
		for (int xPos = x-1; xPos <= x+1; xPos++)
		{
			for (int yPos = y-1; yPos <= y+1; yPos++)
			{
				for (int zPos = z-1; zPos <= z+1; zPos++)
				{
					if (!(tags.getBoolean("Broken")))
					{
						int blockID = world.getBlockId(xPos, yPos, zPos);
						Block block = Block.blocksList[blockID];
						if (block != null && block.blockMaterial == Material.wood)
						{
							Block.blocksList[blockID].harvestBlock(world, player, xPos, yPos, zPos, world.getBlockMetadata(xPos, yPos, zPos));
							world.setBlockWithNotify(xPos, yPos, zPos, 0);
							if (!player.capabilities.isCreativeMode)
								onBlockDestroyed(stack, world, blockID, xPos, yPos, zPos, player);
						}
					}
				}
			}
		}
	}
}
