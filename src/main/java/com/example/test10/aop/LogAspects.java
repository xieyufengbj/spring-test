package com.example.test10.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;
import java.util.Objects;

/**
 * FileName: LogAspects
 *
 * @author: yufeng
 * @date: 2020/3/7 15:03
 * @description:
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.example.test10.aop.Calculator.*(..))")
    public void pointCut() {}

    @Before("pointCut()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "运算入参列表是:{"+ Arrays.asList(joinPoint.getArgs()) +"}");
    }

    @After("pointCut()")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "运算结束列表参数是：{"+ Arrays.asList(joinPoint.getArgs()) +"}");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println(joinPoint.getSignature().getName() + "运算返回结果是:{"+ Objects.toString(result) +"}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(JoinPoint joinPoint, Exception exception) {
        System.out.println(joinPoint.getSignature().getName() + "运算抛出异常是:{" + exception + "}");
    }

//    @Around("pointCut()")
//    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("@Around 执行目标方法之前...");
//        Object obj = proceedingJoinPoint.proceed();
//        System.out.println("@Around 执行目标方法之后...");
//        return obj;
//    }
}
