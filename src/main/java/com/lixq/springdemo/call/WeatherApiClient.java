package com.lixq.springdemo.call;

import com.lixq.springdemo.config.FeignConfig;
import com.lixq.springdemo.vo.WeatherInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotBlank;

/**
 * 天气服务调用api
 *
 * @author lixiangqian
 * @date 2019-07-25 17:51
 **/
@FeignClient(name = "weatherApiClient", url = "https://www.tianqiapi.com", fallback = WeatherApiClientFallback.class, configuration = {FeignConfig.class})
public interface WeatherApiClient {

    /**
     * 获取指定城市、城市id或ip的天气信息
     *
     * @param version
     * @param cityId
     * @param city
     * @param ip
     * @return
     */
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    WeatherInfoVo getInfo(@NotBlank @RequestParam("version") String version, @RequestParam("cityid") String cityId, @RequestParam("city") String city, @RequestParam("ip") String ip);
}