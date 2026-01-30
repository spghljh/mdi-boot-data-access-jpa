package kr.co.mdi.device.service;

import kr.co.mdi.device.entity.DeviceEntity;
import kr.co.mdi.device.repository.DeviceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public List<DeviceEntity> findAll() {
        return deviceRepository.findAll();
    }

    @Override
    public Optional<DeviceEntity> findById(Long id) {
        return deviceRepository.findById(id);
    }

    @Override
    public DeviceEntity save(DeviceEntity deviceEntity) {
        return deviceRepository.save(deviceEntity);
    }

    @Override
    public void delete(Long id) {
        deviceRepository.deleteById(id);
    }
}
