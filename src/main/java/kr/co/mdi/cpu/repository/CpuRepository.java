package kr.co.mdi.cpu.repository;

import kr.co.mdi.cpu.entity.CpuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CpuRepository extends JpaRepository<CpuEntity, Long> {
}
