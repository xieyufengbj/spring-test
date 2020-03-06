package com.example.test6;

import com.example.test6.config.Chap6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * FileName: Chap6MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/4 14:01
 * @description:
 */
public class Chap6MainConfigTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap6MainConfig.class);

        System.out.println("ioc初始化创建完成");

        Object obj1 = app.getBean("customFactoryBean");
        Object obj2 = app.getBean("customFactoryBean");
        System.out.println("obj1类型：" + obj1.getClass());
        System.out.println("obj2类型：" + obj2.getClass());
        System.out.println(obj1 == obj2);

        Object obj3 = app.getBean("&customFactoryBean");
        System.out.println("obj3类型：" + obj3.getClass());

        String[]  beanDefinitionNames = app.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + name);
        }
    }
}