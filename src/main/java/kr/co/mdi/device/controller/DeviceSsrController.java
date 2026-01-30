package kr.co.mdi.device.controller;

import kr.co.mdi.device.service.DeviceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeviceSsrController {

    private final DeviceService deviceService;

    public DeviceSsrController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/ssr/devices")
    public String deviceList(Model model) {
        model.addAttribute("deviceList", deviceService.findAll());
        return "/ssr/ssr-device-total";
    }
}
