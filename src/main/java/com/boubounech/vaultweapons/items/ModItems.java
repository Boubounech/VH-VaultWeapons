package com.boubounech.vaultweapons.items;

import com.boubounech.vaultweapons.items.weapons.StaffItem;
import iskallia.vault.VaultMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
    public static StaffItem STAFF;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(STAFF);
    }

    static {
        STAFF = new StaffItem(VaultMod.id("staff"), (new Item.Properties()).tab(iskallia.vault.init.ModItems.GEAR_GROUP).stacksTo(1));
    }
}
