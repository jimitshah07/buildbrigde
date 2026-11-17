package com.jimit.buildbrigde;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController 
public class HomeController {
    @GetMapping("/")
    public String home()
    {
        return "Welcome to BuildBrigde Application";
    }

    @GetMapping ("/health")
    public HealthStatus health()
    {
        return new HealthStatus("UP","buildbrigde");

    }
    


}  
