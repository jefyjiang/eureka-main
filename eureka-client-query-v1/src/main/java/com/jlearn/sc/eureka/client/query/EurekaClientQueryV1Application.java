package com.jlearn.sc.eureka.client.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientQueryV1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientQueryV1Application.class, args);
	}
}
