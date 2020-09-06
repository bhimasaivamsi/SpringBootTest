package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBootTestApplication.class, args);
		Example ex=ac.getBean("test",Example.class);
		System.out.println(ex.welcome());
	}

}
