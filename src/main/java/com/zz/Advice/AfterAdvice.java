package com.zz.Advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * Created by dell on 2018/5/4.
 */
public class AfterAdvice implements AfterReturningAdvice {
    public void afterReturning(@Nullable Object o, Method method, Object[] objects, @Nullable Object o1) throws Throwable {
        System.out.println("这是AfterAdvice类的afterReturning方法.");
    }
}
