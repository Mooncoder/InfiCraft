package inficraft.orizon.slimepools;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class SlimeRender implements ISimpleBlockRenderingHandler
{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelID,
			RenderBlocks renderer) {
		
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z,
			Block block, int modelId, RenderBlocks renderer) {
		if (modelId == OrizonSlime.slimeModel)
		{
			renderer.renderStandardBlock(block, x, y, z);
			//renderLiquidBlock(block, x, y, z, renderer, world);
		}
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory() {
		return false;
	}

	@Override
	public int getRenderId() {
		return OrizonSlime.slimeModel;
	}
	
	public boolean renderLiquidBlock(Block par1Block, int par2, int par3, int par4, RenderBlocks render, IBlockAccess blockAccess)
    {
		Tessellator var5 = Tessellator.instance;
        int var6 = par1Block.colorMultiplier(render.blockAccess, par2, par3, par4);
        float var7 = (float)(var6 >> 16 & 255) / 255.0F;
        float var8 = (float)(var6 >> 8 & 255) / 255.0F;
        float var9 = (float)(var6 & 255) / 255.0F;
        boolean var10 = par1Block.shouldSideBeRendered(render.blockAccess, par2, par3 + 1, par4, 1);
        boolean var11 = par1Block.shouldSideBeRendered(render.blockAccess, par2, par3 - 1, par4, 0);
        boolean[] var12 = new boolean[] {par1Block.shouldSideBeRendered(render.blockAccess, par2, par3, par4 - 1, 2), par1Block.shouldSideBeRendered(render.blockAccess, par2, par3, par4 + 1, 3), par1Block.shouldSideBeRendered(render.blockAccess, par2 - 1, par3, par4, 4), par1Block.shouldSideBeRendered(render.blockAccess, par2 + 1, par3, par4, 5)};

        if (!var10 && !var11 && !var12[0] && !var12[1] && !var12[2] && !var12[3])
        {
            return false;
        }
        else
        {
            boolean var13 = false;
            float var14 = 0.5F;
            float var15 = 1.0F;
            float var16 = 0.8F;
            float var17 = 0.6F;
            double var18 = 0.0D;
            double var20 = 1.0D;
            Material var22 = par1Block.blockMaterial;
            int var23 = blockAccess.getBlockMetadata(par2, par3, par4);
            double var24 = (double)this.getLiquidHeight(par2, par3, par4, var22, blockAccess);
            double var26 = (double)this.getLiquidHeight(par2, par3, par4 + 1, var22, blockAccess);
            double var28 = (double)this.getLiquidHeight(par2 + 1, par3, par4 + 1, var22, blockAccess);
            double var30 = (double)this.getLiquidHeight(par2 + 1, par3, par4, var22, blockAccess);
            double var32 = 0.0010000000474974513D;
            int var34;
            int var37;

            if (render.renderAllFaces || var10)
            {
                var13 = true;
                var34 = par1Block.getBlockTextureFromSideAndMetadata(1, var23);
                float var35 = (float)BlockFluid.getFlowDirection(blockAccess, par2, par3, par4, var22);

                if (var35 > -999.0F)
                {
                    var34 = par1Block.getBlockTextureFromSideAndMetadata(2, var23);
                }

                var24 -= var32;
                var26 -= var32;
                var28 -= var32;
                var30 -= var32;
                int var36 = (var34 & 15) << 4;
                var37 = var34 & 240;
                double var38 = ((double)var36 + 8.0D) / 256.0D;
                double var40 = ((double)var37 + 8.0D) / 256.0D;

                if (var35 < -999.0F)
                {
                    var35 = 0.0F;
                }
                else
                {
                    var38 = (double)((float)(var36 + 16) / 256.0F);
                    var40 = (double)((float)(var37 + 16) / 256.0F);
                }

                double var42 = (double)(MathHelper.sin(var35) * 8.0F) / 256.0D;
                double var44 = (double)(MathHelper.cos(var35) * 8.0F) / 256.0D;
                var5.setBrightness(par1Block.getMixedBrightnessForBlock(blockAccess, par2, par3, par4));
                float var46 = 1.0F;
                var5.setColorOpaque_F(var15 * var46 * var7, var15 * var46 * var8, var15 * var46 * var9);
                var5.addVertexWithUV((double)(par2 + 0), (double)par3 + var24, (double)(par4 + 0), var38 - var44 - var42, var40 - var44 + var42);
                var5.addVertexWithUV((double)(par2 + 0), (double)par3 + var26, (double)(par4 + 1), var38 - var44 + var42, var40 + var44 + var42);
                var5.addVertexWithUV((double)(par2 + 1), (double)par3 + var28, (double)(par4 + 1), var38 + var44 + var42, var40 + var44 - var42);
                var5.addVertexWithUV((double)(par2 + 1), (double)par3 + var30, (double)(par4 + 0), var38 + var44 - var42, var40 - var44 - var42);
            }

            if (render.renderAllFaces || var11)
            {
                var5.setBrightness(par1Block.getMixedBrightnessForBlock(blockAccess, par2, par3 - 1, par4));
                float var65 = 1.0F;
                var5.setColorOpaque_F(var14 * var65, var14 * var65, var14 * var65);
                render.renderBottomFace(par1Block, (double)par2, (double)par3 + var32, (double)par4, par1Block.getBlockTextureFromSide(0));
                var13 = true;
            }

            for (var34 = 0; var34 < 4; ++var34)
            {
                int var64 = par2;
                var37 = par4;

                if (var34 == 0)
                {
                    var37 = par4 - 1;
                }

                if (var34 == 1)
                {
                    ++var37;
                }

                if (var34 == 2)
                {
                    var64 = par2 - 1;
                }

                if (var34 == 3)
                {
                    ++var64;
                }

                int var66 = par1Block.getBlockTextureFromSideAndMetadata(var34 + 2, var23);
                int var39 = (var66 & 15) << 4;
                int var67 = var66 & 240;

                if (render.renderAllFaces || var12[var34])
                {
                    double var43;
                    double var41;
                    double var47;
                    double var45;
                    double var51;
                    double var49;

                    if (var34 == 0)
                    {
                        var41 = var24;
                        var43 = var30;
                        var45 = (double)par2;
                        var49 = (double)(par2 + 1);
                        var47 = (double)par4 + var32;
                        var51 = (double)par4 + var32;
                    }
                    else if (var34 == 1)
                    {
                        var41 = var28;
                        var43 = var26;
                        var45 = (double)(par2 + 1);
                        var49 = (double)par2;
                        var47 = (double)(par4 + 1) - var32;
                        var51 = (double)(par4 + 1) - var32;
                    }
                    else if (var34 == 2)
                    {
                        var41 = var26;
                        var43 = var24;
                        var45 = (double)par2 + var32;
                        var49 = (double)par2 + var32;
                        var47 = (double)(par4 + 1);
                        var51 = (double)par4;
                    }
                    else
                    {
                        var41 = var30;
                        var43 = var28;
                        var45 = (double)(par2 + 1) - var32;
                        var49 = (double)(par2 + 1) - var32;
                        var47 = (double)par4;
                        var51 = (double)(par4 + 1);
                    }

                    var13 = true;
                    double var53 = (double)((float)(var39 + 0) / 256.0F);
                    double var55 = ((double)(var39 + 16) - 0.01D) / 256.0D;
                    double var57 = ((double)var67 + (1.0D - var41) * 16.0D) / 256.0D;
                    double var59 = ((double)var67 + (1.0D - var43) * 16.0D) / 256.0D;
                    double var61 = ((double)(var67 + 16) - 0.01D) / 256.0D;
                    var5.setBrightness(par1Block.getMixedBrightnessForBlock(blockAccess, var64, par3, var37));
                    float var63 = 1.0F;

                    if (var34 < 2)
                    {
                        var63 *= var16;
                    }
                    else
                    {
                        var63 *= var17;
                    }

                    var5.setColorOpaque_F(var15 * var63 * var7, var15 * var63 * var8, var15 * var63 * var9);
                    var5.addVertexWithUV(var45, (double)par3 + var41, var47, var53, var57);
                    var5.addVertexWithUV(var49, (double)par3 + var43, var51, var55, var59);
                    var5.addVertexWithUV(var49, (double)(par3 + 0), var51, var55, var61);
                    var5.addVertexWithUV(var45, (double)(par3 + 0), var47, var53, var61);
                }
            }

            render.renderMinY = var18;
            render.renderMaxY = var20;
            return var13;
        }
    }
	
	public float getLiquidHeight(int par1, int par2, int par3, Material par4Material, IBlockAccess blockAccess)
    {
        int var5 = 0;
        float var6 = 0.0F;

        for (int var7 = 0; var7 < 4; ++var7)
        {
            int var8 = par1 - (var7 & 1);
            int var10 = par3 - (var7 >> 1 & 1);

            if (blockAccess.getBlockMaterial(var8, par2 + 1, var10) == par4Material)
            {
                return 1.0F;
            }

            Material var11 = blockAccess.getBlockMaterial(var8, par2, var10);

            if (var11 == par4Material)
            {
                int var12 = blockAccess.getBlockMetadata(var8, par2, var10);

                if (var12 >= 8 || var12 == 0)
                {
                    var6 += LiquidBlockBase.getFluidHeightPercent(var12) * 10.0F;
                    var5 += 10;
                }

                var6 += LiquidBlockBase.getFluidHeightPercent(var12);
                ++var5;
            }
            else if (!var11.isSolid())
            {
                ++var6;
                ++var5;
            }
        }

        return 1.0F - var6 / (float)var5;
    }
}
