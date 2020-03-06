package com.example.test8.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * FileName: Bird
 *
 * @author: yufeng
 * @date: 2020/3/6 13:17
 * @description:
 */
public class Bird {

    @Value("hello bird")
    private String name;

    @Value("#{20-2}")
    private int age;

    @Value("${bird.color}")
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bird() {
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
