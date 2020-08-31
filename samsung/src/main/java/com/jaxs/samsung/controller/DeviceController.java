package com.jaxs.samsung.controller;

import com.jaxs.samsung.model.Devices;
import com.jaxs.samsung.services.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/samsung")
public class DeviceController {

        @Autowired
        private DeviceService service;

        @RequestMapping("/devices")
        public Devices getDevices(){
            return service.getDevices();
        }

    }
