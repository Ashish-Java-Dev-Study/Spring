package com.myapp.demo.config.server.modules.property;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//TODO : Complete the Swagger documentation for Property.

@RestController
@RequestMapping("/property")
public class PropertyResource {

    Logger LOG = LoggerFactory.getLogger(PropertyResource.class.getName());

    @GetMapping("/v1")
    public ResponseEntity<String> getProperties() {
        return new ResponseEntity<>("Success : fetch all properties", HttpStatus.OK);
    }

    @GetMapping("/v1/{propertyId}")
    public ResponseEntity<String> getProperty(@PathVariable("propertyId") String propertyId) {
        return new ResponseEntity<>("Success : fetch property " + propertyId, HttpStatus.OK);
    }

    @PostMapping("/v1")
    public ResponseEntity<String> createProperty() {
        return new ResponseEntity<>("Success : create property", HttpStatus.OK);
    }

    @PutMapping("/v1")
    public ResponseEntity<String> updateProperty() {
        return new ResponseEntity<>("Success : update property", HttpStatus.OK);
    }

    @DeleteMapping("/v1/{propertyId}")
    public ResponseEntity<String> deleteProperty(@PathVariable("propertyId") String propertyId) {
        return new ResponseEntity<>("Success : delete property " + propertyId, HttpStatus.OK);
    }
}
