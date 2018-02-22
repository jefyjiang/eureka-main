package com.jlearn.sc.eureka.client.query;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientQueryV1ApplicationTests {
//本来是要用jersey2的，但是由于eureka依赖jsr311面jersey2依赖javax.ws.rs-api,造成javax.ws.rs.core.Application文件冲突，所以用jersey1吧
	@Test
	public void contextLoads() {
	}

}
