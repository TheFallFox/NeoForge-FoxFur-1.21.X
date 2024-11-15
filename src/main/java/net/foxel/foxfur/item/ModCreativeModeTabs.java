package net.foxel.foxfur.item;

import net.foxel.foxfur.FoxFur;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoxFur.MOD_ID);

    public static final Supplier<CreativeModeTab> FIRST_TEST_TAB = CREATIVE_MODE_TAB.register("first_test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DODGEBALL.get()))
                            .title(Component.translatable("creativetab.foxfur.first_test_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.DODGEBALL);
                            }).build());

    public static final Supplier<CreativeModeTab> SECOND_TEST_TAB = CREATIVE_MODE_TAB.register("second_test_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TENNIS_BALL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FoxFur.MOD_ID, "first_test_tab"))
                    .title(Component.translatable("creativetab.foxfur.second_test_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TENNIS_BALL);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
