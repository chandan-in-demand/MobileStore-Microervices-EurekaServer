package com.jaxs.apple.repository;

import com.jaxs.apple.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {

}
