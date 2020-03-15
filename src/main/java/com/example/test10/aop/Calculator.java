package com.example.test10.aop;

/**
 * FileName: Calculator
 *
 * @author: yufeng
 * @date: 2020/3/7 15:00
 * @description:
 */
public class Calculator {

    /**
     * @param dividend 被除数
     * @param divisor 除数
     * @return
     */
    public int div(int dividend, int divisor) {
        System.out.println("dividend = " + dividend + ", divisor=" + divisor);
        return dividend / divisor;
    }
}
