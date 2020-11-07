package com.akumos.config;

import com.akumos.web.servlet.HystrixThreadPoolServlet;
import com.netflix.hystrix.dashboard.stream.EurekaInfoServlet;
import com.netflix.hystrix.dashboard.stream.MockStreamServlet;
import com.netflix.hystrix.dashboard.stream.ProxyStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig  {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new EurekaInfoServlet(),"/webeureka/*");
    }

    @Bean
    public ServletRegistrationBean proxy(){
        return new ServletRegistrationBean(new ProxyStreamServlet(),"/proxy.stream");
    }

    @Bean
    public ServletRegistrationBean mockStream(){
        return new ServletRegistrationBean(new MockStreamServlet(),"/mock.stream");
    }

    @Bean
    public ServletRegistrationBean hystrixThreadPool(){
        return new ServletRegistrationBean(new HystrixThreadPoolServlet(),"/hystrixThreadPool");
    }
}