package com.cnipr.open.eureka.client.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
//@EnableWebMvc
//@ComponentScan("com.cnipr.open.eureka.client")
public class EurekaClientEdgwareQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientEdgwareQueryApplication.class, args);
	}
}
