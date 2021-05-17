package com.yh.springboot.formatstarter;

/**
 * @author by 张益豪
 * @Classname FormatTemplate
 * @Description TODO
 * @Date 2021/5/17 23:27
 */
public class FormatTemplate {
    private FormatProcessor formatProcessor;

    public FormatTemplate(FormatProcessor formatProcessor) {
        this.formatProcessor = formatProcessor;
    }

    public String formatDate(String name, String age) {
        return formatProcessor.formatValue(name, age);
    }
}
