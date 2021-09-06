package com.tetemaku.highcrest.highcrest.registry;

import com.tetemaku.highcrest.highcrest.registry.toolMaterials.DaggerMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final ToolItem DAGGER = new SwordItem(DaggerMaterial.INSTANCE, -1, -1.8F, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier("highcrest", "dagger"), DAGGER);
    }
}
