package me.shardcoder.addon;

import cc.hyperium.Hyperium;
import cc.hyperium.commands.BaseCommand;
import cc.hyperium.commands.CommandException;
import cc.hyperium.utils.ChatColor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomRPCommand implements BaseCommand {
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
            if (args.length == 0) {
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(getUsage(), false);
            }
            if (args[0].equalsIgnoreCase("reset")) {
                CustomRPUpdater.customRPMode = "addon";
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode reset"), false);
                CustomRPUpdater.callCustomRPUpdate();
            } else if (args[0].equalsIgnoreCase("mode")) {
                if (args[1].equalsIgnoreCase("eVowels")) {
                    CustomRPUpdater.customRPMode = "vewels";
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'eVowels'"), false);
                    CustomRPUpdater.callCustomRPUpdate();
                } else if (args[1].equalsIgnoreCase("eAll")) {
                    CustomRPUpdater.customRPMode = "eee";
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'eAll'"), false);
                    CustomRPUpdater.callCustomRPUpdate();
                } else if (args[1].equalsIgnoreCase("sellout")) {
                    CustomRPUpdater.customRPMode = "sellout";
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'sellout'"), false);
                    CustomRPUpdater.callCustomRPUpdate();
                } else if (args[1].equalsIgnoreCase("bestCoder")) {
                    CustomRPUpdater.customRPMode = "bestCoder";
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fMode set to 'bestCoder'"), false);
                    CustomRPUpdater.callCustomRPUpdate();
                }
            } else if (args[0].equalsIgnoreCase("preview")) {
                if (args[1].equalsIgnoreCase("eVowels")) {
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'eVowels'\n\n" +
                                    "&cHyperium\n" +
                                    "&bCestemRP edden\n" +
                                    "&beGN: [IGN but vowels are es]\n" +
                                    "&b[time]")
                            , false);
                } else if (args[1].equalsIgnoreCase("eAll")) {
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'eAll'\n\n" +
                                    "&cHyperium\n" +
                                    "&beeeeeeee eeeee\n" +
                                    "&beee: [IGN but every character is e]\n" +
                                    "&b[time]")
                            , false);
                } else if (args[1].equalsIgnoreCase("sellout")) {
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'sellout'\n\n" +
                                    "&cHyperium\n" +
                                    "&bCustomRP Addon\n" +
                                    "&bSubscribe to [IGN]\n" +
                                    "&b[time]")
                            , false);
                } else if (args[1].equalsIgnoreCase("bestCoder")) {
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fPreview of 'bestCoder'\n\n" +
                                    "&cHyperium\n" +
                                    "&bCustomRP Addon\n" +
                                    "&b[IGN] best coder\n" +
                                    "&b[time]")
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
