package com.example.test9.service;

import com.example.test9.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * FileName: TestService
 *
 * @author: yufeng
 * @date: 2020/3/6 16:49
 * @description:
 */
@Service
public class TestService {

    @Qualifier("testDao")
    @Autowired
    private TestDao testDao;

    public void println() {
        System.out.println("flag =" + testDao.getFlag());
    }
}
