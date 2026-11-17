package com.jimit.buildbrigde;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List; 

@RestController 
public class ServiceController {
    private final ServiceInfoService chef;

    public ServiceController(ServiceInfoService chef)
    {
        this.chef=chef;
    }
    
    @GetMapping ("/services")
    public List<ServiceInfo> service()
    {
        return chef.getAllServices();
    }
}
