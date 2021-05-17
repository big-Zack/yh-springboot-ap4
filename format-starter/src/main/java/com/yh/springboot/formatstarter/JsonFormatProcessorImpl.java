package com.yh.springboot.formatstarter;

import cn.hutool.json.JSONStrFormater;

/**
 * @author by 张益豪
 * @Classname jsonFormatProcessorImpl
 * @Description jsonFormat
 * @Date 2021/5/17 23:07
 */
public class JsonFormatProcessorImpl implements FormatProcessor {
    @Override
    public String formatValue(String name, String age) {
        String format = JSONStrFormater.format(name + "," + age);
        System.out.println("JSON转换器----------->" + format);
        return format;
    }
}
