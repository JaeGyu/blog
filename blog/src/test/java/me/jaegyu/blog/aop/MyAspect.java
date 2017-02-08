package me.jaegyu.blog.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before("execution(* helloService())")
	public void before() {
		System.out.println("이전에 실행 됩니다.");
	}

	@After("execution(* helloService())")
	public void after() {
		System.out.println("이후에 실행 됩니다.");
	}

}
