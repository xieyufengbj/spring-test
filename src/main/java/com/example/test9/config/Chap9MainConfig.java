package com.example.test9.config;

import com.example.test9.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * FileName: Chap9MainConfig
 *
 * @author: yufeng
 * @date: 2020/3/6 13:57
 * @description:
 */
@Configuration
@ComponentScan(value = "com.example.test9")
public class Chap9MainConfig {

    /**
     * @Primary : spring自动注入时，将默认选该bean；除非加上@Qualifier
     */
    @Primary
    @Bean("testDao2")
    public TestDao testDao() {

        TestDao testDao = new TestDao();
        testDao.setFlag(2);
        return testDao;
    }
}
