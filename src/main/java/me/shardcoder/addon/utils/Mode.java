package me.shardcoder.addon.utils;

import cc.hyperium.Hyperium;
import cc.hyperium.utils.ChatColor;
import me.shardcoder.addon.config.Config;

public class Mode {
    public static void set(String mode) {
        if (mode.equalsIgnoreCase("addon")) {
            Config.customRPMode = "addon";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode reset"), false);
            RichPresenceUpdater.callCustomRPUpdate();
        } else if (mode.equalsIgnoreCase("eVowels")) {
            Config.customRPMode = "eVowels";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
        } else if (mode.equalsIgnoreCase("eAll")) {
            Config.customRPMode = "eAll";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
        } else if (mode.equalsIgnoreCase("sellout")) {
            Config.customRPMode = "sellout";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
        } else if (mode.equalsIgnoreCase("bestCoder")) {
            Config.customRPMode = "bestCoder";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
        }
    }

    public static void preview(String mode) {
        if (mode.equalsIgnoreCase("addon")) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                            "&cHyperium\n" +
                            "&bCustomRP Addon v[version]\n" +
                            "&bPlaying a game\n" +
                            "&b[time]\n")
                    , false);
        } else if (mode.equalsIgnoreCase("eVowels")) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                            "&cHyperium\n" +
                            "&bCestemRP edden v[version]\n" +
                            "&beGN: [IGN but vowels are es]\n" +
                            "&b[time]\n")
                    , false);
        } else if (mode.equalsIgnoreCase("eAll")) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                            "&cHyperium\n" +
                            "&beeeeeeee eeeee e[version]\n" +
                            "&beee: [IGN but every character is e]\n" +
                            "&b[time]\n")
                    , false);
        } else if (mode.equalsIgnoreCase("sellout")) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                            "&cHyperium\n" +
                            "&bCustomRP Addon v[version]\n" +
                            "&bSubscribe to [IGN]\n" +
                            "&b[time]\n")
                    , false);
        } else if (mode.equalsIgnoreCase("bestCoder")) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                            "&cHyperium\n" +
                            "&bCustomRP Addon v[version]\n" +
                            "&b[IGN] best coder\n" +
                            "&b[time]\n")
                    , false);
        }
    }
}
