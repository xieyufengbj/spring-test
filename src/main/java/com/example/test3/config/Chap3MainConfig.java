package com.example.test3.config;

import com.example.test1.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * FileName: Chap3MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/2 16:39
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test3")
public class Chap3MainConfig {

    /**
     * 给容器中注册-个bean，类型为返回值的类型，默认是单实例
     *
     * prototype: 多实例-IOC容器启动的时候，IOC容器启动并不会去调用方法创建对象；而是每次获取的时候才会调用方法创建对象
     * singleton: 单实例（默认）：IOC容器启动的时候会调用方法创建对象并放到IOC容器中，以后每次获取直接从容器中拿（大Map.get）的同一个bean
     * request: 主要针对web应用，递交一次请求创建一个实例
     * session: 同一个session创建一个实例
     */
//    @Bean("person")
//    @Scope("prototype")
    @Scope("singleton")
    @Bean
    public Person person() {
        System.out.println("创建实体bean-person");
        return new Person("测试003", 20);
    }
}
