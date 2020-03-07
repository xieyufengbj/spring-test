package com.example.test9.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * FileName: Light
 *
 * @author: yufeng
 * @date: 2020/3/7 11:35
 * @description:
 */
@Component
public class Light implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入ioc容器的 :" + applicationContext);
        this.applicationContext = applicationContext;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String result = resolver.resolveStringValue("你好${os.name}, 计算#{3 * 8}");
        System.out.println("计算出结果为：" + result);
    }
}
