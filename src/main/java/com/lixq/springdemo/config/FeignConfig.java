package com.lixq.springdemo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Feign 自定义配置
 *
 * @author lixiangqian
 * @date 2019-07-26 11:17
 **/
@Import(FeignAutoConfiguration.class)
@Configuration
public class FeignConfig {

    @Setter
    @Getter
    private String userAgent;
}