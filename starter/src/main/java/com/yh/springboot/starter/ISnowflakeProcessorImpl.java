package com.yh.springboot.starter;

import cn.hutool.core.util.IdUtil;

import java.util.Map;

/**
 * @author by 张益豪
 * @Classname ISnowflakeProcessorImpl
 * @Description 雪花算法
 * @Date 2021/5/15 0:54
 */
public class ISnowflakeProcessorImpl implements IUUIDProcessor {
    @Override
    public String getUUID(UUIDProperties uuidProperties) {
        Map<String, String> properties = uuidProperties.getInfo();
        long workerId = Long.parseLong(properties.get("workerId"));
        long datacenterId = Long.parseLong(properties.get("datacenterId"));
        String uuid = IdUtil.createSnowflake(workerId, datacenterId).nextIdStr();
        System.out.println("Snowflake: " + uuid);
        return uuid;
    }
}
