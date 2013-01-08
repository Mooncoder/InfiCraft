package tinker.toolconstruct;

import tinker.toolconstruct.blocks.PartCrafterLogic;
import tinker.toolconstruct.blocks.ToolStationLogic;
import tinker.toolconstruct.client.*;
import tinker.toolconstruct.crafting.*;
import inficraft.api.machines.BlockLogicBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	int stationID = 0;
	int partID = 1;

	@Override
	public Object getServerGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		if (tile != null && tile instanceof BlockLogicBase)
			return ((BlockLogicBase) tile).getGuiContainer(player.inventory);
		return null;
	}

	@Override
	public Object getClientGuiElement (int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if (ID == stationID)
			return new ToolStationGui(player.inventory, (ToolStationLogic) world.getBlockTileEntity(x, y, z));
		if (ID == partID)
			return new PartCrafterGui(player.inventory, (PartCrafterLogic) world.getBlockTileEntity(x, y, z));
		return null;
	}

}
