package com.myapp.demo.config.server.modules.tenant;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//TODO : Complete the Swagger documentation for Tenant.
@RestController
@RequestMapping("/tenant")
@Api(value = "tenant", description = "These are operations permitted on the tenant resource.")
public class TenantResource {

    Logger LOG = LoggerFactory.getLogger(TenantResource.class.getName());

    @RequestMapping(value = "/v1", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Fetch list of all the available tenants.", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<String> getTenants() {
        return new ResponseEntity<>("Success : fetch all tenants", HttpStatus.OK);
    }

    @RequestMapping(value = "/v1/{tenantId}", method = RequestMethod.GET, produces = "application/json")
    @ApiOperation(value = "Fetch list of all the available tenants.", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<String> getTenant(@PathVariable("tenantId") String tenantId) {
        return new ResponseEntity<>("Success : fetch tenant " + tenantId, HttpStatus.OK);
    }

    @RequestMapping(value = "/v1", method = RequestMethod.POST, produces = "application/json")
    @ApiOperation(value = "Fetch list of all the available tenants.", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<String> createTenant() {
        return new ResponseEntity<>("Success : create tenant", HttpStatus.OK);
    }

    @RequestMapping(value = "/v1", method = RequestMethod.PUT, produces = "application/json")
    @ApiOperation(value = "Fetch list of all the available tenants.", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<String> updateTenant() {
        return new ResponseEntity<>("Success : update tenant", HttpStatus.OK);
    }

    @RequestMapping(value = "/v1/{tenantId}", method = RequestMethod.DELETE, produces = "application/json")
    @ApiOperation(value = "Fetch list of all the available tenants.", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public ResponseEntity<String> deleteTenant(@PathVariable("tenantId") String tenantId) {
        return new ResponseEntity<>("Success : delete tenant " + tenantId, HttpStatus.OK);
    }
}
