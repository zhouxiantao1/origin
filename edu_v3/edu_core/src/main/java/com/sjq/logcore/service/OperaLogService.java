package com.sjq.logcore.service;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.sjq.logcore.bean.OperationLog;

/**
 * 操作日志Service
 * 
 * @author SJQ-Zejie Zheng
 * @since 2014年6月25日 上午10:25:13
 * @version 0.0.1
 */
public interface OperaLogService {

    /**
     * 添加操作日志
     * 
     * @param log
     *            日志对象 {@link OperationLog}
     * @return int
     */
    int addOperaLog(OperationLog log);
}
