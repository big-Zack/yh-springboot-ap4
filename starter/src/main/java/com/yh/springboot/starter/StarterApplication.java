package com.yh.springboot.starter;

import cn.hutool.core.util.IdUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class StarterApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(StarterApplication.class, args);
        long l = IdUtil.createSnowflake(1, 1).nextId();

    }

}
