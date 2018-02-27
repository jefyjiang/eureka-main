package com.cnipr.open.eureka.client.query.rs;

import com.cnipr.open.eureka.client.query.rs.dto.User;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/2/13.
 */
@Path("/user")
@Component
@Api(value = "用户相关服务", produces = "application/json")
public class UserEndpoint {

    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON})
    @GET
    @ApiOperation(value = "获取所有用户", notes = "需要分页")
    public Response list(@QueryParam(value = "size")@DefaultValue(value = "1") int size){
        System.out.println("@@@@@@@@@@ size="+size);
        User u1 = new User("name1",10,"password1");
        User u2 = new User("name2",20,null);
        List<User> users = Lists.newArrayList(u1);
        if(size>=2){
            try {
                long start = System.nanoTime();
                System.out.println("start sleep at "+start);
                Thread.sleep(5000L);
                System.out.println("finish sleep at " + (System.nanoTime() - start));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            users.add(u2);
        }
        return Response.ok(users).build();
    }

}
