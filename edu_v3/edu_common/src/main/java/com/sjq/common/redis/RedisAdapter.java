package com.sjq.common.redis;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * RedisAdapter适配器
 * @author SJQ-ZeJie Zheng
 * @since 2017年4月1日上午10:27:00
 * @version 1.0
 */
public abstract class RedisAdapter<K extends Serializable, V extends Serializable>  {
   
//  @Autowired
//  protected RedisTemplate<K,V> redisTemplate ;
// 
//  /**
//   * 设置redisTemplate
//   * @param redisTemplate the redisTemplate to set
//   */ 
//  public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) { 
//    this.redisTemplate = redisTemplate; 
//  } 
//     
//  
//  /**
//   * 获取 RedisSerializer
//   * <br>------------------------------<br>
//   */ 
//  protected RedisSerializer<String> getRedisSerializer() { 
//    return redisTemplate.getStringSerializer(); 
//  }
 
}