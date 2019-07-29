package com.lixq.springdemo.config;

import com.google.common.base.Charsets;
import feign.Logger;
import feign.RequestInterceptor;
import feign.RetryableException;
import feign.Retryer;
import feign.auth.BasicAuthRequestInterceptor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Collection;
import java.util.Map;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Feign 自定义配置
 *
 * @author lixiangqian
 * @date 2019-07-26 11:17
 **/
@Import(FeignAutoConfiguration.class)
@Configuration()
@ConfigurationProperties(prefix = "feign")
@Slf4j
public class FeignConfig {

    @Setter
    private Map<String, Collection<String>> headers;

    @Setter
    private RetryPolicy retry;

    @Setter
    private BasicAuthConfig basicAuth;

    @Setter
    private String logLevel = Logger.Level.NONE.name();

    /**
     * 请求日志打印配置，需配置com.lixq.springdemo.call.xx 日志级别为debug
     *
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        try {
            return Logger.Level.valueOf(logLevel);
        } catch (Exception ex) {
            log.error("logLevel is error: {}", logLevel);
            return Logger.Level.NONE;
        }
    }

    /**
     * 基础认证配置
     *
     * @return
     */
    @Bean
    @ConditionalOnProperty(name = "basicAuth.enabled", havingValue = "true", matchIfMissing = false)
    public RequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor(basicAuth.username, basicAuth.password, Charsets.UTF_8);
    }

    /**
     * 请求头配置
     *
     * @return
     */
    @Bean
    public RequestInterceptor baseCommonHeaderRequestInterceptor() {
        return template -> template.headers(headers);
    }

    /**
     * 重试配置
     *
     * @return
     */
    @Bean
    public Retryer feignRetry() {
        if (retry == null || retry.enabled == false) {
            return Retryer.NEVER_RETRY;
        }
        return this.retry;
    }


    @Data
    public static class BasicAuthConfig {
        private String username;
        private String password;
    }


    @NoArgsConstructor
    public static class RetryPolicy implements Retryer {
        @Setter
        private boolean enabled = false;

        @Setter
        private int maxAttempts = 5;
        @Setter
        private long period = 100;
        @Setter
        private long maxPeriod = SECONDS.toMillis(1);
        int attempt = 1;
        long sleptForMillis;

        public RetryPolicy(long period, long maxPeriod, int maxAttempts) {
            this.period = period;
            this.maxPeriod = maxPeriod;
            this.maxAttempts = maxAttempts;
            this.attempt = 1;
        }

        @Override
        public void continueOrPropagate(RetryableException e) {
            if (attempt++ >= maxAttempts) {
                throw e;
            }

            long interval;
            if (e.retryAfter() != null) {
                interval = e.retryAfter().getTime() - System.currentTimeMillis();
                if (interval > maxPeriod) {
                    interval = maxPeriod;
                }
                if (interval < 0) {
                    return;
                }
            } else {
                interval = nextMaxInterval();
            }
            try {
                Thread.sleep(interval);
            } catch (InterruptedException ignored) {
                Thread.currentThread().interrupt();
                throw e;
            }
            sleptForMillis += interval;
        }

        long nextMaxInterval() {
            long interval = (long) (period * Math.pow(1.5, attempt - 1));
            return interval > maxPeriod ? maxPeriod : interval;
        }

        @Override
        public Retryer clone() {
            return new RetryPolicy(period, maxPeriod, maxAttempts);
        }
    }
}