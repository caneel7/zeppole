package com.zeppole.tenant_service.repository;

import com.zeppole.tenant_service.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant,Integer> {

}
