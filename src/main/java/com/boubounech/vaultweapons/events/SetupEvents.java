package com.boubounech.vaultweapons.events;

import com.boubounech.vaultweapons.configs.ModConfigs;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SetupEvents {
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void setupCommon(FMLCommonSetupEvent event) {
        ModConfigs.register();
    }
}