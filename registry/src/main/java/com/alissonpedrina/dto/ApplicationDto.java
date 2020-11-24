package com.alissonpedrina.dto;

import com.netflix.appinfo.InstanceInfo;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

@Data
@Builder
public class ApplicationDto {

    private static Random shuffleRandom = new Random();
    private String name;
    private volatile boolean isDirty;
    private final List<InstanceInfoDto> instances;
    private final AtomicReference<List<InstanceInfo>> shuffledInstances;
    private final Map<String, InstanceInfo> instancesMap;
}

