package com.example.test1.config;

import com.example.test1.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/2 10:08
 * @description:
 */
@Configuration
public class MainConfig {

    @Bean("personId")
    public Person createPerson() {

        return new Person("测试person", 18);
    }
}
