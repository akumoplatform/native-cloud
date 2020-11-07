package com.alissonpedrina.mapper;

import com.akumos.registry.dto.ApplicationDto;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationMapper {

    @Autowired
    private InstanceInfoMapper instanceInfoMapper;

    public ApplicationDto application2DTO(Application app) {

        return ApplicationDto.builder()
                .instances(instanceInfoMapper.entityToDto(app.getInstances()))
                .build();
    }

}
