package com.timecraft.timecraftmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.minecraft.util.EnumHand;

@Mod(modid = TimeCraft.MODID, version = TimeCraft.VERSION, useMetadata = true)
public class TimeCraft {
    public static final String MODID = "timecraft";
    public static final String VERSION = "0.1.0";

    @Mod.EventBusSubscriber(modid = TimeCraft.MODID)
    public static class TimeCraftEventHandler {
        @SubscribeEvent
        public static void onLoad(WorldEvent.Load event) {
            System.out.println("Entering " + event.getWorld());
        }

        @SubscribeEvent
        public static void onLeftClick(PlayerInteractEvent.LeftClickBlock event) {
            EnumHand hand = event.getHand();

            if (hand.name().equals("MAIN_HAND")) {
                System.out.println("You've hit using " + event.getEntityPlayer().getHeldItemMainhand().getDisplayName());
            } else {
                System.out.println("You've hit using " + event.getEntityPlayer().getHeldItemOffhand().getDisplayName());
            }
        }

        @SubscribeEvent
        public static void onRightClick(PlayerInteractEvent.RightClickBlock event) {
            EnumHand hand = event.getHand();

            if (hand.name().equals("MAIN_HAND")) {
                System.out.println("You've interacted using " + event.getEntityPlayer().getHeldItemMainhand().getDisplayName());
            } else {
                System.out.println("You've interacted using " + event.getEntityPlayer().getHeldItemOffhand().getDisplayName());
            }
        }
    }
}
