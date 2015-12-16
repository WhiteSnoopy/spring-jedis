package com.neo.test.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import redis.clients.jedis.JedisCluster;

@ContextConfiguration(locations = { "classpath:/test*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestRedis {
    
        @Resource
	private JedisCluster jedisCluster;

	@Test
	public void testRedisCluster() {
	    jedisCluster.set("zx_hello", "hi  welocme babyxx!");
	    String value=jedisCluster.get("zx_hello");
	    System.out.println(value);
	    
	}
    

}

