package com.jimit.buildbrigde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceInfo,Long>{
    
}
