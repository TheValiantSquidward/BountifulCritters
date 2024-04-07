package net.dylanvhs.bountiful_critters.entity;

import net.dylanvhs.bountiful_critters.BountifulCritters;
import net.dylanvhs.bountiful_critters.entity.custom.EmuEggEntity;
import net.dylanvhs.bountiful_critters.entity.custom.EmuEntity;
import net.dylanvhs.bountiful_critters.entity.custom.StingrayEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BountifulCritters.MOD_ID);

    public static final RegistryObject<EntityType<StingrayEntity>> STINGRAY =
            ENTITY_TYPES.register("stingray",
                    () -> EntityType.Builder.of(StingrayEntity::new, MobCategory.WATER_AMBIENT)
                            .sized(0.8f, 0.25f)
                            .build(new ResourceLocation(BountifulCritters.MOD_ID, "stingray").toString()));

    public static final RegistryObject<EntityType<EmuEntity>> EMU =
            ENTITY_TYPES.register("emu",
                    () -> EntityType.Builder.of(EmuEntity::new, MobCategory.CREATURE)
                            .sized(1f, 2f)
                            .build(new ResourceLocation(BountifulCritters.MOD_ID, "emu").toString()));


    public static final RegistryObject<EntityType<EmuEggEntity>> EMU_EGG =
                    ENTITY_TYPES.register("emu_egg_projectile", () -> EntityType.Builder.<EmuEggEntity>of(EmuEggEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f).build("emu_egg_projectile"));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}