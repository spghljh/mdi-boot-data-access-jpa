package kr.co.mdi.cpu.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.mdi.cpu.entity.CpuEntity;
import kr.co.mdi.cpu.service.CpuService;

@RestController
public class CpuRestController {

    private final CpuService cpuService;

    public CpuRestController(CpuService cpuService) {
        this.cpuService = cpuService;
    }

    @GetMapping("/api/cpus")
    public List<CpuEntity> getAllCpu() {
        return cpuService.findAll();
    }

    @GetMapping("/api/cpus/{id}")
    public ResponseEntity<CpuEntity> getCpuById(@PathVariable Long id) {
        return cpuService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/api/cpus")
    public ResponseEntity<CpuEntity> createCpu(@RequestBody CpuEntity cpuEntity) {
        CpuEntity saved = cpuService.save(cpuEntity);
        URI location = URI.create("/api/cpus/" + saved.getIdCpu());
        return ResponseEntity.created(location).body(saved);
    }


    @PutMapping("/api/cpus/{id}")
    public ResponseEntity<CpuEntity> updateCpu(@PathVariable Long id, @RequestBody CpuEntity cpuDetails) {
        return cpuService.findById(id)
                .map(cpu -> {
                    cpu.setNameCpu(cpuDetails.getNameCpu());
                    cpu.setReleaseCpu(cpuDetails.getReleaseCpu());
                    cpu.setCoreCpu(cpuDetails.getCoreCpu());
                    cpu.setThreadCpu(cpuDetails.getThreadCpu());
                    cpu.setMaxGhzCpu(cpuDetails.getMaxGhzCpu());
                    cpu.setMinGhzCpu(cpuDetails.getMinGhzCpu());
                    cpu.setTypeCodeCpu(cpuDetails.getTypeCodeCpu());
                    cpu.setManfCodeCpu(cpuDetails.getManfCodeCpu());
                    return ResponseEntity.ok(cpuService.save(cpu));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/api/cpus/{id}")
    public ResponseEntity<Void> deleteCpu(@PathVariable Long id) {
        cpuService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
