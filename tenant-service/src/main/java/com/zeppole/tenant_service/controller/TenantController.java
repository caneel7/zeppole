package com.zeppole.tenant_service.controller;

import com.zeppole.tenant_service.dto.ApiResponse;
import com.zeppole.tenant_service.dto.TenantDTO;
import com.zeppole.tenant_service.model.Tenant;
import com.zeppole.tenant_service.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tenant", produces = "application/json")
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @PostMapping()
    public ResponseEntity<ApiResponse<Tenant>> createNewTenant(@RequestBody TenantDTO tenant)
    {
        return tenantService.createNewTenant(tenant);
    }

}
