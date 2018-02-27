package com.cnipr.open.eureka.client.query.controller;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * Created by Administrator on 2018/2/12.
 */
@RestController
@Api(value = "示例", produces = "application/json")
public class ShowCaseController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value="/showcase/{username}",method={RequestMethod.GET})
    @ApiOperation(value = "欢迎词接口", notes = "欢迎词接口详细描述")
    public String showcase(
    		@ApiParam(required = true, name = "username", value = "姓名")
            @PathVariable( name = "username") String username
            ){
        String services = "Services: " + discoveryClient.getServices()+" service provider";
        System.out.println(services);
        return "Hello " + username.toUpperCase() + ", welcome to BeiJing!";
    }
}
