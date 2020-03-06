package com.example.test8.config;

import com.example.test8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * FileName: Chap8MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/6 13:11
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test8")
@PropertySource(value = "classpath:test.properties")
public class Chap8MainConfig {

    @Bean
    public Bird bird() {
        return new Bird();
    }
}
