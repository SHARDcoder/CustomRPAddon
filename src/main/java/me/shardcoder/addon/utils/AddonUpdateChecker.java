package me.shardcoder.addon.utils;

import cc.hyperium.Hyperium;
import cc.hyperium.event.InvokeEvent;
import cc.hyperium.event.ServerJoinEvent;
import cc.hyperium.event.SingleplayerJoinEvent;
import cc.hyperium.internal.addons.AddonBootstrap;
import cc.hyperium.utils.ChatColor;
import org.apache.commons.io.IOUtils;

import java.net.URL;
import java.nio.charset.Charset;

public class AddonUpdateChecker {
    static String updateVersion;
    static String localVersion;

    public static void getVersion() {
        try {
            updateVersion = IOUtils.toString(
                    new URL("https://raw.githubusercontent.com/SHARDcoder/CustomRPAddon/master/version.txt"),
                    Charset.forName("UTF-8")
            );

            updateVersion = updateVersion.substring(0, 5);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void updateCheck() {
        getVersion();
        AddonBootstrap.INSTANCE.getAddonManifests().forEach(m -> {
            if (m.getName().equalsIgnoreCase("CustomRP addon")) {
                localVersion = m.getVersion();
                localVersion = localVersion.substring(0, 5);

                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fRunning version: " + localVersion), false);
                Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fLatest version: " + updateVersion), false);

                if (!localVersion.equalsIgnoreCase(updateVersion)) {
                    System.out.println("[CustomRP] Outdated version detected. Suggesting update");
                    Hyperium.INSTANCE.getHandlers().getGeneralChatHandler().sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[CustomRP] &fNew version available!\n" +
                                    "&8[CustomRP] &fDownload at 'bit.ly/CustomRP'")
                            , false);
                }
            }
        });
    }

    @InvokeEvent
    public void serverJoin(ServerJoinEvent event) {
        updateCheck();
    }

    @InvokeEvent
    public void lonelyJoin(SingleplayerJoinEvent event) {
        updateCheck();
    }
}
