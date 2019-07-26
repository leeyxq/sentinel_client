package com.lixq.springdemo.config;

import feign.RequestInterceptor;
import feign.Retryer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Collection;
import java.util.Map;

/**
 * Feign 自定义配置
 *
 * @author lixiangqian
 * @date 2019-07-26 11:17
 **/
@Import(FeignAutoConfiguration.class)
@Configuration()
@ConfigurationProperties(prefix = "feign.httpclient")
public class FeignConfig {

    @Setter
    @Getter
    private Map<String, Collection<String>> headers;

    @Bean
    public Retryer feignRetry() {
        //return new Retryer.Default(100, SECONDS.toMillis(1), 3);
        return Retryer.NEVER_RETRY;
    }

//    @Bean
//    public RequestInterceptor basicAuthRequestInterceptor() {
    //认证用
//        return new BasicAuthRequestInterceptor("root", "12345", Charsets.UTF_8);
//    }


    @Bean
    public RequestInterceptor baseCommonHeaderRequestInterceptor() {
        return template -> template.headers(headers);
    }
}