package com.example.test7;

import com.example.test7.config.Chap7MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * FileName: Chap7MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/4 17:14
 * @description:
 */
public class Chap7MainConfigTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap7MainConfig.class);
        System.out.println("ioc 容器创建完成...");

        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("beanDefinitionName: " + name);
        }
        app.close();
    }
}