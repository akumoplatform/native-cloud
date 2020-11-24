package com.akumos.dto;

import com.netflix.appinfo.DataCenterInfo;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.appinfo.LeaseInfo;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class InstanceInfoDto {

    private volatile String instanceId;
    private volatile String appName;
    private volatile String appGroupName;
    private volatile String ipAddr;
    private static final String SID_DEFAULT = "na";
    private volatile String sid;
    private volatile int port;
    private volatile int securePort;
    private volatile String homePageUrl;
    private volatile String statusPageUrl;
    private volatile String healthCheckUrl;
    private volatile String secureHealthCheckUrl;
    private volatile String vipAddress;
    private volatile String secureVipAddress;
    private String statusPageRelativeUrl;
    private String statusPageExplicitUrl;
    private String healthCheckRelativeUrl;
    private String healthCheckSecureExplicitUrl;
    private String vipAddressUnresolved;
    private String secureVipAddressUnresolved;
    private String healthCheckExplicitUrl;
    private volatile int countryId;
    private volatile boolean isSecurePortEnabled;
    private volatile boolean isUnsecurePortEnabled;
    private volatile DataCenterInfo dataCenterInfo;
    private volatile String hostName;
    private volatile InstanceInfo.InstanceStatus status;
    private volatile InstanceInfo.InstanceStatus overriddenStatus;
    private volatile boolean isInstanceInfoDirty;
    private volatile LeaseInfo leaseInfo;
    private volatile Boolean isCoordinatingDiscoveryServer;
    private volatile Map<String, String> metadata;
    private volatile Long lastUpdatedTimestamp;
    private volatile Long lastDirtyTimestamp;
    private volatile InstanceInfo.ActionType actionType;
    private volatile String asgName;
    private String version;
}

