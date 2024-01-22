package com.boubounech.vaultweapons.events;

import com.boubounech.vaultweapons.configs.ModConfigs;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SetupEvents {
    @SubscribeEvent
    public static void setupCommon(FMLCommonSetupEvent event) {
        ModConfigs.register();
        System.err.println("WE GOT THERE BUT WHAT HAS HAPPEN?");
    }
}