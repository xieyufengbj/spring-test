package com.example.test5.bean;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * FileName: MacCondition
 *
 * @author: yufeng
 * @date: 2020/3/3 11:56
 * @description:
 */
public class MacCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 能获取到IOC容器正在使用到beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 获取当前环境
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        System.out.println("osName:" + osName);
        if (osName.contains("Mac")) {
            return true;
        }
        return false;
    }
}
