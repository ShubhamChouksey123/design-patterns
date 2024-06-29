package com.shubham.app.structural.adapter.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PilotPen {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public void mark(String str) {
        logger.info("writing with pilot pen : " + str);
    }
}
