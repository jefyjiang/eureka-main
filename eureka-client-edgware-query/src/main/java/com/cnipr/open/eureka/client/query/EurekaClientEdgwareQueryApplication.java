package com.cnipr.open.eureka.client.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientEdgwareQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientEdgwareQueryApplication.class, args);
	}
}
