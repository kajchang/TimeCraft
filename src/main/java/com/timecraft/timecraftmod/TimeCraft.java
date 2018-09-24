package com.timecraft.timecraftmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TimeCraft.MODID, version = TimeCraft.VERSION, useMetadata = true)
public class TimeCraft {
    public static final String MODID = "timecraft";
    public static final String VERSION = "0.1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Starting Forge");
    }
}
