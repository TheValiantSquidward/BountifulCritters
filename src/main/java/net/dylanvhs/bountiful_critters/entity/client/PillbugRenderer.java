package net.dylanvhs.bountiful_critters.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.dylanvhs.bountiful_critters.BountifulCritters;
import net.dylanvhs.bountiful_critters.entity.custom.PillbugEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class PillbugRenderer extends GeoEntityRenderer<PillbugEntity> {
    public PillbugRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PillbugModel());
    }
    private static final ResourceLocation TEXTURE = new ResourceLocation(BountifulCritters.MOD_ID, "textures/entity/pillbug.png");
    private static final ResourceLocation TEXTURE_POISONOUS = new ResourceLocation(BountifulCritters.MOD_ID, "textures/entity/pillbug_poisonous.png");
    @Override
    public ResourceLocation getTextureLocation(PillbugEntity animatable) {
        if (animatable.hasEffect(MobEffects.POISON)) {
            return TEXTURE_POISONOUS;
        } else return TEXTURE;
    }

    @Override
    public void render(PillbugEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
