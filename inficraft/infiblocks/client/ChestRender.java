package inficraft.infiblocks.client;

import inficraft.infiblocks.InfiBlocks;
import inficraft.infiblocks.tech.ChestLogic;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.world.IBlockAccess;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class ChestRender implements ISimpleBlockRenderingHandler
{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {
		if (modelID == InfiBlocks.getContentInstance().chestModelID)
		{
			renderChest(block, metadata, 0);
	        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
		}
		
	}
	
	 private static ChestLogic logic = new ChestLogic();
	    //TODO: Move render code outside item
	    public static void renderChest(Block var0, int var1, float var2)
	    {
	        logic.metadata = var1;
	        TileEntityRenderer.instance.renderTileEntityAt(logic, 0.0D, 0.0D, 0.0D, 0.0F);
	    }

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelID, RenderBlocks renderer) 
	{	
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		return true;
	}

	@Override
	public int getRenderId() {
		return 0;
	}

}
