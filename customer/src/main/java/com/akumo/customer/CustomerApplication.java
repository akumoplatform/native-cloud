package com.akumo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.akumo.customer")
public class CustomerApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);

    }

}