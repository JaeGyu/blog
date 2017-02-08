package me.jaegyu.blog.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String helloService(){
		System.out.println("헬로우 서비스 입니다.");
		return "hello Service!";
	}

}
