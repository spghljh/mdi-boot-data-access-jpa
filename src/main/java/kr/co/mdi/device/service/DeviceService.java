package kr.co.mdi.device.service;

import kr.co.mdi.device.entity.DeviceEntity;

import java.util.List;
import java.util.Optional;

public interface DeviceService {

    List<DeviceEntity> findAll();

    Optional<DeviceEntity> findById(Long id);

    DeviceEntity save(DeviceEntity deviceEntity);

    void delete(Long id);
}
