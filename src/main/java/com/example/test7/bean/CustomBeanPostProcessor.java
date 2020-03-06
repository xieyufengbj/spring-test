package com.example.test7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * FileName: CustomBeanPostProcessor
 *
 * @author: yufeng
 * @date: 2020/3/4 18:06
 * @description:
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor -- postProcessBeforeInitialization -- " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomBeanPostProcessor -- postProcessAfterInitialization -- " + beanName);
        return bean;
    }
}
