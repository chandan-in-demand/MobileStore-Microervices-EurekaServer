package com.jaxs.samsung.repository;

import com.jaxs.samsung.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
