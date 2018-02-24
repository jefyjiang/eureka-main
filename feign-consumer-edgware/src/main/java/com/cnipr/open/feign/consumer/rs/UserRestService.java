package com.cnipr.open.feign.consumer.rs;

import com.cnipr.open.feign.consumer.consumer.UserConsumer;
import com.cnipr.open.feign.consumer.consumer.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;

/**
 * Created by Administrator on 2018/2/22.
 */
@Path("/user")
@Component
public class UserRestService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserConsumer userConsumer;

    @Path("/list")
    @Produces({MediaType.APPLICATION_JSON})
    @GET
    public Response listUser(@QueryParam(value = "size") @DefaultValue(value = "3") int size){
        ResponseEntity<List<User>> users = this.userConsumer.list(size);
        return Response.ok(users.getBody()).build();
    }
}
