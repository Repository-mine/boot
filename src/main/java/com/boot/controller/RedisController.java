package com.boot.controller;

import com.boot.redis.RedisService;
import com.boot.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;


    @RequestMapping("/get")
    public JSONResult get() {
        return JSONResult.ok(redisService.get("hello"));
    }





}
