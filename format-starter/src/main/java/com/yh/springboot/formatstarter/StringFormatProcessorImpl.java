package com.yh.springboot.formatstarter;

/**
 * @author by 张益豪
 * @Classname stringFormatProcessorImpl
 * @Description TODO
 * @Date 2021/5/17 23:06
 */
public class StringFormatProcessorImpl implements FormatProcessor {
    @Override
    public String formatValue(String name, String age) {
        String info = "名称: " + name + "年龄: " + age;
        System.out.println("字符串转换器----------->" + info);
        return info;
    }
}
