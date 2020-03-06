package com.example.test5.config;

import com.example.test1.bean.Person;
import com.example.test5.bean.LinCondition;
import com.example.test5.bean.MacCondition;
import com.example.test5.bean.WinCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: Chap5MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/3 10:36
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test5")
public class Chap5MainConfig {

    @Bean("person")
    public Person person() {
        System.out.println("正常创建person实体");
        return new Person("测试005", 20);
    }

    @Conditional(LinCondition.class)
    @Bean("lin")
    public Person lin() {
        System.out.println("linux环境创建person实体");
        return new Person("linux-005", 20);
    }

    @Conditional(WinCondition.class)
    @Bean("win")
    public Person win() {
        System.out.println("window环境创建person实体");
        return new Person("window-005", 20);
    }

    @Conditional(MacCondition.class)
    @Bean("mac")
    public Person mac() {
        System.out.println("mac环境创建person实体");
        return new Person("mac-005", 20);
    }
}
