package com.nhnent.edu.springboot.configuration;

import com.nhnent.edu.springboot.filter.Log1Filter;
import com.nhnent.edu.springboot.filter.Log2Filter;
import com.nhnent.edu.springboot.servlet.Log1Servlet;
import com.nhnent.edu.springboot.servlet.Log2Servlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class FilterConfiguration {
    @Bean
    public FilterRegistrationBean log1FilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new Log1Filter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.setOrder(1000);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean log2FilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new Log2Filter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}