package com.shubham.app.creational.factory.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowsOS implements OS {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Override
    public void getSpecs() {
        logger.info("this is and windows OS");
    }
}
