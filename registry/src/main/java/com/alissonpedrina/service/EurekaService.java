package com.alissonpedrina.service;

import com.akumos.registry.dto.ApplicationDto;
import com.alissonpedrina.mapper.ApplicationMapper;
import com.netflix.eureka.EurekaServerContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EurekaService {

    private ApplicationMapper applicationMapper;

    public List<ApplicationDto> getAll() {

        var peerAwareInstanceRegistry = EurekaServerContextHolder.getInstance().getServerContext().getRegistry();
        return peerAwareInstanceRegistry.getApplications().getRegisteredApplications().stream().map(r -> applicationMapper.application2DTO(r)).collect(Collectors.toList());

    }
}
