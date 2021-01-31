package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloWorldMain {

	public static void main(String[] args) {
		 
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("configuration.xml");

        
	}

}
