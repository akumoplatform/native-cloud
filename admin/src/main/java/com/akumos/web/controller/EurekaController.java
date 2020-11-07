package com.akumos.web.controller;

import com.akumos.service.EurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/eureka")
public class EurekaController {

    @Autowired
    private EurekaService eurekaService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(eurekaService.getAll());
    }

}
