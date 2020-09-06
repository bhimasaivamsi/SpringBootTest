package com.example.demo;

import org.springframework.stereotype.Component;

@Component("test")
public class Example {
	
	public String welcome() {
		System.out.println("Hello modified...>>>>>>>>>>>>");
		return "Spring boot git Test program";
	}
	
	

}
