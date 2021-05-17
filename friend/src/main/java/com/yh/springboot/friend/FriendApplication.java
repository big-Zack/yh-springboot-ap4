package com.yh.springboot.friend;

import cn.hutool.core.util.IdUtil;
import com.yh.springboot.formatstarter.FormatTemplate;
import com.yh.springboot.starter.YHUUIDTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FriendApplication {
    public static YHUUIDTemplate yhuuidTemplate;
    public static FormatTemplate formatTemplate;

    @Autowired
    public void setYhuuidTemplate(YHUUIDTemplate yhuuidTemplate) {
        FriendApplication.yhuuidTemplate = yhuuidTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(FriendApplication.class, args);
        yhuuidTemplate.getUuid();
        formatTemplate.formatDate("1", "1");
    }

}
