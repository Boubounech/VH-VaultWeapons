package com.boubounech.vaultweapons.items.weapons;

import iskallia.vault.gear.VaultGearClassification;
import iskallia.vault.gear.crafting.ProficiencyType;
import iskallia.vault.gear.item.VaultGearItem;
import iskallia.vault.item.gear.VaultSwordItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class StaffItem extends VaultSwordItem implements VaultGearItem {
    public StaffItem(ResourceLocation id, Properties builder) {
        super(id, builder);
    }

    public @NotNull VaultGearClassification getClassification(ItemStack stack) {
        return VaultGearClassification.WAND;
    }

    @Nonnull
    public ProficiencyType getCraftingProficiencyType(ItemStack stack) {
        return ProficiencyType.WAND;
    }
}
