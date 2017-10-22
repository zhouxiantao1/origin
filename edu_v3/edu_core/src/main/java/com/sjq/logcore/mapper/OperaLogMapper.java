package com.sjq.logcore.mapper;

import java.util.List;
import java.util.Map;

import com.sjq.logcore.bean.OperationLog;


/**
 * 操作日志Mapper
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月15日下午3:11:19
 * @version 1.0
 */
public interface OperaLogMapper {
    /**
     * 添加操作日志
     * 
     * @param log
     *            日志对象 {@link OperationLog}
     * @return
     */
    int addOperaLog(OperationLog log);

    /**
     * 查询日志条数
     * 
     * @param log
     *            日志对象
     * @return 日志条数 {@link Long}
     */
    Long selectOperaSize(OperationLog log);

    /**
     * 查询日志列表
     * 
     * @param paramMap
     *            查询条件 {@link Map}
     * @return 日志集合 List<Object> {@link List}
     */
    List<Object> selectAllOpera(Map<String, Object> paramMap);

    /**
     * 根据时间段查询日志集合
     * 
     * @param days
     *            天 {@link Long}
     * @return 日志集合 List<OperationLog>
     */
    List<Object> selectLogListByDays(Map<String, Object> paramMap);

    /**
     * 删除日志
     * 
     * @param paramMap
     *            opIds 日志ID
     * @return 0 删除失败 1成功
     */
    int deleteLog(Map<String, Object> paramMap);
}
