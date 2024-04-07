package net.dylanvhs.bountiful_critters.item;

import net.dylanvhs.bountiful_critters.BountifulCritters;
import net.dylanvhs.bountiful_critters.entity.ModEntities;
import net.dylanvhs.bountiful_critters.item.custom.ItemAnimalEgg;
import net.dylanvhs.bountiful_critters.item.custom.ItemModFishBucket;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BountifulCritters.MOD_ID);
    public static final RegistryObject<Item> STINGRAY_BUCKET = ITEMS.register("stingray_bucket",
            () -> new ItemModFishBucket(ModEntities.STINGRAY, Fluids.WATER, new Item.Properties()));

    public static final RegistryObject<Item> EMU_EGG = ITEMS.register("emu_egg", () -> new ItemAnimalEgg(new Item.Properties().stacksTo(8)));
    public static final RegistryObject<Item> BOILED_EMU_EGG = ITEMS.register("boiled_emu_egg", () -> new Item(new Item.Properties().stacksTo(8)));

    public static final RegistryObject<Item> EMU_SPAWN_EGG = ITEMS.register("emu_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.EMU, 0x4d56c5, 0x9c33c5, new Item.Properties()));
    public static final RegistryObject<Item> STINGRAY_SPAWN_EGG = ITEMS.register("stingray_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.STINGRAY, 0x3e8730, 0x7d31c5, new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

