package kr.co.mdi.cpu.controller;

import kr.co.mdi.cpu.service.CpuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CpuSsrController {

    private final CpuService cpuService;

    public CpuSsrController(CpuService cpuService) {
        this.cpuService = cpuService;
    }

    @GetMapping("/ssr/cpus")
    public String cpuList(Model model) {
        model.addAttribute("cpuList", cpuService.findAll());
        return "/ssr/ssr-cpu-total";
    }
}
