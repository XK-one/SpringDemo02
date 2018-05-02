package com.wyk.spring.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecurityHandler {

	//切面编程
	/*private void checkSecurity() {  
        System.out.println("-------checkSecurity-------");  
    }*/    
	
	//拿到所插入方法体的方法参数和名称
	private void checkSecurity(JoinPoint joinPoint) {  
	        //取得参数.  
	        for(int i=0;i<joinPoint.getArgs().length;i++)  
	        {  
	            System.out.println(joinPoint.getArgs()[i]);  
	        }  
	        System.out.println(joinPoint.getSignature().getName());  
	        System.out.println("-------checkSecurity-------");  
	} 
	
	private void end(){
		System.out.println("结束了");
	}
	 
	
	
	
	
	/**
	 * 通过注解方式去实现切面编程
	 */
	
	/** 
     * 定义Pointcut，Pointcut的名称为addAddMethod()，此方法没有返回值和参数 
     * 该方法就是一个标识，不进行调用 
     */ 
	/*@Pointcut("execution(* add*(..))")
	private void addAddMethod(){};*/
	
	 /** 
     * 定义Advice，表示我们的Advice应用到哪些Pointcut订阅的Joinpoint上 
     */  
	/*@Before("addAddMethod()")
	private void checkSecurity() {  
        System.out.println("-------checkSecurity-------");  
    }  */
	
}
