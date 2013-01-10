package florasoma.trees;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import florasoma.trees.blocks.FloraDoor;
import florasoma.trees.blocks.FloraDoorItem;
import florasoma.trees.blocks.FloraLeaves;
import florasoma.trees.blocks.FloraLeavesNocolor;
import florasoma.trees.blocks.FloraSaplingBlock;
import florasoma.trees.blocks.LogTwoxTwo;
import florasoma.trees.blocks.Planks;
import florasoma.trees.blocks.SimpleLog;
import florasoma.trees.blocks.TreeBlock;
import florasoma.trees.entities.FloraBoat;
import florasoma.trees.worldgen.TreeWorldgen;

@Mod(modid = "Flora Trees", name = "Flora and Soma Trees", version = "1.4.6_2013.1.9")
public class FloraTrees
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "florasoma.trees.FloraTreesClientProxy", serverSide = "florasoma.trees.FloraTreesCommonProxy")
	public static FloraTreesCommonProxy proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("Flora Trees")
	public static FloraTrees instance;

	/* Initial loading, used to define blocks, items, and entities */
	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHTrees.initProps();
		MinecraftForge.EVENT_BUS.register(this);
		
		tree = new TreeBlock(PHTrees.treeID);
		redwood = new SimpleLog(PHTrees.redwoodID, 32, texture);
		planks = new Planks(PHTrees.planksID, 80, texture);
		floraLeaves = new FloraLeaves(PHTrees.floraLeavesID, 112);
		floraLeavesNoColor = new FloraLeavesNocolor(PHTrees.cherryLeavesID, 115);
		floraSapling = new FloraSaplingBlock(PHTrees.floraSaplingID);
		
		redwoodDoorItem = new FloraDoorItem(PHTrees.redwoodDoorItemID, PHTrees.redwoodDoorID).setIconCoord(3, 9).setItemName("redwoodDoorItem");
		redwoodDoor = new FloraDoor(PHTrees.redwoodDoorID, 162, Material.wood, redwoodDoorItem.itemID);		
		
		bloodwood = new LogTwoxTwo(2000, 48, texture, 8f).setBlockName("bloodwood");
		
		floraBoat = new FloraBoat(PHTrees.boatItemID).setIconCoord(0, 3).setItemName("floraBoat");
		
		GameRegistry.registerBlock(tree, florasoma.trees.blocks.TreeItem.class, "tree");
		GameRegistry.registerBlock(redwood, florasoma.trees.blocks.RedwoodItem.class, "redwood");
		GameRegistry.registerBlock(planks, florasoma.trees.blocks.PlanksItem.class, "planks");
		GameRegistry.registerBlock(floraLeaves, florasoma.trees.blocks.FloraLeavesItem.class, "floraleaves");
		GameRegistry.registerBlock(floraLeavesNoColor, florasoma.trees.blocks.FloraLeavesNoColorItem.class, "floraleavsnocolor");
		GameRegistry.registerBlock(floraSapling, florasoma.trees.blocks.FloraSaplingItem.class, "florasapling");
		
		GameRegistry.registerBlock(redwoodDoor, "redwood door");
		
		GameRegistry.registerBlock(bloodwood, florasoma.trees.blocks.LogTwoxTwoItem.class, "bloodwood");
	}
	

	/* Used for defining blocks and items */	
	@Init
	public void init(FMLInitializationEvent evt)
	{
		proxy.addRecipes();
		proxy.addNames();
		proxy.registerRenderer();
		
		GameRegistry.registerWorldGenerator(new TreeWorldgen());
		
		/*MinecraftForge.registerEntity(net.minecraft.src.flora.trees.RedwoodBoat.class,
				this, 1, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.BloodBoat.class,
				this, 2, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.WhiteWoodBoat.class,
				this, 3, 20, 5, true);
		MinecraftForge.registerEntity(net.minecraft.src.flora.trees.EucalyptusBoat.class,
				this, 4, 20, 5, true);
		
		mc = ModLoader.getMinecraftInstance();
		ModLoader.setInGameHook(this, true, false);*/
	}
	
	@ForgeSubscribe
	public void bonemealEvent(BonemealEvent evt)
	{
		//System.out.println("Firing bonemeal event");
		if (evt.ID == floraSapling.blockID)
		{
			floraSapling.growTree(evt.world, evt.X, evt.Y, evt.Z, random);
			evt.setResult(Event.Result.ALLOW);
		}
	}
	
	/* Renderers for boats */
	/*@Override
	public void addRenderer(Map map)
	{
		map.put(net.minecraft.src.flora.trees.RedwoodBoat.class, new RedwoodBoatRender());
		map.put(net.minecraft.src.flora.trees.BloodBoat.class, new BloodBoatRender());
		map.put(net.minecraft.src.flora.trees.WhiteWoodBoat.class, new WhiteBoatRender());
		map.put(net.minecraft.src.flora.trees.EucalyptusBoat.class, new EucalyptusBoatRender());
	}*/
	
	
	
	/* Used for changing the leaf block's transparency and visible faces */
	//@Override
	/*public boolean onTickInGame(float tick, Minecraft game)
	{
		floraLeaves.setGraphicsLevel(mc.gameSettings.fancyGraphics);
		return true;
	}*/
	
	/* Prototype fields, used elsewhere */
	
	static Random random = new Random();
	
	public static Block tree;
	public static Block redwood;
	public static Block planks;
	public static Block bloodwood;
	
	public static FloraLeaves floraLeaves;
	public static FloraLeaves floraLeavesNoColor;
	public static FloraSaplingBlock floraSapling;
	
	public static Block redwoodDoor;
	public static Item redwoodDoorItem;
	
	public static Item floraBoat;
	
	public static String texture = "/floratextures/trees.png";
}