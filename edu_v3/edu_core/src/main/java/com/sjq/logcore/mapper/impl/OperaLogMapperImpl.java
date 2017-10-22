package com.sjq.logcore.mapper.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sjq.logcore.bean.OperationLog;
import com.sjq.logcore.mapper.OperaLogMapper;
import com.sjq.manager.base.BasicSqlSupport;

/**
 * @see com.sjq.logger.mapper.OperaLogMapper
 * @author SJQ-Zejie Zheng
 * @since 2014年6月25日 上午10:28:37
 * @version 0.0.1
 */
@Repository("operaLogMapperCore")
public class OperaLogMapperImpl extends BasicSqlSupport implements OperaLogMapper {
    /*
     * 
     * 
     * @see com.sjq.logger.mapper.OperaLogMapper#addOperaLog(com.sjq.logger .bean.OperationLog)
     */
    
    public int addOperaLog(OperationLog log) {
        return this.insert("com.sjq.logcore.mapper.OperaLogMapper.insertSelective", log);
    }

    /*
     * 
     * 
     * @see com.sjq.logger.mapper.OperaLogMapper#selectOperaSize(com.sjq. logger.bean.OperationLog)
     */
    
    public Long selectOperaSize(OperationLog log) {
        return this.selectOne("com.sjq.logcore.mapper.OperaLogMapper.selectOperaSize", log);
    }

    /*
     * 
     * 
     * @see com.sjq.logger.mapper.OperaLogMapper#selectAllOpera(java.util.Map)
     */
    
    public List<Object> selectAllOpera(Map<String, Object> paramMap) {
        return this.selectList("com.sjq.logcore.mapper.OperaLogMapper.selectAllOpera", paramMap);
    }

    /*
     * 
     * 
     * @see com.sjq.logger.mapper.OperaLogMapper#selectLogListByDays(java.lang .Long)
     */
    
    public List<Object> selectLogListByDays(Map<String, Object> paramMap) {
        return this.selectList("com.sjq.logcore.mapper.OperaLogMapper.selectLogListByDays", paramMap);
    }

    /*
     * 
     * 
     * @see com.sjq.logger.mapper.OperaLogMapper#deleteLog(java.util.Map)
     */
    
    public int deleteLog(Map<String, Object> paramMap) {
        return this.delete("com.sjq.logcore.mapper.OperaLogMapper.deleteLog", paramMap);
    }

}
