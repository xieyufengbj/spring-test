package com.example.test6.config;

import com.example.test6.bean.Cat;
import com.example.test6.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * FileName: Chap6MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/3 13:50
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test6")
@Import(value = {Dog.class, Cat.class, CustomImportBeanDefinitionRegistrar.class, CustomImportSelector.class})
public class Chap6MainConfig {

    @Bean
    public CustomFactoryBean customFactoryBean() {
        return new CustomFactoryBean();
    }


}
