package com.example.test2.config;

import com.example.test1.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * FileName: Chap2MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/2 11:10
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test2", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class, Repository.class})},
        useDefaultFilters = false)
public class Chap2MainConfig {

    @Bean("person02")
    public Person createPerson() {
        return new Person("测试001", 20);
    }
}
