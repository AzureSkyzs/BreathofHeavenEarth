package me.azuresky.cultivationmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier BREATHCRYSTAL = new  ForgeTier(3, 2000, 12.5f,
            4f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.BREATHCRYSTAL.get()));

}
