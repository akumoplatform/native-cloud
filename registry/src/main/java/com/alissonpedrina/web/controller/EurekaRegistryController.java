package com.alissonpedrina.web.controller;

import com.akumos.registry.dto.ApplicationDto;
import com.alissonpedrina.service.EurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/eureka")
public class EurekaRegistryController {

    @Autowired
    private EurekaService eurekaService;

    @GetMapping
    public List<ApplicationDto> getAll() {

        return eurekaService.getAll();
    }
}
