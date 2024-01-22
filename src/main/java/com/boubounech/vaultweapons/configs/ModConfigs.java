package com.boubounech.vaultweapons.configs;

import iskallia.vault.config.GearModelRollRaritiesConfig;

public class ModConfigs {
    public static WeaponsModelRollRaritiesConfig GEAR_MODEL_ROLL_RARITIES;

    public static void register() {
        GEAR_MODEL_ROLL_RARITIES = (WeaponsModelRollRaritiesConfig)(new WeaponsModelRollRaritiesConfig()).readConfig();
    }
}
