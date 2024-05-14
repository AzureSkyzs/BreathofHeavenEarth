package me.azuresky.breathofheavenearth.world;

import me.azuresky.breathofheavenearth.BreathofHeavenEarth;
import me.azuresky.breathofheavenearth.world.gen.ModFlowerGeneration;
import me.azuresky.breathofheavenearth.world.gen.ModOreGeneration;
import me.azuresky.breathofheavenearth.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BreathofHeavenEarth.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModFlowerGeneration.generateGrass(event);
        ModTreeGeneration.generateTrees(event);
    }
}