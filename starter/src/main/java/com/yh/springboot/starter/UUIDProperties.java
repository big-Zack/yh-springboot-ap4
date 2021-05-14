package com.yh.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @author by 张益豪
 * @Classname UUIDProperties
 * @Description TODO
 * @Date 2021/5/15 0:37
 */
@ConfigurationProperties(prefix = UUIDProperties.YH_PREFIX)
public class UUIDProperties {
    public static final String YH_PREFIX = "yh.uuid";
    private Map<String, String> info;

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }
}
