package com.yh.springboot.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author by 张益豪
 * @Classname UUIDAutoConfiguration
 * @Description TODO
 * @Date 2021/5/15 1:12
 */
@Import(UUIDConfiguration.class)
@EnableConfigurationProperties(UUIDProperties.class)
@Configuration
public class UUIDAutoConfiguration {
    @Bean
    public YHUUIDTemplate YHUUIDTemplate(IUUIDProcessor iuuidProcessor, UUIDProperties uuidProperties) {
        return new YHUUIDTemplate(iuuidProcessor, uuidProperties);
    }
}
