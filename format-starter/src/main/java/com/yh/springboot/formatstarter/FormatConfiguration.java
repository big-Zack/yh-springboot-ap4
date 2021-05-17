package com.yh.springboot.formatstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Formatter;

/**
 * @author by 张益豪
 * @Classname FormatConfiguration
 * @Description TODO
 * @Date 2021/5/17 23:21
 */
@Configuration
public class FormatConfiguration {
    @Bean
    @Primary
    @ConditionalOnMissingClass(value = "cn.hutool.json.JSONStrFormater")
    public FormatProcessor StringFormat() {
        return new StringFormatProcessorImpl();
    }

    @Bean
    @ConditionalOnClass(name = "cn.hutool.json.JSONStrFormater")
    public FormatProcessor JsonFormat() {
        return new JsonFormatProcessorImpl();
    }
}
