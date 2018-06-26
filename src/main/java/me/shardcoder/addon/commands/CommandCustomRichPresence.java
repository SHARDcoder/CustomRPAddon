package me.shardcoder.addon.commands;

import cc.hyperium.Hyperium;
import cc.hyperium.commands.BaseCommand;
import cc.hyperium.commands.CommandException;
import cc.hyperium.utils.ChatColor;
import me.shardcoder.addon.utils.Mode;
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
                Mode.set("addon");
            } else if (args[0].equalsIgnoreCase("mode")) {
                Mode.set(args[1]);
            } else if (args[0].equalsIgnoreCase("preview")) {
                Mode.preview(args[1]);
            }
        } catch (Exception exception) {
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
