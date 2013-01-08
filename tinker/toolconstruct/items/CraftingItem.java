package tinker.toolconstruct.items;

import tinker.toolconstruct.ToolConstruct;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;

public class CraftingItem extends Item
{
	public CraftingItem(int id, int icon, String tex)
	{
		super(id);
		this.setCreativeTab(ToolConstruct.materialTab);
		this.iconIndex = icon;
		this.setTextureFile(tex);
	}

	@SideOnly(Side.CLIENT)
	public int getIconFromDamage(int meta)
	{
		return this.iconIndex + meta;
	}
}
