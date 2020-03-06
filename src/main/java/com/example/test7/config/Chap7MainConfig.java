package com.example.test7.config;

import com.example.test7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: Chap7MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/4 17:13
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test7")
public class Chap7MainConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public Bike Bike() {
        return new Bike();
    }
}
