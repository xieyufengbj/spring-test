package com.example.test9.bean;

import org.springframework.stereotype.Component;

/**
 * FileName: Moon
 *
 * @author: yufeng
 * @date: 2020/3/7 11:35
 * @description:
 */
@Component
public class Moon {

    public Moon() {
    }

    public void init() {
        System.out.println("moon ... init ...");
    }

    public void destory() {
        System.out.println("moon ... destory ...");
    }
}
