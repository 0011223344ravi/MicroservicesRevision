package com.example.apigateways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewaysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewaysApplication.class, args);
    }

}
