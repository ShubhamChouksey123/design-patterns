package com.shubham.app.creational.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class SingletonPattern {

    private static final Logger logger = LoggerFactory.getLogger(SingletonPattern.class);

    public static void main(String[] args) {
        Topper topper1 = Topper.getInstance();
        Topper topper2 = Topper.getInstance();

        topper1.setName("Duggu");
        topper1.setMarks(98);

        topper2.setName("Shubham");
        topper2.setMarks(89);

        if (Objects.equals(topper1, topper2)) {
            logger.info("both are equal");
        }
    }
}
