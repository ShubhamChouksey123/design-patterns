package com.shubham.app.creational.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderMain {

    private static final Logger logger = LoggerFactory.getLogger(BuilderMain.class);

    public static void main(String[] args) {
        Phone newPhone = new Phone("Oneplus 7T", "Android", "", 10.0, 4000);
        logger.info("newPhone : " + newPhone);

        Phone p = new PhoneBuilder().setName("Oneplus 8T").setBattery(1001).getPhone();
        logger.info("newPhone : " + p);
    }
}
