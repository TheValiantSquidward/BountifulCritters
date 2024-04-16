package net.dylanvhs.bountiful_critters.event;

import net.dylanvhs.bountiful_critters.BountifulCritters;
import net.dylanvhs.bountiful_critters.entity.ModEntities;
import net.dylanvhs.bountiful_critters.entity.custom.*;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BountifulCritters.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModEvents {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent e) {
    }



    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent e) {
        e.register(ModEntities.STINGRAY.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.WORLD_SURFACE, StingrayEntity::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
        e.register(ModEntities.KRILL.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.WORLD_SURFACE, KrillEntity::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
        e.register(ModEntities.SUNFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.WORLD_SURFACE, SunfishEntity::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
        e.register(ModEntities.EMU.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EmuEntity::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
        e.register(ModEntities.MARINE_IGUANA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, MarineIguanaEntity::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
        e.register(ModEntities.LONG_HORN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, LonghornEntity::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
        e.register(ModEntities.TOUCAN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, ToucanEntity::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
        e.register(ModEntities.HUMPBACK_WHALE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.WORLD_SURFACE, HumpbackWhaleEntity::checkFishSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        e.register(ModEntities.PILLBUG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, PillbugEntity::canSpawn, SpawnPlacementRegisterEvent.Operation.OR);
    }

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.STINGRAY.get(), StingrayEntity.setAttributes());
        event.put(ModEntities.SUNFISH.get(), SunfishEntity.setAttributes());
        event.put(ModEntities.EMU.get(), EmuEntity.setAttributes());
        event.put(ModEntities.KRILL.get(), KrillEntity.setAttributes());
        event.put(ModEntities.MARINE_IGUANA.get(), MarineIguanaEntity.setAttributes());
        event.put(ModEntities.LONG_HORN.get(), LonghornEntity.setAttributes());
        event.put(ModEntities.TOUCAN.get(), ToucanEntity.setAttributes());
        event.put(ModEntities.HUMPBACK_WHALE.get(), HumpbackWhaleEntity.setAttributes());
        event.put(ModEntities.PILLBUG.get(), PillbugEntity.setAttributes());

    }




}
