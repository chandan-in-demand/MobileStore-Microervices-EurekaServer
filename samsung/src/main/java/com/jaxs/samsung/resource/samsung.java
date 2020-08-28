package com.jaxs.samsung.resource;

import com.jaxs.samsung.model.Device;
import com.jaxs.samsung.model.Devices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/samsung")
public class samsung {

    @RequestMapping("/devices")
    public Devices getDevices(){
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Note 9","android"));
        devices.add(new Device("K9","Tablet"));
        devices.add(new Device("i7","Laptop"));

        Devices deviceList = new Devices(devices);
        return deviceList;
    }
}
