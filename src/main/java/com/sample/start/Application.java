package com.sample.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
	
	public static void main(String[] args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	   Starter starter = (Starter) context.getBean("Starter");
	   starter.start();
	}
	
}
