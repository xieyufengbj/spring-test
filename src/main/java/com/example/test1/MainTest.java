package com.example.test1;

import com.example.test1.bean.Person;
import com.example.test1.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Copyright (C), 2019, 上海昌投网络科技有限公司
 * FileName: MainTest
 *
 * @author: yufeng
 * @date: 2020/3/2 10:34
 * @description:
 */
public class MainTest {

    public static void main(String[] args) {

        ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);

        Person person = (Person) app.getBean("personId");

        System.out.println(person);

        String[] beanDefinitionNames = app.getBeanDefinitionNames();

        for (String name : beanDefinitionNames) {
            System.out.println("beanDefinitionName = " + name);
        }
        // System.out.println("beanDefinitionNames=" + Arrays.toString(beanDefinitionNames));

        int beanDefinitionCount = app.getBeanDefinitionCount();
        System.out.println("beanDefinitionCount=" + beanDefinitionCount);

        String[] beanNamesForType = app.getBeanNamesForType(Person.class);
        for (String name : beanNamesForType) {
            System.out.println("beanNamesForType = " + name);
        }
    }
}
