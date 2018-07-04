package me.shardcoder.addon.utils;

import cc.hyperium.Hyperium;
import cc.hyperium.utils.ChatColor;
import me.shardcoder.addon.config.Config;

import java.util.ArrayList;

public class Mode {
    public static ArrayList<String> getModes() {
        ArrayList<String> modes = new ArrayList<>();
        modes.add("addon");
        modes.add("eVowels");
        modes.add("eAll");
        modes.add("sellout");
        modes.add("bestCoder");
        modes.add("merch");
        modes.add("respects");
        modes.add("sleepy");
        return modes;
    }

    public static void set(String mode) {
        switch (mode.toLowerCase()) {
            case "addon":
                Config.localMode = "addon";
                RichPresenceUpdater.callCustomRPUpdate();
                Config.customRPMode = "addon";
                break;
            case "evowels":
                Config.localMode = "eVowels";
                RichPresenceUpdater.callCustomRPUpdate();
                Config.customRPMode = "eVowels";
                break;
            case "eall":
                Config.localMode = "eAll";
                RichPresenceUpdater.callCustomRPUpdate();
                Config.customRPMode = "eAll";
                break;
            case "sellout":
                Config.localMode = "sellout";
                RichPresenceUpdater.callCustomRPUpdate();
                Config.customRPMode = "sellout";
                break;
            case "bestcoder":
                Config.localMode = "bestCoder";
                RichPresenceUpdater.callCustomRPUpdate();
                Config.customRPMode = "bestCoder";
                break;
            case "merch":
                Config.localMode = "merch";
                RichPresenceUpdater.callCustomRPUpdate();
                Config.customRPMode = "merch";
                break;
            case "respects":
                Config.localMode = "respects";
                RichPresenceUpdater.callCustomRPUpdate();
                Config.customRPMode = "respects";
                break;
            case "sleepy":
                Config.localMode = "sleepy";
                RichPresenceUpdater.callCustomRPUpdate();
                Config.customRPMode = "sleepy";
                break;
            default:
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &f'" + mode + "' is not a valid mode"), false);
                break;
        }
    }

    public static void preview(String mode) {
        switch (mode.toLowerCase()) {
            case "addon":
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon v[version]\n" +
                                "&bPlaying a game\n" +
                                "&b[time]\n")
                        , false);
                break;
            case "evowels":
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&bCestemRP edden v[version]\n" +
                                "&beGN: [IGN but vowels are es]\n" +
                                "&b[time]\n")
                        , false);
                break;
            case "eall":
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&beeeeeeee eeeee e[version]\n" +
                                "&beee: [IGN but every character is e]\n" +
                                "&b[time]\n")
                        , false);
                break;
            case "sellout":
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon v[version]\n" +
                                "&bSubscribe to [IGN]\n" +
                                "&b[time]\n")
                        , false);
                break;
            case "bestcoder":
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon v[version]\n" +
                                "&b[IGN] best coder\n" +
                                "&b[time]\n")
                        , false);
                break;
            case "merch":
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon v[version]\n" +
                                "&bBuy [IGN]'s merch\n" +
                                "&b[time]\n")
                        , false);
                break;
            case "respects":
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon v[version]\n" +
                                "&bPress [F] to pay respects\n" +
                                "&b[time]\n")
                        , false);
                break;
            case "sleepy":
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon v[version]\n" +
                                "&b[IGN] sleepy\n" +
                                "&b[time]\n")
                        , false);
                break;
            default:
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of '" + mode + "'\n\n" +
                                "&cHyperium\n" +
                                "&bCustomRP Addon v[version]\n" +
                                "&bPlaying a game\n" +
                                "&b[time]\n")
                        , false);
                break;
        }
    }
}
