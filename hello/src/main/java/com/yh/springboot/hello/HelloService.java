package com.yh.springboot.hello;

import org.springframework.stereotype.Service;

/**
 * @author by 张益豪
 * @Classname HelloService
 * @Description TODO
 * @Date 2021/5/11 23:17
 */

//@Service
public class HelloService {
    public String say() {
        String msg = "hello world";
        System.out.println("hello world");
        return msg;
    }
}
