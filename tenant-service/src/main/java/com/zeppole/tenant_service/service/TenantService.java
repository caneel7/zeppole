package com.zeppole.tenant_service.service;

import com.zeppole.tenant_service.dto.ApiResponse;
import com.zeppole.tenant_service.dto.TenantDTO;
import com.zeppole.tenant_service.model.Tenant;
import org.springframework.http.ResponseEntity;

public interface TenantService {
    ResponseEntity<ApiResponse<Tenant>> createNewTenant(TenantDTO tenant);
}
