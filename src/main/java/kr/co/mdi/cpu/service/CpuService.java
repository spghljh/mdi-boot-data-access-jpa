package kr.co.mdi.cpu.service;

import kr.co.mdi.cpu.entity.CpuEntity;

import java.util.List;
import java.util.Optional;

public interface CpuService {

    List<CpuEntity> findAll();

    Optional<CpuEntity> findById(Long id);

    CpuEntity save(CpuEntity cpuEntity);

    void delete(Long id);
}
