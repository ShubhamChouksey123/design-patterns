package com.shubham.app.creational.factory;

import com.shubham.app.creational.factory.entity.AndroidOS;
import com.shubham.app.creational.factory.entity.OS;

public class FactoryMain {

    public static void main(String[] args) {

        OS os = new AndroidOS();
        os.getSpecs();

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS osdNew = operatingSystemFactory.getInstance(OSType.ANDROID);
        osdNew.getSpecs();
    }
}
