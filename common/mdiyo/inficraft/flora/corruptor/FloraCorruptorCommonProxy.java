package mdiyo.inficraft.flora.corruptor;

import java.io.File;

import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;

public class FloraCorruptorCommonProxy 
{	
	/* Registers any rendering code. Does nothing server-side */
	public void registerRenderer() {}
	
	/* Ties an internal name to a visible one. Does nothing server-side */
	public void addNames() {}
	
	/* Equivalent Exchange support, direct plug-in 
	 * Temporarily disabled
	 */
	public void addEESupport()
	{
		/*try 
		try 
		{
			Class class1 = Class.forName("mod_EE");
            Class class2 = Class.forName("EEProxy");
			int corr = 64;
            int corrBrick = 512;
            EEProxy.setEMC(new ItemStack(corruptor, 1, 0), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 1), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 2), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 3), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 4), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 5), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 6), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 7), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 8), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 9), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 10), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 11), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 12), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 13), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 14), corr);
            EEProxy.setEMC(new ItemStack(corruptor, 1, 15), corr);
            
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 0), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 1), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 2), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 3), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 4), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 5), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 6), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 7), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 8), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 9), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 10), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 11), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 12), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 13), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 14), corrBrick);
            EEProxy.setEMC(new ItemStack(corruptBrick, 1, 15), corrBrick);
		} 
		catch (Throwable throwable)
		{
			System.out.println("Equivalent Exchange integration for mod_FloraCorruptor failed! Reason:");
            System.out.println(throwable);
		}*/  
	}
	
	public void addRecipes()
	{
		for (int i = 0; i <= 7; i++)
		{
			ModLoader.addRecipe(new ItemStack(FloraCorruptor.getInstance().corruptor, 1, i), new Object[]
			{
				"c", 'c', new ItemStack(FloraCorruptor.getInstance().corruptBrick, 1, i)
			});
		}

		for (int j = 0; j <= 7; j++)
		{
			ModLoader.addRecipe(new ItemStack(FloraCorruptor.getInstance().corruptBrick, 4, j + 8), new Object[]
			{
				"cc", "cc", 'c', new ItemStack(FloraCorruptor.getInstance().corruptBrick, 1, j)
			});
		}
	}
	
	public File getMinecraftDir()
	{
		return new File(".");
	}
}