package com.boubounech.vaultweapons.configs;

import com.boubounech.vaultweapons.items.weapons.StaffItem;
import com.google.gson.annotations.Expose;
import iskallia.vault.config.GearModelRollRaritiesConfig;
import iskallia.vault.gear.VaultGearRarity;
import iskallia.vault.gear.item.VaultGearItem;
import iskallia.vault.init.ModDynamicModels;
import net.minecraft.resources.ResourceLocation;

import java.util.*;
import java.util.stream.Collectors;

public class WeaponsModelRollRaritiesConfig extends GearModelRollRaritiesConfig {
    @Expose
    Map<VaultGearRarity, List<String>> STAFF_MODEL_ROLLS;

    public Map<VaultGearRarity, List<String>> getRolls(VaultGearItem gear) {
        if (gear instanceof StaffItem) {
            return this.STAFF_MODEL_ROLLS;
        }
        return super.getRolls(gear);
    }

    protected void reset() {
        this.STAFF_MODEL_ROLLS = new HashMap();
        this.STAFF_MODEL_ROLLS.put(VaultGearRarity.SCRAPPY, (List) ModDynamicModels.Focus.REGISTRY.getIds().stream().map(ResourceLocation::toString).collect(Collectors.toList()));
        super.reset();
    }
}
