package com.javabykiran.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingCode {
	@Before("execution(* com.javabykiran.*..*Controller(..))")
	public void afterLogging(JoinPoint joinPoint) {
		System.out.println("Entering...."+joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.javabykiran.*..*Controller(..))")
	public void beforeLogging(JoinPoint joinPoint) {
		System.out.println("Exsting...."+joinPoint.getSignature().getName());
	}
	
	@Before("execution(* com.javabykiran.*..*Service(..))")
	public void afterLogging11(JoinPoint joinPoint) {
		System.out.println("Entering...."+joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.javabykiran.*..*Service(..))")
	public void beforeLogging11(JoinPoint joinPoint) {
		System.out.println("Exsting...."+joinPoint.getSignature().getName());
	}
	
	@Before("execution(* com.javabykiran.*..*Dao(..))")
	public void afterLogging22(JoinPoint joinPoint) {
		System.out.println("Entering...."+joinPoint.getSignature().getName());
	}
	
	@After("execution(* com.javabykiran.*..*Dao(..))")
	public void beforeLogging22(JoinPoint joinPoint) {
		System.out.println("Exsting...."+joinPoint.getSignature().getName());
	}
}
