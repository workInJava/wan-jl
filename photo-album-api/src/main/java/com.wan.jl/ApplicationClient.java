package com.wan.jl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
public class ApplicationClient {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationClient.class, args);
    }
}