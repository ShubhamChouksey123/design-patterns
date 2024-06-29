package com.shubham.app.structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {

        PenAdapter penAdapter = new PenAdapter();

        Assignment assignment = new Assignment();
        assignment.setPen(penAdapter);

        assignment.writeAssignment("Let's write this content");
    }
}
