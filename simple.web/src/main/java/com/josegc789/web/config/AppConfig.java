package com.josegc789.web.config;

import com.josegc789.simple.function.PointOfView;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ServiceLoader;

@Configuration
public class AppConfig {

    @Bean("loader")
    public PointOfView getPoint(){
        return ServiceLoader.load(PointOfView.class).findFirst().orElseThrow();
    }
}
