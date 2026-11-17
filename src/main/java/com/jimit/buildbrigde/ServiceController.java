package com.jimit.buildbrigde;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
public class ServiceController {
    @GetMapping ("/serviceinfo")
   public List<ServiceInfo> services()
   {
        return List.of(
            new ServiceInfo("Apple", "Jimit", "abc123.com"),
            new ServiceInfo("Apple", "Jimit", "abc123.com"),
            new ServiceInfo("Apple", "Jimit", "abc123.com")
        );
   }
}
