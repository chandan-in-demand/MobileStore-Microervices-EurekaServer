package com.jaxs.samsung.services;

import com.jaxs.samsung.model.Device;
import com.jaxs.samsung.model.Devices;
import com.jaxs.samsung.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private DeviceRepository repo;

    public Devices getDevices() {
        List<Device> deviceList = new ArrayList<>();
        for(Device device : repo.findAll()){
            deviceList.add(device);
        }
        Devices devices = new Devices(deviceList);
        return devices;
    }
}
