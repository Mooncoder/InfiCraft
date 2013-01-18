package tinker.toolconstruct.client;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import tinker.toolconstruct.blocks.FrypanContainer;
import tinker.toolconstruct.blocks.FrypanLogic;

public class FrypanGui extends GuiContainer
{
    public FrypanLogic logic;

    public FrypanGui(InventoryPlayer inventoryplayer, FrypanLogic frypan, World world, int x, int y, int z)
    {
        super(frypan.getGuiContainer(inventoryplayer, world, x, y, z));
    	//super (new FrypanContainer(inventoryplayer, frypan));
        logic = frypan;
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        fontRenderer.drawString(StatCollector.translateToLocal("crafters.Frypan"), 60, 6, 0x404040);
        fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        int texID = mc.renderEngine.getTexture("/tinkertextures/gui/frypan.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(texID);
        int cornerX = (width - xSize) / 2;
        int cornerY = (height - ySize) / 2;
        drawTexturedModalRect(cornerX, cornerY, 0, 0, xSize, ySize);
        if (logic.fuel > 0)
        {
            int fuel = logic.gaugeFuelScaled(12);
            drawTexturedModalRect(cornerX + 27, (cornerY + 40) - fuel, 176, 12 - fuel, 14, fuel + 2);
        }
        int fuelgague = logic.gaugeProgressScaled(24);
        drawTexturedModalRect(cornerX + 140, cornerY + 8, 176, 14, fuelgague, 16);
    }
}
