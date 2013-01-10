package tinker.toolconstruct.client;


import java.io.File;

import tinker.toolconstruct.TProxyCommon;
import tinker.toolconstruct.ToolConstruct;
import tinker.toolconstruct.ToolItems;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TProxyClient extends TProxyCommon
{
	/* Registers any rendering code. */
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(ToolItems.craftingTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.baseHeads);
		MinecraftForgeClient.preloadTexture(ToolItems.baseAccessories);
		MinecraftForgeClient.preloadTexture(ToolItems.patternTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.swordparts);
		MinecraftForgeClient.preloadTexture(ToolItems.jokeparts);
		
		MinecraftForgeClient.preloadTexture(ToolItems.pickaxeTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.broadswordTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.shovelTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.axeTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.longswordTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.rapierTexture);
		
		MinecraftForgeClient.preloadTexture(ToolItems.frypanTexture);
		MinecraftForgeClient.preloadTexture(ToolItems.signTexture);
		MinecraftForgeClient.preloadTexture("/tinkertextures/ConstructBlocks.png");
	}
	
	
	/* Ties an internal name to a visible one. */
	public void addNames() 
	{
		LanguageRegistry.instance().addStringLocalization("itemGroup.TConstruct", "TConstruct Tools");
		LanguageRegistry.instance().addStringLocalization("itemGroup.TConMaterials", "TConstruct Materials");
		
		LanguageRegistry.instance().addStringLocalization("crafters.ToolStation", "Tool Station");
		LanguageRegistry.instance().addStringLocalization("crafters.PartBuilder", "Part Builder");
		
		LanguageRegistry.instance().addStringLocalization("ToolStation.Crafter.name", "Tool Station");
		LanguageRegistry.instance().addStringLocalization("ToolStation.Parts.name", "Tool Part Station");
		
		for (int mat = 0; mat < materialTypes.length; mat++)
		{
			for (int type = 0; type < toolMaterialNames.length; type++)
			{
				String internalName = new StringBuilder().append("item.tconstruct.").append(materialTypes[mat]).append(".").append(toolMaterialNames[type]).append(".name").toString();
				String visibleName = new StringBuilder().append(toolMaterialNames[type]).append(materialNames[mat]).toString();
				LanguageRegistry.instance().addStringLocalization(internalName, "en_US", visibleName);
			}			
		}
		
		for (int i = 0; i < patterns.length; i++)
		{
			String internalName = "item.tconstruct.Pattern."+patterns[i]+".name";
			String visibleName = patternNames[i]+" Pattern";
			LanguageRegistry.instance().addStringLocalization(internalName, "en_US", visibleName);
		}
		
		LanguageRegistry.addName(ToolItems.pickaxe, "Pickaxe");
		LanguageRegistry.addName(ToolItems.shovel, "Shovel");
		LanguageRegistry.addName(ToolItems.axe, "Axe");
		LanguageRegistry.addName(ToolItems.broadsword, "Broadsword");
		LanguageRegistry.addName(ToolItems.longsword, "Longsword");
		LanguageRegistry.addName(ToolItems.rapier, "Rapier");
		LanguageRegistry.addName(ToolItems.frypan, "Frying Pan");
		LanguageRegistry.addName(ToolItems.battlesign, "Battlesign");
	}
	
	@Override
	public File getLocation()
	{
		return Minecraft.getMinecraftDir();
	}
	
	
	public static final String[] toolMaterialNames = new String[] { 
		"Wood", "Stone", "Iron", "Flint", "Cactus", "Bone", "Obsidian", "Netherrack", "Slime", "Paper", "Cobalt", "Ardite", "Manyullyn" };
	
	public static final String[] materialTypes = new String[] {
		"ToolRod", "PickaxeHead", "ToolShard", "ShovelHead", "AxeHead", "SwordBlade", "LargeGuard", "MediumGuard", "Crossbar", "Binding", "FrypanHead", "SignHead" };
	
	public static final String[] materialNames = new String[] {
		" Rod", " Pickaxe Head", " Shard", " Shovel Head", " Axe Head", " Sword Blade", " Wide Guard", " Cover", " Crossbar", " Binding", " Pan", " Board" };
	
	public static final String[] patterns = new String[] {
		"blank", "rod", "pickaxe", "shovel", "axe", "blade", "largeguard", "medguard", "crossbar", "binding", "frypan", "sign" };
	
	public static final String[] patternNames = new String[] {
		"Blank", "Tool Rod","Pickaxe Head", "Shovel Head", "Axe Head", "Sword Blade", "Large Guard", "Medium Guard", "Crossbar", "Tool Binding", "Pan", "Board" };
}
