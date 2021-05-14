package com.yh.springboot.example;

import com.yh.springboot.example.configuration.EnableYHAutoConfiguration;
import com.yh.springboot.example.service.UserService;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

import java.util.*;


/**
 * @author by 张益豪
 * @Classname YHImportSelector
 * @Description TODO
 * @Date 2021/5/14 1:21
 */
public class YHImportSelector implements DeferredImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        // 所有注解对应的class集合
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(EnableYHAutoConfiguration.class.getName());
        // 得到所有需要排出的beans
        // 正在载入的beans = 全部的beans - exclude beans
        //annotationAttributes.remove();
        return new String[]{UserService.class.getName()};
    }

}
