package tinker.toolconstruct.tools;

import tinker.toolconstruct.ToolItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Pickaxe extends HarvestTool
{

	public Pickaxe(int itemID, String tex)
	{
		super(itemID, 1, tex);
		this.setItemName("InfiTool.Pickaxe");
	}
	
	@Override
	protected String getHarvestType()
	{
		return "pickaxe";
	}

	@Override
	protected Material[] getEffectiveMaterials()
	{
		return materials;
	}

	static Material[] materials = new Material[] { Material.rock, Material.iron, Material.ice, Material.glass, Material.piston };

	
}
