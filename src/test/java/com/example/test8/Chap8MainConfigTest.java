package com.example.test8;

import com.example.test8.config.Chap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import static org.junit.Assert.*;

/**
 * FileName: Chap8MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/6 13:42
 * @description:
 */
public class Chap8MainConfigTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap8MainConfig.class);

        String[] beanDefinitionNames = app.getBeanDefinitionNames();

        for (String name : beanDefinitionNames) {
            System.out.println("beanDefinitionName:" + name);
        }

        ConfigurableEnvironment environment = app.getEnvironment();
        System.out.println("environment ..." + environment.getProperty("bird.color"));
        app.close();
    }
}