package com.yh.springboot.formatstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by 张益豪
 * @Classname FormatController
 * @Description TODO
 * @Date 2021/5/18 0:13
 */
@RestController
public class FormatController {
    @Autowired
    FormatTemplate formatTemplate;

    @RequestMapping("format")
    public String formatGo(String name, String age) {
        return formatTemplate.formatDate(name, age);
    }
}
