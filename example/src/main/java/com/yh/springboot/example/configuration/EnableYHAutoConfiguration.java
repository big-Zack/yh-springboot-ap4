package com.yh.springboot.example.configuration;

import com.yh.springboot.example.YHDefinitionRegistrar;
import com.yh.springboot.example.YHImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author by 张益豪
 * @Classname EnableYHAutoConfiguration
 * @Description TODO
 * @Date 2021/5/14 1:20
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({YHImportSelector.class, YHDefinitionRegistrar.class})
public @interface EnableYHAutoConfiguration {

    /**
     * Exclude specific auto-configuration classes such that they will never be applied.
     *
     * @return the classes to exclude
     */
    Class<?>[] exclude() default {};

    /**
     * Exclude specific auto-configuration class names such that they will never be
     * applied.
     *
     * @return the class names to exclude
     * @since 1.3.0
     */
    String[] excludeName() default {};

}
