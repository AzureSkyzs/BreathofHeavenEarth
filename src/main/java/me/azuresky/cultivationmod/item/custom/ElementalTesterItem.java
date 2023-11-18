package me.azuresky.cultivationmod.item.custom;


import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ElementalTesterItem extends Item {

    public ElementalTesterItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if(!player.getLevel().isClientSide) {
            player.sendMessage(new TextComponent("This is a test Message"), player.getUUID());
        }
        return super.use(level, player, interactionHand);
    }


}
