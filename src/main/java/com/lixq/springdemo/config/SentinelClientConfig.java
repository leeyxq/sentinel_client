package com.lixq.springdemo.config;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.zookeeper.ZookeeperDataSource;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.csp.sentinel.slots.system.SystemRule;
import com.alibaba.csp.sentinel.slots.system.SystemRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.alibaba.sentinel.SentinelConstants;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Sentinel客户端配置
 *
 * @author lixiangqian
 * @date 2019-06-29 10:23
 **/
@Component
@ConfigurationProperties(prefix = SentinelConstants.PROPERTY_PREFIX)
public class SentinelClientConfig {
    @Setter
    private String zkHost = "192.168.28.154:2181";
    @Setter
    private String zkRootPath = "/sentinel_rule";
    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    public void init() {

        //1.流控
        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new ZookeeperDataSource<>(zkHost, zkRootPath + "/" + appName + "/flowRule",
                source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
                }));
        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());

        //2.降级
        ReadableDataSource<String, List<DegradeRule>> degradeRuleDataSource = new ZookeeperDataSource<>(zkHost, zkRootPath + "/" + appName + "/degradeRule",
                source -> JSON.parseObject(source, new TypeReference<List<DegradeRule>>() {
                }));
        DegradeRuleManager.register2Property(degradeRuleDataSource.getProperty());

        //3.系统规则
        ReadableDataSource<String, List<SystemRule>> systemRuleDataSource = new ZookeeperDataSource<>(zkHost, zkRootPath + "/" + appName + "/systemRule",
                source -> JSON.parseObject(source, new TypeReference<List<SystemRule>>() {
                }));
        SystemRuleManager.register2Property(systemRuleDataSource.getProperty());
    }
}
