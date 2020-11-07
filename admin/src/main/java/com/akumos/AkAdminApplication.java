package com.akumos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableEurekaClient
@SpringBootApplication
//@EnableDiscoveryClient
@EnableCircuitBreaker
@ComponentScan(value = "com.akumos")
public class AkAdminApplication extends SpringBootServletInitializer {

    private  static final Logger logger = LoggerFactory.getLogger(AkAdminApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AkAdminApplication.class, args);
    }

}

