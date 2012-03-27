package net.minecraft.src.balkon;

import net.minecraft.src.*;

public class BalkRecipeWarhammers
{
    public BalkRecipeWarhammers()
    {
    }

    public static int recipeStorm()
    {
        mod_InfiWeapons.stWoodWarhammer.setIconCoord(1, 0);
        ModLoader.addName(mod_InfiWeapons.stWoodWarhammer, "Stony Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saWoodWarhammer.setIconCoord(2, 0);
        ModLoader.addName(mod_InfiWeapons.saWoodWarhammer, "Sandy Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bWoodWarhammer.setIconCoord(3, 0);
        ModLoader.addName(mod_InfiWeapons.bWoodWarhammer, "Necrotic Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pWoodWarhammer.setIconCoord(4, 0);
        ModLoader.addName(mod_InfiWeapons.pWoodWarhammer, "Fibery Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nWoodWarhammer.setIconCoord(5, 0);
        ModLoader.addName(mod_InfiWeapons.nWoodWarhammer, "Bloody Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sWoodWarhammer.setIconCoord(6, 0);
        ModLoader.addName(mod_InfiWeapons.sWoodWarhammer, "Slimy Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cWoodWarhammer.setIconCoord(7, 0);
        ModLoader.addName(mod_InfiWeapons.cWoodWarhammer, "Spiny Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fWoodWarhammer.setIconCoord(8, 0);
        ModLoader.addName(mod_InfiWeapons.fWoodWarhammer, "Flaky Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brWoodWarhammer.setIconCoord(9, 0);
        ModLoader.addName(mod_InfiWeapons.brWoodWarhammer, "Baked Wooden Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brWoodWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), new ItemStack(Block.planks, 1, -1), Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stStoneWarhammer.setIconCoord(1, 1);
        ModLoader.addName(mod_InfiWeapons.stStoneWarhammer, "Heavy Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saStoneWarhammer.setIconCoord(2, 1);
        ModLoader.addName(mod_InfiWeapons.saStoneWarhammer, "Sandy Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bStoneWarhammer.setIconCoord(3, 1);
        ModLoader.addName(mod_InfiWeapons.bStoneWarhammer, "Necrotic Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pStoneWarhammer.setIconCoord(4, 1);
        ModLoader.addName(mod_InfiWeapons.pStoneWarhammer, "Fibery Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mStoneWarhammer.setIconCoord(5, 1);
        ModLoader.addName(mod_InfiWeapons.mStoneWarhammer, "Mossy Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nStoneWarhammer.setIconCoord(6, 1);
        ModLoader.addName(mod_InfiWeapons.nStoneWarhammer, "Bloody Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceStoneWarhammer.setIconCoord(7, 1);
        ModLoader.addName(mod_InfiWeapons.iceStoneWarhammer, "Icy Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sStoneWarhammer.setIconCoord(8, 1);
        ModLoader.addName(mod_InfiWeapons.sStoneWarhammer, "Slimy Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cStoneWarhammer.setIconCoord(9, 1);
        ModLoader.addName(mod_InfiWeapons.cStoneWarhammer, "Spiny Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fStoneWarhammer.setIconCoord(10, 1);
        ModLoader.addName(mod_InfiWeapons.fStoneWarhammer, "Flaky Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brStoneWarhammer.setIconCoord(11, 1);
        ModLoader.addName(mod_InfiWeapons.brStoneWarhammer, "Baked Stone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cobblestone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brStoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.stone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stIronWarhammer.setIconCoord(1, 2);
        ModLoader.addName(mod_InfiWeapons.stIronWarhammer, "Stony Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIronWarhammer.setIconCoord(2, 2);
        ModLoader.addName(mod_InfiWeapons.iIronWarhammer, "Ironic Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIronWarhammer.setIconCoord(3, 2);
        ModLoader.addName(mod_InfiWeapons.dIronWarhammer, "Jeweled Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIronWarhammer.setIconCoord(4, 2);
        ModLoader.addName(mod_InfiWeapons.gIronWarhammer, "Expensive Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIronWarhammer.setIconCoord(5, 2);
        ModLoader.addName(mod_InfiWeapons.rIronWarhammer, "Red Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIronWarhammer.setIconCoord(6, 2);
        ModLoader.addName(mod_InfiWeapons.oIronWarhammer, "Glassy Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bIronWarhammer.setIconCoord(7, 2);
        ModLoader.addName(mod_InfiWeapons.bIronWarhammer, "Necrotic Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nIronWarhammer.setIconCoord(8, 2);
        ModLoader.addName(mod_InfiWeapons.nIronWarhammer, "Bloody Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glIronWarhammer.setIconCoord(9, 2);
        ModLoader.addName(mod_InfiWeapons.glIronWarhammer, "Glowing Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIronWarhammer.setIconCoord(10, 2);
        ModLoader.addName(mod_InfiWeapons.iceIronWarhammer, "Icy Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIronWarhammer.setIconCoord(11, 2);
        ModLoader.addName(mod_InfiWeapons.sIronWarhammer, "Slimy Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blIronWarhammer.setIconCoord(12, 2);
        ModLoader.addName(mod_InfiWeapons.blIronWarhammer, "Blazing Iron Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blIronWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotIron, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wDiamondWarhammer.setIconCoord(0, 3);
        ModLoader.addName(mod_InfiWeapons.wDiamondWarhammer, "Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stDiamondWarhammer.setIconCoord(1, 3);
        ModLoader.addName(mod_InfiWeapons.stDiamondWarhammer, "Stony Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iDiamondWarhammer.setIconCoord(2, 3);
        ModLoader.addName(mod_InfiWeapons.iDiamondWarhammer, "Hard Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dDiamondWarhammer.setIconCoord(3, 3);
        ModLoader.addName(mod_InfiWeapons.dDiamondWarhammer, "Diamondium Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gDiamondWarhammer.setIconCoord(4, 3);
        ModLoader.addName(mod_InfiWeapons.gDiamondWarhammer, "Expensive Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rDiamondWarhammer.setIconCoord(5, 3);
        ModLoader.addName(mod_InfiWeapons.rDiamondWarhammer, "Red Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oDiamondWarhammer.setIconCoord(6, 3);
        ModLoader.addName(mod_InfiWeapons.oDiamondWarhammer, "Glassy Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bDiamondWarhammer.setIconCoord(7, 3);
        ModLoader.addName(mod_InfiWeapons.bDiamondWarhammer, "Necrotic Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mDiamondWarhammer.setIconCoord(8, 3);
        ModLoader.addName(mod_InfiWeapons.mDiamondWarhammer, "Mossy Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nDiamondWarhammer.setIconCoord(9, 3);
        ModLoader.addName(mod_InfiWeapons.nDiamondWarhammer, "Bloody Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glDiamondWarhammer.setIconCoord(10, 3);
        ModLoader.addName(mod_InfiWeapons.glDiamondWarhammer, "Glowing Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.blDiamondWarhammer.setIconCoord(11, 3);
        ModLoader.addName(mod_InfiWeapons.blDiamondWarhammer, "Blazing Diamond Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blDiamondWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.diamond, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wGoldWarhammer.setIconCoord(0, 4);
        ModLoader.addName(mod_InfiWeapons.wGoldWarhammer, "Stony Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stGoldWarhammer.setIconCoord(1, 4);
        ModLoader.addName(mod_InfiWeapons.stGoldWarhammer, "Stony Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.gGoldWarhammer.setIconCoord(2, 4);
        ModLoader.addName(mod_InfiWeapons.gGoldWarhammer, "Expensive Useless Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oGoldWarhammer.setIconCoord(3, 4);
        ModLoader.addName(mod_InfiWeapons.oGoldWarhammer, "Glassy Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saGoldWarhammer.setIconCoord(4, 4);
        ModLoader.addName(mod_InfiWeapons.saGoldWarhammer, "Sandy Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bGoldWarhammer.setIconCoord(5, 4);
        ModLoader.addName(mod_InfiWeapons.bGoldWarhammer, "Necrotic Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGoldWarhammer.setIconCoord(6, 4);
        ModLoader.addName(mod_InfiWeapons.mGoldWarhammer, "Mossy Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGoldWarhammer.setIconCoord(7, 4);
        ModLoader.addName(mod_InfiWeapons.nGoldWarhammer, "Bloody Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGoldWarhammer.setIconCoord(8, 4);
        ModLoader.addName(mod_InfiWeapons.glGoldWarhammer, "Glowing Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGoldWarhammer.setIconCoord(9, 4);
        ModLoader.addName(mod_InfiWeapons.iceGoldWarhammer, "Icy Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sGoldWarhammer.setIconCoord(10, 4);
        ModLoader.addName(mod_InfiWeapons.sGoldWarhammer, "Slimy Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fGoldWarhammer.setIconCoord(11, 4);
        ModLoader.addName(mod_InfiWeapons.fGoldWarhammer, "Flaky Gold Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fGoldWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.ingotGold, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.wRedstoneWarhammer.setIconCoord(0, 5);
        ModLoader.addName(mod_InfiWeapons.wRedstoneWarhammer, "Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stRedstoneWarhammer.setIconCoord(1, 5);
        ModLoader.addName(mod_InfiWeapons.stRedstoneWarhammer, "Stony Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iRedstoneWarhammer.setIconCoord(2, 5);
        ModLoader.addName(mod_InfiWeapons.iRedstoneWarhammer, "Hard Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dRedstoneWarhammer.setIconCoord(3, 5);
        ModLoader.addName(mod_InfiWeapons.dRedstoneWarhammer, "Jeweled Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rRedstoneWarhammer.setIconCoord(4, 5);
        ModLoader.addName(mod_InfiWeapons.rRedstoneWarhammer, "Redredred Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oRedstoneWarhammer.setIconCoord(5, 5);
        ModLoader.addName(mod_InfiWeapons.oRedstoneWarhammer, "Glassy Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bRedstoneWarhammer.setIconCoord(6, 5);
        ModLoader.addName(mod_InfiWeapons.bRedstoneWarhammer, "Necrotic Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mRedstoneWarhammer.setIconCoord(7, 5);
        ModLoader.addName(mod_InfiWeapons.mRedstoneWarhammer, "Mossy Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glRedstoneWarhammer.setIconCoord(8, 5);
        ModLoader.addName(mod_InfiWeapons.glRedstoneWarhammer, "Glowing Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sRedstoneWarhammer.setIconCoord(9, 5);
        ModLoader.addName(mod_InfiWeapons.sRedstoneWarhammer, "Slimy Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blRedstoneWarhammer.setIconCoord(10, 5);
        ModLoader.addName(mod_InfiWeapons.blRedstoneWarhammer, "Blazing Redstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blRedstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.redstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wObsidianWarhammer.setIconCoord(0, 6);
        ModLoader.addName(mod_InfiWeapons.wObsidianWarhammer, "Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stObsidianWarhammer.setIconCoord(1, 6);
        ModLoader.addName(mod_InfiWeapons.stObsidianWarhammer, "Stony Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iObsidianWarhammer.setIconCoord(2, 6);
        ModLoader.addName(mod_InfiWeapons.iObsidianWarhammer, "Hard Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dObsidianWarhammer.setIconCoord(3, 6);
        ModLoader.addName(mod_InfiWeapons.dObsidianWarhammer, "Jeweled Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gObsidianWarhammer.setIconCoord(4, 6);
        ModLoader.addName(mod_InfiWeapons.gObsidianWarhammer, "Expensive Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rObsidianWarhammer.setIconCoord(5, 6);
        ModLoader.addName(mod_InfiWeapons.rObsidianWarhammer, "Red Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oObsidianWarhammer.setIconCoord(6, 6);
        ModLoader.addName(mod_InfiWeapons.oObsidianWarhammer, "Wicked Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bObsidianWarhammer.setIconCoord(7, 6);
        ModLoader.addName(mod_InfiWeapons.bObsidianWarhammer, "Necrotic Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nObsidianWarhammer.setIconCoord(8, 6);
        ModLoader.addName(mod_InfiWeapons.nObsidianWarhammer, "Bloody Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glObsidianWarhammer.setIconCoord(9, 6);
        ModLoader.addName(mod_InfiWeapons.glObsidianWarhammer, "Glowing Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sObsidianWarhammer.setIconCoord(10, 6);
        ModLoader.addName(mod_InfiWeapons.sObsidianWarhammer, "Slimy Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.fObsidianWarhammer.setIconCoord(11, 6);
        ModLoader.addName(mod_InfiWeapons.fObsidianWarhammer, "Flaky Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.blObsidianWarhammer.setIconCoord(12, 6);
        ModLoader.addName(mod_InfiWeapons.blObsidianWarhammer, "Blazing Obsidian Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blObsidianWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.obsidian, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSandstoneWarhammer.setIconCoord(0, 7);
        ModLoader.addName(mod_InfiWeapons.wSandstoneWarhammer, "Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSandstoneWarhammer.setIconCoord(1, 7);
        ModLoader.addName(mod_InfiWeapons.stSandstoneWarhammer, "Stony Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saSandstoneWarhammer.setIconCoord(2, 7);
        ModLoader.addName(mod_InfiWeapons.saSandstoneWarhammer, "Sandpound Two");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSandstoneWarhammer.setIconCoord(3, 7);
        ModLoader.addName(mod_InfiWeapons.bSandstoneWarhammer, "Necrotic Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSandstoneWarhammer.setIconCoord(4, 7);
        ModLoader.addName(mod_InfiWeapons.pSandstoneWarhammer, "Fibery Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nSandstoneWarhammer.setIconCoord(5, 7);
        ModLoader.addName(mod_InfiWeapons.nSandstoneWarhammer, "Bloody Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceSandstoneWarhammer.setIconCoord(6, 7);
        ModLoader.addName(mod_InfiWeapons.iceSandstoneWarhammer, "Icy Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sSandstoneWarhammer.setIconCoord(7, 7);
        ModLoader.addName(mod_InfiWeapons.sSandstoneWarhammer, "Slimy Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSandstoneWarhammer.setIconCoord(8, 7);
        ModLoader.addName(mod_InfiWeapons.cSandstoneWarhammer, "Spiny Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSandstoneWarhammer.setIconCoord(9, 7);
        ModLoader.addName(mod_InfiWeapons.fSandstoneWarhammer, "Flaky Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSandstoneWarhammer.setIconCoord(10, 7);
        ModLoader.addName(mod_InfiWeapons.brSandstoneWarhammer, "Baked Sandstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSandstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.sandStone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wBoneWarhammer.setIconCoord(0, 8);
        ModLoader.addName(mod_InfiWeapons.wBoneWarhammer, "Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stBoneWarhammer.setIconCoord(1, 8);
        ModLoader.addName(mod_InfiWeapons.stBoneWarhammer, "Stony Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iBoneWarhammer.setIconCoord(2, 8);
        ModLoader.addName(mod_InfiWeapons.iBoneWarhammer, "Hard Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dBoneWarhammer.setIconCoord(3, 8);
        ModLoader.addName(mod_InfiWeapons.dBoneWarhammer, "Jeweled Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBoneWarhammer.setIconCoord(4, 8);
        ModLoader.addName(mod_InfiWeapons.rBoneWarhammer, "Red Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oBoneWarhammer.setIconCoord(5, 8);
        ModLoader.addName(mod_InfiWeapons.oBoneWarhammer, "Glassy Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bBoneWarhammer.setIconCoord(6, 8);
        ModLoader.addName(mod_InfiWeapons.bBoneWarhammer, "Reanimated Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mBoneWarhammer.setIconCoord(7, 8);
        ModLoader.addName(mod_InfiWeapons.mBoneWarhammer, "Mossy Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nBoneWarhammer.setIconCoord(8, 8);
        ModLoader.addName(mod_InfiWeapons.nBoneWarhammer, "Netherrack Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBoneWarhammer.setIconCoord(9, 8);
        ModLoader.addName(mod_InfiWeapons.glBoneWarhammer, "Glowstone Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sBoneWarhammer.setIconCoord(10, 8);
        ModLoader.addName(mod_InfiWeapons.sBoneWarhammer, "Slimy Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBoneWarhammer.setIconCoord(11, 8);
        ModLoader.addName(mod_InfiWeapons.cBoneWarhammer, "Spiny Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBoneWarhammer.setIconCoord(12, 8);
        ModLoader.addName(mod_InfiWeapons.fBoneWarhammer, "Flaky Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBoneWarhammer.setIconCoord(13, 8);
        ModLoader.addName(mod_InfiWeapons.brBoneWarhammer, "Baked Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blBoneWarhammer.setIconCoord(14, 8);
        ModLoader.addName(mod_InfiWeapons.blBoneWarhammer, "Blazing Bone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.bone, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wPaperWarhammer.setIconCoord(0, 9);
        ModLoader.addName(mod_InfiWeapons.wPaperWarhammer, "Paper Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wPaperWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.saPaperWarhammer.setIconCoord(1, 9);
        ModLoader.addName(mod_InfiWeapons.saPaperWarhammer, "Stony Paper Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saPaperWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bPaperWarhammer.setIconCoord(2, 9);
        ModLoader.addName(mod_InfiWeapons.bPaperWarhammer, "Necrotic Paper Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bPaperWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pPaperWarhammer.setIconCoord(3, 9);
        ModLoader.addName(mod_InfiWeapons.pPaperWarhammer, "Large Paper Hammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pPaperWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.sPaperWarhammer.setIconCoord(4, 9);
        ModLoader.addName(mod_InfiWeapons.sPaperWarhammer, "Slimy Paper Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sPaperWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cPaperWarhammer.setIconCoord(5, 9);
        ModLoader.addName(mod_InfiWeapons.cPaperWarhammer, "Spiny Paper Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cPaperWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brPaperWarhammer.setIconCoord(6, 9);
        ModLoader.addName(mod_InfiWeapons.brPaperWarhammer, "Baked Paper Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brPaperWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.paperStack, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.stMossyWarhammer.setIconCoord(0, 10);
        ModLoader.addName(mod_InfiWeapons.stMossyWarhammer, "Stony Moss-Covered Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stMossyWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.dMossyWarhammer.setIconCoord(1, 10);
        ModLoader.addName(mod_InfiWeapons.dMossyWarhammer, "Jeweled Moss-Covered Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dMossyWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rMossyWarhammer.setIconCoord(2, 10);
        ModLoader.addName(mod_InfiWeapons.rMossyWarhammer, "Red Moss-Covered Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rMossyWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bMossyWarhammer.setIconCoord(3, 10);
        ModLoader.addName(mod_InfiWeapons.bMossyWarhammer, "Necrotic Moss-Covered Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bMossyWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mMossyWarhammer.setIconCoord(4, 10);
        ModLoader.addName(mod_InfiWeapons.mMossyWarhammer, "Living Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mMossyWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.glMossyWarhammer.setIconCoord(5, 10);
        ModLoader.addName(mod_InfiWeapons.glMossyWarhammer, "Glowing Moss-Covered Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glMossyWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.mossBallCrafted, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.wNetherrackWarhammer.setIconCoord(0, 11);
        ModLoader.addName(mod_InfiWeapons.wNetherrackWarhammer, "Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stNetherrackWarhammer.setIconCoord(1, 11);
        ModLoader.addName(mod_InfiWeapons.stNetherrackWarhammer, "Stony Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iNetherrackWarhammer.setIconCoord(2, 11);
        ModLoader.addName(mod_InfiWeapons.iNetherrackWarhammer, "Hard Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.rNetherrackWarhammer.setIconCoord(3, 11);
        ModLoader.addName(mod_InfiWeapons.rNetherrackWarhammer, "Red Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oNetherrackWarhammer.setIconCoord(4, 11);
        ModLoader.addName(mod_InfiWeapons.oNetherrackWarhammer, "Glassy Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saNetherrackWarhammer.setIconCoord(5, 11);
        ModLoader.addName(mod_InfiWeapons.saNetherrackWarhammer, "Sandy Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bNetherrackWarhammer.setIconCoord(6, 11);
        ModLoader.addName(mod_InfiWeapons.bNetherrackWarhammer, "Necrotic Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mNetherrackWarhammer.setIconCoord(7, 11);
        ModLoader.addName(mod_InfiWeapons.mNetherrackWarhammer, "Mossy Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nNetherrackWarhammer.setIconCoord(8, 11);
        ModLoader.addName(mod_InfiWeapons.nNetherrackWarhammer, "Meat Pounder");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glNetherrackWarhammer.setIconCoord(9, 11);
        ModLoader.addName(mod_InfiWeapons.glNetherrackWarhammer, "Glowing Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceNetherrackWarhammer.setIconCoord(10, 11);
        ModLoader.addName(mod_InfiWeapons.iceNetherrackWarhammer, "Icy Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sNetherrackWarhammer.setIconCoord(11, 11);
        ModLoader.addName(mod_InfiWeapons.sNetherrackWarhammer, "Slimy Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cNetherrackWarhammer.setIconCoord(12, 11);
        ModLoader.addName(mod_InfiWeapons.cNetherrackWarhammer, "Spiny Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fNetherrackWarhammer.setIconCoord(13, 11);
        ModLoader.addName(mod_InfiWeapons.fNetherrackWarhammer, "Flaky Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.brNetherrackWarhammer.setIconCoord(14, 11);
        ModLoader.addName(mod_InfiWeapons.brNetherrackWarhammer, "Baked Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.blNetherrackWarhammer.setIconCoord(15, 11);
        ModLoader.addName(mod_InfiWeapons.blNetherrackWarhammer, "Blazing Netherrack Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blNetherrackWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.netherrack, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.wGlowstoneWarhammer.setIconCoord(0, 12);
        ModLoader.addName(mod_InfiWeapons.wGlowstoneWarhammer, "Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stGlowstoneWarhammer.setIconCoord(1, 12);
        ModLoader.addName(mod_InfiWeapons.stGlowstoneWarhammer, "Stony Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iGlowstoneWarhammer.setIconCoord(2, 12);
        ModLoader.addName(mod_InfiWeapons.iGlowstoneWarhammer, "Hard Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dGlowstoneWarhammer.setIconCoord(3, 12);
        ModLoader.addName(mod_InfiWeapons.dGlowstoneWarhammer, "Jeweled Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rGlowstoneWarhammer.setIconCoord(4, 12);
        ModLoader.addName(mod_InfiWeapons.rGlowstoneWarhammer, "Red Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oGlowstoneWarhammer.setIconCoord(5, 12);
        ModLoader.addName(mod_InfiWeapons.oGlowstoneWarhammer, "Glassy Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.bGlowstoneWarhammer.setIconCoord(6, 12);
        ModLoader.addName(mod_InfiWeapons.bGlowstoneWarhammer, "Necrotic Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.mGlowstoneWarhammer.setIconCoord(7, 12);
        ModLoader.addName(mod_InfiWeapons.mGlowstoneWarhammer, "Mossy Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nGlowstoneWarhammer.setIconCoord(8, 12);
        ModLoader.addName(mod_InfiWeapons.nGlowstoneWarhammer, "Bloody Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glGlowstoneWarhammer.setIconCoord(9, 12);
        ModLoader.addName(mod_InfiWeapons.glGlowstoneWarhammer, "Bright Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceGlowstoneWarhammer.setIconCoord(10, 12);
        ModLoader.addName(mod_InfiWeapons.iceGlowstoneWarhammer, "Icy Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lGlowstoneWarhammer.setIconCoord(11, 12);
        ModLoader.addName(mod_InfiWeapons.lGlowstoneWarhammer, "Fiery Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.sGlowstoneWarhammer.setIconCoord(12, 12);
        ModLoader.addName(mod_InfiWeapons.sGlowstoneWarhammer, "Slimy Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.blGlowstoneWarhammer.setIconCoord(13, 12);
        ModLoader.addName(mod_InfiWeapons.blGlowstoneWarhammer, "Blazing Glowstone Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blGlowstoneWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.glowstoneCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wIceWarhammer.setIconCoord(0, 13);
        ModLoader.addName(mod_InfiWeapons.wIceWarhammer, "Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stIceWarhammer.setIconCoord(1, 13);
        ModLoader.addName(mod_InfiWeapons.stIceWarhammer, "Stony Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iIceWarhammer.setIconCoord(2, 13);
        ModLoader.addName(mod_InfiWeapons.iIceWarhammer, "Hard Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dIceWarhammer.setIconCoord(3, 13);
        ModLoader.addName(mod_InfiWeapons.dIceWarhammer, "Jeweled Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gIceWarhammer.setIconCoord(4, 13);
        ModLoader.addName(mod_InfiWeapons.gIceWarhammer, "Expensive Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rIceWarhammer.setIconCoord(5, 13);
        ModLoader.addName(mod_InfiWeapons.rIceWarhammer, "Red Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oIceWarhammer.setIconCoord(6, 13);
        ModLoader.addName(mod_InfiWeapons.oIceWarhammer, "Glassy Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saIceWarhammer.setIconCoord(7, 13);
        ModLoader.addName(mod_InfiWeapons.saIceWarhammer, "Sandy Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bIceWarhammer.setIconCoord(8, 13);
        ModLoader.addName(mod_InfiWeapons.bIceWarhammer, "Necrotic Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.glIceWarhammer.setIconCoord(9, 13);
        ModLoader.addName(mod_InfiWeapons.glIceWarhammer, "Glowing Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceIceWarhammer.setIconCoord(10, 13);
        ModLoader.addName(mod_InfiWeapons.iceIceWarhammer, "Compressed Snowflake");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sIceWarhammer.setIconCoord(11, 13);
        ModLoader.addName(mod_InfiWeapons.sIceWarhammer, "Slimy Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cIceWarhammer.setIconCoord(12, 13);
        ModLoader.addName(mod_InfiWeapons.cIceWarhammer, "Spiny Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fIceWarhammer.setIconCoord(13, 13);
        ModLoader.addName(mod_InfiWeapons.fIceWarhammer, "Flaky Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brIceWarhammer.setIconCoord(14, 13);
        ModLoader.addName(mod_InfiWeapons.brIceWarhammer, "Baked Ice Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brIceWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.ice, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dLavaWarhammer.setIconCoord(0, 14);
        ModLoader.addName(mod_InfiWeapons.dLavaWarhammer, "Jeweled Lava Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dLavaWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rLavaWarhammer.setIconCoord(1, 14);
        ModLoader.addName(mod_InfiWeapons.rLavaWarhammer, "Red Lava Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rLavaWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bLavaWarhammer.setIconCoord(2, 14);
        ModLoader.addName(mod_InfiWeapons.bLavaWarhammer, "Necrotic Lava Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bLavaWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nLavaWarhammer.setIconCoord(3, 14);
        ModLoader.addName(mod_InfiWeapons.nLavaWarhammer, "Bloody Lava Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nLavaWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glLavaWarhammer.setIconCoord(4, 14);
        ModLoader.addName(mod_InfiWeapons.glLavaWarhammer, "Glowing Lava Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glLavaWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lLavaWarhammer.setIconCoord(5, 14);
        ModLoader.addName(mod_InfiWeapons.lLavaWarhammer, "Bedrock Thumper");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lLavaWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.blLavaWarhammer.setIconCoord(6, 14);
        ModLoader.addName(mod_InfiWeapons.blLavaWarhammer, "Blazing Lava Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blLavaWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.lavaCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wSlimeWarhammer.setIconCoord(0, 15);
        ModLoader.addName(mod_InfiWeapons.wSlimeWarhammer, "Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stSlimeWarhammer.setIconCoord(1, 15);
        ModLoader.addName(mod_InfiWeapons.stSlimeWarhammer, "Stony Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iSlimeWarhammer.setIconCoord(2, 15);
        ModLoader.addName(mod_InfiWeapons.iSlimeWarhammer, "Hard Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.dSlimeWarhammer.setIconCoord(3, 15);
        ModLoader.addName(mod_InfiWeapons.dSlimeWarhammer, "Jeweled Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.gSlimeWarhammer.setIconCoord(4, 15);
        ModLoader.addName(mod_InfiWeapons.gSlimeWarhammer, "Expensive Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.rSlimeWarhammer.setIconCoord(5, 15);
        ModLoader.addName(mod_InfiWeapons.rSlimeWarhammer, "Red Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.oSlimeWarhammer.setIconCoord(6, 15);
        ModLoader.addName(mod_InfiWeapons.oSlimeWarhammer, "Glassy Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saSlimeWarhammer.setIconCoord(7, 15);
        ModLoader.addName(mod_InfiWeapons.saSlimeWarhammer, "Sandy Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bSlimeWarhammer.setIconCoord(8, 15);
        ModLoader.addName(mod_InfiWeapons.bSlimeWarhammer, "Necrotic Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pSlimeWarhammer.setIconCoord(9, 15);
        ModLoader.addName(mod_InfiWeapons.pSlimeWarhammer, "Fibery Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.mSlimeWarhammer.setIconCoord(10, 15);
        ModLoader.addName(mod_InfiWeapons.mSlimeWarhammer, "Mossy Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.mSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.mossyRod
                });
        mod_InfiWeapons.nSlimeWarhammer.setIconCoord(11, 15);
        ModLoader.addName(mod_InfiWeapons.nSlimeWarhammer, "Bloody Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glSlimeWarhammer.setIconCoord(12, 15);
        ModLoader.addName(mod_InfiWeapons.glSlimeWarhammer, "Glowing Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.iceSlimeWarhammer.setIconCoord(13, 15);
        ModLoader.addName(mod_InfiWeapons.iceSlimeWarhammer, "Icy Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.lSlimeWarhammer.setIconCoord(14, 15);
        ModLoader.addName(mod_InfiWeapons.lSlimeWarhammer, "Fiery Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.lavaRod
                });
        mod_InfiWeapons.sSlimeWarhammer.setIconCoord(15, 15);
        ModLoader.addName(mod_InfiWeapons.sSlimeWarhammer, "Croquet Mallet");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cSlimeWarhammer.setIconCoord(12, 14);
        ModLoader.addName(mod_InfiWeapons.cSlimeWarhammer, "Spiny Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fSlimeWarhammer.setIconCoord(13, 14);
        ModLoader.addName(mod_InfiWeapons.fSlimeWarhammer, "Flaky Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brSlimeWarhammer.setIconCoord(14, 14);
        ModLoader.addName(mod_InfiWeapons.brSlimeWarhammer, "Baked Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blSlimeWarhammer.setIconCoord(15, 14);
        ModLoader.addName(mod_InfiWeapons.blSlimeWarhammer, "Blazing Slime Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blSlimeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.slimeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wCactusWarhammer.setIconCoord(10, 0);
        ModLoader.addName(mod_InfiWeapons.wCactusWarhammer, "Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stCactusWarhammer.setIconCoord(11, 0);
        ModLoader.addName(mod_InfiWeapons.stCactusWarhammer, "Stony Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saCactusWarhammer.setIconCoord(12, 0);
        ModLoader.addName(mod_InfiWeapons.saCactusWarhammer, "Sandy Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bCactusWarhammer.setIconCoord(13, 0);
        ModLoader.addName(mod_InfiWeapons.bCactusWarhammer, "Necrotic Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pCactusWarhammer.setIconCoord(14, 0);
        ModLoader.addName(mod_InfiWeapons.pCactusWarhammer, "Fibery Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nCactusWarhammer.setIconCoord(15, 0);
        ModLoader.addName(mod_InfiWeapons.nCactusWarhammer, "Bloody Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.sCactusWarhammer.setIconCoord(12, 1);
        ModLoader.addName(mod_InfiWeapons.sCactusWarhammer, "Slimy Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cCactusWarhammer.setIconCoord(13, 1);
        ModLoader.addName(mod_InfiWeapons.cCactusWarhammer, "Spined Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fCactusWarhammer.setIconCoord(14, 1);
        ModLoader.addName(mod_InfiWeapons.fCactusWarhammer, "Flaky Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brCactusWarhammer.setIconCoord(15, 1);
        ModLoader.addName(mod_InfiWeapons.brCactusWarhammer, "Baked Cactus Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brCactusWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Block.cactus, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.wFlintWarhammer.setIconCoord(13, 2);
        ModLoader.addName(mod_InfiWeapons.wFlintWarhammer, "Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.stick
                });
        mod_InfiWeapons.stFlintWarhammer.setIconCoord(14, 2);
        ModLoader.addName(mod_InfiWeapons.stFlintWarhammer, "Stony Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.iFlintWarhammer.setIconCoord(15, 2);
        ModLoader.addName(mod_InfiWeapons.iFlintWarhammer, "Hard Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.ironRod
                });
        mod_InfiWeapons.gFlintWarhammer.setIconCoord(12, 3);
        ModLoader.addName(mod_InfiWeapons.gFlintWarhammer, "Expensive Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.gFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.goldRod
                });
        mod_InfiWeapons.oFlintWarhammer.setIconCoord(13, 3);
        ModLoader.addName(mod_InfiWeapons.oFlintWarhammer, "Glassy Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.oFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.obsidianRod
                });
        mod_InfiWeapons.saFlintWarhammer.setIconCoord(14, 3);
        ModLoader.addName(mod_InfiWeapons.saFlintWarhammer, "Sandy Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bFlintWarhammer.setIconCoord(15, 3);
        ModLoader.addName(mod_InfiWeapons.bFlintWarhammer, "Necrotic Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nFlintWarhammer.setIconCoord(12, 4);
        ModLoader.addName(mod_InfiWeapons.nFlintWarhammer, "Bloody Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceFlintWarhammer.setIconCoord(13, 4);
        ModLoader.addName(mod_InfiWeapons.iceFlintWarhammer, "Icy Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sFlintWarhammer.setIconCoord(14, 4);
        ModLoader.addName(mod_InfiWeapons.sFlintWarhammer, "Slimy Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cFlintWarhammer.setIconCoord(15, 4);
        ModLoader.addName(mod_InfiWeapons.cFlintWarhammer, "Spiny Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fFlintWarhammer.setIconCoord(11, 5);
        ModLoader.addName(mod_InfiWeapons.fFlintWarhammer, "Flaky Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brFlintWarhammer.setIconCoord(12, 5);
        ModLoader.addName(mod_InfiWeapons.brFlintWarhammer, "Rough-hewn Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.blFlintWarhammer.setIconCoord(13, 5);
        ModLoader.addName(mod_InfiWeapons.blFlintWarhammer, "Blazing Flint Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blFlintWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.flint, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.wBrickWarhammer.setIconCoord(14, 5);
        ModLoader.addName(mod_InfiWeapons.wBrickWarhammer, "Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.wBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.brick
                });
        mod_InfiWeapons.stBrickWarhammer.setIconCoord(15, 5);
        ModLoader.addName(mod_InfiWeapons.stBrickWarhammer, "Stony Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.stBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.stoneRod
                });
        mod_InfiWeapons.saBrickWarhammer.setIconCoord(13, 6);
        ModLoader.addName(mod_InfiWeapons.saBrickWarhammer, "Sandstone Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.saBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.sandstoneRod
                });
        mod_InfiWeapons.bBrickWarhammer.setIconCoord(14, 6);
        ModLoader.addName(mod_InfiWeapons.bBrickWarhammer, "Necrotic Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.pBrickWarhammer.setIconCoord(15, 6);
        ModLoader.addName(mod_InfiWeapons.pBrickWarhammer, "Fibery Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.pBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.paperRod
                });
        mod_InfiWeapons.nBrickWarhammer.setIconCoord(11, 7);
        ModLoader.addName(mod_InfiWeapons.nBrickWarhammer, "Bloody Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.iceBrickWarhammer.setIconCoord(12, 7);
        ModLoader.addName(mod_InfiWeapons.iceBrickWarhammer, "Icy Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.iceBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.iceRod
                });
        mod_InfiWeapons.sBrickWarhammer.setIconCoord(13, 7);
        ModLoader.addName(mod_InfiWeapons.sBrickWarhammer, "Slimy Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.sBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.slimeRod
                });
        mod_InfiWeapons.cBrickWarhammer.setIconCoord(14, 7);
        ModLoader.addName(mod_InfiWeapons.cBrickWarhammer, "Spiny Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.cBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.cactusRod
                });
        mod_InfiWeapons.fBrickWarhammer.setIconCoord(15, 7);
        ModLoader.addName(mod_InfiWeapons.fBrickWarhammer, "Flaky Brick Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.flintRod
                });
        mod_InfiWeapons.brBrickWarhammer.setIconCoord(15, 8);
        ModLoader.addName(mod_InfiWeapons.brBrickWarhammer, "Look-alike Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.brBrickWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), Item.brick, Character.valueOf('|'), mod_InfiTools.brickRod
                });
        mod_InfiWeapons.dBlazeWarhammer.setIconCoord(7, 9);
        ModLoader.addName(mod_InfiWeapons.dBlazeWarhammer, "Jeweled Blaze Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.dBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.diamondRod
                });
        mod_InfiWeapons.rBlazeWarhammer.setIconCoord(8, 9);
        ModLoader.addName(mod_InfiWeapons.rBlazeWarhammer, "Red Blaze Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.rBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.redstoneRod
                });
        mod_InfiWeapons.bBlazeWarhammer.setIconCoord(9, 9);
        ModLoader.addName(mod_InfiWeapons.bBlazeWarhammer, "Necrotic Blaze Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.bone
                });
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.bBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.boneRod
                });
        mod_InfiWeapons.nBlazeWarhammer.setIconCoord(10, 9);
        ModLoader.addName(mod_InfiWeapons.nBlazeWarhammer, "Bloody Blaze Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.nBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.netherrackRod
                });
        mod_InfiWeapons.glBlazeWarhammer.setIconCoord(11, 9);
        ModLoader.addName(mod_InfiWeapons.glBlazeWarhammer, "Glowing Blaze Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.glBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), mod_InfiTools.glowstoneRod
                });
        mod_InfiWeapons.lBlazeWarhammer.setIconCoord(12, 9);
        ModLoader.addName(mod_InfiWeapons.lBlazeWarhammer, "Fiery Blaze Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.lBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.fBlazeWarhammer.setIconCoord(13, 9);
        ModLoader.addName(mod_InfiWeapons.fBlazeWarhammer, "Flaky Blaze Warhammer");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.fBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        mod_InfiWeapons.blBlazeWarhammer.setIconCoord(14, 9);
        ModLoader.addName(mod_InfiWeapons.blBlazeWarhammer, "Underworld Smite");
        ModLoader.addRecipe(new ItemStack(mod_InfiWeapons.blBlazeWarhammer, 1), new Object[]
                {
                    "m|m", "m|m", " | ", Character.valueOf('m'), mod_InfiTools.blazeCrystal, Character.valueOf('|'), Item.blazeRod
                });
        return 0;
    }
}
