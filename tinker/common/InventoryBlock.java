package tinker.common;

import inficraft.infiblocks.tech.FurnaceLogic;

import java.util.Random;

import tinker.toolconstruct.ToolConstruct;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class InventoryBlock extends BlockContainer
{
	protected InventoryBlock(int id, Material material)
	{
		super(id, material);
	}

	/* Logic backend */
	public TileEntity createNewTileEntity (World var1) { return null; }	
	public abstract TileEntity createNewTileEntity(World world, int metadata);
	public abstract Integer getGui(World world, int x, int y, int z, EntityPlayer entityplayer);    
    public abstract Object getModInstance();

	@Override
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float clickX, float clickY, float clickZ)
	{
		if (player.isSneaking())
			return false;
		
		Integer integer = getGui(world, x, y, z, player);
		if (integer == null || integer == -1)
		{
			return false;
		}
		else
		{
			player.openGui(getModInstance(), integer, world, x, y, z);
			return true;
		}
	}

	/* Inventory */
	
	@Override
	public void breakBlock (World par1World, int x, int y, int z, int par5, int par6)
	{
		InventoryLogic logic = (InventoryLogic) par1World.getBlockTileEntity(x, y, z);

		if (logic != null)
		{
			for (int iter = 0; iter < logic.getSizeInventory(); ++iter)
			{
				ItemStack stack = logic.getStackInSlot(iter);

				if (stack != null)
				{
					float jumpX = ToolConstruct.tRand.nextFloat() * 0.8F + 0.1F;
					float jumpY = ToolConstruct.tRand.nextFloat() * 0.8F + 0.1F;
					float jumpZ = ToolConstruct.tRand.nextFloat() * 0.8F + 0.1F;

					while (stack.stackSize > 0)
					{
						int itemSize = ToolConstruct.tRand.nextInt(21) + 10;

						if (itemSize > stack.stackSize)
						{
							itemSize = stack.stackSize;
						}

						stack.stackSize -= itemSize;
						EntityItem entityitem = new EntityItem(par1World, (double) ((float) x + jumpX), (double) ((float) y + jumpY), (double) ((float) z + jumpZ), 
								new ItemStack(stack.itemID, itemSize, stack.getItemDamage()));

						if (stack.hasTagCompound())
						{
							entityitem.func_92014_d().setTagCompound((NBTTagCompound) stack.getTagCompound().copy());
						}

						float offset = 0.05F;
						entityitem.motionX = (double) ((float) ToolConstruct.tRand.nextGaussian() * offset);
						entityitem.motionY = (double) ((float) ToolConstruct.tRand.nextGaussian() * offset + 0.2F);
						entityitem.motionZ = (double) ((float) ToolConstruct.tRand.nextGaussian() * offset);
						par1World.spawnEntityInWorld(entityitem);
					}
				}
			}
		}

		super.breakBlock(par1World, x, y, z, par5, par6);
	}
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLiving entityliving)
    {
		TileEntity logic = world.getBlockTileEntity(x, y, z);
		if (logic instanceof IFacingLogic)
		{
			IFacingLogic facing = (IFacingLogic) logic;
			//Set facing here
		}
    }
	
	public static boolean isActive(IBlockAccess world, int x, int y, int z)
    {
		TileEntity logic = world.getBlockTileEntity(x, y, z);
		if (logic instanceof IActiveLogic)
		{
			return ((IActiveLogic)logic).getActive();
		}
		return false;
    }
}
