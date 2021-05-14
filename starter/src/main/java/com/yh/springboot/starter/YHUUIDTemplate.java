package com.yh.springboot.starter;

/**
 * @author by 张益豪
 * @Classname YHUUIDTemplate
 * @Description TODO
 * @Date 2021/5/15 1:15
 */
public class YHUUIDTemplate {
    private IUUIDProcessor iuuidProcessor;
    private UUIDProperties uuidProperties;

    public YHUUIDTemplate(IUUIDProcessor iuuidProcessor, UUIDProperties uuidProperties) {
        this.iuuidProcessor = iuuidProcessor;
        this.uuidProperties = uuidProperties;
    }

    public String getUuid() {
        return iuuidProcessor.getUUID(uuidProperties);
    }
}
