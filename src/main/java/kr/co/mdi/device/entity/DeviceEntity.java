package kr.co.mdi.device.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "device")
public class DeviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_device")
    private Long idDevice;

    @Column(name = "name_device")
    private String nameDevice;

    @Column(name = "id_cpu")
    private Long idCpu;   // FK (cpu.id_cpu)

    @Column(name = "lineup_device")
    private String lineupDevice;

    @Column(name = "release_device")
    private Integer releaseDevice;

    @Column(name = "weight_device")
    private Float weightDevice;

    @Column(name = "type_code_device", length = 50)
    private String typeCodeDevice = "UNDEFINED";

    @Column(name = "manf_code_device", length = 50)
    private String manfCodeDevice = "UNDEFINED";

    public DeviceEntity() {}

    // Getter & Setter
    public Long getIdDevice() { return idDevice; }
    public void setIdDevice(Long idDevice) { this.idDevice = idDevice; }

    public String getNameDevice() { return nameDevice; }
    public void setNameDevice(String nameDevice) { this.nameDevice = nameDevice; }

    public Long getIdCpu() { return idCpu; }
    public void setIdCpu(Long idCpu) { this.idCpu = idCpu; }

    public String getLineupDevice() { return lineupDevice; }
    public void setLineupDevice(String lineupDevice) { this.lineupDevice = lineupDevice; }

    public Integer getReleaseDevice() { return releaseDevice; }
    public void setReleaseDevice(Integer releaseDevice) { this.releaseDevice = releaseDevice; }

    public Float getWeightDevice() { return weightDevice; }
    public void setWeightDevice(Float weightDevice) { this.weightDevice = weightDevice; }

    public String getTypeCodeDevice() { return typeCodeDevice; }
    public void setTypeCodeDevice(String typeCodeDevice) { this.typeCodeDevice = typeCodeDevice; }

    public String getManfCodeDevice() { return manfCodeDevice; }
    public void setManfCodeDevice(String manfCodeDevice) { this.manfCodeDevice = manfCodeDevice; }
}
