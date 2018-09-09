package com.msvvdv.bosessionsws.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {
    @Bean
    public DozerBeanMapper beanMapper(){
        return new DozerBeanMapper();
    }
}
