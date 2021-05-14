package com.yh.springboot.example;

import com.yh.springboot.example.configuration.EnableYHAutoConfiguration;
import com.yh.springboot.example.configuration.ExampleConfiguration;
import com.yh.springboot.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@SpringBootApplication
//@ComponentScan(value = "com.yh.springboot.example.service,com.yh.springboot.example.controller")
//@ComponentScan(value = "com.yh.springboot.example.*")
//@Import(ExampleConfiguration.class)
@EnableYHAutoConfiguration
public class ExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ExampleApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
    }

}
