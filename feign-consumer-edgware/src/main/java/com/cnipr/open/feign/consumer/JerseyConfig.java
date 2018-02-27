package com.cnipr.open.feign.consumer;

import javax.annotation.PostConstruct;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

/**
 * Created by Administrator on 2018/2/13.
 */
//@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    @Value("${spring.jersey.application-path}")
    private String apiPath;

    public JerseyConfig() {
        this.packages("com.cnipr.open.feign.consumer.rs");
        this.register(JacksonFeature.class);
        this.register(OpenCniprJacksonJsonProvider.class);
    }

    @PostConstruct
    public void init() {
        // Register components where DI is needed
        this.configureSwagger();
    }

    private void configureSwagger() {
        // Available at localhost:port/swagger.json
    	this.register(ApiListingResource.class);
        this.register(SwaggerSerializers.class);

        BeanConfig config = new BeanConfig();
        config.setConfigId("CNIPR开放平台接口文档");
        config.setTitle("CNIPR开放平台(http://open.cnipr.com)接口文档");
        config.setVersion("v1");
        config.setContact("cnipr");
        config.setSchemes(new String[]{"http", "https"});
        config.setBasePath(this.apiPath);
        config.setResourcePackage("com.cnipr.open.feign.consumer.rs");
        config.setPrettyPrint(true);
        config.setScan(true);
    }

}
