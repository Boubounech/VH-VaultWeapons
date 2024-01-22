package com.boubounech.vaultweapons.configs;

import com.boubounech.vaultweapons.items.ModItems;
import iskallia.vault.config.gear.VaultGearTierConfig;
import iskallia.vault.config.gear.VaultGearWorkbenchConfig;
import iskallia.vault.init.ModConfigs;

public class WeaponsArraysConfig {

    public static void addToVanilla() {
        ModConfigs.VAULT_GEAR_CONFIG.put(ModItems.STAFF, (VaultGearTierConfig)(new VaultGearTierConfig(ModItems.STAFF)).readConfig());
        ModConfigs.VAULT_GEAR_WORKBENCH_CONFIG.put(ModItems.STAFF, (VaultGearWorkbenchConfig)(new VaultGearWorkbenchConfig(ModItems.STAFF)).readConfig());
    }
}
