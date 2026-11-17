package com.jimit.buildbrigde;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
    @PostMapping("/services")
    public ServiceInfo addService(@RequestBody ServiceInfo service)
    {
        return chef.addService(service);   // the chef method you just wrote
    }
}
