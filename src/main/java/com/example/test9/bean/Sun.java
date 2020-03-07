package com.example.test9.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * FileName: Sun
 *
 * @author: yufeng
 * @date: 2020/3/7 11:35
 * @description:
 */
@Component
public class Sun {

    private Moon moon;

    public Sun(@Autowired Moon moon) {
        this.moon = moon;
        System.out.println("Sun ... Constructor ...");
    }

    public Moon getMoon() {
        return moon;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "moon=" + moon +
                '}';
    }
}
