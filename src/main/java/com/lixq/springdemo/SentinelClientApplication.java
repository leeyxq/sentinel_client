package com.lixq.springdemo;

import com.lixq.springdemo.call.WeatherApiClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lixiangqian
 */
@SpringBootApplication
@EnableFeignClients(basePackageClasses = WeatherApiClient.class)
public class SentinelClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelClientApplication.class, args);
    }
}
