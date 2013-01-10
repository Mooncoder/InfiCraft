package inficraft.armory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ArmorStandEntity extends EntityEquipment
{
	//Container inventory;
	public ArmorStandEntity(World world)
	{
		super(world);
		this.texture = "/tinkertextures/mob/armorstandtexture.png";
		//inventory = new ArmorStandContainer(this);
	}

	public boolean interact (EntityPlayer player)
	{
		//if (player.getCurrentEquippedItem() == null)
		if (player.isSneaking())
		{
			int facing = (int) ((player.rotationYawHead + 225) * 16 / 360);
			setRotation(facing * 22.5f, 0);
		}
		else
			player.openGui(InfiArmory.instance, entityId, worldObj, (int) posX, (int) posY, (int) posZ);
		return true;
	}

	@Override
	protected void setRotation (float par1, float par2)
	{
		this.rotationYaw = par1 % 360.0F;
		this.rotationYawHead = rotationYaw + 315F;
		this.rotationPitch = par2 % 360.0F;
	}

	@Override
	public Container getContainer (EntityPlayer player)
	{
		return new ArmorStandContainer(player.inventory, this);
	}

	@Override
	public int getSizeInventory ()
	{
		return 5;
	}

	@Override
	public ItemStack getStackInSlot (int slot)
	{
		return getCurrentItemOrArmor(slot);
	}

	@Override
	public ItemStack decrStackSize (int slot, int stackSize)
	{
		if (getCurrentItemOrArmor(slot) != null)
		{
			if (getCurrentItemOrArmor(slot).stackSize <= stackSize)
			{
				ItemStack itemstack = getCurrentItemOrArmor(slot);
				setCurrentItemOrArmor(slot, null);
				return itemstack;
			}
			ItemStack itemstack1 = getCurrentItemOrArmor(slot).splitStack(stackSize);
			if (getCurrentItemOrArmor(slot).stackSize == 0)
			{
				setCurrentItemOrArmor(slot, null);
			}
			return itemstack1;
		}
		else
		{
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing (int var1)
	{
		return null;
	}

	@Override
	public void setInventorySlotContents (int slot, ItemStack itemstack)
	{
		setCurrentItemOrArmor(slot, itemstack);
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
		{
			itemstack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public String getInvName ()
	{
		return "Inventory";
	}

	@Override
	public int getInventoryStackLimit ()
	{
		return 1;
	}

	@Override
	public void onInventoryChanged ()
	{

	}

	@Override
	public boolean isUseableByPlayer (EntityPlayer var1)
	{
		return true;
	}

	public void openChest ()
	{
	}

	public void closeChest ()
	{
	}
}
