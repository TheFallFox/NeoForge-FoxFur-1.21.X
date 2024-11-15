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

    public static final Supplier<CreativeModeTab> SPORTS_EQUIPMENT = CREATIVE_MODE_TAB.register("sports_equipment",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DODGEBALL.get()))
                            .title(Component.translatable("creativetab.foxfur.sports_equipment"))
                            .displayItems((itemDisplayParameters, output) -> {
                            output.accept(ModItems.DODGEBALL);
                            }).build());

    public static final Supplier<CreativeModeTab> FURNITURE = CREATIVE_MODE_TAB.register("furniture",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TENNIS_BALL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FoxFur.MOD_ID, "sports_equipment"))
                    .title(Component.translatable("creativetab.foxfur.furniture"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TENNIS_BALL);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
