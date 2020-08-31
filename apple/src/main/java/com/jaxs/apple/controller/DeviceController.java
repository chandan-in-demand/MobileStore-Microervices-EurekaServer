package com.jaxs.apple.controller;

import com.jaxs.apple.model.Devices;
import com.jaxs.apple.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apple")
public class DeviceController {
    @Autowired
    private DeviceService service;

    @RequestMapping("/devices")
    public Devices getDevices(){
        return service.getDevices();
    }

}
