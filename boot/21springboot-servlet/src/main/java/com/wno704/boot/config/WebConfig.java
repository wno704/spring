package com.wno704.boot.config;

import com.wno704.boot.servlet.HeServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean
    public ServletRegistrationBean heServletRegistrationBean() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new HeServlet(),"/heServlet");
        return registration;
    }
}
