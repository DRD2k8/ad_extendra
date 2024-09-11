package com.drd.ad_extendra.block.door;

import net.minecraft.util.StringRepresentable;

import java.util.Locale;

public enum LocationState implements StringRepresentable {
    TOP_LEFT,
    TOP,
    TOP_RIGHT,
    LEFT,
    CENTER,
    RIGHT,
    BOTTOM_LEFT,
    BOTTOM,
    BOTTOM_RIGHT;

    private LocationState() {
    }

    public String toString() {
        return this.getSerializedName();
    }

    public String getSerializedName() {
        return this.name().toLowerCase(Locale.ROOT);
    }
}
