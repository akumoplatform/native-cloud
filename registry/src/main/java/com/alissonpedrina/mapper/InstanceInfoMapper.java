package com.alissonpedrina.mapper;

import com.akumos.registry.dto.InstanceInfoDto;
import com.netflix.appinfo.InstanceInfo;

import java.util.List;
import java.util.stream.Collectors;

public class InstanceInfoMapper {

    private InstanceInfoMapper mapper;

    public List<InstanceInfoDto> entityToDto(List<InstanceInfo> instances) {

        return instances.stream().map(instanceInfo ->

                InstanceInfoDto.builder()
                        .actionType(instanceInfo.getActionType())
                        .appGroupName(instanceInfo.getAppGroupName())
                        .appName(instanceInfo.getAppName())
                        .hostName(instanceInfo.getHostName())
                        .ipAddr(instanceInfo.getIPAddr())
                        .build()


        ).collect(Collectors.toList());


    }
}
