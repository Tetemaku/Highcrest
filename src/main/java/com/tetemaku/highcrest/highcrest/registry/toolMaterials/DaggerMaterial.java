package com.tetemaku.highcrest.highcrest.registry.toolMaterials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DaggerMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 500;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }
    @Override
    public float getAttackDamage() {
        return 3.0F;
    }
    @Override
    public int getMiningLevel() {
        return 2;
    }
    @Override
    public int getEnchantability() {
        return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
    public static final DaggerMaterial INSTANCE = new DaggerMaterial();
}
