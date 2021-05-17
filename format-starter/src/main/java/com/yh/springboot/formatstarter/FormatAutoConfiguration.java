package com.yh.springboot.formatstarter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author by 张益豪
 * @Classname FormatAutoConfiguration
 * @Description TODO
 * @Date 2021/5/17 23:25
 */
@Import(FormatConfiguration.class)
@Configuration
public class FormatAutoConfiguration {
    @Bean
    public FormatTemplate FormatTemplate(FormatProcessor formatProcessor) {
        return new FormatTemplate(formatProcessor);
    }
}
