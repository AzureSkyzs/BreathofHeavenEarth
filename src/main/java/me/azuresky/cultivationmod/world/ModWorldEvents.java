package me.azuresky.cultivationmod.world;

import me.azuresky.cultivationmod.CultivationMod;
import me.azuresky.cultivationmod.world.gen.ModGrassGeneration;
import me.azuresky.cultivationmod.world.gen.ModOreGeneration;
import me.azuresky.cultivationmod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CultivationMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModGrassGeneration.generateGrass(event);
        ModTreeGeneration.generateTrees(event);
    }
}