package com.sjq.common.redis.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjq.common.redis.aop.CacheKey;
import com.sjq.common.redis.aop.Cacheable;
import com.sjq.common.redis.dao.RedisCacheDao;
import com.sjq.common.redis.model.Member;
import com.sjq.common.redis.service.RedisCacheService;

@Service
public class RedisCacheServiceImpl implements RedisCacheService {
      
//     @Autowired
//     private RedisCacheDao memberDao;
//      
//     public void setMemberDao(RedisCacheDao memberDao)
//     {
//        this.memberDao = memberDao;
//     }
//       
//     public void add(Member member){
//         memberDao.add(member);
//     }
//      
//     public void delete(String id){
//         memberDao.delete(id);
//     }
//      
//     @Cacheable(expire=3000,keyMode=Cacheable.KeyMode.ALL)
//     public Member get(String id,String name,Map<String,Object> map)
//     {
////         return memberDao.get(id);
//    	 
//    	 Member mem = new Member("001","admin");
//    	 return mem;
//    	 
//     }
}