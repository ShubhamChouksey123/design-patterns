package com.shubham.app.creational.builder;

public class Phone {

    private String name;
    private String os;
    private String processor;
    private Double screenSize;
    private Integer battery;

    public Phone() {
    }

    public Phone(String name, String os, String processor, Double screenSize, Integer battery) {
        this.name = name;
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" + "name='" + name + '\'' + ", os='" + os + '\'' + ", processor='" + processor + '\''
                + ", screenSize=" + screenSize + ", battery=" + battery + '}';
    }
}
