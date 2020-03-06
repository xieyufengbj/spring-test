package com.example.test7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * FileName: Jeep
 *
 * @author: yufeng
 * @date: 2020/3/4 18:15
 * @description:
 */
@Component
public class Jeep {

    public Jeep() {
        System.out.println("jeep -- constructor ...");
    }
    @PostConstruct
    public void init() {
        System.out.println("jeep -- init ...");
    }
    @PreDestroy
    public void destory() {
        System.out.println("jeep -- destory ...");
    }
}
