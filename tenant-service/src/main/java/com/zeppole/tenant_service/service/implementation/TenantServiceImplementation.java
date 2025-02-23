package com.zeppole.tenant_service.service.implementation;

import com.zeppole.tenant_service.dto.ApiResponse;
import com.zeppole.tenant_service.dto.TenantDTO;
import com.zeppole.tenant_service.libs.ResponseEntityBuilder;
import com.zeppole.tenant_service.model.Tenant;
import com.zeppole.tenant_service.repository.TenantRepository;
import com.zeppole.tenant_service.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImplementation implements TenantService {

    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public ResponseEntity<ApiResponse<Tenant>> createNewTenant(TenantDTO tenant)
    {

        Tenant newTenant = Tenant.builder()
                .email(tenant.email())
                .name(tenant.name())
                .country(tenant.country())
        .build();

        tenantRepository.save(newTenant);
        
        return ResponseEntityBuilder.success(newTenant,"Tenant Create");
    }

}
