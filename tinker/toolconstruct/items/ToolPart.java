package tinker.toolconstruct.items;


import java.util.List;

import tinker.toolconstruct.ToolConstruct;
import tinker.toolconstruct.client.TProxyClient;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ToolPart extends CraftingItem
{
	public final boolean isHead;
	public ToolPart(int id, int icon, String tex, boolean head)
	{
		super(id, icon, tex);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		isHead = head;
	}

	public String getItemNameIS(ItemStack stack)
	{
		int arr = MathHelper.clamp_int(stack.getItemDamage(), 0, 12);
		return getItemName() + "." +toolMaterialNames[arr];
	}
	
	public void getSubItems(int id, CreativeTabs tab, List list)
    {
		for (int i = 0; i < 13; i++)
			list.add(new ItemStack(id, 1, i));
    }
	
	public static final String[] toolMaterialNames = new String[] { 
		"Wood", "Stone", "Iron", "Flint", "Cactus", "Bone", "Obsidian", "Netherrack", "Slime", "Paper", "Cobalt", "Ardite", "Manyullyn" };
}
