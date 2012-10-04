package com.helloweenvsfei.spring.example;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBeforeAdviceImpl implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object obj)
			throws Throwable {
		System.out.println("checking...");
		System.out.println("Method: " + method.getName());
		System.out.println("Args: " + Arrays.asList(args));
		System.out.println("Object: " + obj);
	}

}
