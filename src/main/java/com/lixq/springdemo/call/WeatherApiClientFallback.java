package com.lixq.springdemo.call;

import com.lixq.springdemo.vo.WeatherInfoVo;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

/**
 * 天气服务异常回调api
 *
 * @author lixiangqian
 * @date 2019-07-26 14:00
 **/
@Component
public class WeatherApiClientFallback implements WeatherApiClient {
    @Override
    public WeatherInfoVo getInfo(@NotBlank String version, String cityId, String city, String ip) {
        return null;
    }
}
