package me.azuresky.cultivationmod.item;

import me.azuresky.cultivationmod.CultivationMod;
import me.azuresky.cultivationmod.item.custom.ElementalTesterItem;
import net.minecraft.world.item.Item;
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



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
