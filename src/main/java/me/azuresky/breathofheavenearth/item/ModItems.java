package me.azuresky.breathofheavenearth.item;

import me.azuresky.breathofheavenearth.BreathofHeavenEarth;
import me.azuresky.breathofheavenearth.item.custom.BeserkAxeItem;
import me.azuresky.breathofheavenearth.item.custom.ElementalTesterItem;
import me.azuresky.breathofheavenearth.item.custom.FreezeSwordItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BreathofHeavenEarth.MOD_ID);

    public static final RegistryObject<Item> BREATHSTONE = ITEMS.register("breathstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> BREATHCRYSTAL = ITEMS.register("breathcrystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> RAW_BREATHSTONE = ITEMS.register("raw_breathstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> ELEMENTAL_TESTER = ITEMS.register("elemental_tester",
            () -> new ElementalTesterItem(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> MEGA_OAK_ROD = ITEMS.register("mega_oak_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> BREATHCRYSTAL_SWORD = ITEMS.register("breathcrystal_sword",
            () -> new FreezeSwordItem(ModTiers.BREATHCRYSTAL,4,3f,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> BREATHCRYSTAL_PICKAXE = ITEMS.register("breathcrystal_pickaxe",
            () -> new PickaxeItem(ModTiers.BREATHCRYSTAL,1,2f,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> BREATHCRYSTAL_AXE = ITEMS.register("breathcrystal_axe",
            () -> new BeserkAxeItem(ModTiers.BREATHCRYSTAL,5,1f,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> BREATHCRYSTAL_SHOVEL = ITEMS.register("breathcrystal_shovel",
            () -> new ShovelItem(ModTiers.BREATHCRYSTAL,0,2f,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> BREATHCRYSTAL_HOE = ITEMS.register("breathcrystal_hoe",
            () -> new HoeItem(ModTiers.BREATHCRYSTAL,0,0,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> IMMORTAL_HELMET = ITEMS.register("immortal_helmet",
            () -> new ArmorItem(ModArmorMaterials.BREATHCRYSTAL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> IMMORTAL_CHESTPLATE = ITEMS.register("immortal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BREATHCRYSTAL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> IMMORTAL_LEGGINGS = ITEMS.register("immortal_leggings",
            () -> new ArmorItem(ModArmorMaterials.BREATHCRYSTAL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> IMMORTAL_BOOTS = ITEMS.register("immortal_boots",
            () -> new ArmorItem(ModArmorMaterials.BREATHCRYSTAL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> BREATHCRYSTAL_DUST = ITEMS.register("breathcrystal_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> BREATHGRASS_FIBER = ITEMS.register("breathgrass_fiber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
