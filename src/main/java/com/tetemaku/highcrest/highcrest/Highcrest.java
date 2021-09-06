package com.tetemaku.highcrest.highcrest;

import com.tetemaku.highcrest.highcrest.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Highcrest implements ModInitializer {
    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
