package com.example.test4;

import com.example.test4.config.Chap4MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * FileName: Chap4MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/3 10:05
 * @description:
 */
public class Chap4MainConfigTest {


    @Test
    public void test() {

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap4MainConfig.class);

        System.out.println("IOC容器创建完成。。。");
        app.getBean("person");
    }
}