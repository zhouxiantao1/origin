package com.sjq.logcore.util;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.sjq.logcore.bean.OperationLog;
import com.sjq.logcore.service.OperaLogService;


/**
 * 
 * 操作日志Util
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月15日下午3:18:21
 * @version 1.0
 */
@Service("operaLogUtilCore")
public final class OperaLogUtil {
	
	
    private static OperaLogService operaLogService;

    /**
     * 添加异常日志
     * 
     * @param username
     *            用户名
     * @param e
     *            异常 {@link Exception}
     * @param request
     */
    public static void addOperaException(String username, Exception e, HttpServletRequest request) {
        Date date = new Date();
        StackTraceElement[] st = e.getStackTrace();
        OperationLog log = new OperationLog();
        log.setOpCode(e.getClass().getName());
        log.setOpName(username);
        log.setOpTime(date);
        log.setOpIp(IPAddress.getIpAddr(request));
        log.setOpContent(UtilDate.dataFormat(date) + ":" + "[类:" + st[0].getClassName() + "]调用" + st[0].getMethodName() + "时在第" + st[0].getLineNumber() + "行代码处发生异常!异常类型:" + e.getClass().getName());
        operaLogService.addOperaLog(log);
    }

    /**
     * 添加操作日志记录
     * 
     * @param request
     * @param username
     *            操作人 {@link String}
     * @param operaCode
     *            操作主题 如:添加会员 {@link String}
     * @param operaContent
     *            操作内容
     */
    public static void addOperaLog(HttpServletRequest request, String username, String operaCode, String operaContent) {
        Date date = new Date();
        OperationLog log = new OperationLog();
        log.setOpCode(operaCode);
        log.setOpName(username);
        log.setOpTime(date);
        log.setOpIp(IPAddress.getIpAddr(request));
        log.setOpContent(operaContent);
        operaLogService.addOperaLog(log);
    }

    public OperaLogService getOperaLogService() {
        return operaLogService;
    }

    /**
     * 设置操作日志
     * */
    @Resource(name = "operaLogServiceCore")
    public void setOperaLogService(OperaLogService operaLogService) {
        OperaLogUtil.operaLogService = operaLogService;
    }

}