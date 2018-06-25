package me.shardcoder.addon.commands;

import cc.hyperium.Hyperium;
import cc.hyperium.commands.BaseCommand;
import cc.hyperium.commands.CommandException;
import cc.hyperium.utils.ChatColor;
import me.shardcoder.addon.config.Config;
import me.shardcoder.addon.utils.RichPresenceUpdater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandCustomRichPresence implements BaseCommand {
    @Override
    public String getName() {
        return "customrichpresence";
    }

    @Override
    public String getUsage() {
        return "/customrichpresence \n    preview [mode]\n    mode [eVowels / eAll /  sellout / bestCoder]\n    reset";
    }

    @Override
    public void onExecute(String[] args) throws CommandException {
        try {
            if (args[0].equalsIgnoreCase("reset")) {
                Config.customRPMode = "addon";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode reset"), false);
                RichPresenceUpdater.callCustomRPUpdate();
            } else if (args[0].equalsIgnoreCase("mode")) {
                if (args[1].equalsIgnoreCase("eVowels")) {
                    Config.customRPMode = "vewels";
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'eVowels'"), false);
                    RichPresenceUpdater.callCustomRPUpdate();
                } else if (args[1].equalsIgnoreCase("eAll")) {
                    Config.customRPMode = "eee";
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'eAll'"), false);
                    RichPresenceUpdater.callCustomRPUpdate();
                } else if (args[1].equalsIgnoreCase("sellout")) {
                    Config.customRPMode = "sellout";
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'sellout'"), false);
                    RichPresenceUpdater.callCustomRPUpdate();
                } else if (args[1].equalsIgnoreCase("bestCoder")) {
                    Config.customRPMode = "bestCoder";
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'bestCoder'"), false);
                    RichPresenceUpdater.callCustomRPUpdate();
                }
            } else if (args[0].equalsIgnoreCase("preview")) {
                if (args[1].equalsIgnoreCase("eVowels")) {
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'eVowels'\n\n" +
                                    "&cHyperium\n" +
                                    "&bCestemRP edden\n" +
                                    "&beGN: [IGN but vowels are es]\n" +
                                    "&b[time]\n")
                            , false);
                } else if (args[1].equalsIgnoreCase("eAll")) {
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'eAll'\n\n" +
                                    "&cHyperium\n" +
                                    "&beeeeeeee eeeee\n" +
                                    "&beee: [IGN but every character is e]\n" +
                                    "&b[time]\n")
                            , false);
                } else if (args[1].equalsIgnoreCase("sellout")) {
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'sellout'\n\n" +
                                    "&cHyperium\n" +
                                    "&bCustomRP Addon\n" +
                                    "&bSubscribe to [IGN]\n" +
                                    "&b[time]\n")
                            , false);
                } else if (args[1].equalsIgnoreCase("bestCoder")) {
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'bestCoder'\n\n" +
                                    "&cHyperium\n" +
                                    "&bCustomRP Addon\n" +
                                    "&b[IGN] best coder\n" +
                                    "&b[time]\n")
                            , false);
                }
            }
        } catch (Exception e) {
            Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(getUsage(), false);
        }
    }

    @Override
    public List<String> getCommandAliases() {
        return Collections.singletonList("crp");
    }

    @Override
    public List<String> onTabComplete(String[] args) {
        ArrayList<String> tabCompleteList = new ArrayList<> ();
        tabCompleteList.add("reset");
        tabCompleteList.add("mode");
        tabCompleteList.add("preview");
        return tabCompleteList;
    }
}
