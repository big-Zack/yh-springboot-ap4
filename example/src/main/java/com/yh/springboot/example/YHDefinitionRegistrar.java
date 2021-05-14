package com.yh.springboot.example;

import com.yh.springboot.example.service.AccountService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.context.annotation.DeterminableImports;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

import java.util.Set;

/**
 * @author by 张益豪
 * @Classname yhDefinitionRegistrar
 * @Description TODO
 * @Date 2021/5/14 1:05
 */
public class YHDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        Class<AccountService> accountServiceClass = AccountService.class;
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(accountServiceClass);
        // 名称转换
        String uncapitalize = StringUtils.uncapitalize(accountServiceClass.getSimpleName());
        registry.registerBeanDefinition(uncapitalize, rootBeanDefinition);
    }

}
