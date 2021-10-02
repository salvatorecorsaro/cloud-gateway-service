package com.example.cloudgatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudGatewayConfig {


    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p -> p.path("/production/**") //what we receive
                        .uri("lb://production-service")) // where we redirect to -- lb stands for load balancer
                .route(p -> p.path("/fortune-messages/**")
                        .uri("lb://fortune-message-service"))
                .build();
    }
}
