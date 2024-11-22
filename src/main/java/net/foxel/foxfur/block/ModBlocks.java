package net.foxel.foxfur.block;

import net.foxel.foxfur.FoxFur;
import net.foxel.foxfur.block.custom.Air_Hockey_Table;
import net.foxel.foxfur.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FoxFur.MOD_ID);

    public static final DeferredBlock<Block> AIR_HOCKEY = registerBlock("air_hockey",
            () -> new Air_Hockey_Table(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ARCADE_SIGN = registerBlock("arcade_sign",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BASKET_BALL = registerBlock("basketball_game",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DANCE_MACHINE_MONITOR = registerBlock("dance_machine_monitor",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DANCE_MACHINE_PAD = registerBlock("dance_machine_pad",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MS_PACMAN = registerBlock("ms_pacman",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> PAC_MAN_PLUS = registerBlock("pac_man_plus",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> PUNCH_MACHINE = registerBlock("punch_machine",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SAN_FRANCISCO_RUSH = registerBlock("san_francisco_rush",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SHOOTING_ARCADE = registerBlock("shooting_arcade",
            () -> new Block(BlockBehaviour.Properties.of().noOcclusion()));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
