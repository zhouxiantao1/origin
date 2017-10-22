package com.sjq.logcore.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sjq.logcore.bean.OperationLog;
import com.sjq.logcore.mapper.OperaLogMapper;
import com.sjq.logcore.service.OperaLogService;

/**
 * @see com.sjq.logger.service.OperaLogService
 * @author SJQ-Zejie Zheng
 * @since 2014年6月25日 上午10:26:31
 * @version 0.0.1
 */
@Service("operaLogServiceCore")
public class OperaLogServiceImpl implements OperaLogService {
    // Spring注入
    private OperaLogMapper operaLogMapper;

    public int addOperaLog(OperationLog log) {
        // 插入操作日志
        return operaLogMapper.addOperaLog(log);
    }

    public OperaLogMapper getOperaLogMapper() {
        return operaLogMapper;
    }

    @Resource(name = "operaLogMapperCore")
    public void setOperaLogMapper(OperaLogMapper operaLogMapper) {
        this.operaLogMapper = operaLogMapper;
    }

}
