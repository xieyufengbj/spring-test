package com.example.test1;

import com.example.test1.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * FileName: MainTest01
 *
 * @author: yufeng
 * @date: 2020/3/2 08:37
 * @description:
 */
public class MainTest01 {

    public static void main(String[] args) {
        // 把beans.xml 的类加载到容器中
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");
        // 容器中获取对应到实体 -- 根据beanId获取
        Person person = (Person) app.getBean("personId");
        System.out.println(person);
        // 容器中获取对应实体 -- 根据类命
        Person person1 = app.getBean(Person.class);
        System.out.println(person1);

        int beanDefinitionCount = app.getBeanDefinitionCount();
        System.out.println("beanDefinitionCount=" + beanDefinitionCount);
        String[] beanDefinitionNames =  app.getBeanDefinitionNames();
        System.out.println("beanDefinitionNames=" + Arrays.toString(beanDefinitionNames));
    }
}
