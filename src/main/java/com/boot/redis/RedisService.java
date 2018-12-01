package com.boot.redis;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class RedisService {

    @Autowired
    JedisPool jedisPool;



    public <T> T get(String key, Class<T> clazz) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String s = jedis.get(key);
            T bean = strToBean(s,clazz);
            return bean;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }


    public <T> String set(String key, T value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String str = beanToStr(value);
            return jedis.set(key, str);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public String set(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();

            return jedis.set(key, value);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    public String get(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.get(key);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    private <T> T strToBean(String s, Class<T> clazz) {
        return JSON.toJavaObject(JSON.parseObject(s), clazz);
    }

    private <T> String beanToStr(T value) {
        return JSON.toJSONString(value);
    }

}
