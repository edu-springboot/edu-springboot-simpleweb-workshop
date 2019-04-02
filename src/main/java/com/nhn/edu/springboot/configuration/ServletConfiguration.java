package com.nhn.edu.springboot.configuration;

import com.nhn.edu.springboot.servlet.Log1Servlet;
import com.nhn.edu.springboot.servlet.Log2Servlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ServletConfiguration {
    @Bean
    public ServletRegistrationBean log1ServletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new Log1Servlet());
        servletRegistrationBean.setUrlMappings(Arrays.asList("/log1"));
        return servletRegistrationBean;
    }

    @Bean
    public ServletRegistrationBean log2ServletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new Log2Servlet());
        servletRegistrationBean.setUrlMappings(Arrays.asList("/log2"));
        return servletRegistrationBean;
    }
}