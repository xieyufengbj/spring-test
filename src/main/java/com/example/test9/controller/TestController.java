package com.example.test9.controller;

import com.example.test9.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * FileName: TestController
 *
 * @author: yufeng
 * @date: 2020/3/6 16:49
 * @description:
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;
}
