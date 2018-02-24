package com.cnipr.open.eureka.client.query.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/12.
 */
@RestController
public class ShowCaseController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/showcase/{username}")
    public String showcase(
            @PathVariable( name = "username") String username
            ){
        String services = "Services: " + discoveryClient.getServices()+" service provider";
        System.out.println(services);
        return "Hello " + username.toUpperCase() + ", welcome to BeiJing!";
    }
}
