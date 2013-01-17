package tinker.toolconstruct;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tinker.toolconstruct.blocks.*;
import tinker.toolconstruct.crafting.*;
import tinker.toolconstruct.items.*;
import tinker.toolconstruct.modifiers.*;
import tinker.toolconstruct.tools.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class TConstructContent
{
	//Patterns and other materials
	public static Item materials;
	public static Item toolRod;
	public static Item toolShard;
	public static Item woodPattern;
	public static Item stonePattern;
	public static Item netherPattern;
	
	//Tools
	public static ToolCore pickaxe;
	public static ToolCore shovel;
	public static ToolCore axe;
	public static ToolCore broadsword;
	public static ToolCore longsword;
	public static ToolCore rapier;
	
	public static ToolCore frypan;
	public static ToolCore battlesign;
	
	public static ToolCore mattock;
	public static ToolCore lumberaxe;
	
	//Tool parts
	public static Item pickaxeHead;
	public static Item shovelHead;
	public static Item axeHead;
	public static Item swordBlade;
	public static Item largeGuard;
	public static Item medGuard;
	public static Item crossbar;
	public static Item binding;
	
	public static Item frypanHead;
	public static Item signHead;
	
	//Crafting blocks
	public static Block woodCrafter;
	public static Block stoneCrafter;
	public static Block netherCrafter;
	
	public static Block heldItemBlock;
	public static Block ores;
	
	//Tool modifiers
	public static ModElectric modE;
	
	public TConstructContent()
	{
		createItems();
		registerMaterials();
		addToolRecipes();
		addCraftingRecipes();
		setupToolTabs();
	}
	
	void createItems ()
	{
		woodCrafter = new ToolStationBlock(PHTools.woodCrafter, Material.wood);
		GameRegistry.registerBlock(woodCrafter, tinker.toolconstruct.blocks.ToolStationItemBlock.class, "ToolStationBlock");
		GameRegistry.registerTileEntity(tinker.toolconstruct.blocks.ToolStationLogic.class, "ToolStation");
		GameRegistry.registerTileEntity(tinker.toolconstruct.blocks.PartCrafterLogic.class, "PartCrafter");
		
		heldItemBlock = new EquipBlock(PHTools.heldItemBlock, Material.wood);
		GameRegistry.registerBlock(heldItemBlock, "HeldItemBlock");
		GameRegistry.registerTileEntity(tinker.toolconstruct.blocks.FrypanLogic.class, "FrypanLogic");
		
		ores = new TBaseOre(PHTools.ores, 48);
		GameRegistry.registerBlock(ores, tinker.toolconstruct.blocks.TBaseOreItem.class, "TConstruct.ores");

		//materials = new ToolPart(PHTools.materials, 64, craftingTexture).setItemName("tconstruct.Materials");
		toolRod = new ToolPart(PHTools.toolRod, 0, craftingTexture).setItemName("tconstruct.ToolRod");
		toolShard = new ToolPart(PHTools.toolShard, 64, craftingTexture).setItemName("tconstruct.ToolShard");
		woodPattern = new Pattern(PHTools.woodPattern, 0, patternTexture).setItemName("tconstruct.Pattern");
		stonePattern = new Pattern(PHTools.stonePattern, 64, patternTexture).setItemName("tconstruct.Pattern");
		netherPattern = new Pattern(PHTools.netherPattern, 128, patternTexture).setItemName("tconstruct.Pattern");
		
		pickaxe = new Pickaxe(PHTools.pickaxe, pickaxeTexture);
		shovel = new Shovel(PHTools.shovel, shovelTexture);
		axe = new Axe(PHTools.axe, axeTexture);
		broadsword = new Broadsword(PHTools.broadsword, broadswordTexture);
		longsword = new Longsword(PHTools.longsword, longswordTexture);
		rapier = new Rapier(PHTools.rapier, rapierTexture);
		
		frypan = new FryingPan(PHTools.frypan, frypanTexture);
		battlesign = new BattleSign(PHTools.battlesign, signTexture);
		mattock = new Mattock(PHTools.mattock, mattockTexture);
		lumberaxe = new LumberAxe(PHTools.lumberaxe, lumberaxeTexture);
				
		pickaxeHead = new ToolPart(PHTools.pickaxeHead, 0, baseHeads).setItemName("tconstruct.PickaxeHead");
		shovelHead = new ToolPart(PHTools.shovelHead, 64, baseHeads).setItemName("tconstruct.ShovelHead");
		axeHead = new ToolPart(PHTools.axeHead, 128, baseHeads).setItemName("tconstruct.AxeHead");
		swordBlade = new ToolPart(PHTools.swordBlade, 0, swordparts).setItemName("tconstruct.SwordBlade");
		largeGuard = new ToolPart(PHTools.largeGuard, 64, swordparts).setItemName("tconstruct.LargeGuard");
		medGuard = new ToolPart(PHTools.medGuard, 128, swordparts).setItemName("tconstruct.MediumGuard");
		crossbar = new ToolPart(PHTools.crossbar, 192, swordparts).setItemName("tconstruct.Crossbar");
		binding = new ToolPart(PHTools.binding, 0, baseAccessories).setItemName("tconstruct.Binding");
		
		frypanHead = new ToolPart(PHTools.frypanHead, 0, jokeparts).setItemName("tconstruct.FrypanHead");
		signHead = new ToolPart(PHTools.signHead, 64, jokeparts).setItemName("tconstruct.SignHead");
	}
	
	void registerMaterials ()
	{
		PatternBuilder pb = PatternBuilder.instance;
		pb.registerFullMaterial(Block.planks, 2, "wood", new ItemStack(Item.stick), new ItemStack(Item.stick), 0);
		pb.registerFullMaterial(Block.stone, 2, "stone", 1);
		pb.registerMaterial(Block.cobblestone, 2, "stone");
		pb.registerFullMaterial(Item.ingotIron, 2, "iron", 2);
		pb.registerFullMaterial(Item.flint, 2, "flint", 3);
		pb.registerFullMaterial(Block.cactus, 2, "cactus", 4);
		pb.registerFullMaterial(Item.bone, 2, "bone", new ItemStack(toolShard, 1, 5), new ItemStack(Item.bone), 5);
		pb.registerFullMaterial(Block.obsidian, 2, "obsidian", 6);
		pb.registerFullMaterial(Block.netherrack, 2, "netherrack", 7);
		pb.registerFullMaterial(Item.slimeBall, 2, "slime", 8); //TODO: Register a better material
		pb.registerFullMaterial(Item.paper, 2, "paper", new ItemStack(Item.paper), new ItemStack(toolRod, 1, 9), 9); //TODO: Register a better material
		
		Item[] items = { toolRod, pickaxeHead, shovelHead, axeHead, swordBlade, largeGuard, medGuard, crossbar, binding, frypanHead, signHead };
		for (int iter = 0; iter < items.length; iter++)
		{
			pb.addToolPattern(new ItemStack(woodPattern, 1, iter+1), items[iter]);
			pb.addToolPattern(new ItemStack(stonePattern, 1, iter+1), items[iter]);
			pb.addToolPattern(new ItemStack(netherPattern, 1, iter+1), items[iter]);
		}
	}
	
	void addToolRecipes ()
	{
		ToolBuilder tb = ToolBuilder.instance;
		tb.addToolRecipe(pickaxe, pickaxeHead, binding);
		tb.addToolRecipe(broadsword, swordBlade, largeGuard);
		tb.addToolRecipe(axe, axeHead);
		tb.addToolRecipe(shovel, shovelHead);
		tb.addToolRecipe(longsword, swordBlade, medGuard);
		tb.addToolRecipe(rapier, swordBlade, crossbar);
		tb.addToolRecipe(frypan, frypanHead);
		tb.addToolRecipe(battlesign, signHead);
		tb.addToolRecipe(mattock, axeHead, shovelHead);
		tb.addToolRecipe(lumberaxe, axeHead, axeHead);
		
		tb.registerToolMod(new ModRepair());
		tb.registerToolMod(new ModDurability(new ItemStack[] {new ItemStack(Item.diamond)}, 0, 500, 0f, 3, "Diamond", "\u00a7bDurability +500", "\u00a7b"));
		tb.registerToolMod(new ModDurability(new ItemStack[] {new ItemStack(Item.emerald)}, 1, 0, 0.5f, 2, "Emerald", "\u00a72Durability +50%", "\u00a72"));
		modE = new ModElectric();
		tb.registerToolMod(modE);
		tb.registerToolMod(new ModRedstone(new ItemStack[] {new ItemStack(Item.redstone)}, 2, 1));
		tb.registerToolMod(new ModRedstone(new ItemStack[] { new ItemStack(Item.redstone), new ItemStack(Item.redstone) }, 2, 2));
		tb.registerToolMod(new ModLapisBase(new ItemStack[] {new ItemStack(Block.blockLapis), new ItemStack(Block.blockLapis)}, 10));
		tb.registerToolMod(new ModLapisIncrease(new ItemStack[] {new ItemStack(Item.dyePowder, 1, 4)}, 10, 1));
		tb.registerToolMod(new ModLapisIncrease(new ItemStack[] {new ItemStack(Block.blockLapis)}, 10, 9));
		
		ItemStack reBattery = ic2.api.Items.getItem("reBattery");
		if (reBattery != null)
			modE.batteries.add(reBattery);
		ItemStack chargedReBattery = ic2.api.Items.getItem("chargedReBattery");
		if (chargedReBattery != null)
			modE.batteries.add(chargedReBattery);
		ItemStack electronicCircuit = ic2.api.Items.getItem("electronicCircuit");
		if (electronicCircuit != null)
			modE.circuits.add(electronicCircuit);
	}
	
	void addCraftingRecipes ()
	{
		/*GameRegistry.addRecipe(new ItemStack(woodCrafter, 1, 0), "c", 'c', Block.workbench);
		GameRegistry.addRecipe(new ItemStack(woodCrafter, 1, 1), "cc", 'c', Block.workbench);*/
		GameRegistry.addRecipe(new ItemStack(woodCrafter, 1, 0), "p", "w", 'p', new ItemStack(woodPattern, 1, 0), 'w', Block.workbench);
		GameRegistry.addRecipe(new ItemStack(woodCrafter, 1, 1), "p", "w", 'p', new ItemStack(woodPattern, 1, 0), 'w', new ItemStack(Block.wood, 1, 0));
		GameRegistry.addRecipe(new ItemStack(woodCrafter, 1, 2), "p", "w", 'p', new ItemStack(woodPattern, 1, 0), 'w', new ItemStack(Block.wood, 1, 1));
		GameRegistry.addRecipe(new ItemStack(woodCrafter, 1, 3), "p", "w", 'p', new ItemStack(woodPattern, 1, 0), 'w', new ItemStack(Block.wood, 1, 2));
		GameRegistry.addRecipe(new ItemStack(woodCrafter, 1, 4), "p", "w", 'p', new ItemStack(woodPattern, 1, 0), 'w', new ItemStack(Block.wood, 1, 3));
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodCrafter, 1, 1), "p", "w", 'p', new ItemStack(woodPattern, 1, 0), 'w', "logWood"));
		
		GameRegistry.addRecipe( new ShapedOreRecipe(new ItemStack(woodPattern, 1, 0), "ps", "sp", 'p', "plankWood", 's', Item.stick));
		GameRegistry.addRecipe(new ItemStack(stonePattern, 1, 0), "ps", "sp", 'p', Block.cobblestone, 's', new ItemStack(toolRod, 1, 1));
		GameRegistry.addRecipe(new ItemStack(stonePattern, 1, 0), "ps", "sp", 'p', Block.stone, 's', new ItemStack(toolRod, 1, 1));
		GameRegistry.addRecipe(new ItemStack(netherPattern, 1, 0), "ps", "sp", 'p', Block.netherrack, 's', new ItemStack(toolRod, 1, 7));
		
		for (int i = 0; i < 11; i++)
		{
			GameRegistry.addRecipe(new ItemStack(TConstructContent.woodPattern, 1, i + 1), "s", 's', new ItemStack(TConstructContent.woodPattern, 1, i));
			GameRegistry.addRecipe(new ItemStack(TConstructContent.stonePattern, 1, i + 1), "s", 's', new ItemStack(TConstructContent.stonePattern, 1, i));
			GameRegistry.addRecipe(new ItemStack(TConstructContent.netherPattern, 1, i + 1), "s", 's', new ItemStack(TConstructContent.netherPattern, 1, i));
		}
	}
	
	void setupToolTabs ()
	{
		ToolConstruct.materialTab.init(new ItemStack(TConstructContent.woodPattern, 1, 255));
		ToolConstruct.blockTab.init(new ItemStack(woodCrafter));
		ItemStack tool = new ItemStack(longsword, 1, 0);

		NBTTagCompound compound = new NBTTagCompound();
		compound.setCompoundTag("InfiTool", new NBTTagCompound());
		compound.getCompoundTag("InfiTool").setInteger("RenderHead", 2);
		compound.getCompoundTag("InfiTool").setInteger("RenderHandle", 0);
		compound.getCompoundTag("InfiTool").setInteger("RenderAccessory", 10);
		tool.setTagCompound(compound);

		ToolConstruct.toolTab.init(tool);
	}
	
	ItemStack[] materialArray = { new ItemStack(Block.planks), new ItemStack(Block.cobblestone), new ItemStack(Item.ingotIron), new ItemStack(Item.flint), 
			new ItemStack(Block.cactus), new ItemStack(Item.bone), new ItemStack(Block.obsidian), new ItemStack(Block.netherrack), new ItemStack(Item.slimeBall), 
			new ItemStack(Item.paper) };
	
	public static String blockTexture = "/tinkertextures/ConstructBlocks.png";
	
	public static String craftingTexture = "/tinkertextures/tools/materials.png";
	public static String patternTexture = "/tinkertextures/tools/patterns.png";
	public static String baseHeads = "/tinkertextures/tools/baseheads.png";
	public static String baseAccessories = "/tinkertextures/tools/baseaccessories.png";
	public static String swordparts = "/tinkertextures/tools/swordparts.png";
	public static String jokeparts = "/tinkertextures/tools/jokeparts.png";

	public static String pickaxeTexture = "/tinkertextures/tools/pickaxes.png";
	public static String broadswordTexture = "/tinkertextures/tools/swordbroad.png";
	public static String shovelTexture = "/tinkertextures/tools/shovels.png";
	public static String axeTexture = "/tinkertextures/tools/axes.png";
	public static String longswordTexture = "/tinkertextures/tools/swordlong.png";
	public static String rapierTexture = "/tinkertextures/tools/swordrapier.png";
	public static String frypanTexture = "/tinkertextures/tools/frypans.png";
	public static String signTexture = "/tinkertextures/tools/battlesigns.png";
	public static String mattockTexture = "/tinkertextures/tools/mattock.png";
	public static String lumberaxeTexture = "/tinkertextures/tools/lumberaxe.png";
}