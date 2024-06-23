package com.shubham.app.creational.factory;

import com.shubham.app.creational.factory.entity.AndroidOS;
import com.shubham.app.creational.factory.entity.IOS;
import com.shubham.app.creational.factory.entity.OS;
import com.shubham.app.creational.factory.entity.WindowsOS;

public class OperatingSystemFactory {

    public OS getInstance(OSType osType) {
        switch (osType) {
            case ANDROID -> {
                return new AndroidOS();
            }
            case IOS -> {
                return new IOS();
            }
            default -> {
                return new WindowsOS();
            }
        }
    }
}
