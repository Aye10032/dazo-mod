package aye10032.gay.client.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class ModelStrangeAss extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
  
  public ModelStrangeAss()
  {
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, 0F);
      rightarm.mirror = true;
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, 0F);
      leftarm.mirror = true;
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.mirror = true;
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.mirror = true;
  }
  
  public void render(Entity entity, float limbSwing, float limbSwingAmount, float rotateFloat, float rotateYaw,float rotatePitch, float scale)
  {
    this.setRotationAngles(limbSwing, limbSwingAmount, rotateFloat, rotateYaw, rotatePitch, scale, entity);
    head.render(scale);
    body.render(scale);
    rightarm.render(scale);
    leftarm.render(scale);
    rightleg.render(scale);
    leftleg.render(scale);
  }
  
  
  public void setRotationAngles(float limbSwing, float limbSwingAmount, float rotateFloat, float rotateYaw,
          float rotatePitch, float scale, Entity entity)
  {
	  this.head.rotateAngleX = rotatePitch / (180F / (float) Math.PI);
      this.head.rotateAngleY = rotateYaw / (180F / (float) Math.PI);
      this.leftleg.rotateAngleX = -MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
      this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
      this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
      this.rightarm.rotateAngleX = -MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
  }


}