package com.example.test2;


import com.example.test2.config.Chap2MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * FileName: Chap2MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/2 15:49
 * @description:
 */
public class Chap2MainConfigTest {

    @Test
    public void test() {

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap2MainConfig.class);

        String[] beanDefinitionNames =  app.getBeanDefinitionNames();

        for(String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }
}