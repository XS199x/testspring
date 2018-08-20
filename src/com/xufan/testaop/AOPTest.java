package com.xufan.testaop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component("AAA")
public class AOPTest implements MethodBeforeAdvice
{
	 @Override  
    public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {  
        saveBeforeMessage();      
    }  
//    @Override  
//    public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {  
//        saveAfterMessage();   
//    }  
    public void saveBeforeMessage(){  
        System.out.println("����BeforeAdvice�ɹ�");  
    }  
//    public void saveAfterMessage(){  
//        System.out.println("����AfterAdvice�ɹ�");  
//    }  
//    @Override  
//    public Object invoke(MethodInvocation arg0) throws Throwable {  
//        System.out.println("����RoundService֮ǰ�ɹ�");  
//        Object result=arg0.proceed();  
//        System.out.println("����RoundService֮��ɹ�");  
//        return result;  
//    }
}
