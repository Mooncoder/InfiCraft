package net.minecraft.src.balkon;

import net.minecraft.src.*;

public class BalkRecipeBattleaxes
{
    public BalkRecipeBattleaxes()
    {
    }

    public static int recipeStorm()
    {
        mod_InfiWeapons.stWoodBattleaxe.setIconCoord(1, 0);
        ModLoader.addName(mod_InfiWeapons.stWoodBattleaxe, "Stony Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saWoodBattleaxe.setIconCoord(2, 0);
        ModLoader.addName(mod_InfiWeapons.saWoodBattleaxe, "Sandy Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bWoodBattleaxe.setIconCoord(3, 0);
        ModLoader.addName(mod_InfiWeapons.bWoodBattleaxe, "Necrotic Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pWoodBattleaxe.setIconCoord(4, 0);
        ModLoader.addName(mod_InfiWeapons.pWoodBattleaxe, "Fibery Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nWoodBattleaxe.setIconCoord(5, 0);
        ModLoader.addName(mod_InfiWeapons.nWoodBattleaxe, "Bloody Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sWoodBattleaxe.setIconCoord(6, 0);
        ModLoader.addName(mod_InfiWeapons.sWoodBattleaxe, "Slimy Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cWoodBattleaxe.setIconCoord(7, 0);
        ModLoader.addName(mod_InfiWeapons.cWoodBattleaxe, "Spiny Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fWoodBattleaxe.setIconCoord(8, 0);
        ModLoader.addName(mod_InfiWeapons.fWoodBattleaxe, "Flaky Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brWoodBattleaxe.setIconCoord(9, 0);
        ModLoader.addName(mod_InfiWeapons.brWoodBattleaxe, "Baked Wooden Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brWoodBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stStoneBattleaxe.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiWeapons.stStoneBattleaxe, "Heavy Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saStoneBattleaxe.setIconCoord(2, 1);
        ModLoader.addName(mod_InfiWeapons.saStoneBattleaxe, "Sandy Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bStoneBattleaxe.setIconCoord(3, 1);
        ModLoader.addName(mod_InfiWeapons.bStoneBattleaxe, "Necrotic Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pStoneBattleaxe.setIconCoord(4, 1);
        ModLoader.addName(mod_InfiWeapons.pStoneBattleaxe, "Fibery Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mStoneBattleaxe.setIconCoord(5, 1);
        ModLoader.addName(mod_InfiWeapons.mStoneBattleaxe, "Mossy Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nStoneBattleaxe.setIconCoord(6, 1);
        ModLoader.addName(mod_InfiWeapons.nStoneBattleaxe, "Bloody Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceStoneBattleaxe.setIconCoord(7, 1);
        ModLoader.addName(mod_InfiWeapons.iceStoneBattleaxe, "Icy Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sStoneBattleaxe.setIconCoord(8, 1);
        ModLoader.addName(mod_InfiWeapons.sStoneBattleaxe, "Slimy Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cStoneBattleaxe.setIconCoord(9, 1);
        ModLoader.addName(mod_InfiWeapons.cStoneBattleaxe, "Spiny Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fStoneBattleaxe.setIconCoord(10, 1);
        ModLoader.addName(mod_InfiWeapons.fStoneBattleaxe, "Flaky Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brStoneBattleaxe.setIconCoord(11, 1);
        ModLoader.addName(mod_InfiWeapons.brStoneBattleaxe, "Baked Stone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stIronBattleaxe.setIconCoord(1, 2);
        ModLoader.addName(mod_InfiWeapons.stIronBattleaxe, "Stony Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIronBattleaxe.setIconCoord(2, 2);
        ModLoader.addName(mod_InfiWeapons.iIronBattleaxe, "Ironic Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIronBattleaxe.setIconCoord(3, 2);
        ModLoader.addName(mod_InfiWeapons.dIronBattleaxe, "Jeweled Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIronBattleaxe.setIconCoord(4, 2);
        ModLoader.addName(mod_InfiWeapons.gIronBattleaxe, "Expensive Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIronBattleaxe.setIconCoord(5, 2);
        ModLoader.addName(mod_InfiWeapons.rIronBattleaxe, "Red Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIronBattleaxe.setIconCoord(6, 2);
        ModLoader.addName(mod_InfiWeapons.oIronBattleaxe, "Glassy Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bIronBattleaxe.setIconCoord(7, 2);
        ModLoader.addName(mod_InfiWeapons.bIronBattleaxe, "Necrotic Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nIronBattleaxe.setIconCoord(8, 2);
        ModLoader.addName(mod_InfiWeapons.nIronBattleaxe, "Bloody Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glIronBattleaxe.setIconCoord(9, 2);
        ModLoader.addName(mod_InfiWeapons.glIronBattleaxe, "Glowing Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIronBattleaxe.setIconCoord(10, 2);
        ModLoader.addName(mod_InfiWeapons.iceIronBattleaxe, "Icy Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIronBattleaxe.setIconCoord(11, 2);
        ModLoader.addName(mod_InfiWeapons.sIronBattleaxe, "Slimy Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blIronBattleaxe.setIconCoord(12, 2);
        ModLoader.addName(mod_InfiWeapons.blIronBattleaxe, "Blazing Iron Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blIronBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.stDiamondBattleaxe.setIconCoord(1, 3);
        ModLoader.addName(mod_InfiWeapons.stDiamondBattleaxe, "Stony Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iDiamondBattleaxe.setIconCoord(2, 3);
        ModLoader.addName(mod_InfiWeapons.iDiamondBattleaxe, "Hard Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dDiamondBattleaxe.setIconCoord(3, 3);
        ModLoader.addName(mod_InfiWeapons.dDiamondBattleaxe, "Diamondium Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gDiamondBattleaxe.setIconCoord(4, 3);
        ModLoader.addName(mod_InfiWeapons.gDiamondBattleaxe, "Expensive Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rDiamondBattleaxe.setIconCoord(5, 3);
        ModLoader.addName(mod_InfiWeapons.rDiamondBattleaxe, "Red Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oDiamondBattleaxe.setIconCoord(6, 3);
        ModLoader.addName(mod_InfiWeapons.oDiamondBattleaxe, "Glassy Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bDiamondBattleaxe.setIconCoord(7, 3);
        ModLoader.addName(mod_InfiWeapons.bDiamondBattleaxe, "Necrotic Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mDiamondBattleaxe.setIconCoord(8, 3);
        ModLoader.addName(mod_InfiWeapons.mDiamondBattleaxe, "Mossy Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nDiamondBattleaxe.setIconCoord(9, 3);
        ModLoader.addName(mod_InfiWeapons.nDiamondBattleaxe, "Bloody Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glDiamondBattleaxe.setIconCoord(10, 3);
        ModLoader.addName(mod_InfiWeapons.glDiamondBattleaxe, "Glowing Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.blDiamondBattleaxe.setIconCoord(11, 3);
        ModLoader.addName(mod_InfiWeapons.blDiamondBattleaxe, "Blazing Diamond Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blDiamondBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.stGoldBattleaxe.setIconCoord(1, 4);
        ModLoader.addName(mod_InfiWeapons.stGoldBattleaxe, "Stony Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.gGoldBattleaxe.setIconCoord(2, 4);
        ModLoader.addName(mod_InfiWeapons.gGoldBattleaxe, "Expensive Useless Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oGoldBattleaxe.setIconCoord(3, 4);
        ModLoader.addName(mod_InfiWeapons.oGoldBattleaxe, "Glassy Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saGoldBattleaxe.setIconCoord(4, 4);
        ModLoader.addName(mod_InfiWeapons.saGoldBattleaxe, "Sandy Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bGoldBattleaxe.setIconCoord(5, 4);
        ModLoader.addName(mod_InfiWeapons.bGoldBattleaxe, "Necrotic Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGoldBattleaxe.setIconCoord(6, 4);
        ModLoader.addName(mod_InfiWeapons.mGoldBattleaxe, "Mossy Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGoldBattleaxe.setIconCoord(7, 4);
        ModLoader.addName(mod_InfiWeapons.nGoldBattleaxe, "Bloody Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGoldBattleaxe.setIconCoord(8, 4);
        ModLoader.addName(mod_InfiWeapons.glGoldBattleaxe, "Glowing Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGoldBattleaxe.setIconCoord(9, 4);
        ModLoader.addName(mod_InfiWeapons.iceGoldBattleaxe, "Icy Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sGoldBattleaxe.setIconCoord(10, 4);
        ModLoader.addName(mod_InfiWeapons.sGoldBattleaxe, "Slimy Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fGoldBattleaxe.setIconCoord(11, 4);
        ModLoader.addName(mod_InfiWeapons.fGoldBattleaxe, "Flaky Gold Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fGoldBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.wRedstoneBattleaxe.setIconCoord(0, 5);
        ModLoader.addName(mod_InfiWeapons.wRedstoneBattleaxe, "Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stRedstoneBattleaxe.setIconCoord(1, 5);
        ModLoader.addName(mod_InfiWeapons.stRedstoneBattleaxe, "Stony Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iRedstoneBattleaxe.setIconCoord(2, 5);
        ModLoader.addName(mod_InfiWeapons.iRedstoneBattleaxe, "Hard Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dRedstoneBattleaxe.setIconCoord(3, 5);
        ModLoader.addName(mod_InfiWeapons.dRedstoneBattleaxe, "Jeweled Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rRedstoneBattleaxe.setIconCoord(4, 5);
        ModLoader.addName(mod_InfiWeapons.rRedstoneBattleaxe, "Redredred Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oRedstoneBattleaxe.setIconCoord(5, 5);
        ModLoader.addName(mod_InfiWeapons.oRedstoneBattleaxe, "Glassy Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bRedstoneBattleaxe.setIconCoord(6, 5);
        ModLoader.addName(mod_InfiWeapons.bRedstoneBattleaxe, "Necrotic Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mRedstoneBattleaxe.setIconCoord(7, 5);
        ModLoader.addName(mod_InfiWeapons.mRedstoneBattleaxe, "Mossy Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glRedstoneBattleaxe.setIconCoord(8, 5);
        ModLoader.addName(mod_InfiWeapons.glRedstoneBattleaxe, "Glowing Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sRedstoneBattleaxe.setIconCoord(9, 5);
        ModLoader.addName(mod_InfiWeapons.sRedstoneBattleaxe, "Slimy Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blRedstoneBattleaxe.setIconCoord(10, 5);
        ModLoader.addName(mod_InfiWeapons.blRedstoneBattleaxe, "Blazing Redstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blRedstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wObsidianBattleaxe.setIconCoord(0, 6);
        ModLoader.addName(mod_InfiWeapons.wObsidianBattleaxe, "Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stObsidianBattleaxe.setIconCoord(1, 6);
        ModLoader.addName(mod_InfiWeapons.stObsidianBattleaxe, "Stony Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iObsidianBattleaxe.setIconCoord(2, 6);
        ModLoader.addName(mod_InfiWeapons.iObsidianBattleaxe, "Hard Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dObsidianBattleaxe.setIconCoord(3, 6);
        ModLoader.addName(mod_InfiWeapons.dObsidianBattleaxe, "Jeweled Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gObsidianBattleaxe.setIconCoord(4, 6);
        ModLoader.addName(mod_InfiWeapons.gObsidianBattleaxe, "Expensive Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rObsidianBattleaxe.setIconCoord(5, 6);
        ModLoader.addName(mod_InfiWeapons.rObsidianBattleaxe, "Red Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oObsidianBattleaxe.setIconCoord(6, 6);
        ModLoader.addName(mod_InfiWeapons.oObsidianBattleaxe, "Wicked Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bObsidianBattleaxe.setIconCoord(7, 6);
        ModLoader.addName(mod_InfiWeapons.bObsidianBattleaxe, "Necrotic Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nObsidianBattleaxe.setIconCoord(8, 6);
        ModLoader.addName(mod_InfiWeapons.nObsidianBattleaxe, "Bloody Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glObsidianBattleaxe.setIconCoord(9, 6);
        ModLoader.addName(mod_InfiWeapons.glObsidianBattleaxe, "Glowing Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sObsidianBattleaxe.setIconCoord(10, 6);
        ModLoader.addName(mod_InfiWeapons.sObsidianBattleaxe, "Slimy Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fObsidianBattleaxe.setIconCoord(11, 6);
        ModLoader.addName(mod_InfiWeapons.fObsidianBattleaxe, "Flaky Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.blObsidianBattleaxe.setIconCoord(12, 6);
        ModLoader.addName(mod_InfiWeapons.blObsidianBattleaxe, "Blazing Obsidian Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blObsidianBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSandstoneBattleaxe.setIconCoord(0, 7);
        ModLoader.addName(mod_InfiWeapons.wSandstoneBattleaxe, "Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSandstoneBattleaxe.setIconCoord(1, 7);
        ModLoader.addName(mod_InfiWeapons.stSandstoneBattleaxe, "Stony Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saSandstoneBattleaxe.setIconCoord(2, 7);
        ModLoader.addName(mod_InfiWeapons.saSandstoneBattleaxe, "Sandsmite");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSandstoneBattleaxe.setIconCoord(3, 7);
        ModLoader.addName(mod_InfiWeapons.bSandstoneBattleaxe, "Necrotic Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSandstoneBattleaxe.setIconCoord(4, 7);
        ModLoader.addName(mod_InfiWeapons.pSandstoneBattleaxe, "Fibery Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nSandstoneBattleaxe.setIconCoord(5, 7);
        ModLoader.addName(mod_InfiWeapons.nSandstoneBattleaxe, "Bloody Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceSandstoneBattleaxe.setIconCoord(6, 7);
        ModLoader.addName(mod_InfiWeapons.iceSandstoneBattleaxe, "Icy Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sSandstoneBattleaxe.setIconCoord(7, 7);
        ModLoader.addName(mod_InfiWeapons.sSandstoneBattleaxe, "Slimy Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSandstoneBattleaxe.setIconCoord(8, 7);
        ModLoader.addName(mod_InfiWeapons.cSandstoneBattleaxe, "Spiny Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSandstoneBattleaxe.setIconCoord(9, 7);
        ModLoader.addName(mod_InfiWeapons.fSandstoneBattleaxe, "Flaky Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSandstoneBattleaxe.setIconCoord(10, 7);
        ModLoader.addName(mod_InfiWeapons.brSandstoneBattleaxe, "Baked Sandstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSandstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wBoneBattleaxe.setIconCoord(0, 8);
        ModLoader.addName(mod_InfiWeapons.wBoneBattleaxe, "Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stBoneBattleaxe.setIconCoord(1, 8);
        ModLoader.addName(mod_InfiWeapons.stBoneBattleaxe, "Stony Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iBoneBattleaxe.setIconCoord(2, 8);
        ModLoader.addName(mod_InfiWeapons.iBoneBattleaxe, "Hard Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dBoneBattleaxe.setIconCoord(3, 8);
        ModLoader.addName(mod_InfiWeapons.dBoneBattleaxe, "Jeweled Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBoneBattleaxe.setIconCoord(4, 8);
        ModLoader.addName(mod_InfiWeapons.rBoneBattleaxe, "Red Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oBoneBattleaxe.setIconCoord(5, 8);
        ModLoader.addName(mod_InfiWeapons.oBoneBattleaxe, "Glassy Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bBoneBattleaxe.setIconCoord(6, 8);
        ModLoader.addName(mod_InfiWeapons.bBoneBattleaxe, "Reanimated Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mBoneBattleaxe.setIconCoord(7, 8);
        ModLoader.addName(mod_InfiWeapons.mBoneBattleaxe, "Mossy Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nBoneBattleaxe.setIconCoord(8, 8);
        ModLoader.addName(mod_InfiWeapons.nBoneBattleaxe, "Netherrack Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBoneBattleaxe.setIconCoord(9, 8);
        ModLoader.addName(mod_InfiWeapons.glBoneBattleaxe, "Glowstone Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sBoneBattleaxe.setIconCoord(10, 8);
        ModLoader.addName(mod_InfiWeapons.sBoneBattleaxe, "Slimy Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBoneBattleaxe.setIconCoord(11, 8);
        ModLoader.addName(mod_InfiWeapons.cBoneBattleaxe, "Spiny Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBoneBattleaxe.setIconCoord(12, 8);
        ModLoader.addName(mod_InfiWeapons.fBoneBattleaxe, "Flaky Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBoneBattleaxe.setIconCoord(13, 8);
        ModLoader.addName(mod_InfiWeapons.brBoneBattleaxe, "Baked Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blBoneBattleaxe.setIconCoord(14, 8);
        ModLoader.addName(mod_InfiWeapons.blBoneBattleaxe, "Blazing Bone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wPaperBattleaxe.setIconCoord(0, 9);
        ModLoader.addName(mod_InfiWeapons.wPaperBattleaxe, "Paper Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wPaperBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.saPaperBattleaxe.setIconCoord(1, 9);
        ModLoader.addName(mod_InfiWeapons.saPaperBattleaxe, "Stony Paper Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saPaperBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bPaperBattleaxe.setIconCoord(2, 9);
        ModLoader.addName(mod_InfiWeapons.bPaperBattleaxe, "Necrotic Paper Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pPaperBattleaxe.setIconCoord(3, 9);
        ModLoader.addName(mod_InfiWeapons.pPaperBattleaxe, "Flimsy Whacker");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pPaperBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.sPaperBattleaxe.setIconCoord(4, 9);
        ModLoader.addName(mod_InfiWeapons.sPaperBattleaxe, "Slimy Paper Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sPaperBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cPaperBattleaxe.setIconCoord(5, 9);
        ModLoader.addName(mod_InfiWeapons.cPaperBattleaxe, "Spiny Paper Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cPaperBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brPaperBattleaxe.setIconCoord(6, 9);
        ModLoader.addName(mod_InfiWeapons.brPaperBattleaxe, "Baked Paper Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brPaperBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stMossyBattleaxe.setIconCoord(0, 10);
        ModLoader.addName(mod_InfiWeapons.stMossyBattleaxe, "Stony Moss-Covered Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stMossyBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.dMossyBattleaxe.setIconCoord(1, 10);
        ModLoader.addName(mod_InfiWeapons.dMossyBattleaxe, "Jeweled Moss-Covered Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dMossyBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rMossyBattleaxe.setIconCoord(2, 10);
        ModLoader.addName(mod_InfiWeapons.rMossyBattleaxe, "Red Moss-Covered Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rMossyBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bMossyBattleaxe.setIconCoord(3, 10);
        ModLoader.addName(mod_InfiWeapons.bMossyBattleaxe, "Necrotic Moss-Covered Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mMossyBattleaxe.setIconCoord(4, 10);
        ModLoader.addName(mod_InfiWeapons.mMossyBattleaxe, "Living Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mMossyBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glMossyBattleaxe.setIconCoord(5, 10);
        ModLoader.addName(mod_InfiWeapons.glMossyBattleaxe, "Glowing Moss-Covered Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glMossyBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.wNetherrackBattleaxe.setIconCoord(0, 11);
        ModLoader.addName(mod_InfiWeapons.wNetherrackBattleaxe, "Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stNetherrackBattleaxe.setIconCoord(1, 11);
        ModLoader.addName(mod_InfiWeapons.stNetherrackBattleaxe, "Stony Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iNetherrackBattleaxe.setIconCoord(2, 11);
        ModLoader.addName(mod_InfiWeapons.iNetherrackBattleaxe, "Hard Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.rNetherrackBattleaxe.setIconCoord(3, 11);
        ModLoader.addName(mod_InfiWeapons.rNetherrackBattleaxe, "Red Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oNetherrackBattleaxe.setIconCoord(4, 11);
        ModLoader.addName(mod_InfiWeapons.oNetherrackBattleaxe, "Glassy Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saNetherrackBattleaxe.setIconCoord(5, 11);
        ModLoader.addName(mod_InfiWeapons.saNetherrackBattleaxe, "Sandy Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bNetherrackBattleaxe.setIconCoord(6, 11);
        ModLoader.addName(mod_InfiWeapons.bNetherrackBattleaxe, "Necrotic Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mNetherrackBattleaxe.setIconCoord(7, 11);
        ModLoader.addName(mod_InfiWeapons.mNetherrackBattleaxe, "Mossy Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nNetherrackBattleaxe.setIconCoord(8, 11);
        ModLoader.addName(mod_InfiWeapons.nNetherrackBattleaxe, "Bloody Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glNetherrackBattleaxe.setIconCoord(9, 11);
        ModLoader.addName(mod_InfiWeapons.glNetherrackBattleaxe, "Glowing Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceNetherrackBattleaxe.setIconCoord(10, 11);
        ModLoader.addName(mod_InfiWeapons.iceNetherrackBattleaxe, "Icy Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sNetherrackBattleaxe.setIconCoord(11, 11);
        ModLoader.addName(mod_InfiWeapons.sNetherrackBattleaxe, "Slimy Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cNetherrackBattleaxe.setIconCoord(12, 11);
        ModLoader.addName(mod_InfiWeapons.cNetherrackBattleaxe, "Spiny Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fNetherrackBattleaxe.setIconCoord(13, 11);
        ModLoader.addName(mod_InfiWeapons.fNetherrackBattleaxe, "Flaky Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brNetherrackBattleaxe.setIconCoord(14, 11);
        ModLoader.addName(mod_InfiWeapons.brNetherrackBattleaxe, "Baked Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.blNetherrackBattleaxe.setIconCoord(15, 11);
        ModLoader.addName(mod_InfiWeapons.blNetherrackBattleaxe, "Blazing Netherrack Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blNetherrackBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.wGlowstoneBattleaxe.setIconCoord(0, 12);
        ModLoader.addName(mod_InfiWeapons.wGlowstoneBattleaxe, "Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stGlowstoneBattleaxe.setIconCoord(1, 12);
        ModLoader.addName(mod_InfiWeapons.stGlowstoneBattleaxe, "Stony Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iGlowstoneBattleaxe.setIconCoord(2, 12);
        ModLoader.addName(mod_InfiWeapons.iGlowstoneBattleaxe, "Hard Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dGlowstoneBattleaxe.setIconCoord(3, 12);
        ModLoader.addName(mod_InfiWeapons.dGlowstoneBattleaxe, "Jeweled Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rGlowstoneBattleaxe.setIconCoord(4, 12);
        ModLoader.addName(mod_InfiWeapons.rGlowstoneBattleaxe, "Red Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oGlowstoneBattleaxe.setIconCoord(5, 12);
        ModLoader.addName(mod_InfiWeapons.oGlowstoneBattleaxe, "Glassy Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bGlowstoneBattleaxe.setIconCoord(6, 12);
        ModLoader.addName(mod_InfiWeapons.bGlowstoneBattleaxe, "Necrotic Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGlowstoneBattleaxe.setIconCoord(7, 12);
        ModLoader.addName(mod_InfiWeapons.mGlowstoneBattleaxe, "Mossy Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGlowstoneBattleaxe.setIconCoord(8, 12);
        ModLoader.addName(mod_InfiWeapons.nGlowstoneBattleaxe, "Bloody Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGlowstoneBattleaxe.setIconCoord(9, 12);
        ModLoader.addName(mod_InfiWeapons.glGlowstoneBattleaxe, "Bright Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGlowstoneBattleaxe.setIconCoord(10, 12);
        ModLoader.addName(mod_InfiWeapons.iceGlowstoneBattleaxe, "Icy Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lGlowstoneBattleaxe.setIconCoord(11, 12);
        ModLoader.addName(mod_InfiWeapons.lGlowstoneBattleaxe, "Fiery Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sGlowstoneBattleaxe.setIconCoord(12, 12);
        ModLoader.addName(mod_InfiWeapons.sGlowstoneBattleaxe, "Slimy Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blGlowstoneBattleaxe.setIconCoord(13, 12);
        ModLoader.addName(mod_InfiWeapons.blGlowstoneBattleaxe, "Blazing Glowstone Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blGlowstoneBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wIceBattleaxe.setIconCoord(0, 13);
        ModLoader.addName(mod_InfiWeapons.wIceBattleaxe, "Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stIceBattleaxe.setIconCoord(1, 13);
        ModLoader.addName(mod_InfiWeapons.stIceBattleaxe, "Stony Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIceBattleaxe.setIconCoord(2, 13);
        ModLoader.addName(mod_InfiWeapons.iIceBattleaxe, "Hard Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIceBattleaxe.setIconCoord(3, 13);
        ModLoader.addName(mod_InfiWeapons.dIceBattleaxe, "Jeweled Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIceBattleaxe.setIconCoord(4, 13);
        ModLoader.addName(mod_InfiWeapons.gIceBattleaxe, "Expensive Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIceBattleaxe.setIconCoord(5, 13);
        ModLoader.addName(mod_InfiWeapons.rIceBattleaxe, "Red Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIceBattleaxe.setIconCoord(6, 13);
        ModLoader.addName(mod_InfiWeapons.oIceBattleaxe, "Glassy Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saIceBattleaxe.setIconCoord(7, 13);
        ModLoader.addName(mod_InfiWeapons.saIceBattleaxe, "Sandy Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bIceBattleaxe.setIconCoord(8, 13);
        ModLoader.addName(mod_InfiWeapons.bIceBattleaxe, "Necrotic Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.glIceBattleaxe.setIconCoord(9, 13);
        ModLoader.addName(mod_InfiWeapons.glIceBattleaxe, "Glowing Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIceBattleaxe.setIconCoord(10, 13);
        ModLoader.addName(mod_InfiWeapons.iceIceBattleaxe, "Frosted Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIceBattleaxe.setIconCoord(11, 13);
        ModLoader.addName(mod_InfiWeapons.sIceBattleaxe, "Slimy Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cIceBattleaxe.setIconCoord(12, 13);
        ModLoader.addName(mod_InfiWeapons.cIceBattleaxe, "Spiny Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fIceBattleaxe.setIconCoord(13, 13);
        ModLoader.addName(mod_InfiWeapons.fIceBattleaxe, "Flaky Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brIceBattleaxe.setIconCoord(14, 13);
        ModLoader.addName(mod_InfiWeapons.brIceBattleaxe, "Baked Ice Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brIceBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dLavaBattleaxe.setIconCoord(0, 14);
        ModLoader.addName(mod_InfiWeapons.dLavaBattleaxe, "Jeweled Lava Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dLavaBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rLavaBattleaxe.setIconCoord(1, 14);
        ModLoader.addName(mod_InfiWeapons.rLavaBattleaxe, "Red Lava Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rLavaBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bLavaBattleaxe.setIconCoord(2, 14);
        ModLoader.addName(mod_InfiWeapons.bLavaBattleaxe, "Necrotic Lava Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nLavaBattleaxe.setIconCoord(3, 14);
        ModLoader.addName(mod_InfiWeapons.nLavaBattleaxe, "Bloody Lava Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nLavaBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glLavaBattleaxe.setIconCoord(4, 14);
        ModLoader.addName(mod_InfiWeapons.glLavaBattleaxe, "Glowing Lava Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glLavaBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lLavaBattleaxe.setIconCoord(5, 14);
        ModLoader.addName(mod_InfiWeapons.lLavaBattleaxe, "Lavascar");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lLavaBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.blLavaBattleaxe.setIconCoord(6, 14);
        ModLoader.addName(mod_InfiWeapons.blLavaBattleaxe, "Blazing Lava Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blLavaBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSlimeBattleaxe.setIconCoord(0, 15);
        ModLoader.addName(mod_InfiWeapons.wSlimeBattleaxe, "Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSlimeBattleaxe.setIconCoord(1, 15);
        ModLoader.addName(mod_InfiWeapons.stSlimeBattleaxe, "Stony Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iSlimeBattleaxe.setIconCoord(2, 15);
        ModLoader.addName(mod_InfiWeapons.iSlimeBattleaxe, "Hard Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dSlimeBattleaxe.setIconCoord(3, 15);
        ModLoader.addName(mod_InfiWeapons.dSlimeBattleaxe, "Jeweled Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gSlimeBattleaxe.setIconCoord(4, 15);
        ModLoader.addName(mod_InfiWeapons.gSlimeBattleaxe, "Expensive Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rSlimeBattleaxe.setIconCoord(5, 15);
        ModLoader.addName(mod_InfiWeapons.rSlimeBattleaxe, "Red Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oSlimeBattleaxe.setIconCoord(6, 15);
        ModLoader.addName(mod_InfiWeapons.oSlimeBattleaxe, "Glassy Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saSlimeBattleaxe.setIconCoord(7, 15);
        ModLoader.addName(mod_InfiWeapons.saSlimeBattleaxe, "Sandy Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSlimeBattleaxe.setIconCoord(8, 15);
        ModLoader.addName(mod_InfiWeapons.bSlimeBattleaxe, "Necrotic Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSlimeBattleaxe.setIconCoord(9, 15);
        ModLoader.addName(mod_InfiWeapons.pSlimeBattleaxe, "Fibery Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mSlimeBattleaxe.setIconCoord(10, 15);
        ModLoader.addName(mod_InfiWeapons.mSlimeBattleaxe, "Mossy Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nSlimeBattleaxe.setIconCoord(11, 15);
        ModLoader.addName(mod_InfiWeapons.nSlimeBattleaxe, "Bloody Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glSlimeBattleaxe.setIconCoord(12, 15);
        ModLoader.addName(mod_InfiWeapons.glSlimeBattleaxe, "Glowing Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceSlimeBattleaxe.setIconCoord(13, 15);
        ModLoader.addName(mod_InfiWeapons.iceSlimeBattleaxe, "Icy Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lSlimeBattleaxe.setIconCoord(14, 15);
        ModLoader.addName(mod_InfiWeapons.lSlimeBattleaxe, "Fiery Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.sSlimeBattleaxe.setIconCoord(15, 15);
        ModLoader.addName(mod_InfiWeapons.sSlimeBattleaxe, "Green Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSlimeBattleaxe.setIconCoord(12, 14);
        ModLoader.addName(mod_InfiWeapons.cSlimeBattleaxe, "Spiny Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSlimeBattleaxe.setIconCoord(13, 14);
        ModLoader.addName(mod_InfiWeapons.fSlimeBattleaxe, "Flaky Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSlimeBattleaxe.setIconCoord(14, 14);
        ModLoader.addName(mod_InfiWeapons.brSlimeBattleaxe, "Baked Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blSlimeBattleaxe.setIconCoord(15, 14);
        ModLoader.addName(mod_InfiWeapons.blSlimeBattleaxe, "Blazing Slime Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blSlimeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wCactusBattleaxe.setIconCoord(10, 0);
        ModLoader.addName(mod_InfiWeapons.wCactusBattleaxe, "Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stCactusBattleaxe.setIconCoord(11, 0);
        ModLoader.addName(mod_InfiWeapons.stCactusBattleaxe, "Stony Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saCactusBattleaxe.setIconCoord(12, 0);
        ModLoader.addName(mod_InfiWeapons.saCactusBattleaxe, "Sandy Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bCactusBattleaxe.setIconCoord(13, 0);
        ModLoader.addName(mod_InfiWeapons.bCactusBattleaxe, "Necrotic Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pCactusBattleaxe.setIconCoord(14, 0);
        ModLoader.addName(mod_InfiWeapons.pCactusBattleaxe, "Fibery Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nCactusBattleaxe.setIconCoord(15, 0);
        ModLoader.addName(mod_InfiWeapons.nCactusBattleaxe, "Bloody Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sCactusBattleaxe.setIconCoord(12, 1);
        ModLoader.addName(mod_InfiWeapons.sCactusBattleaxe, "Slimy Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cCactusBattleaxe.setIconCoord(13, 1);
        ModLoader.addName(mod_InfiWeapons.cCactusBattleaxe, "Spined Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fCactusBattleaxe.setIconCoord(14, 1);
        ModLoader.addName(mod_InfiWeapons.fCactusBattleaxe, "Flaky Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brCactusBattleaxe.setIconCoord(15, 1);
        ModLoader.addName(mod_InfiWeapons.brCactusBattleaxe, "Baked Cactus Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brCactusBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wFlintBattleaxe.setIconCoord(13, 2);
        ModLoader.addName(mod_InfiWeapons.wFlintBattleaxe, "Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stFlintBattleaxe.setIconCoord(14, 2);
        ModLoader.addName(mod_InfiWeapons.stFlintBattleaxe, "Stony Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iFlintBattleaxe.setIconCoord(15, 2);
        ModLoader.addName(mod_InfiWeapons.iFlintBattleaxe, "Hard Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.gFlintBattleaxe.setIconCoord(12, 3);
        ModLoader.addName(mod_InfiWeapons.gFlintBattleaxe, "Expensive Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oFlintBattleaxe.setIconCoord(13, 3);
        ModLoader.addName(mod_InfiWeapons.oFlintBattleaxe, "Glassy Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saFlintBattleaxe.setIconCoord(14, 3);
        ModLoader.addName(mod_InfiWeapons.saFlintBattleaxe, "Sandy Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bFlintBattleaxe.setIconCoord(15, 3);
        ModLoader.addName(mod_InfiWeapons.bFlintBattleaxe, "Necrotic Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nFlintBattleaxe.setIconCoord(12, 4);
        ModLoader.addName(mod_InfiWeapons.nFlintBattleaxe, "Bloody Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceFlintBattleaxe.setIconCoord(13, 4);
        ModLoader.addName(mod_InfiWeapons.iceFlintBattleaxe, "Icy Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sFlintBattleaxe.setIconCoord(14, 4);
        ModLoader.addName(mod_InfiWeapons.sFlintBattleaxe, "Slimy Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cFlintBattleaxe.setIconCoord(15, 4);
        ModLoader.addName(mod_InfiWeapons.cFlintBattleaxe, "Spiny Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fFlintBattleaxe.setIconCoord(11, 5);
        ModLoader.addName(mod_InfiWeapons.fFlintBattleaxe, "Rough-hewn Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brFlintBattleaxe.setIconCoord(12, 5);
        ModLoader.addName(mod_InfiWeapons.brFlintBattleaxe, "Baked Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blFlintBattleaxe.setIconCoord(13, 5);
        ModLoader.addName(mod_InfiWeapons.blFlintBattleaxe, "Blazing Flint Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blFlintBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wBrickBattleaxe.setIconCoord(14, 5);
        ModLoader.addName(mod_InfiWeapons.wBrickBattleaxe, "Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.brick
                });
        mod_InfiWeapons.stBrickBattleaxe.setIconCoord(15, 5);
        ModLoader.addName(mod_InfiWeapons.stBrickBattleaxe, "Stony Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saBrickBattleaxe.setIconCoord(13, 6);
        ModLoader.addName(mod_InfiWeapons.saBrickBattleaxe, "Sandstone Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bBrickBattleaxe.setIconCoord(14, 6);
        ModLoader.addName(mod_InfiWeapons.bBrickBattleaxe, "Necrotic Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pBrickBattleaxe.setIconCoord(15, 6);
        ModLoader.addName(mod_InfiWeapons.pBrickBattleaxe, "Fibery Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nBrickBattleaxe.setIconCoord(11, 7);
        ModLoader.addName(mod_InfiWeapons.nBrickBattleaxe, "Bloody Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceBrickBattleaxe.setIconCoord(12, 7);
        ModLoader.addName(mod_InfiWeapons.iceBrickBattleaxe, "Icy Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sBrickBattleaxe.setIconCoord(13, 7);
        ModLoader.addName(mod_InfiWeapons.sBrickBattleaxe, "Slimy Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBrickBattleaxe.setIconCoord(14, 7);
        ModLoader.addName(mod_InfiWeapons.cBrickBattleaxe, "Spiny Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBrickBattleaxe.setIconCoord(15, 7);
        ModLoader.addName(mod_InfiWeapons.fBrickBattleaxe, "Flaky Brick Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBrickBattleaxe.setIconCoord(15, 8);
        ModLoader.addName(mod_InfiWeapons.brBrickBattleaxe, "Look-alike Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBrickBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dBlazeBattleaxe.setIconCoord(7, 9);
        ModLoader.addName(mod_InfiWeapons.dBlazeBattleaxe, "Jeweled Blaze Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBlazeBattleaxe.setIconCoord(8, 9);
        ModLoader.addName(mod_InfiWeapons.rBlazeBattleaxe, "Red Blaze Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bBlazeBattleaxe.setIconCoord(9, 9);
        ModLoader.addName(mod_InfiWeapons.bBlazeBattleaxe, "Necrotic Blaze Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nBlazeBattleaxe.setIconCoord(10, 9);
        ModLoader.addName(mod_InfiWeapons.nBlazeBattleaxe, "Bloody Blaze Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBlazeBattleaxe.setIconCoord(11, 9);
        ModLoader.addName(mod_InfiWeapons.glBlazeBattleaxe, "Glowing Blaze Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lBlazeBattleaxe.setIconCoord(12, 9);
        ModLoader.addName(mod_InfiWeapons.lBlazeBattleaxe, "Fiery Blaze Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.fBlazeBattleaxe.setIconCoord(13, 9);
        ModLoader.addName(mod_InfiWeapons.fBlazeBattleaxe, "Flaky Blaze Battleaxe");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.blBlazeBattleaxe.setIconCoord(14, 9);
        ModLoader.addName(mod_InfiWeapons.blBlazeBattleaxe, "Creeper Crasher");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBlazeBattleaxe, 1), new Object[]
                {
                    "mmm", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        return 0;
    }
}
