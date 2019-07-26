package com.lixq.springdemo.util;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.alibaba.sentinel.rest.SentinelClientHttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;

/**
 * 异常工具类
 *
 * @author lixiangqian
 * @since 2018-10-24 12:38 PM
 **/
@Slf4j
public class ExceptionUtil {

    /**
     * 降级默认处响应
     */
    private final static ClientHttpResponse fallbackResponse = new SentinelClientHttpResponse();

    public static ClientHttpResponse handleException(HttpRequest request, byte[] body, ClientHttpRequestExecution execution, BlockException exception) {
        log.info("请求处理失败, url={}, err={}", request.getURI(), exception.getMessage());
        return fallbackResponse;
    }
}
