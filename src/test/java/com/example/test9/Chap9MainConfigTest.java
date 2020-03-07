package com.example.test9;

import com.example.test9.config.Chap9MainConfig;
import com.example.test9.dao.TestDao;
import com.example.test9.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * FileName: Chap9MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/6 17:16
 * @description:
 */
public class Chap9MainConfigTest {

    @Test
    public void test() {

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap9MainConfig.class);

        System.out.println("ioc容器创建完成...");
//        TestService testService = app.getBean(TestService.class);
//        testService.println();

//        TestDao testDao = app.getBean(TestDao.class);
//        System.out.println(testDao);
//
//        TestDao testDao1 = (TestDao) app.getBean("testDao");
//        System.out.println(testDao1);
//
//        String[] beanDefinitionNames = app.getBeanDefinitionNames();
//        for (String name : beanDefinitionNames) {
//            System.out.println("beanDefinitionName: " + name);
//        }

        app.close();
    }
}