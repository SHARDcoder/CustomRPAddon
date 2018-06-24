package me.shardcoder.addon.gui;

import cc.hyperium.Hyperium;
import cc.hyperium.gui.main.HyperiumOverlay;
import cc.hyperium.gui.main.components.OverlayButton;
import cc.hyperium.gui.main.components.OverlayToggle;
import cc.hyperium.utils.ChatColor;
import me.shardcoder.addon.CustomRPUpdater;

public class CustomRPOverlay extends HyperiumOverlay {
    boolean buttonMode = true;

    public CustomRPOverlay() {
        CustomRPUpdater.customRPMode = "addon";
        this.getComponents().add(new OverlayButton("RESET", () -> {
            CustomRPUpdater.customRPMode = "addon";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode reset"), false);
            CustomRPUpdater.callCustomRPUpdate();
        }));
        this.getComponents().add(new OverlayToggle("Set ----- Preview", false, b -> {
            buttonMode = !b;
        }));
        this.getComponents().add(new OverlayButton("eVowels", () -> {
            if (buttonMode) {
                CustomRPUpdater.customRPMode = "vewels";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'eVowels'"), false);
                CustomRPUpdater.callCustomRPUpdate();
            } else {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'eVowels'\n\n" +
                                "&cHyperium\n" +
                                "&bCestemRP edden\n" +
                                "&beGN: [IGN but vowels are es]\n" +
                                "&b[time]")
                        , false);
            }
        }));
        this.getComponents().add(new OverlayButton("eAll", () -> {
            if (buttonMode) {
                CustomRPUpdater.customRPMode = "eee";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'eAll'"), false);
                CustomRPUpdater.callCustomRPUpdate();
            } else {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'eAll'\n\n" +
                                "&cHyperium\n" +
                                "&beeeeeeee eeeee\n" +
                                "&beee: [IGN but every character is e]\n" +
                                "&b[time]")
                        , false);
            }
        }));
        this.getComponents().add(new OverlayButton("sellout", () -> {
            if (buttonMode) {
                CustomRPUpdater.customRPMode = "sellout";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'sellout'"), false);
                CustomRPUpdater.callCustomRPUpdate();
            } else {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'sellout'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon\n" +
                                "&bSubscribe to [IGN]\n" +
                                "&b[time]")
                        , false);
            }
        }));
        this.getComponents().add(new OverlayButton("bestCoder", () -> {
            if (buttonMode) {
                CustomRPUpdater.customRPMode = "bestCoder";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'bestCoder'"), false);
                CustomRPUpdater.callCustomRPUpdate();
            } else {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'bestCoder'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon\n" +
                                "&b[IGN] best coder\n" +
                                "&b[time]")
                        , false);
            }
        }));
    }
}
