package com.yh.springboot.example.configuration;

import com.yh.springboot.example.service.AccountService;
import com.yh.springboot.example.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by 张益豪
 * @Classname ExampleConfiguration
 * @Description TODO
 * @Date 2021/5/12 23:57
 */
//@Configuration
public class ExampleConfiguration {
    //@Bean
    public AccountService AccountService() {
        return new AccountService();
    }
}
