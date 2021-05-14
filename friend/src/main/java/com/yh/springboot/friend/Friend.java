package com.yh.springboot.friend;

import org.springframework.stereotype.Component;

/**
 * @author by 张益豪
 * @Classname friend
 * @Description TODO
 * @Date 2021/5/12 23:32
 */
@Component
public class Friend {
    private String name;
    private Integer age;

    public Friend() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
