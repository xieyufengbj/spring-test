package com.example.test4.config;

import com.example.test1.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * FileName: Chap4MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/3 09:53
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test4")
public class Chap4MainConfig {

    /**
     * 懒加载：容器启动时候不创建对象、仅当第一次使用（获取）bean的时候才创建被初始化
     */
//    @Lazy
    @Bean
    public Person person() {
        System.out.println("创建实体person...");
        return new Person("测试004", 20);
    }
}
