package com.example.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Action.Action;
import com.example.Action.Inilization;

@Configuration
@ComponentScan({"com.example.Spring"})
public class AppConfig {

	@Bean
	public Action action() {
		return new Action();
	}
	
//	@Bean
//	public Inilization inilization() {
//		return new Inilization();
//	}
//	
	
}
