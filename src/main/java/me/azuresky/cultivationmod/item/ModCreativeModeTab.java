package me.azuresky.cultivationmod.item;

import me.azuresky.cultivationmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab CULTIVATION_TAB_ITEMS = new CreativeModeTab("cultivationtabitems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BREATHSTONE.get());
        }
    };

    public static final CreativeModeTab CULTIVATION_TAB_BLOCKS = new CreativeModeTab("cultivationtabblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BREATHSTONE_ORE.get());
        }
    };

}
