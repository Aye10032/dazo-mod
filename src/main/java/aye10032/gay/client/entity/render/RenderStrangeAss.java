package aye10032.gay.client.entity.render;

import net.minecraftforge.fml.relauncher.SideOnly;
import aye10032.gay.common.entity.EntityStrangeAss;
import aye10032.gay.Gay;
import aye10032.gay.client.entity.model.ModelStrangeAss;
import net.minecraft.client.model.ModelVillager;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class RenderStrangeAss extends RenderLiving<EntityStrangeAss> 
{
	
	private static final ResourceLocation STRANGE_ASS_TEXTURE = new ResourceLocation(Gay.MODID + ":" + "textures/entity/strange_ass.png");
	
	
	public RenderStrangeAss(RenderManager renderManager)
	{
		super(renderManager, new ModelStrangeAss(), 0.4F);
	}
	
	
	@Override
    protected void preRenderCallback(EntityStrangeAss entity, float partialTickTime)
    {
        GlStateManager.scale(0.7F, 0.7F, 0.7F);
    }
	
	
	@Override
	protected ResourceLocation getEntityTexture(EntityStrangeAss entity)
	{
		return RenderStrangeAss.STRANGE_ASS_TEXTURE;
	}
	
	
	@Override
	public void doRender(EntityStrangeAss entity, double x, double y, double z, float entityYaw, float partialTicks)
	{
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}
}
