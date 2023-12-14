package me.azuresky.cultivationmod.item;

import me.azuresky.cultivationmod.CultivationMod;
import me.azuresky.cultivationmod.item.custom.BeserkAxeItem;
import me.azuresky.cultivationmod.item.custom.ElementalTesterItem;
import me.azuresky.cultivationmod.item.custom.FreezeSwordItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CultivationMod.MOD_ID);

    public static final RegistryObject<Item> QISTONE = ITEMS.register("qistone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> QICRYSTAL = ITEMS.register("qicrystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> RAW_QISTONE = ITEMS.register("raw_qistone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> ELEMENTAL_TESTER = ITEMS.register("elemental_tester",
            () -> new ElementalTesterItem(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> MEGA_OAK_ROD = ITEMS.register("mega_oak_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> QICRYSTAL_SWORD = ITEMS.register("qicrystal_sword",
            () -> new FreezeSwordItem(ModTiers.QICRYSTAL,4,3f,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> QICRYSTAL_PICKAXE = ITEMS.register("qicrystal_pickaxe",
            () -> new PickaxeItem(ModTiers.QICRYSTAL,1,2f,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> QICRYSTAL_AXE = ITEMS.register("qicrystal_axe",
            () -> new BeserkAxeItem(ModTiers.QICRYSTAL,5,1f,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> QICRYSTAL_SHOVEL = ITEMS.register("qicrystal_shovel",
            () -> new ShovelItem(ModTiers.QICRYSTAL,0,2f,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> QICRYSTAL_HOE = ITEMS.register("qicrystal_hoe",
            () -> new HoeItem(ModTiers.QICRYSTAL,0,0,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> IMMORTAL_HELMET = ITEMS.register("immortal_helmet",
            () -> new ArmorItem(ModArmorMaterials.QICRYSTAL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> IMMORTAL_CHESTPLATE = ITEMS.register("immortal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.QICRYSTAL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> IMMORTAL_LEGGINGS = ITEMS.register("immortal_leggings",
            () -> new ArmorItem(ModArmorMaterials.QICRYSTAL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> IMMORTAL_BOOTS = ITEMS.register("immortal_boots",
            () -> new ArmorItem(ModArmorMaterials.QICRYSTAL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));

    public static final RegistryObject<Item> QICRYSTAL_DUST = ITEMS.register("qicrystal_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));
    public static final RegistryObject<Item> QIGRASS_FIBER = ITEMS.register("qigrass_fiber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CULTIVATION_TAB_ITEMS)));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
