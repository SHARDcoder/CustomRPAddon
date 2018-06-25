package me.shardcoder.addon.utils;

import cc.hyperium.config.Settings;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.RichPresence;
import me.shardcoder.addon.config.Config;
import net.minecraft.client.Minecraft;

import java.time.OffsetDateTime;

public class RichPresenceUpdater {
    public static IPCClient client;

    public static void callCustomRPUpdate() {
        if (Config.customRPMode.equalsIgnoreCase("addon")) {
            RichPresence.Builder builder = new RichPresence.Builder();
            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState("Playing a game")
                    .setDetails("CustomRP Addon")
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.customRPMode.equalsIgnoreCase("vewels")) {
            RichPresence.Builder builder = new RichPresence.Builder();
            String eIfiedUsername = Minecraft.getMinecraft().getSession().getUsername();
            eIfiedUsername = eIfiedUsername.replace('a', 'e');
            eIfiedUsername = eIfiedUsername.replace('i', 'e');
            eIfiedUsername = eIfiedUsername.replace('o', 'e');
            eIfiedUsername = eIfiedUsername.replace('u', 'e');
            eIfiedUsername = eIfiedUsername.replace('A', 'e');
            eIfiedUsername = eIfiedUsername.replace('I', 'e');
            eIfiedUsername = eIfiedUsername.replace('O', 'e');
            eIfiedUsername = eIfiedUsername.replace('U', 'e');
            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState("eGN: ".concat(eIfiedUsername))
                    .setDetails("CestemRP edden")
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.customRPMode.equalsIgnoreCase("eee")) {
            RichPresence.Builder builder = new RichPresence.Builder();
            String allEUsername = "";
            for (int x = 0; x < Minecraft.getMinecraft().getSession().getUsername().length();) {
                allEUsername = allEUsername.concat("e");
                x++;
            }
            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState("eee: ".concat(allEUsername))
                    .setDetails("eeeeeeee eeeee")
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.customRPMode.equalsIgnoreCase("sellout")) {
            RichPresence.Builder builder = new RichPresence.Builder();
            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState("Subscribe to ".concat(Minecraft.getMinecraft().thePlayer.getName()))
                    .setDetails("CustomRP Addon")
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.customRPMode.equalsIgnoreCase("bestCoder")) {
            RichPresence.Builder builder = new RichPresence.Builder();
            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState(Minecraft.getMinecraft().thePlayer.getName().concat(" best coder"))
                    .setDetails("CustomRP Addon")
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else {
            Config.customRPMode = "addon";
            callCustomRPUpdate();
        }
    }

    public RichPresenceUpdater(IPCClient client) {
        this.client = client;
        if (Settings.DISCORD_RP) {
            return;
        }

        callCustomRPUpdate();
    }
}
