package kr.co.mdi.cpu.service;

import kr.co.mdi.cpu.entity.CpuEntity;
import kr.co.mdi.cpu.repository.CpuRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CpuServiceImpl implements CpuService {

    private final CpuRepository cpuRepository;

    public CpuServiceImpl(CpuRepository cpuRepository) {
        this.cpuRepository = cpuRepository;
    }

    @Override
    public List<CpuEntity> findAll() {
        return cpuRepository.findAll();
    }

    @Override
    public Optional<CpuEntity> findById(Long id) {
        return cpuRepository.findById(id);
    }

    @Override
    public CpuEntity save(CpuEntity cpuEntity) {
        return cpuRepository.save(cpuEntity);
    }

    @Override
    public void delete(Long id) {
        cpuRepository.deleteById(id);
    }
}
