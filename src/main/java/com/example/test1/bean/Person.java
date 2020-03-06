package com.example.test1.bean;

import lombok.Data;

/**
 * FileName: Person
 *
 * @author: yufeng
 * @date: 2020/3/2 08:39
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
