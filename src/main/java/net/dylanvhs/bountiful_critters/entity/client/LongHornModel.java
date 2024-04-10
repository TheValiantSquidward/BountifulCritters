package net.dylanvhs.bountiful_critters.entity.client;

import net.dylanvhs.bountiful_critters.BountifulCritters;
import net.dylanvhs.bountiful_critters.entity.custom.LonghornEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class LongHornModel extends GeoModel<LonghornEntity> {
    @Override
    public ResourceLocation getModelResource(LonghornEntity animatable) {
        return new ResourceLocation(BountifulCritters.MOD_ID, "geo/long_horn.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LonghornEntity animatable) {
        return new ResourceLocation(BountifulCritters.MOD_ID, "textures/entity/long_horn.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LonghornEntity animatable) {
        return new ResourceLocation(BountifulCritters.MOD_ID, "animations/long_horn.animation.json");
    }

    @Override
    public void setCustomAnimations(LonghornEntity animatable, long instanceId, AnimationState<LonghornEntity> animationState) {
        super.setCustomAnimations(animatable, instanceId, animationState);
        if (animationState == null) return;
        EntityModelData extraDataOfType = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
        CoreGeoBone head = this.getAnimationProcessor().getBone("head");
        CoreGeoBone root = this.getAnimationProcessor().getBone("marine_iguana");
        if (animatable.isBaby()) {
            root.setScaleX(0.5F);
            root.setScaleY(0.5F);
            root.setScaleZ(0.5F);

            head.setScaleX(1.75F);
            head.setScaleY(1.75F);
            head.setScaleZ(1.75F);

        } else {
            root.setScaleX(1.0F);
            root.setScaleY(1.0F);
            root.setScaleZ(1.0F);

            head.setScaleX(1.0F);
            head.setScaleY(1.0F);
            head.setScaleZ(1.0F);
        }
        if (!animatable.isSprinting()) {

            head.setRotY(extraDataOfType.netHeadYaw() * ((float)Math.PI / 180F));
            head.setRotX(extraDataOfType.headPitch() * ((float)Math.PI / 180F));
        }
    }



}
