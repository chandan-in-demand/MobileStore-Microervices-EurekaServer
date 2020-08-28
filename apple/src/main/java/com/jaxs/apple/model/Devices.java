package com.jaxs.apple.model;

import java.util.List;

public class Devices {
    List<Device> devices;
//Adding brandname is easy because we doing all this inside an object
    private String brandName = "Apple";

    public Devices() {
    }

    public Devices(List<Device> devices) {
        this.devices = devices;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Devices{" +
                "devices=" + devices +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
