package com.footballstandings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public RedisService(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void saveToCache(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getFromCache(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
