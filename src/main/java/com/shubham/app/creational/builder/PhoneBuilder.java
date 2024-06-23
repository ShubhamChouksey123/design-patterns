package com.shubham.app.creational.builder;

public class PhoneBuilder {

    private String name;
    private String os;
    private String processor;
    private Double screenSize;
    private Integer battery;

    public PhoneBuilder() {
    }

    public PhoneBuilder(String name, String os, String processor, Double screenSize, Integer battery) {
        this.name = name;
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(Integer battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone() {
        return new Phone(name, os, processor, screenSize, battery);
    }
}
