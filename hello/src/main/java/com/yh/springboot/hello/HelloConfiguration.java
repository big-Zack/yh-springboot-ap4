package com.yh.springboot.hello;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

/**
 * 1. 通过configuration 注入bean
 * 2. 通过Service注解
 * 3. 通过配置文件指定 org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.yh.springboot.hello.HelloService
 */
//@Configuration
public class HelloConfiguration {
    @Bean
    @Scope(value = SCOPE_SINGLETON)
    @ConditionalOnClass(name = "com.yh.springboot.friend.Friend")
    public HelloService helloService() {
        return new HelloService();
    }
}
