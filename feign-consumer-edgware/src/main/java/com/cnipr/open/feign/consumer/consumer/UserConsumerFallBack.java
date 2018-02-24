package com.cnipr.open.feign.consumer.consumer;

import com.cnipr.open.feign.consumer.consumer.vo.User;
import com.google.common.collect.Lists;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2018/2/24.
 */
@Component
public class UserConsumerFallBack implements UserConsumer {

    @Override
    public ResponseEntity<List<User>> list(int size) {
        List<User> users = Lists.newArrayList();
        return ResponseEntity.ok(users);
    }
}
