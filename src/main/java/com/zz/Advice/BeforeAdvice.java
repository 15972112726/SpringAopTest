package com.zz.Advice;


import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

/**
 * Created by dell on 2018/5/4.
 */
public class BeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, @Nullable Object o) throws Throwable {
        System.out.println( " 这是BeforeAdvice类的before方法. " );
    }
}
