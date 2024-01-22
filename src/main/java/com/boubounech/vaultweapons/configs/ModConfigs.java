package com.boubounech.vaultweapons.configs;

import iskallia.vault.VaultMod;
import org.apache.logging.log4j.LogManager;

public class ModConfigs {
    public static WeaponsModelRollRaritiesConfig GEAR_MODEL_ROLL_RARITIES;

    public static void register() {
        try {
            while (iskallia.vault.init.ModConfigs.PLAYER_RESEARCH_TRANSFER == null) {
                Thread.sleep(1000);
                VaultMod.LOGGER.info("Waiting for ModConfigs to finish...");
            }
            VaultMod.LOGGER.info("ModConfigs finished, I can go now");

            GEAR_MODEL_ROLL_RARITIES = (WeaponsModelRollRaritiesConfig) (new WeaponsModelRollRaritiesConfig()).readConfig();
            WeaponsArraysConfig.addToVanilla();
        } catch (Exception e) {
            VaultMod.LOGGER.info("Welp, could not wait for ModConfigs to finish...");
        }
    }
}
