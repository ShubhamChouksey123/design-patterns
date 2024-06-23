package com.shubham.app.creational.factory;

public enum OSType {
    ANDROID(0), IOS(1), WINDOWS(2);

    private final int value;

    OSType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
