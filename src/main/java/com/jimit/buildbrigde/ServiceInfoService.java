package com.jimit.buildbrigde;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.*;
@Service

public class ServiceInfoService {
    private final ServiceRepository kitchen;

    public ServiceInfoService(ServiceRepository kitchen)
    {
        this.kitchen=kitchen;
    }
    public List<ServiceInfo> getAllServices()
    {
        return kitchen.findAll();

    }
   
    public ServiceInfo addService(@RequestBody ServiceInfo service)
    {
        return kitchen.save(service);
    }

    

}
