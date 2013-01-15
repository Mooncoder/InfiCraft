package florasoma.corruptor;

import java.io.File;

import net.minecraft.client.Minecraft;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;

public class FloraCorruptorClientProxy extends FloraCorruptorCommonProxy
{
	
	/* Registers any rendering code. */
	@Override
	public void registerRenderer() 
	{
		MinecraftForgeClient.preloadTexture(FloraCorruptor.texture);
	}
	@Override
	public void addNames()
	{
		ModLoader.addLocalization("bloodcorruptor.name", "Blood Corruptor");
		ModLoader.addLocalization("azurecorruptor.name", "Azure Corruptor");
		ModLoader.addLocalization("envycorruptor.name", "Envious Corruptor");
		ModLoader.addLocalization("ambercorruptor.name", "Amber Corruptor");
		ModLoader.addLocalization("heartcorruptor.name", "Heart Corruptor");
		ModLoader.addLocalization("darkcorruptor.name", "Dark Corruptor");
		ModLoader.addLocalization("brightcorruptor.name", "Bright Corruptor");
		ModLoader.addLocalization("purecorruptor.name", "Pure Corruptor");
		
		ModLoader.addLocalization("bloodgrasscorruptor.name", "Blood Corruption Grass");
		ModLoader.addLocalization("azuregrasscorruptor.name", "Azure Corruption Grass");
		ModLoader.addLocalization("envygrasscorruptor.name", "Envious Corruption Grass");
		ModLoader.addLocalization("ambergrasscorruptor.name", "Amber Corruption Grass");
		ModLoader.addLocalization("heartgrasscorruptor.name", "Heart Corruption Grass");
		ModLoader.addLocalization("darkgrasscorruptor.name", "Dark Corruption Grass");
		ModLoader.addLocalization("brightgrasscorruptor.name", "Bright Corruption Grass");
		ModLoader.addLocalization("puregrasscorruptor.name", "Pure Corruption Grass");
		
		ModLoader.addLocalization("bloodcorrupted.name", "Bloodstone");
		ModLoader.addLocalization("azurecorrupted.name", "Azure Stone");
		ModLoader.addLocalization("envycorrupted.name", "Envious Stone");
		ModLoader.addLocalization("ambercorrupted.name", "Amber Stone");
		ModLoader.addLocalization("heartcorrupted.name", "Heartstone");
		ModLoader.addLocalization("darkcorrupted.name", "Darkstone");
		ModLoader.addLocalization("brightcorrupted.name", "Brightstone");
		ModLoader.addLocalization("purecorrupted.name", "Purified Stone");
		
		ModLoader.addLocalization("bloodbrickcorrupted.name", "Blood Brick");
		ModLoader.addLocalization("azurebrickcorrupted.name", "Azure Brick");
		ModLoader.addLocalization("envybrickcorrupted.name", "Envious Brick");
		ModLoader.addLocalization("amberbrickcorrupted.name", "Amber Brick");
		ModLoader.addLocalization("heartbrickcorrupted.name", "Heart Brick");
		ModLoader.addLocalization("darkbrickcorrupted.name", "Dark Brick");
		ModLoader.addLocalization("brightbrickcorrupted.name", "Bright Brick");
		ModLoader.addLocalization("purebrickcorrupted.name", "Purified Brick");
	}
	
	@Override
	public File getMinecraftDir()
	{
		return Minecraft.getMinecraftDir();
	}
}
