package me.shardcoder.addon.gui;

import cc.hyperium.gui.main.HyperiumOverlay;
import cc.hyperium.gui.main.components.OverlayButton;
import cc.hyperium.gui.main.components.OverlayToggle;
import me.shardcoder.addon.utils.Mode;
import me.shardcoder.addon.utils.AddonUpdateChecker;

public class Overlay extends HyperiumOverlay {
    boolean buttonMode = true;

    public Overlay() {
        this.getComponents().add(new OverlayButton("Check for updates", () -> {
            AddonUpdateChecker.updateCheck();
        }));
        this.getComponents().add(new OverlayButton("RESET", () -> {
            Mode.set("addon");
        }));
        this.getComponents().add(new OverlayToggle("Set ----- Preview", false, b -> {
            buttonMode = !b;
        }));
        this.getComponents().add(new OverlayButton("eVowels", () -> {
            if (buttonMode) {
                Mode.set("eVowels");
            } else {
                Mode.preview("eVowels");
            }
        }));
        this.getComponents().add(new OverlayButton("eAll", () -> {
            if (buttonMode) {
                Mode.set("eAll");
            } else {
                Mode.preview("eAll");
            }
        }));
        this.getComponents().add(new OverlayButton("sellout", () -> {
            if (buttonMode) {
                Mode.set("sellout");
            } else {
                Mode.preview("sellout");
            }
        }));
        this.getComponents().add(new OverlayButton("bestCoder", () -> {
            if (buttonMode) {
                Mode.set("bestCoder");
            } else {
                Mode.preview("bestCoder");
            }
        }));
        this.getComponents().add(new OverlayButton("merch", () -> {
            if (buttonMode) {
                Mode.set("merch");
            } else {
                Mode.preview("merch");
            }
        }));
        this.getComponents().add(new OverlayButton("sleepy", () -> {
            if (buttonMode) {
                Mode.set("sleepy");
            } else {
                Mode.preview("sleepy");
            }
        }));
    }
}
