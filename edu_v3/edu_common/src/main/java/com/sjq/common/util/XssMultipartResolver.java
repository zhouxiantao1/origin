package com.sjq.common.util;

import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author SJQ-ZeJie Zheng
 * @since 2017年3月8日下午2:09:52
 *
 */
public class XssMultipartResolver extends CommonsMultipartResolver {

    @Override
    public MultipartHttpServletRequest resolveMultipart(HttpServletRequest request) throws MultipartException {
        Assert.notNull(request, "Request must not be null");
            MultipartParsingResult parsingResult = parseRequest(request);
            return new XssMultipartHttpServletRequest(request, parsingResult.getMultipartFiles(),
                    parsingResult.getMultipartParameters(), parsingResult.getMultipartParameterContentTypes());
    }
}
