package me.azuresky.cultivationmod.block;

import me.azuresky.cultivationmod.CultivationMod;
import me.azuresky.cultivationmod.item.ModCreativeModeTab;
import me.azuresky.cultivationmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CultivationMod.MOD_ID);

    public static final RegistryObject<Block> QISTONE_ORE = registryBlock("qistone_ore",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(1f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> QISTONE_BLOCK = registryBlock("qistone_block",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.AMETHYST)
                    .strength(2f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> QISTONE_BRICK = registryBlock("qistone_brick",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.HEAVY_METAL)
                    .strength(2f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);


    private static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn, tab);
        return toReturn;

    }

    private static <T extends Block>RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {

        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));

    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);

    }

}
