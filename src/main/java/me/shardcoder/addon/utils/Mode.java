package me.shardcoder.addon.utils;

import cc.hyperium.Hyperium;
import cc.hyperium.utils.ChatColor;
import me.shardcoder.addon.config.Config;

public class Mode {
    public static void set(String mode) {
        if (mode.equalsIgnoreCase("addon")) {
            Config.localMode = "addon";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode reset"), false);
            RichPresenceUpdater.callCustomRPUpdate();
            Config.customRPMode = "addon";
        } else if (mode.equalsIgnoreCase("eVowels")) {
            Config.localMode = "eVowels";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
            Config.customRPMode = "eVowels";
        } else if (mode.equalsIgnoreCase("eAll")) {
            Config.localMode = "eAll";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
            Config.customRPMode = "eAll";
        } else if (mode.equalsIgnoreCase("sellout")) {
            Config.localMode = "sellout";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
            Config.customRPMode = "sellout";
        } else if (mode.equalsIgnoreCase("bestCoder")) {
            Config.localMode = "bestCoder";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
            Config.customRPMode = "bestCoder";
        } else if (mode.equalsIgnoreCase("merch")) {
            Config.localMode = "merch";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
            Config.customRPMode = "merch";
        } else if (mode.equalsIgnoreCase("respects")) {
            Config.localMode = "respects";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
            Config.customRPMode = "respects";
        } else if (mode.equalsIgnoreCase("sleepy")) {
            Config.localMode = "sleepy";
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to '" + mode + "'"), false);
            RichPresenceUpdater.callCustomRPUpdate();
            Config.customRPMode = "sleepy";
        } else {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &f'" + mode + "' is not a valid mode"), false);
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
        } else if (mode.equalsIgnoreCase("merch")) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                            "&cHyperium\n" +
                            "&bCustomRP Addon v[version]\n" +
                            "&bBuy [IGN]'s merch\n" +
                            "&b[time]\n")
                    , false);
        } else if (mode.equalsIgnoreCase("respects")) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                            "&cHyperium\n" +
                            "&bCustomRP Addon v[version]\n" +
                            "&bPress [F] to pay respects\n" +
                            "&b[time]\n")
                    , false);
        } else if (mode.equalsIgnoreCase("sleepy")) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                            "&cHyperium\n" +
                            "&bCustomRP Addon v[version]\n" +
                            "&b[IGN] sleepy\n" +
                            "&b[time]\n")
                    , false);
        }
    }
}
