package com.lixq.springdemo.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lixq.springdemo.call.WeatherApiClient;
import com.lixq.springdemo.vo.WeatherInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lixiangqian
 * @date 2019-07-26 14:12
 **/
@RestController()
public class IndexController {

    @Autowired
    WeatherApiClient weatherApiClient;

    @GetMapping("/")
    @SentinelResource("index")
    public String index() {
        return "index";
    }

    @GetMapping("/weather")
    @SentinelResource("weather")
    public WeatherInfoVo weatherInfo() {
        return weatherApiClient.getInfo("v1", null, "北京", null);
    }
}