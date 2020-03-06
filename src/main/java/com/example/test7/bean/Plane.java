package com.example.test7.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * FileName: Plane
 *
 * @author: yufeng
 * @date: 2020/3/4 18:27
 * @description:
 */
@Component
public class Plane implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Plane() {
        System.out.println("plane -- constructor ...");
    }

    @PostConstruct
    public void init() {
        System.out.println("plane -- @PostConstruct ...");
    }

    @PreDestroy
    public void destory() {
        System.out.println("plane -- @PreDestroy ...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("plane -- applicationContext ...");
        this.applicationContext = applicationContext;
    }
}
