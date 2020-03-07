package com.example.test9.dao;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * FileName: TestDao
 *
 * @author: yufeng
 * @date: 2020/3/6 16:49
 * @description:
 */
@Repository
public class TestDao {

    private Integer flag = 1;

    public TestDao() {

    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "TestDao{" +
                "flag=" + flag +
                '}';
    }
}
