package aye10032.gay.common.entity;

import aye10032.gay.Gay;
import aye10032.gay.common.item.GayItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;


public class EntityStrangeAss extends EntityVillager
{
	
	public EntityStrangeAss(World worldIn)
	{
		super(worldIn);
		this.setSize(0.6F, 1.3F);
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, GayItems.itemSuperAss, false));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.CARROT_ON_A_STICK, false));
	}
	

	
	
	
	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
	}
	
	
	@Override
	protected void dropFewItems(boolean arg1, int arg2)
	{
		if (this.rand.nextInt(1) == 0)
		{
			this.dropItem(GayItems.itemDazosAss,1);
		}
		super.dropFewItems(arg1, arg2);
	}
	
	
	protected SoundEvent getHurtSound()
	{
		return null ;
	}
	
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(32.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.0D);
	}
	
	
	@Override
	protected void entityInit()
	{
		super.entityInit();
	}
	
	
}
