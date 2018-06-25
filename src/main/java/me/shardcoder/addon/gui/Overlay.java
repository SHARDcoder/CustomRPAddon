package me.shardcoder.addon.gui;

import cc.hyperium.Hyperium;
import cc.hyperium.gui.main.HyperiumOverlay;
import cc.hyperium.gui.main.components.OverlayButton;
import cc.hyperium.gui.main.components.OverlayToggle;
import cc.hyperium.utils.ChatColor;
import me.shardcoder.addon.config.Config;
import me.shardcoder.addon.utils.AddonUpdateChecker;
import me.shardcoder.addon.utils.RichPresenceUpdater;

public class Overlay extends HyperiumOverlay {
    boolean buttonMode = true;

    public Overlay() {
        this.getComponents().add(new OverlayButton("Check for updates", () -> {
            AddonUpdateChecker.updateCheck();
        }));
        this.getComponents().add(new OverlayButton("RESET", () -> {
            Config.customRPMode = "addon";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode reset"), false);
            RichPresenceUpdater.callCustomRPUpdate();
        }));
        this.getComponents().add(new OverlayToggle("Set ----- Preview", !buttonMode, b -> {
            buttonMode = !b;
        }));
        this.getComponents().add(new OverlayButton("eVowels", () -> {
            if (buttonMode) {
                Config.customRPMode = "vewels";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'eVowels'"), false);
                RichPresenceUpdater.callCustomRPUpdate();
            } else {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'eVowels'\n\n" +
                                "&cHyperium\n" +
                                "&bCestemRP edden\n" +
                                "&beGN: [IGN but vowels are es]\n" +
                                "&b[time]\n")
                        , false);
            }
        }));
        this.getComponents().add(new OverlayButton("eAll", () -> {
            if (buttonMode) {
                Config.customRPMode = "eee";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'eAll'"), false);
                RichPresenceUpdater.callCustomRPUpdate();
            } else {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'eAll'\n\n" +
                                "&cHyperium\n" +
                                "&beeeeeeee eeeee\n" +
                                "&beee: [IGN but every character is e]\n" +
                                "&b[time]\n")
                        , false);
            }
        }));
        this.getComponents().add(new OverlayButton("sellout", () -> {
            if (buttonMode) {
                Config.customRPMode = "sellout";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'sellout'"), false);
                RichPresenceUpdater.callCustomRPUpdate();
            } else {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'sellout'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon\n" +
                                "&bSubscribe to [IGN]\n" +
                                "&b[time]\n")
                        , false);
            }
        }));
        this.getComponents().add(new OverlayButton("bestCoder", () -> {
            if (buttonMode) {
                Config.customRPMode = "bestCoder";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'bestCoder'"), false);
                RichPresenceUpdater.callCustomRPUpdate();
            } else {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'bestCoder'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon\n" +
                                "&b[IGN] best coder\n" +
                                "&b[time]\n")
                        , false);
            }
        }));
    }
}
