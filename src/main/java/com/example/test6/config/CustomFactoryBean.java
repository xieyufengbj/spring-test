package com.example.test6.config;

import com.example.test6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * FileName: CustomFactoryBean
 *
 * @author: yufeng
 * @date: 2020/3/3 16:18
 * @description:
 */
public class CustomFactoryBean implements FactoryBean<Monkey> {
    /**
     * 1、getObject()返回对象方法;
     * 2、getObjectType返回对象类型
     * 3、isSingleton()是否单例控制
     */
    @Override
    public Monkey getObject() throws Exception {

        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {

        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {

        return true;
    }
}
