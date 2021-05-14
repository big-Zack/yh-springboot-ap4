package com.yh.springboot.starter;

import java.util.UUID;

/**
 * @author by 张益豪
 * @Classname IUUIDProcessorImpl
 * @Description 原生实现UUID
 * @Date 2021/5/15 0:52
 */
public class IUUIDProcessorImpl implements IUUIDProcessor {
    @Override
    public String getUUID(UUIDProperties uuidProperties) {
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID:" + uuid);
        return uuid;
    }
}
