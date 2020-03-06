package com.example.test7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * FileName: Train
 *
 * @author: yufeng
 * @date: 2020/3/4 18:09
 * @description:
 */
@Component
public class Train implements InitializingBean, DisposableBean {

    public Train() {
        System.out.println("train - constructor...");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("train -- destroy ...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("train -- afterPropertiesSet ...");
    }
}
