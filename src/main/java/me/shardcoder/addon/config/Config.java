package me.shardcoder.addon.config;

import cc.hyperium.config.ConfigOpt;

public class Config {
    public static String localMode = "addon";

    public static boolean remoteDisable = false;

    @ConfigOpt
    public static String customRPMode = "addon";
}
