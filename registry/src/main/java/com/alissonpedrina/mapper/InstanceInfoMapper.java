package com.alissonpedrina.mapper;

import com.alissonpedrina.dto.InstanceInfoDto;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class InstanceInfoMapper {

    private InstanceInfoMapper mapper;

    public List<InstanceInfoDto> entityToDto(List<InstanceInfo> instances) {

        return instances.stream().map(instanceInfo ->

                InstanceInfoDto.builder()
                        .instanceId(instanceInfo.getInstanceId())
                        .actionType(instanceInfo.getActionType())
                        .appGroupName(instanceInfo.getAppGroupName())
                        .appName(instanceInfo.getAppName())
                        .hostName(instanceInfo.getHostName())
                        .ipAddr(instanceInfo.getIPAddr())
                        .build()


        ).collect(Collectors.toList());


    }
}
