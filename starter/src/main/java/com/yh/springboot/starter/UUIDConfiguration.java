package com.yh.springboot.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author by 张益豪
 * @Classname UUIDConfiguration
 * @Description TODO
 * @Date 2021/5/15 1:04
 */
@Configuration
public class UUIDConfiguration {
    @Bean
    @Primary
    @ConditionalOnMissingClass(value = "cn.hutool.core.util.IdUtil")
    public IUUIDProcessor getUUID() {
        return new IUUIDProcessorImpl();
    }

    @Bean
    @ConditionalOnClass(name = "cn.hutool.core.util.IdUtil")
    public IUUIDProcessor getSnowFlakeUUID() {
        return new ISnowflakeProcessorImpl();
    }

}
