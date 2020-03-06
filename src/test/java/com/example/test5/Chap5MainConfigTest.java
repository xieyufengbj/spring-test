package com.example.test5;

import com.example.test5.config.Chap5MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * FileName: Chap5MainConfigTest
 *
 * @author: yufeng
 * @date: 2020/3/3 10:36
 * @description:
 */
public class Chap5MainConfigTest {

    @Test
    public void test() {

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Chap5MainConfig.class);

        System.out.println("IOC容器创建完成...");
    }
}