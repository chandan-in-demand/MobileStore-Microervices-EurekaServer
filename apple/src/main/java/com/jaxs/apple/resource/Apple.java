package com.jaxs.apple.resource;

import com.jaxs.apple.model.Device;
import com.jaxs.apple.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/apple")
public class Apple {

    @RequestMapping("/devices")
    public Devices getDevices(){
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("iphone-6s","smartphone"));
        devices.add(new Device("iphone-7pro","tablet"));
        Devices deviceList = new Devices(devices);
        return deviceList;
    }
}
