package com.example.test1.bean;

import lombok.Data;

/**
 * Copyright (C), 2019, 上海昌投网络科技有限公司
 * FileName: Person
 *
 * @author: yufeng
 * @date: 2020/3/2 10:09
 * @description:
 */
@Data
public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
