package com.example.test10.config;

import com.example.test10.aop.Calculator;
import com.example.test10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * FileName: Chap10MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/7 14:43
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test10")
@EnableAspectJAutoProxy
public class Chap10MainConfig {

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }
    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
