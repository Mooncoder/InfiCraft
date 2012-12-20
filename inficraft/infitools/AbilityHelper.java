package inficraft.infitools;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class AbilityHelper
{
	public static boolean onBlockDestroyed(ItemStack stack, World world, int bID, int x, int y, int z, EntityLiving player, Random random)
	{
		if (!stack.hasTagCompound())
			return false;

		int durability = 0;
		NBTTagCompound tags = stack.getTagCompound();

		if (tags.getCompoundTag("InfiTool").hasKey("Durability"))
			durability = tags.getCompoundTag("InfiTool").getInteger("Durability");
		
		if (random.nextInt(10) < 10 - durability)
		{
			damageTool(stack, 1, tags, player);
		}			
		
		return true;
	}
	
	public static void hitEntity(ItemStack stack, EntityLiving mob, EntityLiving player, int baseDamage)
	{
		NBTTagCompound tags = stack.getTagCompound();
		if (!tags.getCompoundTag("InfiTool").getBoolean("Broken"))
		{
			int durability = tags.getCompoundTag("InfiTool").getInteger("Damage");
			
			float shoddy = tags.getCompoundTag("InfiTool").getFloat("Shoddy");
			float damageModifier = -shoddy*durability/100f;
			
			int attack = (int) (baseDamage + tags.getCompoundTag("InfiTool").getInteger("Attack") + damageModifier);
				
			if (player instanceof EntityPlayer)
				mob.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer) player), attack);
			else
				mob.attackEntityFrom(DamageSource.causeMobDamage(player), attack);
		}
		damageTool(stack, 1, tags, player);
	}
	
	public static void damageTool(ItemStack stack, int dam, Entity entity)
	{
		NBTTagCompound tags = stack.getTagCompound();		
		damageTool(stack, dam, tags, entity);
	}
	
	public static void damageTool(ItemStack stack, int dam, NBTTagCompound tags, Entity entity)
	{
		int damage = tags.getCompoundTag("InfiTool").getInteger("Damage");
		int maxDamage = tags.getCompoundTag("InfiTool").getInteger("MaxDamage");
		
		//System.out.println("Damage: "+damage);
		
		if ((damage + dam) > maxDamage)
			breakTool(stack, tags, entity);
		
		else
			tags.getCompoundTag("InfiTool").setInteger("Damage", damage + dam);
	}
	
	public static void breakTool(ItemStack stack, NBTTagCompound tags, Entity player)
	{
		if (!tags.getCompoundTag("InfiTool").getBoolean("Broken"))
		{
			tags.getCompoundTag("InfiTool").setBoolean("Broken", true);
			player.worldObj.playSound(player.posX, player.posY, player.posZ, "random.break", 1f, 1f, true);
		}
	}
	
	public static void repairTool(ItemStack stack, NBTTagCompound tags)
	{
		tags.getCompoundTag("InfiTool").setBoolean("Broken", false);
		tags.getCompoundTag("InfiTool").setInteger("Damage", 0);
	}
}
