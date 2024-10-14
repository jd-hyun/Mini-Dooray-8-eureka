package com.nhnacademy.minidooray8eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MiniDooray8EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniDooray8EurekaApplication.class, args);
    }

}
