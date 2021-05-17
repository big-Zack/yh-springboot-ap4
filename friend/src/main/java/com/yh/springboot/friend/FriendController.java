package com.yh.springboot.friend;

import com.yh.springboot.formatstarter.FormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by 张益豪
 * @Classname FriendController
 * @Description TODO
 * @Date 2021/5/18 0:33
 */
@RestController
public class FriendController {

    public static FormatTemplate formatTemplate;

    @RequestMapping("format")
    public String format(String name, String age) {
        return formatTemplate.formatDate(name, age);
    }
}
