package com.example.test10;

import com.example.test10.aop.Calculator;
import com.example.test10.config.Chap10MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * FileName: Chap10MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/7 14:45
 * @description:
 */
public class Chap10MainConfigTest {

    @Test
    public void test() {

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap10MainConfig.class);

        String[] beanDefinitionNames = app.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println("beanDefinitionName: " + name);
        }

        Calculator calculator = app.getBean(Calculator.class);
        int result = calculator.div(10, 1);
        System.out.println("result = " + result);
        app.close();
    }
}