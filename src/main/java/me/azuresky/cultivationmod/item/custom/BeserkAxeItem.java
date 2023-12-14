package me.azuresky.cultivationmod.item.custom;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class BeserkAxeItem extends AxeItem {
    public BeserkAxeItem(Tier pTier, float p_40522_, float p_40523_, Properties p_40524_) {
        super(pTier, p_40522_, p_40523_, p_40524_);
    }

    @Override
    public boolean hurtEnemy(ItemStack pItemStack, LivingEntity pTarget, LivingEntity pAttacker) {
        var timer = false;

        var targetHealth = pTarget.getHealth();

        var healthAdded = pTarget.getMaxHealth() - targetHealth;

        long  startTime = System.currentTimeMillis();


        if(pAttacker.getHealth() != pAttacker.getMaxHealth()){
            pAttacker.setHealth(pAttacker.getHealth() + healthAdded);

        }
        else if(pAttacker.getHealth() == pAttacker.getMaxHealth()){

            pAttacker.setAbsorptionAmount(pAttacker.getAbsorptionAmount() + 2);

        }



        return super.hurtEnemy(pItemStack, pTarget, pAttacker);
    }
}
