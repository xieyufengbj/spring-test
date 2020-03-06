package com.example.test3;

import com.example.test3.config.Chap3MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;


/**
 * FileName: Chap3MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/2 16:43
 * @description:
 */
public class Chap3MainConfigTest {

    @Test
    public void test() {

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap3MainConfig.class);

        System.out.println("ioc容器初始化");
        String[] beanDefinitionNames = app.getBeanDefinitionNames();

        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        // 从容器中分别取两次person,看是否为同一个
        Object obj1 = app.getBean("person");
        Object obj2 = app.getBean("person");
        System.out.println(obj1 == obj2);
    }
}