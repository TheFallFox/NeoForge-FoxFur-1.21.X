package net.foxel.foxfur.item;

import net.foxel.foxfur.FoxFur;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FoxFur.MOD_ID);

    public static final DeferredItem<Item> DODGEBALL = ITEMS.register("dodgeball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TENNIS_BALL = ITEMS.register("tennis_ball",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BASEBALL_BAT = ITEMS.register("baseball_bat",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YEN = ITEMS.register("yen",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MPHONE11 = ITEMS.register("mphone11",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
