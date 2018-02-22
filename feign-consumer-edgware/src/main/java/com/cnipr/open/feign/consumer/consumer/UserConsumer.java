package com.cnipr.open.feign.consumer.consumer;

/**
 * Created by Administrator on 2018/2/22.
 */


import com.cnipr.open.feign.consumer.consumer.vo.User;
import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import java.util.List;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;

@FeignClient("EUREKA-CLIENT-QUERY")
public interface UserConsumer {
    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    ResponseEntity<List<User>> list(@RequestParam(value = "size") int size);

}
