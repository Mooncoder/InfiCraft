package tinker.toolconstruct.blocks;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tinker.common.InventoryLogic;
import tinker.toolconstruct.TConstructContent;
import tinker.toolconstruct.crafting.PatternBuilder;
import tinker.toolconstruct.items.Pattern;

public class PartCrafterLogic extends InventoryLogic
{
	boolean craftedTop;
	boolean craftedBottom;

	public PartCrafterLogic()
	{
		super(10);
		craftedTop = false;
		craftedBottom = false;
	}

	@Override
	public String getInvName ()
	{
		return "toolstation.parts";
	}

	@Override
	public Container getGuiContainer (InventoryPlayer inventoryplayer, World world, int x, int y, int z)
	{
		for (int xPos = x-1; xPos <= x+1; xPos++)
		{
			for (int zPos = z-1; zPos <= z+1; zPos++)
			{
				TileEntity tile = world.getBlockTileEntity(xPos, y, zPos);
				if (tile != null && tile instanceof PatternHolderLogic)
					return new PartCrafterChestContainer(inventoryplayer, this, (PatternHolderLogic)tile);
					//return ((PatternHolderLogic) tile).getGuiContainer(player.inventory, world, x, y, z);
			}
		}
		System.out.println("Regular container");
		return new PartCrafterContainer(inventoryplayer, this);
	}

	//Called when emptying a slot, not when another item is placed in it
	public ItemStack decrStackSize (int slot, int quantity)
	{
		ItemStack returnStack = super.decrStackSize(slot, quantity);

		if (slot == 4 || slot == 5)
		{
			if (!craftedTop)
			{
				int value = PatternBuilder.instance.getPartValue(inventory[1]);
				int cost = ((Pattern)inventory[0].getItem()).getPatternCost(inventory[0].getItemDamage());
				if (value > 0)
				{
					int decrease = cost / value;
					if (cost % value != 0)
						decrease++;
					super.decrStackSize(1, decrease); //Call super to avoid crafting again
				}
			}
			
			if (inventory[4] != null || inventory[5] != null)
				craftedTop = true;
			else
				craftedTop = false;
		}

		if (!craftedTop)
			buildTopPart();
		
		if (slot == 6 || slot == 7)
		{
			if (!craftedBottom)
			{
				int value = PatternBuilder.instance.getPartValue(inventory[3]);
				int cost = ((Pattern)inventory[2].getItem()).getPatternCost(inventory[2].getItemDamage());
				if (value > 0)
				{
					int decrease = cost / value;
					if (cost % value != 0)
						decrease++;
					super.decrStackSize(3, decrease); //Call super to avoid crafting again
				}
			}
			
			if (inventory[6] != null || inventory[7] != null)
				craftedBottom = true;
			else
				craftedBottom = false;
		}

		if (!craftedBottom)
			buildBottomPart();

		return returnStack;
	}

	//Called when a slot has something placed into it.
	public void setInventorySlotContents (int slot, ItemStack itemstack)
	{
		super.setInventorySlotContents(slot, itemstack);
		if ((slot == 0 || slot == 1) && !craftedTop)
			buildTopPart();
		if ((slot == 2 || slot == 3) && !craftedBottom)
			buildBottomPart();
	}

	void buildTopPart ()
	{
		ItemStack[] parts = PatternBuilder.instance.getToolPart(inventory[1], inventory[0], inventory[2]);
		if (parts != null)
		{
			inventory[4] = parts[0];
			inventory[5] = parts[1];
		}
		else
		{
			inventory[4] = inventory[5] = null;
		}
	}

	void buildBottomPart ()
	{
		ItemStack[] parts = PatternBuilder.instance.getToolPart(inventory[3], inventory[2], inventory[0]);
		if (parts != null)
		{
			inventory[6] = parts[0];
			inventory[7] = parts[1];
		}
		else
		{
			inventory[6] = inventory[7] = null;
		}
	}

	public boolean shouldRemoveItemsForCrafting (int slot)
	{
		if ((slot == 4 || slot == 5) && craftedTop)
			return false;
		if ((slot == 6 || slot == 7) && craftedBottom)
			return false;

		return true;
	}

	/* NBT */
	public void readFromNBT (NBTTagCompound tags)
	{
		super.readFromNBT(tags);
		craftedTop = tags.getBoolean("CraftedTop");
		craftedBottom = tags.getBoolean("CraftedBottom");
	}

	public void writeToNBT (NBTTagCompound tags)
	{
		super.writeToNBT(tags);
		tags.setBoolean("CraftedTop", craftedTop);
		tags.setBoolean("CraftedBottom", craftedBottom);
	}
}
