package com.akumos.service;

import com.akumos.registry.dto.ApplicationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EurekaService {

    @Autowired
    private RestTemplate restTemplate;


    public List<ApplicationDto> getAll() {
        return null;
    }
}
