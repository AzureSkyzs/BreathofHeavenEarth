package me.azuresky.cultivationmod.block;

import me.azuresky.cultivationmod.CultivationMod;
import me.azuresky.cultivationmod.block.custom.ModFlammableRotatedPillerBlock;
import me.azuresky.cultivationmod.item.ModCreativeModeTab;
import me.azuresky.cultivationmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
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
                    .strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> QISTONE_BLOCK = registryBlock("qistone_block",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.AMETHYST)
                    .strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> QISTONE_BRICK = registryBlock("qistone_brick",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> QISTONE_BRICK_STAIRS = registryBlock("qistone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.QISTONE_BRICK.get().defaultBlockState(),
                    BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> QISTONE_BRICK_SLAB = registryBlock("qistone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);

    public static final RegistryObject<Block> QISTONE_BRICK_WALL = registryBlock("qistone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties
                    .of(Material.STONE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> MEGA_OAK_LOG = registryBlock("mega_oak_log",
            () -> new ModFlammableRotatedPillerBlock(
                    BlockBehaviour.Properties
                    .copy(Blocks.OAK_LOG)), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> MEGA_OAK_WOOD = registryBlock("mega_oak_wood",
            () -> new ModFlammableRotatedPillerBlock(
                    BlockBehaviour.Properties
                            .copy(Blocks.OAK_WOOD)), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);

    public static final RegistryObject<Block> MEGA_OAK_PLANKS = registryBlock("mega_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {

                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;

                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }


    }, ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);

    public static final RegistryObject<Block> STRIPPED_MEGA_OAK_LOG = registryBlock("stripped_mega_oak_log",
            () -> new ModFlammableRotatedPillerBlock(
                    BlockBehaviour.Properties
                            .copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_MEGA_OAK_WOOD = registryBlock("stripped_mega_oak_wood",
            () -> new ModFlammableRotatedPillerBlock(
                    BlockBehaviour.Properties
                            .copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> MEGA_OAK_BUTTON = registryBlock("mega_oak_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties
                    .copy(Blocks.OAK_BUTTON)
                    .strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> MEGA_OAK_PRESSURE_PLATE = registryBlock("mega_oak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties
                    .copy(Blocks.OAK_PRESSURE_PLATE)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .noCollission()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> MEGA_OAK_DOOR = registryBlock("mega_oak_door",
            () -> new DoorBlock(BlockBehaviour.Properties
                    .of(Material.WOOD)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);
    public static final RegistryObject<Block> MEGA_OAK_TRAP_DOOR = registryBlock("mega_oak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties
                    .of(Material.WOOD)
                    .strength(5f)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()), ModCreativeModeTab.CULTIVATION_TAB_BLOCKS);

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
