package com.yh.springboot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.text.normalizer.CharTrie;

@RestController
@SpringBootApplication
public class HelloApplication {

    @GetMapping("")
    public String hello() {
        return "hello";
    }

    @Autowired
    public void setHelloService(HelloService helloService) {
        HelloApplication.helloService = helloService;
    }

    static HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
        helloService.say();
    }

}
