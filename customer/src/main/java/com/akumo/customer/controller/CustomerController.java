package com.akumo.customer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/v1")
public class CustomerController {

    @PostMapping
    public ResponseEntity<String> add(@RequestBody String body) {
        return ResponseEntity.ok("mock... added Customer");
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("mock... getting Customers: 'John'");
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<String> all() {
        return ResponseEntity.ok("mock... getting all Customers: 'John', 'Mary', 'Lucas'");
    }

}
