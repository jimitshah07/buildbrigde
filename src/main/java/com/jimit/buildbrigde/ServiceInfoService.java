package com.jimit.buildbrigde;

import org.springframework.stereotype.Service;
import java.util.*;
@Service

public class ServiceInfoService {
    public List<ServiceInfo> getAllServices()
    {
        return List.of(
            new ServiceInfo("payment-service", "payments-teams", "github.com/acme/payment-service"),
            new ServiceInfo("login-service", "identity-teams", "github.com/acme/login-service")

        );

    }
}
