package com.example.ejournaldiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EJournalDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EJournalDiscoveryApplication.class, args);
    }

}
