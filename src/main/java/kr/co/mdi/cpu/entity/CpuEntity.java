package kr.co.mdi.cpu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cpu")
public class CpuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cpu")
    private Long idCpu;

    @Column(name = "name_cpu")
    private String nameCpu;

    @Column(name = "release_cpu", nullable = false)
    private Integer releaseCpu;

    @Column(name = "core_cpu")
    private Integer coreCpu;

    @Column(name = "thread_cpu")
    private Integer threadCpu;

    @Column(name = "maxghz_cpu")
    private Float maxGhzCpu;

    @Column(name = "minghz_cpu")
    private Float minGhzCpu;

    @Column(name = "type_code_cpu", length = 50)
    private String typeCodeCpu = "UNDEFINED";

    @Column(name = "manf_code_cpu", length = 50)
    private String manfCodeCpu = "UNDEFINED";

    public CpuEntity() {}

    // Getter & Setter
    public Long getIdCpu() { return idCpu; }
    public void setIdCpu(Long idCpu) { this.idCpu = idCpu; }

    public String getNameCpu() { return nameCpu; }
    public void setNameCpu(String nameCpu) { this.nameCpu = nameCpu; }

    public Integer getReleaseCpu() { return releaseCpu; }
    public void setReleaseCpu(Integer releaseCpu) { this.releaseCpu = releaseCpu; }

    public Integer getCoreCpu() { return coreCpu; }
    public void setCoreCpu(Integer coreCpu) { this.coreCpu = coreCpu; }

    public Integer getThreadCpu() { return threadCpu; }
    public void setThreadCpu(Integer threadCpu) { this.threadCpu = threadCpu; }

    public Float getMaxGhzCpu() { return maxGhzCpu; }
    public void setMaxGhzCpu(Float maxGhzCpu) { this.maxGhzCpu = maxGhzCpu; }

    public Float getMinGhzCpu() { return minGhzCpu; }
    public void setMinGhzCpu(Float minGhzCpu) { this.minGhzCpu = minGhzCpu; }

    public String getTypeCodeCpu() { return typeCodeCpu; }
    public void setTypeCodeCpu(String typeCodeCpu) { this.typeCodeCpu = typeCodeCpu; }

    public String getManfCodeCpu() { return manfCodeCpu; }
    public void setManfCodeCpu(String manfCodeCpu) { this.manfCodeCpu = manfCodeCpu; }
}
