package inficraft.orizon.pastelmarble;

import inficraft.api.detailing.DetailManager;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "OrizonPastels", name = "Stone, Pastels, and Marble", version = "1.4.6_2013.1.5")
public class PastelMarble 
{
	/* Proxies for sides, used for graphics processing */
	@SidedProxy(clientSide = "inficraft.orizon.pastelmarble.PastelProxyClient", serverSide = "inficraft.orizon.pastelmarble.PastelProxyCommon")
	public static PastelProxyCommon proxy;
	
	/* Instance of this mod, used for grabbing prototype fields */
	@Instance("OrizonPastels")
	public static PastelMarble instance;
	public static CreativeTabs stonetab = new TabOrizonStone("orizonStone");
	
	/* Initial loading, used to define blocks, items, and entities */	
	@PreInit
	public void preInit(FMLPreInitializationEvent evt)
	{
		PHPastel.initProps();
		
		cStone = new ColoredStone(PHPastel.cStoneID, 0).setHardness(1.5f).setBlockName("Colored Stone");
		cCobble = new CustomBlockStone(PHPastel.cCobbleID, 16).setHardness(Block.cobblestone.getBlockHardness(null, 0, 0, 0)).setBlockName("Colored Cobblestone");
		cBrick = new CustomBlockStone(PHPastel.cBrickID, 32).setHardness(1.5f).setBlockName("Colored Stone Brick");
		cMossy = new CustomBlockStone(PHPastel.cMossyID, 48).setHardness(1.5f).setBlockName("Colored Moss Brick");
		cCracked = new CustomBlockStone(PHPastel.cCrackedID, 64).setHardness(1.5f).setBlockName("Colored Cracked Brick");
		cTile = new CustomBlockStone(PHPastel.cTileID, 80).setHardness(1.5f).setBlockName("Colored Tile");
		cFancy = new CustomBlockStone(PHPastel.cFancyID, 96).setHardness(1.5f).setBlockName("Colored Fancy Brick");
		cSquare = new CustomBlockStone(PHPastel.cSquareID, 112).setHardness(1.5f).setBlockName("Colored Square Brick");
		
		marble = new Marble(PHPastel.marbleID, 176).setHardness(5F).setBlockName("Marble");
		
		GameRegistry.registerBlock(cStone, inficraft.orizon.pastelmarble.ColoredStoneItem.class);
		GameRegistry.registerBlock(cCobble, inficraft.orizon.pastelmarble.ColoredCobblestoneItem.class);
		GameRegistry.registerBlock(cBrick, inficraft.orizon.pastelmarble.ColoredBrickItem.class);
		GameRegistry.registerBlock(cMossy, inficraft.orizon.pastelmarble.ColoredMossyBrickItem.class);
		GameRegistry.registerBlock(cCracked, inficraft.orizon.pastelmarble.ColoredCrackedBrickItem.class);
		GameRegistry.registerBlock(cTile, inficraft.orizon.pastelmarble.ColoredTileItem.class);
		GameRegistry.registerBlock(cFancy, inficraft.orizon.pastelmarble.ColoredFancyBrickItem.class);
		GameRegistry.registerBlock(cSquare, inficraft.orizon.pastelmarble.ColoredSquareBrickItem.class);
		
		GameRegistry.registerBlock(marble, inficraft.orizon.pastelmarble.MarbleItem.class);
		
		for (int i = 0; i < 16; i++)
		{
			OreDictionary.registerOre("customStone", new ItemStack(cStone, 1, i));
			OreDictionary.registerOre("customCobblestone", new ItemStack(cCobble, 1, i));
			DetailManager.addCracking(cStone, i, cCobble, i);
			DetailManager.addDrilling(cStone, i, cCobble, i);
		}
		for (int i = 0; i < 6; i++)
		{
			OreDictionary.registerOre("marble", new ItemStack(marble, 1, i));
			DetailManager.addCracking(marble, i, marble, i+6);
			DetailManager.addDrilling(marble, i, marble, i+6);
		}
	}
	
	@Init
	public void init(FMLInitializationEvent evt) 
	{		
		GameRegistry.registerWorldGenerator(new PastelGenerator());
		
		proxy.registerRenderer();
		proxy.addNames();
		proxy.addRecipes();
	}
	
	public Block cStone;
	public Block cCobble;
	public Block cBrick;
	public Block cMossy;
	public Block cCracked;
	public Block cTile;
	public Block cFancy;
	public Block cSquare;
	
	public Block marble;
	
	public static String texture = "/infitextures/stone.png";
}
