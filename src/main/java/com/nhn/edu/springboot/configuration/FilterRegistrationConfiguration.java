package com.nhn.edu.springboot.configuration;

import com.nhn.edu.springboot.filter.UriLoggingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterRegistrationConfiguration {
    @Bean
    public FilterRegistrationBean uriLoggingFilterRegistrationBean() {
        return new FilterRegistrationBean(new UriLoggingFilter());
    }
}
