package com.cnipr.open.eureka.client.query;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

/**
 * Created by Administrator on 2018/2/13.
 */
@Component
public class JerseyConfig extends ResourceConfig {
	@Value("${spring.jersey.application-path}")
    private String apiPath;

    public JerseyConfig() {
        this.packages("com.cnipr.open.eureka.client.query.rs");
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
        config.setConfigId("springmvc-jersey-swagger-example");
        config.setTitle("springmvc-jersey-swagger-example");
        config.setVersion("v1");
        config.setContact("cnipr");
        config.setSchemes(new String[]{"http", "https"});
        config.setBasePath(this.apiPath);
        config.setResourcePackage("com.cnipr.open.eureka.client.query.rs");
        config.setPrettyPrint(true);
        config.setScan(true);

        // it does not work as below
        //config.getSwagger().setSecurityDefinitions(XX);

        // if you want to have you pojo parse as SNAKE_CASE, please add following line,
        // also in this case, you should use swagger.yaml, rather than swagger.json for output, as
        // some swagger keywords, such as operationId, will be parsed as operation_id. - syntax error
        //io.swagger.util.Json.mapper().setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

}
