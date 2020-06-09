package com.alissonpedrina.mapper;

import com.akumos.registry.dto.ApplicationDto;
import com.netflix.discovery.shared.Application;

public class ApplicationMapper {


    private InstanceInfoMapper instanceInfoMapper;

    public ApplicationDto application2DTO(Application app) {

        return ApplicationDto.builder()
                .instances(instanceInfoMapper.entityToDto(app.getInstances()))
                .build();
    }

}
