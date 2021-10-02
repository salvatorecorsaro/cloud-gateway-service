package com.example.cloudgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayServiceApplication.class, args);
    }


//    application properties x
//    enable client eureka x
//    some crazy things to do the routing
}
