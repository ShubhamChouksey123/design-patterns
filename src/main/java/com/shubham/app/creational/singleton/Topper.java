package com.shubham.app.creational.singleton;

public class Topper {

    private static Topper topper = new Topper();
    private String name;
    private Integer marks;

    private Topper() {
    }

    public static Topper getInstance() {
        return topper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Topper{" + "name='" + name + '\'' + ", marks=" + marks + '}';
    }
}
