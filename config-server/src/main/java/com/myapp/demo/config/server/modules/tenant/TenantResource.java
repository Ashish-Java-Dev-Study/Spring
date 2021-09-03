package com.myapp.demo.config.server.modules.tenant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tenant")
public class TenantResource {

    Logger LOG = LoggerFactory.getLogger(TenantResource.class.getName());

    @GetMapping("/v1")
    public ResponseEntity<String> getTenants() {
        return new ResponseEntity<>("Success : fetch all tenants", HttpStatus.OK);
    }

    @GetMapping("/v1/{tenantId}")
    public ResponseEntity<String> getTenant(@PathVariable("tenantId") String tenantId ) {
        return new ResponseEntity<>("Success : fetch tenant " + tenantId, HttpStatus.OK);
    }

    @PostMapping("/v1")
    public ResponseEntity<String> createTenant() {
        return new ResponseEntity<>("Success : create tenant", HttpStatus.OK);
    }

    @PutMapping("/v1")
    public ResponseEntity<String> updateTenant() {
        return new ResponseEntity<>("Success : update tenant", HttpStatus.OK);
    }

    @DeleteMapping("/v1/{tenantId}")
    public ResponseEntity<String> deleteTenant(@PathVariable("tenantId") String tenantId ) {
        return new ResponseEntity<>("Success : delete tenant " + tenantId, HttpStatus.OK);
    }
}
