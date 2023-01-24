package com.example.medium.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.example")
public class Config {

    @Bean
    ViewResolver viewResolver(){
         InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
         internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");
        return  internalResourceViewResolver;
    }
}
