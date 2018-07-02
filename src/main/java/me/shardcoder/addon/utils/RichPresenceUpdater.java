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
        if (Config.localMode.equalsIgnoreCase("addon")) {
            RichPresence.Builder builder = new RichPresence.Builder();

            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState("Playing a game")
                    .setDetails("CustomRP Addon v" + AddonUpdateChecker.getLocalVersion())
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.localMode.equalsIgnoreCase("eVowels")) {
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
                    .setState("eGN: " + eIfiedUsername)
                    .setDetails("CestemRP edden v" + AddonUpdateChecker.getLocalVersion())
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.localMode.equalsIgnoreCase("eAll")) {
            RichPresence.Builder builder = new RichPresence.Builder();

            String allEUsername = "";
            for (int x = 0; x < Minecraft.getMinecraft().getSession().getUsername().length();) {
                allEUsername = allEUsername.concat("e");
                x++;
            }

            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState("eee: " + allEUsername)
                    .setDetails("eeeeeeee eeeee e" + AddonUpdateChecker.getLocalVersion())
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.localMode.equalsIgnoreCase("sellout")) {
            RichPresence.Builder builder = new RichPresence.Builder();

            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState("Sub to " + Minecraft.getMinecraft().getSession().getUsername())
                    .setDetails("CustomRP Addon v" + AddonUpdateChecker.getLocalVersion())
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.localMode.equalsIgnoreCase("bestCoder")) {
            RichPresence.Builder builder = new RichPresence.Builder();

            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState(Minecraft.getMinecraft().getSession().getUsername() + " best coder")
                    .setDetails("CustomRP Addon v" + AddonUpdateChecker.getLocalVersion())
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.localMode.equalsIgnoreCase("merch")) {
            if (Minecraft.getMinecraft().getSession().getUsername().endsWith("s")) {
                RichPresence.Builder builder = new RichPresence.Builder();

                client.sendRichPresence(builder
                        .setSmallImage("compass")
                        .setLargeImage("hyperium", "Hyperium Client")
                        .setState("Buy " + Minecraft.getMinecraft().getSession().getUsername() + "' merch")
                        .setDetails("CustomRP Addon v" + AddonUpdateChecker.getLocalVersion())
                        .setStartTimestamp(OffsetDateTime.now())
                        .build());
            } else {
                RichPresence.Builder builder = new RichPresence.Builder();

                client.sendRichPresence(builder
                        .setSmallImage("compass")
                        .setLargeImage("hyperium", "Hyperium Client")
                        .setState("Buy " + Minecraft.getMinecraft().getSession().getUsername() + "'s merch")
                        .setDetails("CustomRP Addon v" + AddonUpdateChecker.getLocalVersion())
                        .setStartTimestamp(OffsetDateTime.now())
                        .build());
            }
        } else if (Config.localMode.equalsIgnoreCase("respects")) {
            RichPresence.Builder builder = new RichPresence.Builder();

            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState("Press [F] to pay respects")
                    .setDetails("CustomRP Addon v" + AddonUpdateChecker.getLocalVersion())
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else if (Config.localMode.equalsIgnoreCase("sleepy")) {
            RichPresence.Builder builder = new RichPresence.Builder();

            client.sendRichPresence(builder
                    .setSmallImage("compass")
                    .setLargeImage("hyperium", "Hyperium Client")
                    .setState(Minecraft.getMinecraft().getSession().getUsername() + " sleepy")
                    .setDetails("CustomRP Addon v" + AddonUpdateChecker.getLocalVersion())
                    .setStartTimestamp(OffsetDateTime.now())
                    .build());
        } else {
            Config.localMode = "addon";
            callCustomRPUpdate();
        }
    }

    public RichPresenceUpdater(IPCClient client) {
        this.client = client;
        if (Settings.DISCORD_RP) {
            callCustomRPUpdate();
        }
    }
}
