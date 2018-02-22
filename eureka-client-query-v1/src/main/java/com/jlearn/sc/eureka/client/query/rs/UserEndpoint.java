package com.jlearn.sc.eureka.client.query.rs;

import com.jlearn.sc.eureka.client.query.pojo.dto.demo.User;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/2/13.
 */
@Path("/user")
@Component
public class UserEndpoint {

    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON})
    @GET
    public Response list(){
        User u1 = new User("name1",10,"password1");
        User u2 = new User("name2",20,null);
        List<User> users = Arrays.asList(u1,u2);
        return Response.ok(users).build();
    }

}
